package com.sh.java8.functionalinterface;

public class FunctionalInterfaceInstantiationByLambda {
	public static void main(String[] args) {
		Foo foo = parameter -> parameter + " from lambda";
		System.out.println(foo.method("Hi"));
		
		//old way from annonymous class
		Foo fooByIC = new Foo() {
		    @Override
		    public String method(String string) {
		        return string + " from lambda";
		    }
		};
		System.out.println(fooByIC.method("Hello"));
	}
}
