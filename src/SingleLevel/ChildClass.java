package SingleLevel;

public class ChildClass extends ParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass cc=new ChildClass();
		cc.chest();
		cc.shoulder();
		cc.back();
		cc.legs();
	}
	public void chest() {
		System.out.println("chest code executed in child");
	}
		public void shoulder() {
			System.out.println("shoulder code executed in child");
	}
}
