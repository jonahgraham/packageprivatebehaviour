package clientproject.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import pack.TheClass;
import pack.TheExtendClassInAnotherClassloader;
import pack.TheExtendClassInSameClassloader;

public class SampleHandler extends AbstractHandler {
	public Object execute(ExecutionEvent event) throws ExecutionException {
		TheClass c = new TheClass();
		System.out.println("Expected next two prints are from TheClass");
		c.call();
		System.out.println("Incorrect expectation that next two prints are from TheExtendClassInAnotherClassloader");
		System.out.println("Because callPackagePrivate is package private and handled by different ");
		System.out.println("classloader, TheClass's one will be called.");
		c = new TheExtendClassInAnotherClassloader();
		c.call();
		System.out.println("Expected next two prints are from TheExtendClassInSameClassloader");
		c = new TheExtendClassInSameClassloader();
		c.call();
		return null;
	}
}
