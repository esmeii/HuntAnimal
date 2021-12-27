package Main;
import Animal.Dog;
import Animal.Eagle;
import Animal.Animal;
import Animal.Snake;
import Animal.Shark;
import 장소.*;

public class 사냥꾼 {

	동물농장 farm = 동물농장.getInstance();
	숲속 forest = 숲속.getInstance();
	동물원 zoo = 동물원.getInstance();
	public static String name;
	public static int money=0; // 무일푼으로 사냥 시작.
	
	public 사냥꾼() {
		name = "김철철"; //기본 이름 김철철
	} 
	
    public 사냥꾼(String name){
    	사냥꾼.name = name;
    }
    public void 인사하기() {
    	System.out.println(사냥꾼.name+" :"+"안녕, 내 이름은 "+ name);
    	// 실행 시 마다 랜덤하게 인사말이 바뀐다.
    	int r = (int)(Math.random()*10)+1; //1 부터 10까지의 난수 생성
    	switch(r) {
    	case 1:System.out.println(사냥꾼.name+" :"+"나,"+사냥꾼.name+"은(는) 사실 채식주의자야."); break;
    	case 2: System.out.println(사냥꾼.name+" :"+"동물을 잡으러 가자!!"); break;
    	case 3: System.out.println(사냥꾼.name+" :"+사냥꾼.name+",  내 이름이 너무 마음에 들어"); break;
    	case 4: System.out.println(사냥꾼.name+" :"+"나는 돈을 많이 벌고 싶어!!!!"); break;
    	case 5: System.out.println(사냥꾼.name+" :"+"사냥을 할 땐 힙합을 들어..."); break;
    	case 6: System.out.println(사냥꾼.name+" :"+"과제가 중간고사랑 겹친다고? 객지프가 제일 중요해"); break;
    	case 7: System.out.println(사냥꾼.name+" :"+"상어를 잡아볼까나~?"); break;
    	case 8: System.out.println(사냥꾼.name+" :"+"나는 아침형 인간이 되고 싶어.");
    	case 9: System.out.println(사냥꾼.name+" :"+"오해는 말아줘, 나는 동물을 무척 사랑한다고."); break;
    	case 10: System.out.println(사냥꾼.name+" :"+"같이,,마라탕 먹을래?"); break;
    	}
 	  
 	   System.out.println();
    }
    public void showInfo() { 
    	System.out.println("------------------------------------------------");
    	System.out.println("사냥꾼의 동물농장 크기 : " + farm.getSize());
    	System.out.println("사냥꾼의 money: " + 사냥꾼.money +"만원");    	
    	System.out.println("동물농장에 있는 동물 수: " + farm.numOfAnimals);
    	System.out.println("------------------------------------------------");
    	
    	farm.showAnimals();
    	System.out.println();
    }
    public void showMenu() { //사냥꾼의 동작메뉴.
    	System.out.println("******************************************************************");
    	System.out.println(" 사  냥  꾼 :  1.동물 사냥하기  2.숲속으로 소풍  3. ?동물농장? 4.동물원 구경 ");
		System.out.println("             5.동물농장 순찰  6.동물 팔기     7.?숲속?    0.종료하기");
		System.out.println("******************************************************************");
    }
	public void  show() {
		System.out.println("==========================================================================");
		System.out.print("## 동물농장에 있는 동물들 :");
		
		farm.showAnimals();
	}
	
    public boolean 사냥하기(Animal ani){    	
    	System.out.println("아자좟!!  " + ani.이름);    	
    	return  true;
    }
 
    public boolean 사냥하기(Dog dog){
    	boolean signal = doRandom(dog);
    	return signal;
    }
   
    public boolean 사냥하기(Snake snake){    	
    	boolean signal = doRandom(snake);
    	return signal;  
    }
    
    public boolean 사냥하기(Shark shark){
    	boolean signal = doRandom(shark);
    	return signal;  
    }
    public boolean 사냥하기(Eagle eagle) {
    	boolean signal = doRandom(eagle);
    	return signal;
    }
    public boolean doRandom(Animal animal) {
    	int r=(int)(Math.random()*1000)% 100;
    	if( r < animal.get사냥확률()) {
    		System.out.println(animal.이름 + "사냥하기 성공!");
    		return true;
    	}
    	else System.out.println(animal.이름 + "사냥하기 실패!");    	
    	return false;
    }   
    public void 사냥하기(){
    	
    	Animal ani = forest.getAnimal();
    	boolean sig=false;    
    
    	if (ani instanceof Dog) sig=사냥하기((Dog)ani);
    	else if (ani instanceof Snake) sig=사냥하기((Snake)ani);
    	else if (ani instanceof Shark) sig=사냥하기((Shark)ani);
    	else if (ani instanceof Eagle) sig=사냥하기((Eagle)ani);
    	else sig = 사냥하기(ani);  
    	if(sig==true) {
    		forest.removeAnimal(ani);
    		farm.addAnimal(ani);
    	}  
    }
    public void 종료하기() {
    	System.out.println(사냥꾼.name+" :"+"이따 두 시 거기서 다시 만나자!");
    }
   
 

  
}
