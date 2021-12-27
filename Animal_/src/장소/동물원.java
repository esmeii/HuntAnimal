package ���;


import Main.*;
import Animal.*;
/* ������: Animal ��ü �迭�� ���� �⺻ ũ��� 10�̴�. 
 *  	 ��ɲ��� ���ӿ��� ���� ������ �������� �� �� �ִ�.
 *  	 ������ ���������� work�� �Ѵ�. work�� �� ������ power�� �����Ѵ�.
 *  	 power�� 100�� �ѱ�� Ż���� ������ �õ��Ѵ�.
 *  	 */
/*  ���� ���� �����带 ��� ���߰� �ϴ� ����� ���� sleep() �޼ҵ�, 
 *  ���� ��� ���·� �����.���⼭ ���� ��� ���� ���ֺθ��⸦ 3�ʿ� �� ���� �ϵ��� ��*/

public class ������ extends Place implements  Workable, Escapable{
	private static ������ instance = null;	
	
	private ������() { 	
		this.where = "������";
		animals = new Animal[size];
	}
	public static ������ getInstance() {
		if(instance==null) instance = new ������();
		return instance;
	}
	
	public  void show() {
		System.out.println("==========================================================================");
		System.out.print("## �������� �ִ� ������ :");
		
		showAnimals(animals , numOfAnimals);
		
	}
	//work �� ���� power�� ������Ű�� �ʹ�.-> �� Animal ��ü�� ���ֺθ��� �޼ҵ� �ȿ��� power ���� �κ� ó��
	public void work() {
				
		Workable [] work = getAnimals();  
		
		for(int i=0; i<numOfAnimals; i++) {			
			work[i].���ֺθ���();
			
			if(this.animals[i].power>Workable.MaxPower) {
				//���ֺθ���� power�� MaxPower���� Ŀ���� ���������� Ż���ؼ� ������ �ٽ� ��ȯ
				���� forest = ����.getInstance();
				System.out.println(this.animals[i].�̸� +" :"+"�� �־��! ���������� �Ӽ���!");
				forest.addAnimal(this.animals[i]); 
				//���������� ���� �����
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
	
	
	   
	








