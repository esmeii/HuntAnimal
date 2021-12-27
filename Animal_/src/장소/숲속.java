package ���;

import Animal.Animal;
import Animal.Dog;
import Animal.Eagle;
import Animal.Snake;
import Animal.Shark;
import Main.Huntable;
import Main.Playable;
import Main.��ɲ�;

public class ���� extends Place implements Huntable, Playable  {
	private  static ���� instance = null;	
	
	private ����() { 	//���ӿ� 10������ ������ ��	
		this.where = "����";
		animals = new Animal[10];
	}	
	
	public static ���� getInstance() {
		if(instance==null) instance = new ����();
		return instance;
	}	
	public void show() {
		System.out.println("==========================================================================");
		System.out.print("##  �� �ӿ� �ִ� ������ :");
		
		showAnimals(animals, numOfAnimals);		
	}	
	public  void ���() {
		System.out.println(��ɲ�.name+" :"+"�������� ��-�� ���, ������ ����Ϸ� �;߰ڴ�!");		
	
		Playable [] p = getAnimals();  //Playable�� �����ϵ��� ����
		for(int i=0; i< numOfAnimals; i++) {
			System.out.printf("[%2d] :",i);
			p[i].���();	  
			try {
				Thread.sleep(1000); // 1��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
	//���ӿ� �ִ� �������� ���� ����� �Ѵ�.
	public  void ����ϱ�() {
		
		System.out.println(��ɲ�.name+" :"+"��Ȥ�� ���������� ����..");
		
		// ���� �������� �����ϰ� ��� ����ϱ�
		Animal h1 = getAnimal();
		Animal h2 = getAnimal();
		// h1 �� h2 �� ����Ѵ�
		
		����ϱ�(h1,h2);
		
		//h1�� ���Ȯ���� h2���� ������ h1�� ���̻罽���� ���ٴ� �ǹ�, ��� �Ұ�.
		//���Ȯ��: ���<������<��<������ 
		if(h1.get���Ȯ��()>h2.get���Ȯ��()) {
			System.out.println(h1.�̸�+" :"+"�̾�!");
			System.out.println(��ɲ�.name+" :"+"��, ��ɿ� ������ ����̱�, ���߿� ���� ����� ��� �ڴ�~");
		}
		else {
			System.out.println(h2.�̸�+" :"+"������..������ ����");
			System.out.println(��ɲ�.name+" :"+" "+h1.�̸�+"��(��) ��ɿ� �����߾�!");
			//������ ���� �����
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
	public void set����() { //���� �����ϴ� ����
		int r = (int)(Math.random()*10000)%4+1;//1~4 ������ ���� ����
		
		switch(r) {
		case 1: this.addAnimal(new Dog("���" + (this.numOfAnimals)));   break;
		case 2: this.addAnimal(new Snake("���" + (this.numOfAnimals))); break;
		case 3: this.addAnimal(new Eagle("����" + (this.numOfAnimals))); break;
		case 4: this.addAnimal(new Shark("���" + (this.numOfAnimals))); break;
		
		}
	}
	}

	

