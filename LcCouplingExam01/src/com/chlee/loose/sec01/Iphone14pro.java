package com.chlee.loose.sec01;

public class Iphone14pro implements Remote, Camera{

	@Override
	public String actionOne(String mesage) {
		System.out.println("아이폰14프로 작동 1 결과 : " + mesage);
		return mesage;
		
	}

	@Override
	public String actionTwo(String mesage) {
		System.out.println("아이폰14프로 애플페이 실행 : " + mesage);
		return mesage;
		
	}

	@Override
	public String shot(String smile) {
		System.out.println("아이폰 14프로 3배 망원줌 카메라 실행" + smile);
		return smile;
	}

}
