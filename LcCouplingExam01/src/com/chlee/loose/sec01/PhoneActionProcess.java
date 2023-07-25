package com.chlee.loose.sec01;

public class PhoneActionProcess {
	private Remote remote;
	private Camera camera;

	public PhoneActionProcess(Remote remote) {
		this.remote = remote;
	}
	
	public PhoneActionProcess(Camera camera) {
		this.camera = camera;
	}

	public void perfomencePhone() {
		String result1 = remote.actionOne("전원이 켜졌습니다.");
		String result2 = remote.actionTwo("어플리 케이션을 실행 완료했습니다.");
		
	}
	
	public void perfomenceCamera() {
		String result3 = camera.shot("촬칵 촬칵!! 촬칵!!!!!!!!!!!!!!!!!!!!");
		
		
	}
	

}
