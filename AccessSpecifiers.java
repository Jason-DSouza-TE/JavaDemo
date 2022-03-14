epackage com.te.access.common;

public class AccessSpecifiers {
	public void publicMethod() {
		System.out.println("this is public method");
	} //qwertyui

	protected void protectedMethod() {
		System.out.println("this is protected method");
	}

	void defaultMethod() {
		System.out.println("this is default method");
	}to pull 

	private void privateMethod() {
		System.out.println("this is private method");
	}

	public static void main(String[] args) {
		AccessSpecifiers class1 = new AccessSpecifiers();
		class1.defaultMethod();
		class1.publicMethod();
		class1.protectedMethod();
		class1.privateMethod();
	}
}
