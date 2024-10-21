package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import application.Validator;

class ValidatorTest {
	
	@Test
	final void testValidateCourseNameShouldPassAlphabeticAndSpaces() {
		boolean result = Validator.validateCourseName("Software Testing");
		assertTrue(result,"The code mistakes valid Course Name for a wrong one");
	}
	
	@Test
	final void testValidateCourseNameShouldPassHasAlphabeticNoSpaces() {
		boolean result = Validator.validateCourseName("Software");
		assertTrue(result,"The code mistakes valid Course Name for a wrong one");
	}
	
	@Test
	final void testValidateCourseNameShouldFailHasNumber() {
		boolean result = Validator.validateCourseName("Software Testing1");
		assertFalse(result,"The code returns true for a name that has a number when it should return false");
	}
	
	@Test
	final void testValidateCourseNameShouldFailHasSpaceAtStart() {
		boolean result = Validator.validateCourseName(" Software Testing");
		assertFalse(result,"The code returns true for a name that has a space at start when it should return false");
	}
	
	@Test
	final void testValidateCourseNameShouldFailHasSpecialCharacter() {
		boolean result = Validator.validateCourseName("Software#Testing");
		assertFalse(result,"The code returns true for a name that has a special character when it should return false");
	}
	
	@Test
	final void testValidateCourseNameShouldFailEmptyString() {
		boolean result = Validator.validateCourseName("");
		assertFalse(result,"The code returns true for an empty string when it should return false");
	}
	
	@Test
	final void testValidateCourseNameShouldFailNullInput() {
		boolean result = Validator.validateCourseName(null);
		assertFalse(result,"The code returns true for a null input when it should return false");
	}

	@Test
	final void testValidateCourseCodeShouldPassWithoutS() {
		boolean result = Validator.validateCourseCode("phm012");
		assertTrue(result,"The code mistakes valid Course Code for a wrong one");
	}
	
	@Test
	final void testValidateCourseCodeShouldPassWithS() {
		boolean result = Validator.validateCourseCode("phm012s");
		assertTrue(result,"The code mistakes valid Course Code for a wrong one");
	}
	
	@Test
	final void testValidateCourseCodeShouldFailLessThanSixCharacters() {
		boolean result = Validator.validateCourseCode("phm01");
		assertFalse(result,"The code returns true for a code with less than 6 characters when it should return false");
	}
	
	@Test
	final void testValidateCourseCodeShouldFailMoreThanSevenCharacters() {
		boolean result = Validator.validateCourseCode("phm012sa");
		assertFalse(result,"The code returns true for a code with more than 7 characters when it should return false");
	}
	
	@Test
	final void testValidateCourseCodeShouldFailThreeNumericThenThreeAlphabetic() {
		boolean result = Validator.validateCourseCode("012phm");
		assertFalse(result,"The code returns true for a code with 3 Numeric Then 3 Alphabetic when it should return false");
	}
	
	@Test
	final void testValidateCourseCodeShouldFailTwoNumericThenFourAlphabetic() {
		boolean result = Validator.validateCourseCode("01phms");
		assertFalse(result,"The code returns true for a code with 2 Numeric Then 4 Alphabetic when it should return false");
	}
	
	@Test
	final void testValidateCourseCodeShouldFailOneNumericThenFiveAlphabetic() {
		boolean result = Validator.validateCourseCode("0phmas");
		assertFalse(result,"The code returns true for a code with 1 Numeric Then 5 Alphabetic when it should return false");
	}
	
	@Test
	final void testValidateCourseCodeShouldFailAllAlphabetic() {
		boolean result = Validator.validateCourseCode("phmall");
		assertFalse(result,"The code returns true for a code with all Alphabetic when it should return false");
	}
	
	@Test
	final void testValidateCourseCodeShouldFailFourAlphabeticThenTwoNumeric() {
		boolean result = Validator.validateCourseCode("phma11");
		assertFalse(result,"The code returns true for a code with 4 Alphabetic Then 2 Numeric when it should return false");
	}
	
