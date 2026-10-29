import java.util.*;

class Course {
    String courseCode;
    int capacity;
    HashSet<String> enrolledStudents = new HashSet<>();
    ArrayList<String> prerequisites = new ArrayList<>();
    LinkedList<String> waitlist = new LinkedList<>();

    Course(String courseCode, int capacity, ArrayList<String> prerequisites) {
        this.courseCode = courseCode;
        this.capacity = capacity;
        this.prerequisites = prerequisites;
    }

    void register(String studentId, HashMap<String, Course> courses,
                  HashSet<String> completedCourses) {
        for (String p : prerequisites) {
            if (!completedCourses.contains(p)) {
                System.out.println("Prerequisite not completed");
                return;
            }
        }

        if (enrolledStudents.contains(studentId) || waitlist.contains(studentId)) {
            System.out.println("Already registered");
            return;
        }

        if (enrolledStudents.size() < capacity) {
            enrolledStudents.add(studentId);
            System.out.println(studentId + " enrolled in " + courseCode);
        } else {
            waitlist.addLast(studentId);
            System.out.println(studentId + " added to waitlist");
        }
    }

    void drop(String studentId) {
        if (enrolledStudents.remove(studentId)) {
            System.out.println(studentId + " dropped from " + courseCode);
            promote();
        } else {
            waitlist.remove(studentId);
        }
    }

    void promote() {
        if (!waitlist.isEmpty() && enrolledStudents.size() < capacity) {
            String student = waitlist.removeFirst();
            enrolledStudents.add(student);
            System.out.println(student + " promoted from waitlist");
        }
    }
}

public class question2 {
    public static void main(String[] args) {
        HashMap<String, Course> courses = new HashMap<>();

        courses.put("CS101", new Course("CS101", 2, new ArrayList<>()));
        courses.put("CS201", new Course("CS201", 1,
                new ArrayList<>(Arrays.asList("CS101"))));

        HashSet<String> completed = new HashSet<>(Arrays.asList("CS101"));

        Course c = courses.get("CS201");
        c.register("S101", courses, completed);
        c.register("S102", courses, completed);
        c.drop("S101");
    }
}