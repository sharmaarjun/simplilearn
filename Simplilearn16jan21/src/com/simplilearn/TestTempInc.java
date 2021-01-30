package com.simplilearn;

public class TestTempInc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float tem = 0.0f;
		while(tem<=100.0f) {
			System.out.println("Temperature value: "+tem);
			tem += 20;
		}
		for(float t = 100.0f; t >= 0.0f ; t -= 20) {
			System.out.println("For count: "+t);
		}

	}

}
