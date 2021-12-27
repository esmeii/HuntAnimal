package Main;

public interface Workable {
	
	int MaxPower = 100;
	
	public default void 재주부리기() {
		System.out.println("동물이 재주를 부립니다.");
		
	}
	
}
