//package com.ust.ioc2;
//
//public class Line {
//       Point p1;  
//       Point p2;
//	public Point getP1() {
//		return P1;
//	}
//	public void setP1(Point p1) {
//		this.p1 = p1;
//	}
//	public Point getP2() {
//		return P2;
//	}
//	public void setP2(Point p2) {
//		this.p2 = p2;
//	}
//	public void drawline() {
//		System.out.println("from"+p1.getX()+","+p1.getY()+"to"+P2.getX()+","+P2.getY())
//	}   
//}
package com.ust.ioc2;

public class Line {
	
	Point p1;
	Point P2;
	
	
	public Point getP1() {
		return p1;
	}


	public void setP1(Point p1) {
		this.p1 = p1;
	}

	
	

	public Line(Point p1, Point p2) {
		//super();
		System.out.println("from Line(p1,p2)..........");
		this.p1 = p1;
		P2 = p2;
	}


	public Point getP2() {
		return P2;
	}


	public void setP2(Point p2) {
		this.P2 = p2;
	}


	public void drawline() {
		System.out.println("from"+p1.getX()+","+p1.getY()+"to"+P2.getX()+","+P2.getY());
	}
	
	public void init() {
		System.out.println("from init()........");
	}
	public void destroy() {
		System.out.println("from destroy().....");
	}
	

}