package demo.com.springbasic1;

import org.springframework.beans.factory.annotation.Autowired;

public class Bike implements Vehicle{
	@Autowired
	private Tyre tyre;
	
  public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	 public void drive() {
		  System.out.println("Bhag Raha Hai");
	  }
}
