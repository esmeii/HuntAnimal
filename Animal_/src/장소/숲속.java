package 장소;

import Animal.Animal;
import Animal.Dog;
import Animal.Eagle;
import Animal.Snake;
import Animal.Shark;
import Main.Huntable;
import Main.Playable;
import Main.사냥꾼;

public class 숲속 extends Place implements Huntable, Playable  {
	private  static 숲속 instance = null;	
	
	private 숲속() { 	//숲속엔 10마리의 동물이 들어감	
		this.where = "숲속";
		animals = new Animal[10];
	}	
	
	public static 숲속 getInstance() {
		if(instance==null) instance = new 숲속();
		return instance;
	}	
	public void show() {
		System.out.println("==========================================================================");
		System.out.print("##  숲 속에 있는 동물들 :");
		
		showAnimals(animals, numOfAnimals);		
	}	
	public  void 놀기() {
		System.out.println(사냥꾼.name+" :"+"동물들이 자-알 노네, 다음엔 사냥하러 와야겠다!");		
	
		Playable [] p = getAnimals();  //Playable로 접근하도록 설정
		for(int i=0; i< numOfAnimals; i++) {
			System.out.printf("[%2d] :",i);
			p[i].놀기();	  
			try {
				Thread.sleep(1000); // 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
	//숲속에 있는 동물들은 서로 사냥을 한다.
	public  void 사냥하기() {
		
		System.out.println(사냥꾼.name+" :"+"잔혹한 약육강식의 세계..");
		
		// 여러 동물들중 랜덤하게 골라 사냥하기
		Animal h1 = getAnimal();
		Animal h2 = getAnimal();
		// h1 이 h2 를 사냥한다
		
		사냥하기(h1,h2);
		
		//h1의 사냥확률이 h2보다 높으면 h1이 먹이사슬에서 낮다는 의미, 사냥 불가.
		//사냥확률: 상어<독수리<뱀<강아지 
		if(h1.get사냥확률()>h2.get사냥확률()) {
			System.out.println(h1.이름+" :"+"이얍!");
			System.out.println(사냥꾼.name+" :"+"앗, 사냥에 실패한 모양이군, 나중에 내가 사냥해 줘야 겠다~");
		}
		else {
			System.out.println(h2.이름+" :"+"깨꼬닥..유언은 없다");
			System.out.println(사냥꾼.name+" :"+" "+h1.이름+"이(가) 사냥에 성공했어!");
			//숲에서 동물 지우기
			for(int i = 0; i<this.animals.length;i++) {
				if(this.animals[i] == h2) {
//					this.animals[i] = this.animals[numOfAnimals-1];
//					this.animals[numOfAnimals-1]=null;
//					numOfAnimals--;
					removeAnimal(this.animals[i]);
				}
			}
			
		}
		
		}	
	public void set동물() { //랜덤 생성하는 동물
		int r = (int)(Math.random()*10000)%4+1;//1~4 까지의 난수 생성
		
		switch(r) {
		case 1: this.addAnimal(new Dog("댕댕" + (this.numOfAnimals)));   break;
		case 2: this.addAnimal(new Snake("배앰" + (this.numOfAnimals))); break;
		case 3: this.addAnimal(new Eagle("술희" + (this.numOfAnimals))); break;
		case 4: this.addAnimal(new Shark("사메" + (this.numOfAnimals))); break;
		
		}
	}
	}

	

