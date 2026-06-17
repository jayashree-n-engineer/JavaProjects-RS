import java.util.Objects;

public class StudentInfo {
	
	private int studid;
	private String studName;
	private double cgpa;
	private String major;
	
	
	
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	

	public StudentInfo(int studid, String studName, double cgpa, String major) {
		
		this.studid = studid;
		this.studName = studName;
		this.cgpa = cgpa;
		this.major = major;
	}
	
	
	
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(cgpa, major, studName, studid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentInfo other = (StudentInfo) obj;
		return Double.doubleToLongBits(cgpa) == Double.doubleToLongBits(other.cgpa)
				&& Objects.equals(major, other.major) && Objects.equals(studName, other.studName)
				&& studid == other.studid;
	}
	
	
	
	
	
	
	
	
	
	public static void showStudInfo(StudentInfo s1, StudentInfo s2) throws StudIdMarksException {
		
		if (s1.getCgpa() < 0 || s2.getStudid() < 0 || s1.getStudid() < 0  || s2.getStudid() < 0) {
			
			throw new StudIdMarksException("Marks or Student Id cannot be Negative");
		}
	
		System.out.println("Student1 Name = " + s1.getStudName() + " StudId = " + s1.getStudid() + " CGPA = " + s1.getCgpa() + " Major Subject = " + s1.getMajor());
		System.out.println("Student2 Name = " + s2.getStudName() + " StudId = " + s2.getStudid() + " CGPA = " + s2.getCgpa() + " Major Subject = " + s2.getMajor());
		
	}
	
	
	

}
