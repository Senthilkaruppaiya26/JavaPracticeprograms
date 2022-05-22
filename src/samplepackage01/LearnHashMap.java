package samplepackage01;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "SeleniumAutomationTraining";
		char[] charArray01 = name.toCharArray();
		//Map<generics,Generics> Objname = new HshMap<Character,Integer>();
		Map<Character,Integer> countmap = new HashMap <Character,Integer>();
		
		for (char ch : charArray01 ) {
			if (countmap.containsKey(ch)) {
				//value already exists add +1 to the value for the corresponding key
				countmap.put(ch,countmap.get(ch)+1);
				
			}
			else
			{
				//for first time just add 1
				countmap.put(ch,1);
			}
		}
		System.out.println(countmap);
		
		for (Entry<Character, Integer> eachvalue : countmap.entrySet()) {
			//system.out.println(eachvalue.getkey() + "----> " + eachvalue.getvalue() );
			System.out.println("Key is:" + eachvalue.getKey() + "----> and the value is:" +eachvalue.getValue());
			
			}
		}
		
		}

