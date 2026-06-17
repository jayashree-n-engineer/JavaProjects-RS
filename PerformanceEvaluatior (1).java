Program:


public class PerformanceEvaluatior{


    // StudentInfo class
    private static class StudentInfo {
        private String name;
        private String major;
        private double cgpa;


        public StudentInfo(String name, String major, double cgpa) {
            this.name = name;
            this.major = major;
            this.cgpa = cgpa;
        }


        public String getName() {
            return name;
        }


        public String getMajor() {
            return major;
        }


        public double getCgpa() {
            return cgpa;
        }
    }


    // PerformanceEvaluation interface
    private interface PerformanceEvaluation {
        String comparebothStudentMarks(StudentInfo s1, StudentInfo s2);
    }


    // PerformanceEvaluator class
    private static class PerformanceEvaluator implements PerformanceEvaluation {
        @Override
        public String comparebothStudentMarks(StudentInfo s1, StudentInfo s2) {
            // Compare regardless of major
            if (s1.getCgpa() > s2.getCgpa()) {
                return s1.getName() + " (" + s1.getMajor() + ") has better CGPA than " +
                        s2.getName() + " (" + s2.getMajor() + ")";
            } else if (s1.getCgpa() < s2.getCgpa()) {
                return s2.getName() + " (" + s2.getMajor() + ") has better CGPA than " +
                        s1.getName() + " (" + s1.getMajor() + ")";
            } else {
                return s1.getName() + " (" + s1.getMajor() + ") and " +
                        s2.getName() + " (" + s2.getMajor() + ") have equal CGPA";
            }
        }
    }


    // Main method
    public static void main(String[] args) {
        StudentInfo student1 = new StudentInfo("Alice", "Computer Science", 8.7);
        StudentInfo student2 = new StudentInfo("Bob", "Computer Science", 9.1);
        StudentInfo student3 = new StudentInfo("Charlie", "Mathematics", 8.7);
        StudentInfo student4 = new StudentInfo("Diana", "Physics", 9.5);


        PerformanceEvaluation evaluator = new PerformanceEvaluator();


        System.out.println("=== Student Comparisons ===");
        System.out.println(evaluator.comparebothStudentMarks(student1, student2));
        System.out.println(evaluator.comparebothStudentMarks(student1, student3));
        System.out.println(evaluator.comparebothStudentMarks(student2, student3));
        System.out.println(evaluator.comparebothStudentMarks(student1, student4));
        System.out.println(evaluator.comparebothStudentMarks(student4, student2));
    }
}


Output:


=== Student Comparisons ===
Bob (Computer Science) has better CGPA than Alice (Computer Science)
Alice (Computer Science) and Charlie (Mathematics) have equal CGPA
Bob (Computer Science) has better CGPA than Charlie (Mathematics)
Diana (Physics) has better CGPA than Alice (Computer Science)
Diana (Physics) has better CGPA than Bob (Computer Science)