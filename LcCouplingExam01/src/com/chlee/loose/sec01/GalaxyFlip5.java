package com.chlee.loose.sec01;

public class GalaxyFlip5 implements Remote,Camera {

	@Override
	public String actionOne(String mesage) {
		System.out.println(" 갤럭시 플립5 작동 결과 : " + mesage);
		return mesage;
		
	}

	@Override
	public String actionTwo(String mesage) {
		System.out.println("갤럭시 플립5 삼성페이 실행 : " + mesage);
		return mesage;
		
	}

	

	@Override
	public String shot(String smile) {
		System.out.println("갤럭시 플립5 카메라 실행 : " + smile);
		return smile;
	}

}
