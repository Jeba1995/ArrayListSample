package com.array;

import java.util.ArrayList;
import java.util.List;

public class Sample {
public static void main(String[] args) {
	List<Integer> l=new ArrayList<>();
		
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(50);
	l.add(60);
	l.add(70);
	System.out.println("List 1:"+l);
	int size = l.size();
	System.out.println("List Size:"+size);
	List<Integer> l1=new ArrayList<>();
	l1.add(100);
	l1.add(200);
	l1.add(300);
	l1.add(400);
	l1.add(500);
	l1.add(600);
	l1.add(700);
	System.out.println("List 2:"+l1);
	l1.addAll(l);
	System.out.println(l1);
	       
}
}
