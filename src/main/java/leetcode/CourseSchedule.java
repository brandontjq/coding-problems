package leetcode;

import java.util.*;

public class CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] courseDep = new int[numCourses];
        Map<Integer, List<Integer>> graph = buildGraph(prerequisites, courseDep, numCourses);

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < courseDep.length; i++) {
            if(courseDep[i] == 0) {
                queue.add(i);
            }
        }

        int index = 0;
        int[] orderedResult = new int[numCourses];

        while(!queue.isEmpty()) {
            int course = queue.poll();
            orderedResult[index++] = course;
            List<Integer> coursesThatDependOn = graph.get(course);
            if(coursesThatDependOn.size() != 0) {
                for(int i = 0; i < coursesThatDependOn.size(); i++) {
                    int courseThatDependOn = coursesThatDependOn.get(i);
                    courseDep[courseThatDependOn] = courseDep[courseThatDependOn] - 1;
                    if(courseDep[courseThatDependOn] == 0) {
                        queue.add(courseThatDependOn);
                    }
                }
            }
        }
        return index == graph.size();

    }

    private Map<Integer, List<Integer>> buildGraph(int[][] prerequisites, int[] courseDep, int numCourses) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i = 0; i < numCourses; i++) {
            graph.put(i, new ArrayList<>());
        }
        for(int i = 0; i < prerequisites.length; i++) {
            int course = prerequisites[i][0];
            int courseDependent = prerequisites[i][1];
            List<Integer> dep = graph.getOrDefault(courseDependent, new ArrayList<>());
            dep.add(course);
            courseDep[course] = courseDep[course] + 1;
            graph.put(courseDependent, dep);
        }
        return graph;
    }

    public boolean canFinish2(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int[] numDeps = new int[numCourses];
        buildGraph2(map, numDeps, prerequisites, numCourses);
        Queue<Integer> queue = new LinkedList<>();
        int[] result = new int[numCourses];
        int index = 0;

        for(int i = 0; i < numDeps.length; i++) {
            if(numDeps[i] == 0) {
                queue.add(numDeps[i]);
            }
        }

        while(!queue.isEmpty()) {
            int course = queue.poll();
            result[index] = course;
            index++;

            if(map.get(course).size() != 0) {
                List<Integer> depCourses = map.get(course);
                for(int i = 0; i < depCourses.size(); i++) {
                    int depCourse = depCourses.get(i);
                    numDeps[depCourse]--;
                    if(numDeps[depCourse] == 0) {
                        queue.add(depCourse);
                    }
                }
            }
        }
        return index == map.size();

    }

    private void buildGraph2(Map<Integer, List<Integer>> map, int[] numDeps, int[][] prerequisites, int numCourses){
        for(int i = 0; i < numCourses; i++) {
            map.put(i, new ArrayList<>());
        }

        for(int i = 0; i < prerequisites.length; i++) {
            int first = prerequisites[i][0];
            int second = prerequisites[i][1];
            numDeps[first]++;

            List<Integer> list = map.get(second);
            list.add(first);
            map.put(second, list);
        }
    }
}
