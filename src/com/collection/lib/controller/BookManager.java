package com.collection.lib.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.collection.lib.model.vo.Book;
import com.collection.lib.model.dao.BookDao;

public class BookManager {
	private BookDao bd = new BookDao();
	private Scanner sc = new Scanner(System.in);
	
	public BookManager() {}
	
	public void addBook(Book book) {
		//book 객체에 번호 입력
		try {
			book.setbNo(bd.getLastBookNo()+1);
		} catch (IndexOutOfBoundsException e) {
			book.setbNo(1);
		}
		
//		if(bd.getListSize() == 0) {
//			book.setbNo(0);
//		}else {
//			book.setbNo(bd.getLastBookNo()+1);
//		}
		
		bd.addBook(book);
	}
	
	public int deleteBook(int no) {
		return bd.deleteBook(no);
	}
	public ArrayList<Integer> searchBook(String title) {
		
		ArrayList<Integer> index = bd.searchBook(title);
		return index;
	}
	public ArrayList<Book> selectBook(ArrayList<Integer> index) {
		return bd.selectBook(index);
	}
	public ArrayList<Book> selectAll(){
		return bd.selectAll();
	}
	public Book[] sortedBookList() {
		ArrayList<Book> list = bd.sortedBookList();
		
		Book[] bk = new Book[list.size()];
		for(int i=0; i<bk.length; i++) {
			bk[i] = list.get(i);
		}
		
		return bk;
	}
	public void printBookList(Book[] br) {
		for(Book tmp : br) {
			System.out.println(tmp);
		}
	}
}
	