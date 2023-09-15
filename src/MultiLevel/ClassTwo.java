package MultiLevel;

public class ClassTwo extends ClassOne{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassTwo ct = new ClassTwo();
		ct.legs();
		ct.cardio();
		ct.chest();ct.shoulder();
		
	}

	
	public void legs() {
		System.out.println("legs code executed in child");
	}
		public void cardio() {
			System.out.println("cardio code executed in child");
	
}
	}

