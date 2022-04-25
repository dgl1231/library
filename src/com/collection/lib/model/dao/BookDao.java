package com.collection.lib.model.dao;


import java.util.ArrayList;

import com.collection.lib.model.comparator.AscCategory.AscCategory;
import com.collection.lib.model.vo.Book;


public class BookDao {

	private ArrayList<Book> bookList;
	
	public BookDao() {
		bookList = new ArrayList<Book>();
	}
	public BookDao(ArrayList<Book> list) {
		bookList = list;
	}
	
	public int getListSize() {
		return bookList.size();
	}
	//마지막 도서 번호 리턴
	public int getLastBookNo() {
		
		return bookList.get( bookList.size()-1 ).getbNo();
	}
	//새 도서 추가
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	public int deleteBook(int no) {
		int res = 0;
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getbNo() == no) {
				bookList.remove(i);
				res=1;
			}
		}
		return res;
	}
	public ArrayList<Integer> searchBook(String title) {
		//int index = -1;
		ArrayList<Integer> index = new ArrayList<>();
		
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).gettitle().contains(title)) {
				index.add(i);
			}
		}
		
		return index;
	}
	//해당 인덱스 값을 이용한 book 객체 리턴
	public ArrayList<Book> selectBook(ArrayList<Integer> index) {
		ArrayList<Book> al = new ArrayList<Book>();
		for(int i=0; i<index.size(); i++) {
			al.add(bookList.get( index.get(i)) );
		}
		return al;
	}
	//전체 출력
	public ArrayList<Book> selectAll(){
		return bookList;
	}
	public ArrayList<Book> sortedBookList(){
		ArrayList<Book> cList = new ArrayList<>();
		for(int i=0; i<bookList.size(); i++) {
			cList.add(bookList.get(i));
		}
		
		cList.sort(new AscCategory());
		return cList;
	}
	
	
	
	
	
	
	
	
}
