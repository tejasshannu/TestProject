package org.edureka.spring.model;

public class Course {

	
	private String courseTitle;
	private String courseId;
	private int price;
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	Course(){}
	
	public Course(String id,String title,int price){
		courseId=id;
		courseTitle=title;
		this.price=price;
	}
	
}
