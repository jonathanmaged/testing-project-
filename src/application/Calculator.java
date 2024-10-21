package application;

public class Calculator {
    
    private Student student;
    private String letterGrade;
    private double gpa;
    
    public Calculator(Student student) {
        this.student = student ;
        this.calculateGpa();
    }

    public void calculateGpa() {
    	int activityMark = Integer.parseInt(student.getActivitiesMark());
        int oralMark = Integer.parseInt(student.getOralMark());
        int midtermMark = Integer.parseInt(student.getMidtermMark());
        int finalMark = Integer.parseInt(student.getFinalExamMark());
        int degree = activityMark + oralMark + midtermMark + finalMark;
        
        if (degree >= 97.0 && degree <= 100.0) {
            this.letterGrade = "A+";
            this.gpa = 4.0;
        } else if (degree >= 93.0 && degree < 97.0) {
            this.letterGrade = "A";
            this.gpa = 4.0;
        } else if (degree >= 89.0 && degree < 93.0) {
            this.letterGrade = "A-";
            this.gpa = 3.7;
        } else if (degree >= 84.0 && degree < 89.0) {
            this.letterGrade = "B+";
            this.gpa = 3.3;
        } else if (degree >= 80.0 && degree < 84.0) {
            this.letterGrade = "B";
            this.gpa = 3.0;
        } else if (degree >= 76.0 && degree < 80.0) {
            this.letterGrade = "B-";
            this.gpa = 2.7;
        } else if (degree >= 73.0 && degree < 76.0) {
            this.letterGrade = "C+";
            this.gpa = 2.3;
        } else if (degree >= 70.0 && degree < 73.0) {
            this.letterGrade = "C";
            this.gpa = 2.0;
        } else if (degree >= 67.0 && degree < 70.0) {
            this.letterGrade = "C-";
            this.gpa = 1.7;
        } else if (degree >= 64.0 && degree < 67.0) {
            this.letterGrade = "D+";
            this.gpa = 1.3;
        } else if (degree >= 60.0 && degree < 64.0) {
            this.letterGrade = "D";
            this.gpa = 1.0;
        } else {
            this.letterGrade = "F";
            this.gpa = 0.0;
        }
    }

    // Getter for letterGrade
    public String getLetterGrade() {
        return letterGrade;
    }

    // Getter for gpa
    public double getGpa() {
        return gpa;
    }
    
}