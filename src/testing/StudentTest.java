package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import application.Student;

class StudentTest {
	Student student= null;
	
	@BeforeEach
	void setUp() throws Exception {
		student = new Student("islam zidan mohammed alalamy","1900146p","5","5","20","60");
	}

	@AfterEach
	void tearDown() throws Exception {
		student = null;
	}

	@Test
	final void testGetName() throws Exception {
		setUp();
		String expected="islam zidan mohammed alalamy";
		String actual = student.getName();
		assertEquals(expected,actual,"get name returns wrong name");
		tearDown();
	}

	@Test
	final void testSetName() throws Exception {
		setUp();
		student.setName("Ahmed Ehab Fathy Abdelwahaab");
		final Field field = student.getClass().getDeclaredField("name");
        field.setAccessible(true);
        assertEquals("Ahmed Ehab Fathy Abdelwahaab",field.get(student),"names didn't match");
        tearDown();
	}

	@Test
	final void testGetNumber() throws Exception {
		setUp();
		String expected="1900146p";
		String actual = student.getNumber();
		assertEquals(expected,actual,"get number returns wrong number");
		tearDown();
	}

	@Test
	final void testSetNumber() throws Exception {
		setUp();
		student.setNumber("1901073p");
		final Field field = student.getClass().getDeclaredField("number");
        field.setAccessible(true);
        assertEquals("1901073p",field.get(student),"numbers didn't match");
        tearDown();
	}

	@Test
	final void testGetActivitiesMark() throws Exception {
		setUp();
		String expected="5";
		String actual = student.getActivitiesMark();
		assertEquals(expected,actual,"get Activities Mark returns wrong Mark");
		tearDown();
	}

	@Test
	final void testSetActivitiesMark() throws Exception {
		setUp();
		student.setActivitiesMark("10");
		final Field field = student.getClass().getDeclaredField("activitiesMark");
        field.setAccessible(true);
        assertEquals("10",field.get(student),"activities Mark didn't match");
        tearDown();
	}

	@Test
	final void testGetOralMark() throws Exception {
		setUp();
		String expected="5";
		String actual = student.getOralMark();
		assertEquals(expected,actual,"get Oral Mark returns wrong Mark");
		tearDown();
	}

	@Test
	final void testSetOralMark() throws Exception {
		setUp();
		student.setOralMark("10");
		final Field field = student.getClass().getDeclaredField("oralMark");
        field.setAccessible(true);
        assertEquals("10",field.get(student),"oral Mark didn't match");
        tearDown();
	}

	@Test
	final void testGetMidtermMark() throws Exception {
		setUp();
		String expected="20";
		String actual = student.getMidtermMark();
		assertEquals(expected,actual,"get Midterm Mark returns wrong Mark");
		tearDown();
	}

	@Test
	final void testSetMidtermMark() throws Exception {
		setUp();
		student.setMidtermMark("15");
		final Field field = student.getClass().getDeclaredField("midtermMark");
        field.setAccessible(true);
        assertEquals("15",field.get(student),"midterm Mark didn't match");
        tearDown();
	}

	@Test
	final void testGetFinalExamMark() throws Exception {
		setUp();
		String expected="60";
		String actual = student.getFinalExamMark();
		assertEquals(expected,actual,"get Final Exam Mark returns wrong Mark");
		tearDown();
	}

	@Test
	final void testSetFinalExamMark() throws Exception {
		setUp();
		student.setFinalExamMark("55");
		final Field field = student.getClass().getDeclaredField("finalExamMark");
        field.setAccessible(true);
        assertEquals("55",field.get(student),"finalExam Mark didn't match");
        tearDown();
	}

}