	@Test
	final void testValidateCourseCodeShouldFailFiveAlphabeticThenOneNumeric() {
		boolean result = Validator.validateCourseCode("phman1");
		assertFalse(result,"The code returns true for a code with 5 Alphabetic Then 1 Numeric when it should return false");
	}
	
	@Test
	final void testValidateCourseCodeShouldFailAllNumeric() {
		boolean result = Validator.validateCourseCode("123456");
		assertFalse(result,"The code returns true for a code with all Numeric when it should return false");
	}
	
	@Test
	final void testValidateCourseCodeShouldFailAlternatingPatternA() {
		boolean result = Validator.validateCourseCode("p1h2m0");
		assertFalse(result,"The code returns true for a code with alternating pattern A it should return false");
	}
	
	@Test
	final void testValidateCourseCodeShouldFailAlternatingPatternB() {
		boolean result = Validator.validateCourseCode("ph12m0");
		assertFalse(result,"The code returns true for a code with alternating pattern B it should return false");
	}
	
	@Test
	final void testValidateCourseCodeShouldFailAlternatingPatternC() {
		boolean result = Validator.validateCourseCode("12p0hm");
		assertFalse(result,"The code returns true for a code with alternating pattern C it should return false");
	}
	
	@Test
	final void testValidateCourseCodeShouldFailAlternatingPatternD() {
		boolean result = Validator.validateCourseCode("12ph0m");
		assertFalse(result,"The code returns true for a code with alternating pattern D it should return false");
	}
	
	@Test
	final void testValidateCourseCodeShouldFailAlternatingPatternE() {
		boolean result = Validator.validateCourseCode("1p12hm");
		assertFalse(result,"The code returns true for a code with alternating pattern E it should return false");
	}
	
	@Test
	final void testValidateCourseCodeShouldFailSevenCharactersLastOneNotS() {
		boolean result = Validator.validateCourseCode("phm012a");
		assertFalse(result,"The code returns true for a code with 7 charachters and last one not s it should return false");
	}
	
	@Test
	final void testValidateCourseCodeShouldFailHasSpecialCharacter() {
		boolean result = Validator.validateCourseCode("phm01#");
		assertFalse(result,"The code returns true for a code with special character it should return false");
	}
	
	@Test
	final void testValidateCourseCodeShouldFailWrongPatternWithS() {
		boolean result = Validator.validateCourseCode("012phms");
		assertFalse(result,"The code returns true for a code with 3 Numeric Then 3 Alphabetic  with s it should return false");
		result = Validator.validateCourseCode("01phmss");
		assertFalse(result,"The code returns true for a code with 2 Numeric Then 4 Alphabetic  with s it should return false");
		result = Validator.validateCourseCode("0phmass");
		assertFalse(result,"The code returns true for a code with 1 Numeric Then 5 Alphabetic  with s it should return false");
		result = Validator.validateCourseCode("phmalls");
		assertFalse(result,"The code returns true for a code with all Alphabetic  with s it should return false");
		result = Validator.validateCourseCode("phma11s");
		assertFalse(result,"The code returns true for a code with 4 Alphabetic Then 2 Numeric  with s it should return false");
		result = Validator.validateCourseCode("phman1s");
		assertFalse(result,"The code returns true for a code with 5 Alphabetic Then 1 Numeric  with s it should return false");
		result = Validator.validateCourseCode("123456s");
		assertFalse(result,"The code returns true for a code with all Numeric  with s it should return false");
		result = Validator.validateCourseCode("p1h2m0s");
		assertFalse(result,"The code returns true for a code with alternating pattern A with s it should return false");
		result = Validator.validateCourseCode("ph12m0s");
		assertFalse(result,"The code returns true for a code with alternating pattern B with s it should return false");
		result = Validator.validateCourseCode("12p0hms");
		assertFalse(result,"The code returns true for a code with alternating pattern C with s it should return false");
		result = Validator.validateCourseCode("12ph0ms");
		assertFalse(result,"The code returns true for a code with alternating pattern D with s it should return false");
		result = Validator.validateCourseCode("1p12hms");
		assertFalse(result,"The code returns true for a code with alternating pattern E with s it should return false");
	}
	
