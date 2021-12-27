package 장소;


import Main.*;
import Animal.*;


public class 동물농장 extends Place implements   Escapable, Sellable{
	private static 동물농장 instance = null;	
	
	private 동물농장() { 	//10마리를 넣을 수 있는 동물농장
		this.where = "동물농장";
		animals = new Animal[10];		
	}
	private 동물농장(int size) { 
		this.where = "동물농장";
		animals = new Animal[size];
	}
	public static 동물농장 getInstance() {
		if(instance==null) instance = new 동물농장();
		return instance;
	}
	public static 동물농장 getInstance(int size) {
		if(instance==null) instance = new 동물농장(size);	
		return instance;
	}
	public  void show() {
		System.out.println("==========================================================================");
		System.out.print("## 동물농장에 있는 동물들 :");
		
		showAnimals(animals , numOfAnimals);
		
	}

	public void escape() {		
		// 동물농장에 동물이 한 마리도 없는 경우
				if(this.numOfAnimals==0) {
					System.out.println(사냥꾼.name+" :"+"동물농장에서 이상한 소리가 들린다고?!");
					System.out.println(사냥꾼.name+" :"+"동물농장에 동물이 한 마리도 없는데,,사냥을 해야겠어!");
					return;
				}
		System.out.println(사냥꾼.name+" :"+"?!?! 농장의 철조망이 뜯겨져 있는걸???");
		//랜덤하게 50% 확률로 탈출. 
		System.out.println("동물농장에서 동물이 탈출을 하려합니다. 탈출확률은 50% 입니다."); 
		Escapable [] e = getAnimals();   //동물 [] 을 리턴					
		
		//탈출할 동물 고르기
		int r=(int)(Math.random()*100) % this.numOfAnimals;	
		//각 동물의 확률에 따라 탈출을 시도한다.
		e[r].escape();		
		숲속 forest = 숲속.getInstance();   	
		
		for(int i=0; i<numOfAnimals; i++) {
	    	int r2=(int)(Math.random()*1000)%50+1;
	    	if( r2 < 51) {
	    		
	    		System.out.println(this.animals[i].이름 +" :"+"잘 있어라! "+사냥꾼.name+"!!!");
	    		forest.addAnimal(this.animals[i]); 
	    		//숲으로 다시 귀환
	    		
	    		//동물농장에서 동물 지우기
//	    		this.animals[i]=this.animals[numOfAnimals-1];
//	    		this.animals[numOfAnimals-1]=null;
//	    		numOfAnimals--;
	    		removeAnimal(this.animals[i]);
	    	} 
	    		//탈출에 실패한 경우에는,
	    	else System.out.println(this.animals[i].이름 +" :"+"다음엔 기필코..!");
		}
	}
	//사냥꾼이 동물원에 내다 팔 동물 데려오기
		public void sell() {
			   if(this.numOfAnimals == 0) {
				   System.out.println(사냥꾼.name+" :"+"동물이 없어서 팔 수 없어!");
				   System.out.println();
				   return;
			   }
			   Sellable[] s = getAnimals();		   
			   int r=(int)(Math.random()*1000) % this.numOfAnimals;	
			   동물원 zoo = 동물원.getInstance();
			   s[r].sell();
				//마음이 약한 사냥꾼은 50%의 확률로 동물농장에 팔지 안 팔지 결정함.
				for(int i=0; i<numOfAnimals; i++) {
			    	int r2=(int)(Math.random()*1000)%50+1;
			    	
			    	if( r2 < 51) {
			    		//사냥꾼은 돈을 벌게 됩니다.
			    		사냥꾼.money += this.animals[i].getMoney();
			    		System.out.println(this.animals[i].이름 +" :"+"날 팔다니, 후회할거야!");
			    		zoo.addAnimal(this.animals[i]); 
			    		//동물원으로 이동
			    		
			    		//동물농장에서 동물 지우기
//			    		this.animals[i]=this.animals[numOfAnimals-1];
//			    		this.animals[numOfAnimals-1]=null;
//			    		numOfAnimals--;
			    		removeAnimal(this.animals[i]);
			    		
			    		System.out.println(사냥꾼.name+" :"+"동물을 팔아서 총 재산은 "+사냥꾼.money+" 원이야~");
			    	} 
			    	//사냥꾼이 동정심에 차마 동물을 팔지 못한 경우.
			    	else System.out.println(사냥꾼.name+" :"+"역시 동물은 돈으로 환산 못해,,T__T");
				}
			   
}
		
		
		}








