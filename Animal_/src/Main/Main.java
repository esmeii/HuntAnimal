package Main;
import java.util.Scanner;
import Animal.Dog;
import Animal.Eagle;
import Animal.Snake;
import Animal.Shark;
import ���.��������;
import ���.������;
import ���.����;

public class Main {

    public static void main(String[] args) throws InterruptedException{
    	Scanner input = new Scanner(System.in);
 
    	���� forest = ����.getInstance();
    	������ zoo = ������.getInstance();
    	�������� farm = ��������.getInstance();
		//��ɲ� ����
		System.out.println("��ɲ��� �̸��� �����ֽðھ��? : ");
			String name = input.nextLine();
			��ɲ� hunter = new ��ɲ�(name);
		
		hunter.�λ��ϱ�();
		hunter.showInfo();
		
		for(int i = 0; i<10;i++){//���ӿ� 10 ������ ���� ����		
			menu();
			int menu= input.nextInt();
			switch (menu) {
				case 1:
					forest.addAnimal(new Dog("���" + forest.numOfAnimals));
					break;
				case 2:
					forest.addAnimal(new Snake("���" + forest.numOfAnimals));
					break;
				case 3:
					forest.addAnimal(new Eagle("����" + forest.numOfAnimals));
					break;
				case 4:
					forest.addAnimal(new Shark("���" + forest.numOfAnimals));
					break;	
				// �������� ������ �����Ѵ�.-> 
				case 5: forest.set����(); 
					break;	
				default: 
					System.out.println(��ɲ�.name+" :"+" �߸� ���� ����??");
					i--;
							}
					}
				
		do {
			
			hunter.showMenu(); //��ɲ��� ���� �޴� ���̱�
			int ch = input.nextInt();
			if(ch==0) {
				hunter.�����ϱ�(); break;
			}			
			switch(ch) {
			    case 1:
					hunter.����ϱ�();
					break;
				case 2: //����Ȱ������- ���()
					forest.show();
					forest.���();
					break;
				case 3:// �������忡�� ���� ����..? - Ż��õ�!
					farm.escape();
					break;
				case 4: //������ Ȱ������ - ���ϱ�();	
					zoo.show();
					zoo.work();
					break;
				case 5: //�������� ���� , ��Ȳ ����
					hunter.show();
					hunter.showInfo();
					break;
				case 6: //�������� ������ �� �� ����. ���� ����.
					farm.sell();
					break;
				case 7: //���ӿ��� ������ ���� �����.
					forest.����ϱ�();
					break;
				default:
					System.out.println(��ɲ�.name+" :"+" �߸� ���� ����?");
				}				
		
		}while(true);
    }
	   
    public static void menu() {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("���ӿ� ��������:  1.������ 2.�� 3.������ 4. ��� 5.��������  ");
		System.out.println("-----------------------------------------------------------------------");
	}

}
