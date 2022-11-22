package com.example.assassinapp;

import java.util.ArrayList;
import java.util.List;

public class AssassinNation{
	private String next;
	private Object previous;
	private int count;
	public ArrayList<AssassinType> results;

	public String getNext(){
		return next;
	}

	public Object getPrevious(){
		return previous;
	}

	public int getCount(){
		return count;
	}

	public ArrayList<ResultsItem> getResults(){
		return results;
	}
}