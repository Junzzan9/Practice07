package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {
			
			//Shape s=new Shape("빨강");  추상클래스는 인스턴스 생성 불가
			Circle c1=new Circle("녹색",10);
			Rectangle r1=new Rectangle("빨강",4,4);
			Shape sr1=new Rectangle("빨강",4,4);
			
			
			((Rectangle)r1).setWidth(12);
			((Rectangle)r1).setHeight(12);
			r1.draw();
			((Rectangle)sr1).setWidth(12);
			System.out.println("sr1의 가로는 "+((Rectangle)sr1).getWidth()+"입니다.");
		}
	}


