package org.itcast.com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test {

	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7); // 遍历集合--普通方式
		list.forEach(new Consumer(){
			@Override
			public void accept(Object t) {
				System.out.println(t);
			}
			
		}); // lambda
		
		list.forEach(in -> System.out.println(in));
	}

	private static void compareTo(int i) {
		// TODO Auto-generated method stub
		
	}
}
