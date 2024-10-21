package application;

import java.util.ArrayList;

public class Elements {
	String[] splitter;
	Student student;
	ArrayList<String> courseElements = new ArrayList<String>();
	
	public Student studentElements (String myLine){
		splitter = myLine.split(",", -2);
		for (int i = 0; i < splitter.length; i++) {
			if (splitter[i] == "") {splitter[i] = " ";}
		}
		Student student = new Student(splitter[0],splitter[1], splitter[2], splitter[3], splitter[4], splitter[5]);
		return student;
	}
	
	public ArrayList<String> courseElements (String myLine){
		splitter = myLine.split(",", -2);
		for (int i = 0; i < splitter.length; i++) {
			if (splitter[i] == "") {splitter[i] = " ";}
		}
		courseElements.add(splitter[0]);
		courseElements.add(splitter[1]);
		courseElements.add(splitter[2]);
		return courseElements;
	}

}

