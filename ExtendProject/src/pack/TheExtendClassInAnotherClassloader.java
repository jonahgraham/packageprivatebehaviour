package pack;

import pack.TheClass;

public class TheExtendClassInAnotherClassloader extends TheClass {
	@Override
	void callPackagePrivate() {
		System.out.println("TheExtendClassInAnotherClassloader.callPackagePrivate");
	}

	@Override
	protected void callProtected() {
		System.out.println("TheExtendClassInAnotherClassloader.callProtected");
	}
}
