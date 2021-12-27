package Main;
import java.util.Scanner;
import Animal.Dog;
import Animal.Eagle;
import Animal.Snake;
import Animal.Shark;
import 장소.동물농장;
import 장소.동물원;
import 장소.숲속;

public class Main {

    public static void main(String[] args) throws InterruptedException{
    	Scanner input = new Scanner(System.in);
 
    	숲속 forest = 숲속.getInstance();
    	동물원 zoo = 동물원.getInstance();
    	동물농장 farm = 동물농장.getInstance();
		//사냥꾼 생성
		System.out.println("사냥꾼의 이름을 지어주시겠어요? : ");
			String name = input.nextLine();
			사냥꾼 hunter = new 사냥꾼(name);
		
		hunter.인사하기();
		hunter.showInfo();
		
		for(int i = 0; i<10;i++){//숲속에 10 마리의 동물 생성		
			menu();
			int menu= input.nextInt();
			switch (menu) {
				case 1:
					forest.addAnimal(new Dog("댕댕" + forest.numOfAnimals));
					break;
				case 2:
					forest.addAnimal(new Snake("배앰" + forest.numOfAnimals));
					break;
				case 3:
					forest.addAnimal(new Eagle("술희" + forest.numOfAnimals));
					break;
				case 4:
					forest.addAnimal(new Shark("사메" + forest.numOfAnimals));
					break;	
				// 랜덤으로 동물을 생성한다.-> 
				case 5: forest.set동물(); 
					break;	
				default: 
					System.out.println(사냥꾼.name+" :"+" 잘못 누른 거지??");
					i--;
							}
					}
				
		do {
			
			hunter.showMenu(); //사냥꾼의 동작 메뉴 보이기
			int ch = input.nextInt();
			if(ch==0) {
				hunter.종료하기(); break;
			}			
			switch(ch) {
			    case 1:
					hunter.사냥하기();
					break;
				case 2: //숲속활동보기- 놀기()
					forest.show();
					forest.놀기();
					break;
				case 3:// 동물농장에서 무슨 일이..? - 탈출시도!
					farm.escape();
					break;
				case 4: //동물원 활동보기 - 일하기();	
					zoo.show();
					zoo.work();
					break;
				case 5: //동물농장 보기 , 현황 보기
					hunter.show();
					hunter.showInfo();
					break;
				case 6: //동물원에 동물을 팔 수 있음. 돈을 번다.
					farm.sell();
					break;
				case 7: //숲속에서 동물들 서로 사냥함.
					forest.사냥하기();
					break;
				default:
					System.out.println(사냥꾼.name+" :"+" 잘못 누른 거지?");
				}				
		
		}while(true);
    }
	   
    public static void menu() {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("숲속에 동물생성:  1.강아지 2.뱀 3.독수리 4. 상어 5.랜덤생성  ");
		System.out.println("-----------------------------------------------------------------------");
	}

}
