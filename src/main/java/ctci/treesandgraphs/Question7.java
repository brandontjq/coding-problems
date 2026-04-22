package ctci.treesandgraphs;

import java.util.*;
//Topological Sort
public class Question7 {
    public static void main(String[] args) {
        String[] projects = {"a", "b", "c", "d", "e", "f"};
        String[][] dependencies = {{"a","d"}, {"f","b"},
                {"b","d"},{"f", "a"}, {"d","c"}};
        String[] result = solve(projects, dependencies);
        System.out.println(result);

    }

    private static String[] solve(String[] projects, String[][] dependencies) {
        Map<Project, List<Project>> graph = buildGraph(projects, dependencies);
        Queue<Project> projectQueue = new LinkedList<>();

        for(Map.Entry<Project, List<Project>> projectListEntry : graph.entrySet()) {
            Project project = projectListEntry.getKey();
            if(project.getNumberOfDependencies() == 0) {
                projectQueue.add(project);
            }
        }
        int index = 0;
        String[] order = new String[graph.size()];
        while(!projectQueue.isEmpty()) {
            Project currentProject = projectQueue.poll();
            order[index] = currentProject.getName();
            index++;
            List<Project> dependencyList = graph.get(currentProject);
            if(dependencyList.size() > 0) {
                for(Project dependencyProject : dependencyList) {
                    dependencyProject.decreaseNumberOfDependencies();
                    if(dependencyProject.getNumberOfDependencies() == 0) {
                        projectQueue.add(dependencyProject);
                    }
                }

            }

        }
        if(index != graph.size()) {
            return null;
        }
        return order;
    }

    private static Map<Project, List<Project>> buildGraph(String[] projects, String[][] dependencies) {
        Map<Project, List<Project>> graph = new HashMap<>();
        Map<String, Project> map = new HashMap<>();

        for (String project : projects) {
            Project projectObject = new Project(project);
            graph.put(projectObject, new ArrayList<>());
            map.put(projectObject.getName(), projectObject);
        }
        for (String[] dependencyPair : dependencies) {
            String firstProject = dependencyPair[0];
            String secondProject = dependencyPair[1];

            Project firstProjectObject = map.get(firstProject);
            Project secondProjectObject = map.get(secondProject);

            secondProjectObject.addNumberOfDependencies();
            List<Project> projectDependencies = graph.get(firstProjectObject);
            projectDependencies.add(secondProjectObject);
            graph.put(firstProjectObject, projectDependencies);

        }
        return graph;
    }



    static class Project {
        private final String name;
        private int numberOfDependencies;

        public Project(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void addNumberOfDependencies() {
            this.numberOfDependencies++;
        }

        public void decreaseNumberOfDependencies() {
            this.numberOfDependencies--;
        }

        public int getNumberOfDependencies() {
            return numberOfDependencies;
        }
    }
}
