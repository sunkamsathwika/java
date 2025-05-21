package DAY3;
abstract class test3{
	   abstract void add();
	   abstract void sum();
	   abstract void show();
	   abstract void display();
	   }
  class abstract_ extends test3{
	  public void add() {
		  System.out.println("hi");
	  }
	  public void sum() {
		  System.out.println("hello");
	  }
	  public void show() {
		  System.out.println("learned basics of oops");
	  }
	  public void display() {
		  System.out.println("learned strings");
	  }
	  public static void main(String[] args) {
		  abstract_ d1=new abstract_();
		  d1.add();
		  d1.sum();
		  d1.show();
		  d1.display();
	  }
		

	}


