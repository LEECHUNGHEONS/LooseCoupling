package com.chlee.loose.sec01;

public class PhoneMainExample {
	
	

	public static void main(String[] args) {
		Remote iphone14pro = new Iphone14pro();
		Remote galaxyFlip5 = new GalaxyFlip5();
		Camera iphoneCamera = new Iphone14pro();
		Camera galaxyCamera = new GalaxyFlip5();
		
		PhoneActionProcess iphoneActionProcess = new PhoneActionProcess(iphone14pro);
		PhoneActionProcess galaxyActionProcess = new PhoneActionProcess(galaxyFlip5);
		
		PhoneActionProcess iphoneCameraSh = new PhoneActionProcess(iphoneCamera);
		PhoneActionProcess galaxyCameraSh = new PhoneActionProcess(galaxyCamera);
		
		
		System.out.println("아이폰 14프로 사용");
		
		iphoneActionProcess.perfomencePhone();
		
		
		System.out.println("갤럭시 플립 5 사용");
		
		galaxyActionProcess.perfomencePhone();
		
		System.out.println();
		
		iphoneCameraSh.perfomenceCamera();
		
		galaxyCameraSh.perfomenceCamera();
		
	}

}
