package demo.com.springbasic1;

import org.springframework.beans.factory.annotation.Autowired;

public class Car implements Vehicle{
	@Autowired
	private Tyre tyre;
	
  public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

public void drive() {
	  System.out.println("chal Raha Hai");
  }
}
