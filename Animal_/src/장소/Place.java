package ���;
import Animal.Animal;

public abstract class Place {	
	
	String where;
	protected  Animal[]  animals = null;  //�ִ� 10��������
	public int numOfAnimals = 0;
	int size = 10;
	public int getSize() {
		return size;
	}
	public Animal [] getAnimals() {
		if (this.animals ==null) {
			System.out.println("���� ��������� �ʾҽ��ϴ�."); 
			return null;
		}
		return this.animals;
	}	
	public Animal getAnimal() {
		if (this.animals ==null) {
			System.out.println("���� ��������� �ʾҽ��ϴ�."); 
			return null;
		}
		int r=(int)(Math.random()*1000)% numOfAnimals;
    	return this.animals[r];
		
	}	
	public void  showAnimals() {
		
		System.out.print("(�� " + numOfAnimals+"����)");
		
		for(int i=0; i<this.animals.length; i++) {
			if(animals[i] != null) 	System.out.print(animals[i].�̸� + " ");
			else System.out.print(" x  ");
		}
		System.out.println();
		System.out.println("==========================================================================");
	
	}
	public static void  showAnimals(Animal [] animals,int count) {
		
		System.out.print("(�� " + count +"����)");
		
		for(int i=0; i<animals.length; i++) {
			if(animals[i] != null) 	System.out.print(animals[i].�̸� + " ");
			else System.out.print(" x  ");
		}
		System.out.println();
		System.out.println("==========================================================================");
	
	}
	
	public  void set����() {
		
	}
	public void addAnimal(Animal ani) {
		try{
			animals[numOfAnimals] =ani;
			numOfAnimals++;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���ӿ� ������ ���� á��-!");
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
