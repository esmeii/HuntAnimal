package Animal;
import Main.*;

public abstract class Animal implements Playable, Moveable, Huntable, Workable, Escapable, Sellable {
    public String �̸�;
    private int money;
    private int ���Ȯ��;
    
    public int power = 0;
   

    public Animal(){
    	System.out.println("������ �Ѹ��� �����մϴ�");
    }

    public Animal(String �̸�){
    	
    	this.�̸�=�̸�;
    	System.out.println(this.�̸� +"�� ���� ������ �Ѹ��� �����մϴ�.");
    }

   public void setMoney(int money) {
	   this.money = money;
   }
   public int getMoney() {
	   
	   return money;
   }

    public int get���Ȯ��(){
    	
        return this.���Ȯ��;
    }

    public void set���Ȯ��(int ���Ȯ��){
    	this.���Ȯ�� = ���Ȯ��;
    }   
    
    
   
	public abstract void ���();

    public void �Ա�() {
	}

    public void �ڱ�(){
    }

    public void �����̱�(){
    }

    public void show(){
    	
    }
    public void sell() {
    	
    }

}
