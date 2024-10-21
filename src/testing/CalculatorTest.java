package testing;
import application.Calculator ;
import application.Student;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void testCalculateGpaAplus() {
	    Student student = new Student("John Doe", "1234", "10", "10", "20", "60");
	    Calculator calculator = new Calculator(student);
	    calculator.calculateGpa();
	    assertEquals("A+", calculator.getLetterGrade());
	    assertEquals(4.0, calculator.getGpa(), 0.1);
	}

	@Test
	public void testCalculateGpaA() {
	    Student student = new Student("John Doe", "1234", "8", "8", "20", "60");
	    Calculator calculator = new Calculator(student);
	    calculator.calculateGpa();
	    assertEquals("A", calculator.getLetterGrade());
	    assertEquals(4.0, calculator.getGpa(), 0.1);
	}

	@Test
	public void testCalculateGpaAminus() {
	    Student student = new Student("John Doe", "1234","8", "8", "16", "60");
	    Calculator calculator = new Calculator(student);
	    calculator.calculateGpa();
	    assertEquals("A-", calculator.getLetterGrade());
	    assertEquals(3.7, calculator.getGpa(), 0.1);
	}

	@Test
	public void testCalculateGpaBplus() {
	    Student student = new Student("John Doe", "1234", "8", "8", "16", "56");
	    Calculator calculator = new Calculator(student);
	    calculator.calculateGpa();
	    assertEquals("B+", calculator.getLetterGrade());
	    assertEquals(3.3, calculator.getGpa(), 0.1);
	}

	@Test
	public void testCalculateGpaB() {
	    Student student = new Student("John Doe", "1234", "8", "8", "12", "55");
	    Calculator calculator = new Calculator(student);
	    calculator.calculateGpa();
	    assertEquals("B", calculator.getLetterGrade());
	    assertEquals(3.0, calculator.getGpa(), 0.1);
	}

	@Test
	public void testCalculateGpaBminus() {
	    Student student = new Student("John Doe", "1234", "8", "4", "12", "55");
	    Calculator calculator = new Calculator(student);
	    calculator.calculateGpa();
	    assertEquals("B-", calculator.getLetterGrade());
	    assertEquals(2.7, calculator.getGpa(), 0.1);
	}

	@Test
	public void testCalculateGpaCplus() {
	    Student student = new Student("John Doe", "1234", "8", "4", "12", "51");
	    Calculator calculator = new Calculator(student);
	    calculator.calculateGpa();
	    assertEquals("C+", calculator.getLetterGrade());
	    assertEquals(2.3, calculator.getGpa(), 0.1);
	}

	@Test
	public void testCalculateGpaC() {
	    Student student = new Student("John Doe", "1234", "4", "4", "12", "51");
	    Calculator calculator = new Calculator(student);
	    calculator.calculateGpa();
	    assertEquals("C", calculator.getLetterGrade());
	    assertEquals(2.0, calculator.getGpa(), 0.1);
	}

	@Test
	public void testCalculateGpaCminus() {
	    Student student = new Student("John Doe", "1234", "4", "4", "12", "47");
	    Calculator calculator = new Calculator(student);
	    calculator.calculateGpa();
	    assertEquals("C-", calculator.getLetterGrade());
	    assertEquals(1.7, calculator.getGpa(), 0.1);
	}

	@Test
	public void testCalculateGpaDplus() {
	    Student student = new Student("John Doe", "1234", "4", "4", "12", "44");
	    Calculator calculator = new Calculator(student);
	    calculator.calculateGpa();
	    assertEquals("D+", calculator.getLetterGrade());
	    assertEquals(1.3, calculator.getGpa(), 0.1);
	}

	@Test
	public void testCalculateGpaD() {
	    Student student = new Student("John Doe", "1234","4", "4", "12", "40");
	    Calculator calculator = new Calculator(student);
	    calculator.calculateGpa();
	    assertEquals("D", calculator.getLetterGrade());
	    assertEquals(1.0, calculator.getGpa(), 0.1);
	}

	@Test
	public void testCalculateGpaF() {
	    Student student = new Student("John Doe", "1234", "4", "4", "8", "40");
	    Calculator calculator = new Calculator(student);
	    calculator.calculateGpa();
	    assertEquals("F", calculator.getLetterGrade());
	    assertEquals(0.0, calculator.getGpa(), 0.1);
	}
	// A+
	@Test
	public void testCalculateGpaBoundaryAplus() {
		Student student = new Student("John Doe", "1234", "10", "10", "20", "57");
	    Calculator calculator = new Calculator(student);
	    calculator.calculateGpa();
	    assertEquals("A+", calculator.getLetterGrade());
	    assertEquals(4.0, calculator.getGpa(), 0.1);
	}

	// A
	@Test
	public void testCalculateGpaBoundaryA() {
		Student student = new Student("John Doe", "1234", "10", "9", "20", "54");
	    Calculator calculator = new Calculator(student);
	    calculator.calculateGpa();
	    assertEquals("A", calculator.getLetterGrade());
	    assertEquals(4.0, calculator.getGpa(), 0.1);
	}

	// A-
	@Test
	public void testCalculateGpaBoundaryAminus() {
	    Student student = new Student("Jane Doe", "5678", "9", "8", "12", "60");
	    Calculator calculator = new Calculator(student);
	    calculator.calculateGpa();
	    assertEquals("A-", calculator.getLetterGrade());
	    assertEquals(3.7, calculator.getGpa(), 0.1);
	}

	// B+
	@Test
	public void testCalculateGpaBoundaryBplus() {
		Student student = new Student("John Doe", "1234", "7", "8", "20", "49");
	    Calculator calculator = new Calculator(student);
	    calculator.calculateGpa();
	    assertEquals("B+", calculator.getLetterGrade());
	    assertEquals(3.3, calculator.getGpa(), 0.1);
	}

	// B
	@Test
	public void testCalculateGpaBoundaryB() {
	    Student student = new Student("Jane Smith", "5678", "8", "10", "32", "30");
	    Calculator calculator = new Calculator(student);
	    calculator.calculateGpa();
	    assertEquals("B", calculator.getLetterGrade());
	    assertEquals(3.0, calculator.getGpa(), 0.1);
	}

	// B-
	@Test
	public void testCalculateGpaBoundaryBminus() {
		Student student = new Student("John Doe", "1234", "10", "10", "20", "36");
	    Calculator calculator = new Calculator(student);
	    calculator.calculateGpa();
	    assertEquals("B-", calculator.getLetterGrade());
	    assertEquals(2.7, calculator.getGpa(), 0.1);
	}

	// C+
	@Test
	public void testCalculateGpaBoundaryCplus() {
		Student student = new Student("John Doe", "1234", "7", "10", "16", "40");
	    Calculator calculator = new Calculator(student);
	    calculator.calculateGpa();
	    assertEquals("C+", calculator.getLetterGrade());
	    assertEquals(2.3, calculator.getGpa(), 0.1);
	}

	// C
	@Test
	public void testCalculateGpaBoundaryC() {
		Student student = new Student("John Doe", "1234", "9", "10", "20", "31");

	    Calculator calculator = new Calculator(student);
	    calculator.calculateGpa();
	    assertEquals("C", calculator.getLetterGrade());
	    assertEquals(2.0, calculator.getGpa(), 0.1);
	}

	// C-
	@Test
	public void testCalculateGpaBoundaryCminus() {
		Student student = new Student("John Doe", "1234", "9", "9", "19", "30");
	    Calculator calculator = new Calculator(student);
	    calculator.calculateGpa();
	    assertEquals("C-", calculator.getLetterGrade());
	    assertEquals(1.7, calculator.getGpa(), 0.1);
	}
	@Test
	public void testCalculateGpaboundaryDplus() {
		Student student = new Student("John Doe", "1234", "10", "10", "12", "32");
	    Calculator calculator = new Calculator(student);
	    calculator.calculateGpa();
	    assertEquals("D+", calculator.getLetterGrade());
	    assertEquals(1.3, calculator.getGpa(), 0.1);
	}

	@Test
	public void testCalculateGpaboundaryD() {
	    Student student = new Student("John Doe", "1234", "10", "10", "8", "32");
	    Calculator calculator = new Calculator(student);
	    calculator.calculateGpa();
	    assertEquals("D", calculator.getLetterGrade());
	    assertEquals(1.0, calculator.getGpa(), 0.1);
	}


}
