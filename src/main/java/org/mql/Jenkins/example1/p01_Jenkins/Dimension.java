package org.mql.Jenkins.example1.p01_Jenkins;

public class Dimension {
private int width,height;

	public Dimension(int width, int height) {
		super();
		this.width = width;
		this.height = height;
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
	
	public void setHeight(int height) 
	{
		this.height = height;
	}
}

