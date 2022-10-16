package com.zhouyu.weight;

import org.springframework.util.MethodInvoker;

public class TestWeight {
	public static void main(String[] args) {

		Object[] objects = new Object[]{new A()};

// 0
		System.out.println(MethodInvoker.getTypeDifferenceWeight(new Class[]{A.class}, objects));

// 2
		System.out.println(MethodInvoker.getTypeDifferenceWeight(new Class[]{B.class}, objects));

// 4
		System.out.println(MethodInvoker.getTypeDifferenceWeight(new Class[]{C.class}, objects));

// 1
		System.out.println(MethodInvoker.getTypeDifferenceWeight(new Class[]{D.class}, objects));
	}
}
