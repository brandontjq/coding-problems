package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleTest {
    @Test
    void test() {
        int numCourses = 2;
        int[][] prerequisites = {{0,1}};
        CourseSchedule cs = new CourseSchedule();
        boolean result = cs.canFinish(numCourses, prerequisites);
        System.out.println("hi");
        assertTrue(result);
    }

    @Test
    void test2() {
        int numCourses = 2;
        int[][] prerequisites = {{0,1}};
        CourseSchedule cs = new CourseSchedule();
        boolean result = cs.canFinish2(numCourses, prerequisites);
        assertTrue(result);
    }
}