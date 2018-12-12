package com.nt.listNmapProjects;

public class Example {

	int x, y;

	public Example(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {

		return x + " " + y;
	}

	@Override
	public int hashCode() {

		return x+y;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Example) {
			Example e=(Example)obj;
			return this.x==e.x&&this.y==e.y;
		}
		return false;
	}


	
	/*String x, y;

	public Example(String x, String y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {

		return x + " " + y;
	}

	@Override
	public int hashCode() {

		return x+y;
	}
   
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Example) {
			Example e=(Example)obj;
			
			return this.x.equals(e.x)&& this.y.equals(e.y);
		}
		
		return false;
	}
*/
	
}
