package Main;

public interface Escapable {
	
	int MaxPower = 100;
	
	public default void escape() {
		System.out.println("동물이 탈출합니다!!");
	}
	
}
