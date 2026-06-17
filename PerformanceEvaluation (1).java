Program:


public class PerformanceEvalution{
    private static class StudentInfo {
        private String name;
        private int marks;


        public StudentInfo(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }


        public String getName() {
            return name;
        }


        public int getMarks() {
            return marks;
        }
    }
    private interface PerformanceEvaluationInterface {
        String comparebothStudentMarks(StudentInfo s1, StudentInfo s2);
    }
    private static class PerformanceEvaluationImpl implements PerformanceEvaluationInterface {
        @Override
        public String comparebothStudentMarks(StudentInfo s1, StudentInfo s2) {
            if (s1.getMarks() > s2.getMarks()) {
                return s1.getName() + " has higher marks than " + s2.getName();
            } else if (s1.getMarks() < s2.getMarks()) {
                return s2.getName() + " has higher marks than " + s1.getName();
            } else {
                return s1.getName() + " and " + s2.getName() + " have equal marks";
            }
        }
    }
    public static void main(String[] args) {
        StudentInfo student1 = new StudentInfo("Junnu", 85);
        StudentInfo student2 = new StudentInfo("Seenu", 90);


        PerformanceEvaluationInterface evaluation = new PerformanceEvaluationImpl();
        String result = evaluation.comparebothStudentMarks(student1, student2);


        System.out.println(result);
    }}
Output:


Seenu has higher marks than Junnu