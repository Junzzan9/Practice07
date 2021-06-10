package com.javaex.ex01;

public class Rectangle extends Shape {
	

		private int width;
		private int height;
		/*
		public Rectangle() {
			
		}
		*/
		public Rectangle(String fillColor,int width, int height) {
			super(fillColor);
			this.width=width;
			this.height=height;
		}
		
		
		public int getWidth() {
			return width;
		}
		
		public void setWidth(int width) {
			this.width = width;
		}
		
		public int getHeight() {
			return height;
		}
		
		public void setHeight(int height) {
			this.height = height;
		}
		
		@Override
		public String toString() {
			return "Rectangle [width=" + width + ", height=" + height + "]";
		}
		
		public void draw() {
			System.out.println("[사각형]#면색:"+super.fillColor+",#가로:"+width+",#세로:"+height+" 그렸습니다.");
		}
		/*
		public double area() {
			return width*height;
		}
		*/


}




