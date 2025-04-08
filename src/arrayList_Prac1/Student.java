package arrayList_Prac1;

public class Student {

	private static int cnt;
	private int sno;
	private String sname;
	private int score;

	public void FindStudentF (int sno, String sname) {
		if(getSno() == sno && getSname().equals(sname)) {
			System.out.println(toString());
		}
		
	}

	public Student(String sname, int score) {
//		cnt ++; 
		sno = ++cnt;
		this.sname = sname;
		this.score = score;

	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", score=" + score + "]";
	}

}
