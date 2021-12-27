package 장소;
import Animal.Animal;

public abstract class Place {	
	
	String where;
	protected  Animal[]  animals = null;  //최대 10마리까지
	public int numOfAnimals = 0;
	int size = 10;
	public int getSize() {
		return size;
	}
	public Animal [] getAnimals() {
		if (this.animals ==null) {
			System.out.println("아직 만들어지지 않았습니다."); 
			return null;
		}
		return this.animals;
	}	
	public Animal getAnimal() {
		if (this.animals ==null) {
			System.out.println("아직 만들어지지 않았습니다."); 
			return null;
		}
		int r=(int)(Math.random()*1000)% numOfAnimals;
    	return this.animals[r];
		
	}	
	public void  showAnimals() {
		
		System.out.print("(총 " + numOfAnimals+"마리)");
		
		for(int i=0; i<this.animals.length; i++) {
			if(animals[i] != null) 	System.out.print(animals[i].이름 + " ");
			else System.out.print(" x  ");
		}
		System.out.println();
		System.out.println("==========================================================================");
	
	}
	public static void  showAnimals(Animal [] animals,int count) {
		
		System.out.print("(총 " + count +"마리)");
		
		for(int i=0; i<animals.length; i++) {
			if(animals[i] != null) 	System.out.print(animals[i].이름 + " ");
			else System.out.print(" x  ");
		}
		System.out.println();
		System.out.println("==========================================================================");
	
	}
	
	public  void set동물() {
		
	}
	public void addAnimal(Animal ani) {
		try{
			animals[numOfAnimals] =ani;
			numOfAnimals++;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("숲속에 동물이 가득 찼다-!");
		}	
		
	}	
	public  void removeAnimal(Animal ani) {
		int i=0;
		for(i=0; i<numOfAnimals; i++) {
			if(animals[i] == ani) {
				animals[i]=null;
				break;
			}
		}			
		animals[i]= animals[numOfAnimals-1];
		animals[numOfAnimals-1]=null;
		numOfAnimals--;
	}
}
