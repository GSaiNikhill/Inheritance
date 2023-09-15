package MultiLevel;

public class ClassThree extends ClassTwo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassThree ct = new ClassThree();
		ct.back();
		ct.arms();
		ct.legs();
		ct.cardio();
		ct.chest();
		ct.shoulder();
		
	}
	public void back() {
		System.out.println("back code executed in child");
	}
		public void arms() {
			System.out.println("arms code executed in child");
	
}
}
