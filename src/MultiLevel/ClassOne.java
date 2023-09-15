package MultiLevel;

public class ClassOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassOne co = new ClassOne();
		co.chest();
		co.shoulder();
		
	}

	
	public void chest() {
		System.out.println("chest code executed in child");
	}
		public void shoulder() {
			System.out.println("shoulder code executed in child");
	
}
}
