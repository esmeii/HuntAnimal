package ���;


import Main.*;
import Animal.*;


public class �������� extends Place implements   Escapable, Sellable{
	private static �������� instance = null;	
	
	private ��������() { 	//10������ ���� �� �ִ� ��������
		this.where = "��������";
		animals = new Animal[10];		
	}
	private ��������(int size) { 
		this.where = "��������";
		animals = new Animal[size];
	}
	public static �������� getInstance() {
		if(instance==null) instance = new ��������();
		return instance;
	}
	public static �������� getInstance(int size) {
		if(instance==null) instance = new ��������(size);	
		return instance;
	}
	public  void show() {
		System.out.println("==========================================================================");
		System.out.print("## �������忡 �ִ� ������ :");
		
		showAnimals(animals , numOfAnimals);
		
	}

	public void escape() {		
		// �������忡 ������ �� ������ ���� ���
				if(this.numOfAnimals==0) {
					System.out.println(��ɲ�.name+" :"+"�������忡�� �̻��� �Ҹ��� �鸰�ٰ�?!");
					System.out.println(��ɲ�.name+" :"+"�������忡 ������ �� ������ ���µ�,,����� �ؾ߰ھ�!");
					return;
				}
		System.out.println(��ɲ�.name+" :"+"?!?! ������ ö������ ����� �ִ°�???");
		//�����ϰ� 50% Ȯ���� Ż��. 
		System.out.println("�������忡�� ������ Ż���� �Ϸ��մϴ�. Ż��Ȯ���� 50% �Դϴ�."); 
		Escapable [] e = getAnimals();   //���� [] �� ����					
		
		//Ż���� ���� ����
		int r=(int)(Math.random()*100) % this.numOfAnimals;	
		//�� ������ Ȯ���� ���� Ż���� �õ��Ѵ�.
		e[r].escape();		
		���� forest = ����.getInstance();   	
		
		for(int i=0; i<numOfAnimals; i++) {
	    	int r2=(int)(Math.random()*1000)%50+1;
	    	if( r2 < 51) {
	    		
	    		System.out.println(this.animals[i].�̸� +" :"+"�� �־��! "+��ɲ�.name+"!!!");
	    		forest.addAnimal(this.animals[i]); 
	    		//������ �ٽ� ��ȯ
	    		
	    		//�������忡�� ���� �����
//	    		this.animals[i]=this.animals[numOfAnimals-1];
//	    		this.animals[numOfAnimals-1]=null;
//	    		numOfAnimals--;
	    		removeAnimal(this.animals[i]);
	    	} 
	    		//Ż�⿡ ������ ��쿡��,
	    	else System.out.println(this.animals[i].�̸� +" :"+"������ ������..!");
		}
	}
	//��ɲ��� �������� ���� �� ���� ��������
		public void sell() {
			   if(this.numOfAnimals == 0) {
				   System.out.println(��ɲ�.name+" :"+"������ ��� �� �� ����!");
				   System.out.println();
				   return;
			   }
			   Sellable[] s = getAnimals();		   
			   int r=(int)(Math.random()*1000) % this.numOfAnimals;	
			   ������ zoo = ������.getInstance();
			   s[r].sell();
				//������ ���� ��ɲ��� 50%�� Ȯ���� �������忡 ���� �� ���� ������.
				for(int i=0; i<numOfAnimals; i++) {
			    	int r2=(int)(Math.random()*1000)%50+1;
			    	
			    	if( r2 < 51) {
			    		//��ɲ��� ���� ���� �˴ϴ�.
			    		��ɲ�.money += this.animals[i].getMoney();
			    		System.out.println(this.animals[i].�̸� +" :"+"�� �ȴٴ�, ��ȸ�Ұž�!");
			    		zoo.addAnimal(this.animals[i]); 
			    		//���������� �̵�
			    		
			    		//�������忡�� ���� �����
//			    		this.animals[i]=this.animals[numOfAnimals-1];
//			    		this.animals[numOfAnimals-1]=null;
//			    		numOfAnimals--;
			    		removeAnimal(this.animals[i]);
			    		
			    		System.out.println(��ɲ�.name+" :"+"������ �ȾƼ� �� ����� "+��ɲ�.money+" ���̾�~");
			    	} 
			    	//��ɲ��� �����ɿ� ���� ������ ���� ���� ���.
			    	else System.out.println(��ɲ�.name+" :"+"���� ������ ������ ȯ�� ����,,T__T");
				}
			   
}
		
		
		}








