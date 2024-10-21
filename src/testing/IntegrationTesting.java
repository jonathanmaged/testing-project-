package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import application.Student;
import application.Validator;

public class IntegrationTesting {
	/*Integration Test*/
    @Test
    final void validateStudentSuccess() {
        Student student = new Student("Ahmed Ehab","1900146p", "10","10","20","60");
        String expected="";
        String actual = Validator.validateStudent(student);
        assertEquals(expected,actual,"The code mistakes valid student Code for a wrong one");
    }

    /*Integration Test*/
    @Test
    final void validateStudentInvalidName() {
    	Student student = new Student(null,"1900146p", "10","10","20","60");
        String expected="Student Name invalid";
        String actual = Validator.validateStudent(student);
        assertEquals(expected,actual,"The code treats invalid course name as valid");
    }
    
    /*Integration Test*/
    @Test
    final void validateStudentInvalidNumber() {
    	Student student = new Student("Ahmed Ehab","1901073", "10","10","20","60");
        String expected="Student Number invalid";
        String actual = Validator.validateStudent(student);
        assertEquals(expected,actual,"The code treats invalid course code as valid");
    }
    
    /*Integration Test*/
    @Test
    final void validateStudentInvalidActivitiesMark() {
    	Student student = new Student("Ahmed Ehab","1900146p", "A","10","20","40");
        String expected="Student Activities Mark invalid";
        String actual = Validator.validateStudent(student);
        assertEquals(expected,actual,"The code treats invalid full mark as valid");
    }
    
    /*Integration Test*/
    @Test
    final void validateStudentInvalidOralMark() {
    	Student student = new Student("Ahmed Ehab","1900146p", "10","","20","50");
        String expected="Student Oral Mark invalid";
        String actual = Validator.validateStudent(student);
        assertEquals(expected,actual,"The code treats invalid full mark as valid");
    }
    
    /*Integration Test*/
    @Test
    final void validateStudentInvalidMidTermMark() {
    	Student student = new Student("Ahmed Ehab","1900146p", "10","2","#","50");
        String expected="Student Midterm Mark invalid";
        String actual = Validator.validateStudent(student);
        assertEquals(expected,actual,"The code treats invalid full mark as valid");
    }
    
    /*Integration Test*/
    @Test
    final void validateStudentInvalidFinalMark() {
    	Student student = new Student("Ahmed Ehab","1900146p", "10","2","19","70");
        String expected="Student Final Exam Mark invalid";
        String actual = Validator.validateStudent(student);
        assertEquals(expected,actual,"The code treats invalid full mark as valid");
    }

    /*Integration Test*/
    @Test
    final void validateStudentFailNullArray() {
        String expected="invalid input";
        String actual = Validator.validateStudent(null);
        assertEquals(expected,actual,"The code treats null array as valid");
    }
}