	@Test
	final void testValidateCourseCodeShouldFailEmptyString() {
		boolean result = Validator.validateCourseName("");
		assertFalse(result,"The code returns true for an empty string when it should return false");
	}
	
	@Test
	final void testValidateCourseCodeShouldFailNullInput() {
		boolean result = Validator.validateCourseName(null);
		assertFalse(result,"The code returns true for a null input when it should return false");
	}

	@Test
	final void testValidateFullMarkShouldPass() {
		boolean result = Validator.validateFullMark("100");
		assertTrue(result,"The code mistakes valid Course Code for a wrong one");
	}
	
	@Test
	final void testValidateFullMarkShouldFailInputNot100() {
		boolean result = Validator.validateFullMark("different");
		assertFalse(result,"The code returns true for an input other than 100 when it should return false");
	}
	
	@Test
	final void testValidateFullMarkShouldFailEmptyString() {
		boolean result = Validator.validateFullMark("");
		assertFalse(result,"The code returns true for an empty string when it should return false");
	}
	
	@Test
	final void testValidateFullMarkShouldFailNullInput() {
		boolean result = Validator.validateFullMark(null);
		assertFalse(result,"The code returns true for a null input when it should return false");
	}
	
	/*Integration Test*/
	@Test
	final void testValidateCourseShouldPass() {
		ArrayList<String> course = new ArrayList<String>();
		course.add("Software Testing");
		course.add("CSE337S");
		course.add("100");
		String expected="";
		String actual = Validator.validateCourse(course);
		assertEquals(expected,actual,"The code mistakes valid Course Code for a wrong one");
	}
	
	/*Integration Test*/
	@Test
	final void testValidateCourseShouldFailInvalidCourseName() {
		ArrayList<String> course = new ArrayList<String>();
		course.add(" Software Testing");
		course.add("CSE337S");
		course.add("100");
		String expected="Course Name invalid";
		String actual = Validator.validateCourse(course);
		assertEquals(expected,actual,"The code treats invalid course name as valid");
	}
	
	/*Integration Test*/
	@Test
	final void testValidateCourseShouldFailInvalidCourseCode() {
		ArrayList<String> course = new ArrayList<String>();
		course.add("Software Testing");
		course.add("CSE33");
		course.add("100");
		String expected="Course Code invalid";
		String actual = Validator.validateCourse(course);
		assertEquals(expected,actual,"The code treats invalid course code as valid");
	}
	
	/*Integration Test*/
	@Test
	final void testValidateCourseShouldFailInvalidFullMark() {
		ArrayList<String> course = new ArrayList<String>();
		course.add("Software Testing");
		course.add("CSE337S");
		course.add("different");
		String expected="Course Full Mark invalid";
		String actual = Validator.validateCourse(course);
		assertEquals(expected,actual,"The code treats invalid full mark as valid");
	}
	
	/*Integration Test*/
	@Test
	final void testValidateCourseShouldFailInvalidArrayInput() {
		ArrayList<String> course = new ArrayList<String>();
		course.add("Software Testing");
		String expected="invalid input";
		String actual = Validator.validateCourse(course);
		assertEquals(expected,actual,"The code treats invalid array as valid");
	}
	
	/*Integration Test*/
	@Test
	final void testValidateCourseShouldFailNullArray() {
		String expected="invalid input";
		String actual = Validator.validateCourse(null);
		assertEquals(expected,actual,"The code treats null array as valid");
	}

	@Test
	final void testValidateStudentNameShouldPassAlphabeticAndSpaces() {
		boolean result = Validator.validateStudentName("Islam Zidan Mohammed Alalalmy");
		assertTrue(result,"The code mistakes valid Student Name for a wrong one");
	}
	
	@Test
	final void testValidateStudentNameShouldPassHasAlphabeticNoSpaces() {
		boolean result = Validator.validateStudentName("Islam");
		assertTrue(result,"The code mistakes valid Student Name for a wrong one");
	}
	
