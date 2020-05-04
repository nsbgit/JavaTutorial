package studentArrayList;

public class StudentData 
{
   public String StudentName;
   private int math;
   private int phy;
   private int bio;
   private int total;
   
public String getStudentName() {
	return StudentName;
}
public void setStudentName(String studentName) {
	StudentName = studentName;
}
public int getMath() {
	return math;
}
public void setMath(int math) {
	this.math = math;
}
public int getPhy() {
	return phy;
}
public void setPhy(int phy) {
	this.phy = phy;
}
public int getBio() {
	return bio;
}
public void setBio(int bio) {
	this.bio = bio;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
   
   
}