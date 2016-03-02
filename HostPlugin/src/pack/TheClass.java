package pack;

public class TheClass {

	public void call() {
		callPackagePrivate();
		callProtected();
	}

	void callPackagePrivate() {
		System.out.println("TheClass.callPackagePrivate");
	}

	protected void callProtected() {
		System.out.println("TheClass.callProtected");
	}

}
