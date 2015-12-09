package com.java2novice.enums;

/**
 * Program: How to create custom constructor enum?<br>
 * <br>
 * Description:<br>
 * This example gives you how to create custom constructor for enum. <br>
 * The constructor should be either private or default scope, <br>
 * should not be protected or public. <br>
 * All elements defined in the enum must call constructor.<br>
 * @see more at: http://java2novice.com/java-lang/enum/custom-constructor/#sthash.kll6lebE.dpuf<br>
 * @author java2novice
 * @date 2015年12月9日上午11:05:35
 */
public class MyEnumCustomConstructor {

	enum Department {

		ACCOUNT(12), HR(24), FINANCE(100), SECURITY(108);

		private int deptId;

		Department(int id) {
			deptId = id;
		}

		public int getDeptId() {
			return deptId;
		}
	}

	public static void main(String a[]) {
		System.out.println("Accounts dept id:" + Department.ACCOUNT.getDeptId());
		System.out.println("HR dept id:" + Department.HR.getDeptId());
		System.out.println("Security dept id:" + Department.SECURITY.getDeptId());
	}
}