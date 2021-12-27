package Animal;
import Main.*;

public abstract class Animal implements Playable, Moveable, Huntable, Workable, Escapable, Sellable {
    public String 이름;
    private int money;
    private int 사냥확률;
    
    public int power = 0;
   

    public Animal(){
    	System.out.println("동물을 한마리 생성합니다");
    }

    public Animal(String 이름){
    	
    	this.이름=이름;
    	System.out.println(this.이름 +"을 가진 동물을 한마리 생성합니다.");
    }

   public void setMoney(int money) {
	   this.money = money;
   }
   public int getMoney() {
	   
	   return money;
   }

    public int get사냥확률(){
    	
        return this.사냥확률;
    }

    public void set사냥확률(int 사냥확률){
    	this.사냥확률 = 사냥확률;
    }   
    
    
   
	public abstract void 놀기();

    public void 먹기() {
	}

    public void 자기(){
    }

    public void 움직이기(){
    }

    public void show(){
    	
    }
    public void sell() {
    	
    }

}
