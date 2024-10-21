package testing;

import application.*;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class ElementJUnitTest {
	
	Elements stElement = new Elements();
	Elements courseElement = new Elements();
	Student s1;
	ArrayList<String> c1 = new ArrayList<String>();

	
	//Testing studentElements function
	@Test
	public void studentSampleTest1 () {
		String studentTest = "ahmed,19010p73,15,10,50,90";
		s1 = stElement.studentElements(studentTest);

		assertEquals("ahmed", s1.getName());
		assertEquals("19010p73", s1.getNumber());
		assertEquals("15", s1.getActivitiesMark());
		assertEquals("10", s1.getOralMark());
		assertEquals("50", s1.getMidtermMark());
		assertEquals("90", s1.getFinalExamMark());
	}
	@Test
	public void studentSampleTest2 () {
		String studentTest = "123,,  ABCD#a ,  1f0,50,#";
		s1 = stElement.studentElements(studentTest);

		assertEquals("123", s1.getName());
		assertEquals(" ", s1.getNumber());
		assertEquals("  ABCD#a ", s1.getActivitiesMark());
		assertEquals("  1f0", s1.getOralMark());
		assertEquals("50", s1.getMidtermMark());
		assertEquals("#", s1.getFinalExamMark());
	}
	@Test
	public void studentSampleTest3 () {
		String studentTest = "     ,1d,15,     ,,#";
		s1 = stElement.studentElements(studentTest);

		assertEquals("     ", s1.getName());
		assertEquals("1d", s1.getNumber());
		assertEquals("15", s1.getActivitiesMark());
		assertEquals("     ", s1.getOralMark());
		assertEquals(" ", s1.getMidtermMark());
		assertEquals("#", s1.getFinalExamMark());
	}
	public void studentSampleTest4 () {
		String studentTest = ",,,,,";
		s1 = stElement.studentElements(studentTest);

		assertEquals(" ", s1.getName());
		assertEquals(" ", s1.getNumber());
		assertEquals(" ", s1.getActivitiesMark());
		assertEquals(" ", s1.getOralMark());
		assertEquals(" ", s1.getMidtermMark());
		assertEquals(" ", s1.getFinalExamMark());
	}
	
	
	//Testing courseElements function
	@Test
	public void courseSampleTest1 () {
		String courseTest = "Vibration and Waves,PHM012s,100";
		c1 = stElement.courseElements(courseTest);

		assertEquals("Vibration and Waves", c1.get(0));
		assertEquals("PHM012s", c1.get(1));
		assertEquals("100", c1.get(2));
	}
	@Test
	public void courseSampleTest2 () {
		String courseTest = "1 23, #, ab@3";
		c1 = stElement.courseElements(courseTest);

		assertEquals("1 23", c1.get(0));
		assertEquals(" #", c1.get(1));
		assertEquals(" ab@3", c1.get(2));
	}
	@Test
	public void courseSampleTest3 () {
		String courseTest = ",,";
		c1 = stElement.courseElements(courseTest);

		assertEquals(" ", c1.get(0));
		assertEquals(" ", c1.get(1));
		assertEquals(" ", c1.get(2));
	}
}
