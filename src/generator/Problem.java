package generator;

import java.util.ArrayList;

public class Problem {
    private final int studentCount;
    private final int courseCount; // each course form 0 to count at University
    private final int timeslotsCount;  // timeslots of all courses in total
    private final int classroomCount;

    //each int[] is the array of the courses the students will take
    private final int[][] students;

    // each course needs to happen x amount of times
    private final int[] courses;
    
    public Problem(final int studentCount, final int courseCount, final int timeslotsCount, final int classRoomCount) {
        this.timeslotsCount = timeslotsCount;
        this.classroomCount = classRoomCount;
        this.studentCount = studentCount;
        this.courseCount = courseCount;
        this.students = new int[studentCount][];
        this.courses = new int[courseCount];
    }

    public int getCourseCount() {
        return courseCount;
    }

    public int getTimeslotsCount() {
        return timeslotsCount;
    }

    public int getClassroomCount() {
        return classroomCount;
    }

    public int[][] getStudents() {
        return students;
    }

    public int[] getCourses() {
        return courses;
    }
}
