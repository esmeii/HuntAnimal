package Main;
import Animal.Animal;

public interface Huntable {
	
	public default void ����ϱ�() {
		System.out.println("������ ����� �մϴ�.");
		
	}
	
	public default void ����ϱ�(Animal h1,Animal h2) {
		System.out.println(h1.�̸�+"��(��)"+h2.�̸�+"��(��) ����մϴ�.");
	

	}
	
}
