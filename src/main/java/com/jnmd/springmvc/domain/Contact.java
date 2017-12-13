package com.jnmd.springmvc.domain;

public class Contact {

	private String mphone;
	private String email;

	public Contact() {
		super();
	}

	public Contact(String mphone, String email) {
		super();
		this.mphone = mphone;
		this.email = email;
	}

	public String getMphone() {
		return mphone;
	}

	public void setMphone(String mphone) {
		this.mphone = mphone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [mphone=" + mphone + ", email=" + email + "]";
	}

}
