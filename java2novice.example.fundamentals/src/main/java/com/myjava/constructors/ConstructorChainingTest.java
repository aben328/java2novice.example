package com.myjava.constructors;

/**
 * 构造方法可以调用覆盖的构造方法或父类的构造方法。如果它们都没显式地调用，编译器将把super()当作构造方法的第一条语句。<br>
 * 在任何情况下，构造一个类的实例时，将会沿着继承链调用所有父类的构造方法，父类的构造方法在子类的构造方法之前调用，<br>
 * 这叫做构造方法链（constructor chaining）。<br>
 * @see http://blog.csdn.net/zoneyoung/article/details/9016733 <br>
 * @author java2novice
 */
public class ConstructorChainingTest extends Employee {

	public static void main(String[] args) {

		// TODO, add your application code
		new ConstructorChainingTest();
	}

	public ConstructorChainingTest() {
		System.out.println("(4)Faculty's no-arg constructor is invoked");
	}
}

class Employee extends Person {
	public Employee() {
		this("(2)Invoke Employee's overloaded constructor");
		System.out.println("(3)Employee's no-arg constructor is invoked");
	}

	public Employee(String s) {
		System.out.println(s);
	}
}

class Person {
	public Person() {
		System.out.println("(1)Person's no-arg constructor is invoked");
	}
}
