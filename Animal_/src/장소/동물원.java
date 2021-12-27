package 장소;


import Main.*;
import Animal.*;
/* 동물원: Animal 객체 배열을 갖고 기본 크기는 10이다. 
 *  	 사냥꾼은 숲속에서 잡은 동물을 동물원에 팔 수 있다.
 *  	 동물은 동물원에서 work을 한다. work를 할 때마다 power가 증가한다.
 *  	 power가 100을 넘기면 탈출을 무조건 시도한다.
 *  	 */
/*  실행 중인 스레드를 잠시 멈추게 하는 기능을 가진 sleep() 메소드, 
 *  실행 대기 상태로 만든다.여기서 실행 제어를 통해 재주부리기를 3초에 한 번씩 하도록 함*/

public class 동물원 extends Place implements  Workable, Escapable{
	private static 동물원 instance = null;	
	
	private 동물원() { 	
		this.where = "동물원";
		animals = new Animal[size];
	}
	public static 동물원 getInstance() {
		if(instance==null) instance = new 동물원();
		return instance;
	}
	
	public  void show() {
		System.out.println("==========================================================================");
		System.out.print("## 동물원에 있는 동물들 :");
		
		showAnimals(animals , numOfAnimals);
		
	}
	//work 를 통해 power를 증가시키고 싶다.-> 각 Animal 객체의 재주부리기 메소드 안에서 power 증가 부분 처리
	public void work() {
				
		Workable [] work = getAnimals();  
		
		for(int i=0; i<numOfAnimals; i++) {			
			work[i].재주부리기();
			
			if(this.animals[i].power>Workable.MaxPower) {
				//재주부리기로 power가 MaxPower보다 커지면 동물원에서 탈출해서 숲으로 다시 귀환
				숲속 forest = 숲속.getInstance();
				System.out.println(this.animals[i].이름 +" :"+"잘 있어라! 구질구질한 속세야!");
				forest.addAnimal(this.animals[i]); 
				//동물원에서 동물 지우기
				removeAnimal(this.animals[i]);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}	
	}
	
	
	   
	








