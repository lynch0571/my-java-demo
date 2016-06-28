package com.main.serializable;

import java.io.Serializable;

public class Student implements Serializable{
	private static final long serialVersionUID = -8199253187101821240L;
	private String name;
	private char sex;
	private short age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public Student(String name, char sex, short age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
}
