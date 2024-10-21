package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import application.Elements;
import application.Student;
import application.Validator;

public class DecisionAndPathTesting {
	/*Decision Test*/
    @Test
    final void validateStudentNumberDecision1() {
    	boolean validateNum = Validator.validateStudentNumber("1900146p");
        assertEquals(validateNum, true,"The code treats invalid course code as valid");
    }
    
    /*Decision Test*/
    @Test
    final void validateStudentNumberDecision2() {
    	boolean validateNum = Validator.validateStudentNumber(null);
        assertEquals(validateNum, false,"The code treats invalid course code as valid");
    }
    
    /*Decision Test*/
    @Test
    final void validateStudentNumberDecision3() {
    	boolean validateNum = Validator.validateStudentNumber("1901073");
        assertEquals(validateNum, false,"The code treats invalid course code as valid");
    }
    
    /*Decision Test*/
    @Test
    final void validateStudentNumberDecision4() {
    	boolean validateNum = Validator.validateStudentNumber("1900146#");
        assertEquals(validateNum, false,"The code treats invalid course code as valid");
    }
    

    /*Path Test*/
    @Test
    final void validateStudentElementsPath1() {
    	String myLine = "Ahmed Ehab,1901073p,10,5,15,42";
    	Student expected = new Student ("Ahmed Ehab", "1901073p", "10", "5", "15" ,"42");
    	Elements e = new Elements();
    	Student actual = e.studentElements(myLine);
        assertEquals(expected.getName(), actual.getName(),"The code treats invalid course code as valid");
        assertEquals(expected.getNumber(), actual.getNumber(),"The code treats invalid course code as valid");
        assertEquals(expected.getActivitiesMark(), actual.getActivitiesMark(),"The code treats invalid course code as valid");
        assertEquals(expected.getOralMark(), actual.getOralMark(),"The code treats invalid course code as valid");
        assertEquals(expected.getMidtermMark(), actual.getMidtermMark(),"The code treats invalid course code as valid");
        assertEquals(expected.getFinalExamMark(), actual.getFinalExamMark(),"The code treats invalid course code as valid");
    }
    
    /*Path Test*/
    @Test
    final void validateStudentElementsPath2() {
    	String myLine = ",1901073p, ,5,15,42";
    	Student expected = new Student (" ", "1901073p", " ", "5", "15" ,"42");
    	Elements e = new Elements();
    	Student actual = e.studentElements(myLine);
        assertEquals(expected.getName(), actual.getName(),"The code treats invalid course code as valid");
        assertEquals(expected.getNumber(), actual.getNumber(),"The code treats invalid course code as valid");
        assertEquals(expected.getActivitiesMark(), actual.getActivitiesMark(),"The code treats invalid course code as valid");
        assertEquals(expected.getOralMark(), actual.getOralMark(),"The code treats invalid course code as valid");
        assertEquals(expected.getMidtermMark(), actual.getMidtermMark(),"The code treats invalid course code as valid");
        assertEquals(expected.getFinalExamMark(), actual.getFinalExamMark(),"The code treats invalid course code as valid");
    }
    
    /*Path Test*/
    @Test
    final void validateStudentNumberPath1() {
    	boolean validateNum = Validator.validateStudentNumber("1900146p");
        assertEquals(validateNum, true,"The code treats invalid course code as valid");
    }
}
