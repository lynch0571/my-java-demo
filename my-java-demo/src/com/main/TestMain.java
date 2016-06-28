package com.main;

public class TestMain {

	public static void main(String[] args) {
		System.out.println(fun());
	}

	static int fun() {
		try {
			int a = 1 / 0;			//触发异常
		} catch (Exception e) {
			return 0;
		} finally {
			System.out.println(1);	//catch return了那么finally还会执行吗？
		}
		return 2;
	}
}
