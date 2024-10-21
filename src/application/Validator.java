package application;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	
	public static boolean validateCourseName(String courseName){
		if(courseName == null || courseName.isEmpty()) {return false;}
		Pattern pattern = Pattern.compile("^[ A-Za-z]+$");
		Matcher matcher = pattern.matcher(courseName);
		boolean matchFound = matcher.find();
	    if(matchFound && (courseName.charAt(0) != ' ')) {
	      return true;
	    } else {
	      return false;
	    }
	}
	
	public static boolean validateCourseCode(String courseCode) {
		if(courseCode == null || courseCode.isEmpty()) {return false;}
		if(courseCode.length()==6) {
			Pattern pattern = Pattern.compile("[a-zA-Z][a-zA-Z][a-zA-Z][0-9][0-9][0-9]");
			Matcher matcher = pattern.matcher(courseCode);
			boolean matchFound = matcher.find();
		    if(matchFound) {
		      return true;
		    } else {
		      return false;
		    }
	    }
		else if(courseCode.length()==7) {
			Pattern pattern = Pattern.compile("[a-zA-Z][a-zA-Z][a-zA-Z][0-9][0-9][0-9]");
			Matcher matcher = pattern.matcher(courseCode);
			boolean matchFound = matcher.find();
		    if(matchFound && (courseCode.charAt(6) == 's' || courseCode.charAt(6) == 'S')) {
		      return true;
		    } else {
		      return false;
		    }
		}
		else {
	    	return false;
	    }
	}
	
	public static boolean validateFullMark(String fullMark) {
		if(fullMark == null || fullMark.isEmpty()) {return false;}
		if(fullMark.equals("100")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String validateCourse(ArrayList<String> course) {
		if(course == null || course.size() != 3) {return "invalid input";}
		if(!validateCourseName(course.get(0))) {
			return "Course Name invalid";
		}
		else if(!validateCourseCode(course.get(1))) {
			return "Course Code invalid";
		}
		else if(!validateFullMark(course.get(2))) {
			return "Course Full Mark invalid";
		}
		else {
			return "";
		}
	}
	
	public static boolean validateStudentName(String studentName) {
		if(studentName == null || studentName.isEmpty()) {return false;}
		Pattern pattern = Pattern.compile("^[ A-Za-z]+$");
		Matcher matcher = pattern.matcher(studentName);
		boolean matchFound = matcher.find();
	    if(matchFound && (studentName.charAt(0) != ' ')) {
	      return true;
	    } else {
	      return false;
	    }
	}

	public static boolean validateStudentNumber(String studentNumber) {
		if(studentNumber == null || studentNumber.isEmpty()) {return false;}
		if(studentNumber.length()==8) {
			Pattern pattern = Pattern.compile("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][a-zA-Z0-9]");
			Matcher matcher = pattern.matcher(studentNumber);
			boolean matchFound = matcher.find();
		    if(matchFound) {
		      return true;
		    } else {
		      return false;
		    }
		}
		else {
			return false;
		}
	}

	public static boolean validateStudentActivitiesMark(String studentActivitiesMark) {
		try {
	        Integer mark=Integer.parseInt(studentActivitiesMark);
	        if(mark>=0 && mark <= 10) {
	        	return true;
	        }
	        else {
	        	return false;
	        }
	    }
	    catch( Exception e ) {
	        return false;
	    }
	}
	
	public static boolean validateStudentOralMark(String studentOralMark) {
		try {
	        Integer mark=Integer.parseInt(studentOralMark);
	        if(mark>=0 && mark <= 10) {
	        	return true;
	        }
	        else {
	        	return false;
	        }
	    }
	    catch( Exception e ) {
	        return false;
	    }
	}
	
	public static boolean validateStudentMidtermMark(String studentMidtermMark) {
		try {
	        Integer mark=Integer.parseInt(studentMidtermMark);
	        if(mark>=0 && mark <= 20) {
	        	return true;
	        }
	        else {
	        	return false;
	        }
	    }
	    catch( Exception e ) {
	        return false;
	    }
	}
	
	public static boolean validateStudentFinalMark(String studentFinalMark) {
		try {
	        Integer mark=Integer.parseInt(studentFinalMark);
	        if(mark>=0 && mark <= 60) {
	        	return true;
	        }
	        else {
	        	return false;
	        }
	    }
	    catch( Exception e ) {
	        return false;
	    }
	}

	public static String validateStudent(Student student) {
		if(student == null) {return "invalid input";}
		if(!validateStudentName(student.getName())) {
			return "Student Name invalid";
		}
		else if(!validateStudentNumber(student.getNumber())) {
			return "Student Number invalid";
		}
		else if(!validateStudentActivitiesMark(student.getActivitiesMark())) {
			return "Student Activities Mark invalid";
		}
		else if(!validateStudentOralMark(student.getOralMark())) {
			return "Student Oral Mark invalid";
		}
		else if(!validateStudentMidtermMark(student.getMidtermMark())) {
			return "Student Midterm Mark invalid";
		}
		else if(!validateStudentFinalMark(student.getFinalExamMark())) {
			return "Student Final Exam Mark invalid";
		}
		
		else {
			return "";
		}
	}
}
