package com.pcwk.ex11.json;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class ArrayListToJsonMain {

	public static void main(String[] args) {
		List<Person> list=new ArrayList<>();
		Person person01=new Person("철수", 9, "남");
		Person person02=new Person("영희", 9, "여");
		Person person03=new Person("짱구", 9, "남");
		
		//list에 person추가
		list.add(person01);
		list.add(person02);
		list.add(person03);
		
		Gson gson=new Gson();
		String jsonString = gson.toJson(list);
		System.out.println(jsonString);
		
	}

}
