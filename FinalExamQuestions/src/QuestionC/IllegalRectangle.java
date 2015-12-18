package QuestionC;

import java.io.*;

//Error class for when negative values are given

public class IllegalRectangle extends Exception {
	private int xValue;
	private int yValue;
	
	public IllegalRectangle(int x, int y) {
		this.xValue = x;
		this.yValue = y;
	}

	public int getxValue() {
		return xValue;
	}

	public int getyValue() {
		return yValue;
	}
}
