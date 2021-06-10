package com.javaex.ex01;

public abstract class Shape {
	
	protected String fillColor;
	
	//기본생성자 누락
	
	public Shape() {
		
	}
	
	
	public Shape(String fillColor) {
		this.fillColor=fillColor;
	}
	
	public abstract void draw();


	public String getFillColor() {
		return fillColor;
	}


	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	
}
