package Main;
import Animal.Animal;

public interface Huntable {
	
	public default void 사냥하기() {
		System.out.println("동물이 사냥을 합니다.");
		
	}
	
	public default void 사냥하기(Animal h1,Animal h2) {
		System.out.println(h1.이름+"이(가)"+h2.이름+"을(를) 사냥합니다.");
	

	}
	
}
