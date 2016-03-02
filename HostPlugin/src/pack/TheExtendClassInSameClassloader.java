package pack;

import pack.TheClass;

public class TheExtendClassInSameClassloader extends TheClass {
	@Override
	void callPackagePrivate() {
		System.out.println("TheExtendClassInSameClassloader.callPackagePrivate");
	}

	@Override
	protected void callProtected() {
		System.out.println("TheExtendClassInSameClassloader.callProtected");
	}
}
