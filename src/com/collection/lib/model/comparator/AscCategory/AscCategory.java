package com.collection.lib.model.comparator.AscCategory;

import java.util.Comparator;

import com.collection.lib.model.vo.Book;

public class AscCategory implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		int other1= ((Book)o1).getcategory();
		int other2= ((Book)o2).getcategory();
		
		return other1-other2;
	}

}
