package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Formatter;

import org.junit.jupiter.api.Test;

import application.Calculator;
import application.Student;
import application.OutputString;

class OutputStringTest {

	@Test
	void testHeaderOutString() {
		String expected = new Formatter().format("%-40s\t%-14s\t%-3s\t%-5s\n","Student Name",
												"Student Number","GPA","Grade").toString();
		String actual = OutputString.headerOutString();
		assertEquals(expected, actual, "The test for the headerOutString function has failed.");
	}
	
	@Test
	void testOutputString() {
		
		Student stud = new Student("Abdelrahman Mohammed", "1900829", "15", "5", "10", "50");
		Calculator calculator = new Calculator(stud);
		
		String expected = new Formatter().format("%-40s\t%-14s\t%-3s\t%-5s\n", 
							"Abdelrahman Mohammed", "1900829", "3.0", "B").toString();
		String actual = OutputString.outString(stud, calculator.getGpa(), calculator.getLetterGrade());
		assertEquals(expected, actual, "The test for the OutputString function has failed.");
	}

}
