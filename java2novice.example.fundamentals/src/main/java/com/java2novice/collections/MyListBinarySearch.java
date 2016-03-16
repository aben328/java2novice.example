package com.java2novice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Description: The Collections.binarySearch() method searches the specified list for the specified user defined object
 * using the binary search algorithm. The list must be sorted into ascending order according to the specified comparator
 * (as by the sort(List, Comparator) method), prior to making this call. If it is not sorted, the results are undefined.
 * If the list contains multiple elements equal to the specified object, there is no guarantee which one will be found.
 * See more at: http://java2novice.com/java-collections-and-util/collections/binary-search/#sthash.Rt9Ut6wg.dpuf
 */
public class MyListBinarySearch {

	public static void main(String a[]) {
		List<Emp> empList = new ArrayList<Emp>();
		empList.add(new Emp(12, "Dinesh", 50000));
		empList.add(new Emp(146, "Tom", 20000));
		empList.add(new Emp(201, "John", 40000));
		empList.add(new Emp(302, "Krish", 44500));
		empList.add(new Emp(543, "Abdul", 10000));
		Emp searchKey = new Emp(201, "John", 40000);
		int index = Collections.binarySearch(empList, searchKey, new EmpComp());
		System.out.println("Index of the searched key: " + index);
	}
}

class EmpComp implements Comparator<Emp> {
	public int compare(Emp e1, Emp e2) {
		if (e1.getEmpId() == e2.getEmpId()) {
			return 0;
		} else {
			return -1;
		}
	}
}

class Emp {
	private int empId;
	private String empName;
	private int empSal;

	public Emp(int id, String name, int sal) {
		this.empId = id;
		this.empName = name;
		this.empSal = sal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public String toString() {
		return empId + " : " + empName + " : " + empSal;
	}
}