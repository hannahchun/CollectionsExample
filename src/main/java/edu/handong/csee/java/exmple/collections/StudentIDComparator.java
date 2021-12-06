package edu.handong.csee.java.exmple.collections;

import java.util.Comparator;

public class StudentIDComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o2.getStudentID().compareTo(o1.getStudentID());
	}
	//이 문자열이 문자열 파라미터 미만인 경우에는 값이 0보다 작은 수 반환 ( 왼쪽이 오른쪽보다 작은 경우 음수 반환 ) - 자리 그대로
	
}
