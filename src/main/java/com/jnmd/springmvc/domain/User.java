package com.jnmd.springmvc.domain;

import java.util.List;

public class User {

	private int uid;
	private String userName;
	private int age;

	private String password;
	private String hobby;
	//private Contact contact;
	
	private List<Contact> contacts;

	public User() {
		super();
	}

	public User(int uid, String userName, int age, String password, String hobby, List<Contact> contacts) {
		super();
		this.uid = uid;
		this.userName = userName;
		this.age = age;
		this.password = password;
		this.hobby = hobby;
		this.contacts = contacts;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", userName=" + userName + ", age=" + age + ", password=" + password + ", hobby="
				+ hobby + ", contacts=" + contacts + "]";
	}

}
