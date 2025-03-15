package org.sash;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class Employee {
public static void main(String[] args) {
	//HashMap
	Map<String,Integer> m=new HashMap();
	m.put("Java",10);
	m.put("Sql",20);
	m.put("Oops",30);
	m.put("Sql", 40);
	m.put("Oracle",50);
	m.put("DB",60);
	m.put("Selenium",10);
	m.put("API",50);
	m.put("Appium", 40);
	//System.out.println(m);
	Integer integer = m.get("Java");
	System.out.println(integer);
	// linked hashmap
	//Map<Long,Integer> m1=new LinkedHashMap();
	//m1.put((long) 10,10);
	//m1.put((long) 20, 20);
	//m1.put((long) 30,30);
	//m1.put((long) 40,40);
	//m1.put((long) 10, 10);
	//System.out.println(m1);
	//Treemap
	Map<Character,Integer> m2=new TreeMap();	
	
    m2.put('!',10);
	m2.put('@',20);
	m2.put('#',30);
	m2.put('$',40);
	m2.put('%',50);
	m2.put('^',60);
	m2.put('&',10);
	m2.put('*',50);
	m2.put('(',40);
	//System.out.println(m2);
	Set<Entry<Character, Integer>> entrySet = m2.entrySet();
	for(Entry<Character, Integer> r:entrySet) {
	System.out.println(r);
	System.out.println("muni");
	System.out.println("hiii");
	//hashtabl
	//Map<String,String> m3=new Hashtable();	
	//m3.put("RamSarath","APITesting");
	//m3.put("Xavier","ManualTesting");
	//m3.put("Planivel","FrameWork");
	//m3.put("Aathi","Selenium");
	//m3.put("Vicky","Corejava");
	//System.out.println(m3);
	
	
	
	
	
	
	
	
	}	
	
}
}
