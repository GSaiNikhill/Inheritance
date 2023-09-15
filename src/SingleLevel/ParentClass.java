package SingleLevel;

public class ParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass ps = new ParentClass();
		ps.back();
		ps.legs();
		
	}
	public void back() {
		System.out.println("back code executed in child");
	}
		public void legs() {
			System.out.println("legs code executed in child");
	
}
}
