package application;

import java.util.Formatter;

public class OutputString {
	
	static String outputString;
	static String headerOutputString;
	public static String outString(Student student, double gpa, String grade)
	{
    	try (Formatter studentFMT = new Formatter()) {
			outputString =studentFMT.format("%-40s\t%-14s\t%-3s\t%-5s\n",student.getName(),student.getNumber(),gpa,grade).toString();
		}
		return outputString;
	}
	
	public static String headerOutString()
	{
    	try (Formatter fmt = new Formatter()) {
			headerOutputString =fmt.format("%-40s\t%-14s\t%-3s\t%-5s\n","Student Name","Student Number","GPA","Grade").toString();
		}
		return headerOutputString;
	}
}
