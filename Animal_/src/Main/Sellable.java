package Main;

public interface Sellable {

	public default void sell() {
		System.out.println("사냥꾼이 돈을 위해 동물농장에서 동물을 팔려합니다.");
	}
}
