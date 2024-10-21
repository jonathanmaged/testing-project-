package application;
	
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Elements elements = new Elements();
		BufferedReader inputFileBufferedReader = null;
		FileWriter outputFileWriter = null;
		try {
			try (Scanner inScanner = new Scanner(System.in)) {
				System.out.print("Enter input file name if its in the same directory or full path if not: ");
				String inFile = inScanner.next();
				System.out.println("You entered: " + inFile); 
				File inputFile = new File(inFile);
				FileReader inputFileReader = new FileReader(inputFile); // java.io.FileReader
				outputFileWriter = new FileWriter("output.txt");
				inputFileBufferedReader = new BufferedReader(inputFileReader); // java.io.BufferedReader
			}
			String line;
            String subjectLine=inputFileBufferedReader.readLine();
            ArrayList<String> course = elements.courseElements(subjectLine);
            String message = Validator.validateCourse(course);
            if(message.equals(""))
            	outputFileWriter.write("Subject Name: "+course.get(0)+"\tMax Mark: "+course.get(2)+"\n");
            else
            	outputFileWriter.write(message+"\n");
            outputFileWriter.write(OutputString.headerOutString());
            while ((line = inputFileBufferedReader.readLine()) != null) {
            	Student student = elements.studentElements(line);
            	String errorMessage = Validator.validateStudent(student);
            	if(errorMessage.equals("")) {
	            	Calculator calculator = new Calculator(student);
	            	outputFileWriter.write(OutputString.outString(student, calculator.getGpa(), calculator.getLetterGrade()));
            	}
            	else {
            		outputFileWriter.write(errorMessage+"\n");
            	}
            }
          }
          catch(IOException e) { e.printStackTrace();}
          finally
          {
              try { 
            	  if (inputFileBufferedReader != null) inputFileBufferedReader.close();
            	  if (outputFileWriter != null) outputFileWriter.close();
            	  System.out.println("done");
              }
              catch(IOException e) { e.printStackTrace(); }
          }
	}
}
