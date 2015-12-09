package com.java2novice.enums;

/**
 * Program: How to call enum, which is defined inside a class?<br> 
 * This example defines a basic enum type called Fruit
 * inside a class. This example shows how to call enum constants defined under another class. If you declare Enum is a
 * member of a class, then by default it is static. You can access it with reference to enclosing class.
 * @author java2novice
 * @date 2015年12月9日上午10:38:54
 */
public class MyBasicEnum {
	private Fruits myFruit;

	public MyBasicEnum(Fruits fruit) {
		this.myFruit = fruit;
	}

	public void getFruitDesc() {
		switch (myFruit) {
		case GRAPE:
			System.out.println("A grape is a non-climacteric fruit.");
			break;
		case APPLE:
			System.out.println("The apple is the pomaceous fruit.");
			break;
		case MANGO:
			System.out.println("The mango is a fleshy stone fruit.");
			break;
		case LEMON:
			System.out.println("Lemons are slow growing varieties of citrus.");
			break;
		default:
			System.out.println("No desc available.");
			break;
		}
	}

	public static void main(String a[]) {
		MyBasicEnum grape = new MyBasicEnum(Fruits.GRAPE);
		grape.getFruitDesc();
		MyBasicEnum apple = new MyBasicEnum(Fruits.APPLE);
		apple.getFruitDesc();
		MyBasicEnum lemon = new MyBasicEnum(Fruits.LEMON);
		lemon.getFruitDesc();
		MyBasicEnum guava = new MyBasicEnum(Fruits.GUAVA);
		guava.getFruitDesc();
	}
}

enum Fruits {
	GRAPE, APPLE, MANGO, LEMON, GUAVA
}