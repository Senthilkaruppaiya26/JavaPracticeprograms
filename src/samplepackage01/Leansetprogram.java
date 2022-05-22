package samplepackage01;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Leansetprogram {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashset -> display the value in random order 
		//LinkedHashSet-> always maintains the inserting order
		//Treeset-> Maintain the alphabet / ASCII order
		
		Set<String> obj = new  TreeSet <String>();
		obj.add("one");
		obj.add("two");
		obj.add("three");
		obj.add("aone");
		obj.add("aone");
		obj.add("Aone");
		
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.contains("one"));
		System.out.println(obj.isEmpty());
	}

	}


