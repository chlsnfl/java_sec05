package ch14;
//객체지향 캡슐화, 정보은닉
public class Car {
	
	//필드
	private int speed;
	private boolean stop;
	
	
	//메소드
	public int getSpeed(){
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
