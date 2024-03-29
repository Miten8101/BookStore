package com.bookStore.entity;

import jakarta.persistence.*;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private String name;
	private String author;
	private  String price;
	@Override
	public String toString() {
		return "Book [Id=" + Id + ", name=" + name + ", author=" + author + ", price=" + price + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getAuthor()=" + getAuthor() + ", getPrice()=" + getPrice()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public int getId() {
		return Id;
	}
	public Book(int id, String name, String author, String price) {
		super();
		Id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}
