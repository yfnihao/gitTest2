package com.atguigu.bean;

public class HelloWorld {
public static void main(String[] args) {
	int [] a = new int[]{1,0,-3,9,7,30};
	for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<a.length-1-i;j++) {
			if(a[j]>a[j+1]) {
				int tem = a[j];
				a[j]=a[j+1];
				a[j+1]=tem;
			}
		}
	}
	for(int i =0;i<a.length;i++) {
		System.out.println(a[i]);
		System.out.println(1);
		System.out.println("you are successful!");
	}
}
}
