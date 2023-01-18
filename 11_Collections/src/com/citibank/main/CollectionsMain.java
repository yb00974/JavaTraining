package com.citibank.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsMain {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		System.out.println("1.ArrayList");
		//polymorphism to use collection(LIST is java util) ArrayList is class
		List<String> nameList = new ArrayList<>();
		//by dping below statement u can accept any type because it takes object as type default
		//List nameList = new ArrayList<>();
		//same as List
		//this is the List
		//size 0 because nothing saved yet
		System.out.println("NAme List size::" + nameList.size());
		System.out.println("Name List ::" + nameList);
		nameList.add("Yaminee");
		nameList.add("Trupti");
		nameList.add("Satyam");
		nameList.add("Yaminee");
		
		System.out.println("NAme List size::" + nameList.size());
		System.out.println("Name List ::" + nameList);
		System.out.println("Name at index 2::" + nameList.get(0));
		nameList.remove(2);
		System.out.println("NAme List size::" + nameList.size());
		System.out.println("Name List ::" + nameList);
		nameList.remove("Yaminee");
		System.out.println("NAme List size::" + nameList.size());
		System.out.println("Name List ::" + nameList);
		
		System.out.println("---------------------");
		System.out.println("1>Hashset");
		Set<Integer> numberSet = new HashSet<Integer>();
		System.out.println("numberSet Size ::"+ numberSet.size());
		System.out.println("numberSet::" +numberSet);
		numberSet.add(10);
		numberSet.add(20);
		numberSet.add(10);
		numberSet.add(30);
		numberSet.add(40);
		numberSet.add(10);
		numberSet.add(50);
		System.out.println("after Adding");
		System.out.println("numberSet Size ::"+ numberSet.size());
		System.out.println("numberSet::" +numberSet);
		
		System.out.println("---------------");
		System.out.println("3.TreeSet");
		Set<String> nameTreeSet = new TreeSet<>();
		System.out.println("nameTreeSet size::" + nameTreeSet.size());
		System.out.println("nameTreeSet::" + nameTreeSet);
		
		nameTreeSet.add("B");
		nameTreeSet.add("A");
		nameTreeSet.add("C");
		nameTreeSet.add("z");
		nameTreeSet.add("B");
		//nameTreeSet.add(null);
		
		System.out.println("After Adding");
		System.out.println("nameTreeSet size::" + nameTreeSet.size());
		System.out.println("nameTreeSet::" + nameTreeSet);
		
		
	
		System.out.println("Main End");
		

	}

}
