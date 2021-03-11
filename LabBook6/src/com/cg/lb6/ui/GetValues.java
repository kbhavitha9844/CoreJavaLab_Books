package com.cg.lb6.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GetValues {
	 public static List<String> getValues(HashMap<String, String> ee) {
		 List<String> mm=new ArrayList<>();
		 Collection<String> list=ee.values();
		 mm.addAll(list);
		 Collections.sort(mm);
		 return mm;
 }

	 public static void main(String[] args) {
		 HashMap<String, String> ee = new HashMap<>();
		 ee.put("bhavi", "18");
		 ee.put("mahi", "35");
		 ee.put("radha", "62");
		 ee.put("divya", "11");
		 System.out.println(getValues(ee));
	 }
 }