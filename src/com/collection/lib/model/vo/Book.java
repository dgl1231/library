package com.collection.lib.model.vo;

public class Book {
	
	private int bNo;
	private int category;
	private String title;
	private String author;
	
	
	public Book() {}
	
	public Book(int category, String title, String author) {
		super();
		this.category = category;
		this.title = title;
		this.author = author;
	}
	
	public int getbNo() {return bNo;}
	public void setbNo(int bNo) {this.bNo = bNo;}
	
	public int getcategory() {return category;}
	public void setcategory(int category) {this.category = category;}
	
	public String gettitle() {return title;}
	public void settitle(String title) {this.title = title;}
	
	public String getauthor() {return author;}
	public void setauthor(String author) {this.author = author;}
	
	
	@Override
	public String toString() {
		String str="";
		if(category == 1) {
			str = "인문";
		}else if(category == 2) {
			str = "자연과학";
		}else if(category == 3) {
			str = "의료";
		}else if(category == 4) {
			str = "기타";
		}
		return "도서번호 : "+bNo+"분류 : "+str+"제목 : "+title+"저자 : "+author;
	}
	
}
