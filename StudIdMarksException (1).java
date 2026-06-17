Program:


import java.util.Objects;
class StudIdMarksException1 extends Exception {
    public StudIdMarksException1(String message) {
        super(message);
    }
}
public class StudIdInfo {


    private int studid;
    private String studName;
    private double cgpa;
    private String major;
    public StudIdInfo(int studid, String studName, double cgpa, String major) {
        this.studid = studid;
        this.studName = studName;
        this.cgpa = cgpa;
        this.major = major;
    }
    public int getStudid() { return studid; }
    public void setStudid(int studid) { this.studid = studid; }
    public String getStudName() { return studName; }
    public void setStudName(String studName) { this.studName = studName; }
    public double getCgpa() { return cgpa; }
    public void setCgpa(double cgpa) { this.cgpa = cgpa; }
    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }
    @Override
    public int hashCode() {
        return Objects.hash(cgpa, major, studName, studid);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        StudIdInfo other = (StudIdInfo) obj; // Changed to StudIdInfo
        return Double.doubleToLongBits(cgpa) == Double.doubleToLongBits(other.cgpa)
                && Objects.equals(major, other.major)
                && Objects.equals(studName, other.studName)
                && studid == other.studid;
    }
    public static void showStudInfo(StudIdInfo s1, StudIdInfo s2) throws StudIdMarksException1 {
        if (s1.getCgpa() < 0 || s2.getCgpa() < 0 || s1.getStudid() < 0 || s2.getStudid() < 0) {
            throw new StudIdMarksException1("Marks or Student Id cannot be Negative");
        }


        System.out.println("Student1: " + s1.getStudName() + " | ID: " + s1.getStudid() +
                " | CGPA: " + s1.getCgpa() + " | Major: " + s1.getMajor());
        System.out.println("Student2: " + s2.getStudName() + " | ID: " + s2.getStudid() +
                " | CGPA: " + s2.getCgpa() + " | Major: " + s2.getMajor());
    }
    public static void main(String[] args) {
        try {
            StudIdInfo student1 = new StudIdInfo(101, "junnu", 8.7, "CS");
            StudIdInfo student2 = new StudIdInfo(102, "seenu", 9.1, "CS");


            showStudInfo(student1, student2);


        } catch (StudIdMarksException1 e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


Output:


Student1: junnu | ID: 101 | CGPA: 8.7 | Major: CS
Student2: seenu | ID: 102 | CGPA: 9.1 | Major: CS