package Main;
import Animal.Dog;
import Animal.Eagle;
import Animal.Animal;
import Animal.Snake;
import Animal.Shark;
import ���.*;

public class ��ɲ� {

	�������� farm = ��������.getInstance();
	���� forest = ����.getInstance();
	������ zoo = ������.getInstance();
	public static String name;
	public static int money=0; // ����Ǭ���� ��� ����.
	
	public ��ɲ�() {
		name = "��öö"; //�⺻ �̸� ��öö
	} 
	
    public ��ɲ�(String name){
    	��ɲ�.name = name;
    }
    public void �λ��ϱ�() {
    	System.out.println(��ɲ�.name+" :"+"�ȳ�, �� �̸��� "+ name);
    	// ���� �� ���� �����ϰ� �λ縻�� �ٲ��.
    	int r = (int)(Math.random()*10)+1; //1 ���� 10������ ���� ����
    	switch(r) {
    	case 1:System.out.println(��ɲ�.name+" :"+"��,"+��ɲ�.name+"��(��) ��� ä�������ھ�."); break;
    	case 2: System.out.println(��ɲ�.name+" :"+"������ ������ ����!!"); break;
    	case 3: System.out.println(��ɲ�.name+" :"+��ɲ�.name+",  �� �̸��� �ʹ� ������ ���"); break;
    	case 4: System.out.println(��ɲ�.name+" :"+"���� ���� ���� ���� �;�!!!!"); break;
    	case 5: System.out.println(��ɲ�.name+" :"+"����� �� �� ������ ���..."); break;
    	case 6: System.out.println(��ɲ�.name+" :"+"������ �߰����� ��ģ�ٰ�? �������� ���� �߿���"); break;
    	case 7: System.out.println(��ɲ�.name+" :"+"�� ��ƺ��~?"); break;
    	case 8: System.out.println(��ɲ�.name+" :"+"���� ��ħ�� �ΰ��� �ǰ� �;�.");
    	case 9: System.out.println(��ɲ�.name+" :"+"���ش� ������, ���� ������ ��ô ����Ѵٰ�."); break;
    	case 10: System.out.println(��ɲ�.name+" :"+"����,,������ ������?"); break;
    	}
 	  
 	   System.out.println();
    }
    public void showInfo() { 
    	System.out.println("------------------------------------------------");
    	System.out.println("��ɲ��� �������� ũ�� : " + farm.getSize());
    	System.out.println("��ɲ��� money: " + ��ɲ�.money +"����");    	
    	System.out.println("�������忡 �ִ� ���� ��: " + farm.numOfAnimals);
    	System.out.println("------------------------------------------------");
    	
    	farm.showAnimals();
    	System.out.println();
    }
    public void showMenu() { //��ɲ��� ���۸޴�.
    	System.out.println("******************************************************************");
    	System.out.println(" ��  ��  �� :  1.���� ����ϱ�  2.�������� ��ǳ  3. ?��������? 4.������ ���� ");
		System.out.println("             5.�������� ����  6.���� �ȱ�     7.?����?    0.�����ϱ�");
		System.out.println("******************************************************************");
    }
	public void  show() {
		System.out.println("==========================================================================");
		System.out.print("## �������忡 �ִ� ������ :");
		
		farm.showAnimals();
	}
	
    public boolean ����ϱ�(Animal ani){    	
    	System.out.println("������!!  " + ani.�̸�);    	
    	return  true;
    }
 
    public boolean ����ϱ�(Dog dog){
    	boolean signal = doRandom(dog);
    	return signal;
    }
   
    public boolean ����ϱ�(Snake snake){    	
    	boolean signal = doRandom(snake);
    	return signal;  
    }
    
    public boolean ����ϱ�(Shark shark){
    	boolean signal = doRandom(shark);
    	return signal;  
    }
    public boolean ����ϱ�(Eagle eagle) {
    	boolean signal = doRandom(eagle);
    	return signal;
    }
    public boolean doRandom(Animal animal) {
    	int r=(int)(Math.random()*1000)% 100;
    	if( r < animal.get���Ȯ��()) {
    		System.out.println(animal.�̸� + "����ϱ� ����!");
    		return true;
    	}
    	else System.out.println(animal.�̸� + "����ϱ� ����!");    	
    	return false;
    }   
    public void ����ϱ�(){
    	
    	Animal ani = forest.getAnimal();
    	boolean sig=false;    
    
    	if (ani instanceof Dog) sig=����ϱ�((Dog)ani);
    	else if (ani instanceof Snake) sig=����ϱ�((Snake)ani);
    	else if (ani instanceof Shark) sig=����ϱ�((Shark)ani);
    	else if (ani instanceof Eagle) sig=����ϱ�((Eagle)ani);
    	else sig = ����ϱ�(ani);  
    	if(sig==true) {
    		forest.removeAnimal(ani);
    		farm.addAnimal(ani);
    	}  
    }
    public void �����ϱ�() {
    	System.out.println(��ɲ�.name+" :"+"�̵� �� �� �ű⼭ �ٽ� ������!");
    }
   
 

  
}