	@Test
	final void testValidateStudentNameShouldFailHasNumber() {
		boolean result = Validator.validateStudentName("Islam Zidan Mohammed Alalalmy1");
		assertFalse(result,"The code returns true for a name that has a number when it should return false");
	}
	
	@Test
	final void testValidateStudentNameShouldFailHasSpaceAtStart() {
		boolean result = Validator.validateStudentName(" Islam Zidan Mohammed Alalalmy");
		assertFalse(result,"The code returns true for a name that has a space at start when it should return false");
	}
	
	@Test
	final void testValidateStudentNameShouldFailHasSpecialCharacter() {
		boolean result = Validator.validateStudentName("Islam#Zidan Mohammed Alalalmy");
		assertFalse(result,"The code returns true for a name that has a special character when it should return false");
	}
	
	@Test
	final void testValidateStudentNameShouldFailEmptyString() {
		boolean result = Validator.validateStudentName("");
		assertFalse(result,"The code returns true for an empty string when it should return false");
	}
	
	@Test
	final void testValidateStudentNameShouldFailNullInput() {
		boolean result = Validator.validateStudentName(null);
		assertFalse(result,"The code returns true for a null input when it should return false");
	}
	
	@Test
	final void testValidateStudentNumberShouldPassNumbersOnly() {
		boolean result = Validator.validateStudentNumber("19001461");
		assertTrue(result,"The code mistakes valid Student Name for a wrong one");
	}

	@Test
	final void testValidateStudentNumberShouldPassNumbersEndWithCharacter() {
		boolean result = Validator.validateStudentNumber("1900146p");
		assertTrue(result,"The code mistakes valid Student Name for a wrong one");
	}
	
	@Test
	final void testValidateStudentNumberShouldFaillessthan8characters() {
		boolean result = Validator.validateStudentNumber("1900146");
		assertFalse(result,"The code returns true for a number with less than 8 characters when it should return false");
		
	}
	
	@Test
	final void testValidateStudentNumberShouldFailMorethan8characters() {
		boolean result = Validator.validateStudentNumber("19001461p");
		assertFalse(result,"The code returns true for a number with more than 8 characters when it should return false");
	}
	
	@Test
	final void testValidateStudentNumberShouldFailNumbersCharactersOtherThanEnd1() {
		boolean result = Validator.validateStudentNumber("19ab146p");
		assertFalse(result,"The code returns true for a number with characters at a random position other than end when it should return false");
	}
	
	@Test
	final void testValidateStudentNumberShouldFailNumbersCharactersOtherThanEnd2() {
		boolean result = Validator.validateStudentNumber("a19b1461");
		assertFalse(result,"The code returns true for a number with characters at a random position other than end when it should return false");
	}
	
	@Test
	final void testValidateStudentNumberShouldFailNumbersAndSpecialCharacterAtEnd() {
		boolean result = Validator.validateStudentNumber("1900146#");
		assertFalse(result,"The code returns true for a number with special characters at end when it should return false");
	}
	
	@Test
	final void testValidateStudentNumberShouldFailNumbersAndSpecialCharacterNotAtEnd() {
		boolean result = Validator.validateStudentNumber("#1900146");
		assertFalse(result,"The code returns true for a number with special characters not at end when it should return false");
	}
	
	@Test
	final void testValidateStudentNumberShouldFailEmptyString() {
		boolean result = Validator.validateStudentNumber("");
		assertFalse(result,"The code returns true for an empty string when it should return false");
	}
	
	@Test
	final void testValidateStudentNumberShouldFailNullInput() {
		boolean result = Validator.validateStudentNumber(null);
		assertFalse(result,"The code returns true for a null input when it should return false");
	}
	

	@Test
	final void testValidateStudentActivitiesMark() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testValidateStudentOralMark() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testValidateStudentMidtermMark() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testValidateStudentFinalMark() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testValidateStudent() {
		fail("Not yet implemented"); // TODO
	}

}
