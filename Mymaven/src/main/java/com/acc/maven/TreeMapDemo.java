package com.acc.maven;
import java.util.*;
public class TreeMapDemo {
	public static void main(String[] args) {
		
		TreeMap<Integer,String> courseMap = new TreeMap<Integer, String>();
		
		courseMap.put(1001, "SoftwareEngineering");
		courseMap.put(1005, "DBMS");
		courseMap.put(1002, "EngineeringMathematics");
		courseMap.put(1010, "OOP");
		courseMap.put(1009, "Python");
		courseMap.put(1007, "CompilerDesign");
		
		//System.out.println(courseMap);
		
		NavigableMap<Integer,String> revCourseMap = courseMap.descendingMap();
		
		for(Map.Entry<Integer, String> x : revCourseMap.entrySet()) {
			System.out.println(x);
		}
		
		
		
		
		
	}
}
