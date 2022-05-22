package samplepackage01;

import java.util.ArrayList;
import java.util.List;

public class Learnlistprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//list<generics> <objname> = new linkedlist<generics>();
		List<String> obj = new ArrayList<String>();
		obj.add("one");
		obj.add("two");
		obj.add("three");
		obj.add("two");
		
		for (String eachele:obj) {
			System.out.println(eachele);
		}
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.isEmpty());
		System.out.println(obj.contains("two"));
		obj.add("five");
		for(int i=0;i<obj.size();i++) {
			System.out.println(obj.get(i));
		}
		
		}

	}


