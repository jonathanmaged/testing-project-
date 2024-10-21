package application;

public class Student {
	private String name;
	private String number;
	private String activitiesMark;
	private String oralMark;
	private String midtermMark;
	private String finalExamMark;
	
	public Student() {
		
	}
	
	public Student(String name, String number, String activitiesMark, String oralMark, String midtermMark, String finalExamMark) {
		this.name = name;
		this.number = number;
		this.activitiesMark = activitiesMark;
		this.oralMark = oralMark;
		this.midtermMark = midtermMark;
		this.finalExamMark = finalExamMark;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getActivitiesMark() {
		return activitiesMark;
	}
	public void setActivitiesMark(String activitiesMark) {
		this.activitiesMark = activitiesMark;
	}
	public String getOralMark() {
		return oralMark;
	}
	public void setOralMark(String oralMark) {
		this.oralMark = oralMark;
	}
	public String getMidtermMark() {
		return midtermMark;
	}
	public void setMidtermMark(String midtermMark) {
		this.midtermMark = midtermMark;
	}
	public String getFinalExamMark() {
		return finalExamMark;
	}
	public void setFinalExamMark(String finalExamMark) {
		this.finalExamMark = finalExamMark;
	}
	
	
}
