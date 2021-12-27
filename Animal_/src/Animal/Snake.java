package Animal;
public class Snake extends Animal {
   
    public Snake(){
    	this.이름="배앰";
    	this.set사냥확률(80);  //뱀 사냥확률을 20%
    	this.power = 80;
    	this.setMoney(100);  //뱀을 동물원에 팔면 100원
    }

    public Snake(String name){    	
    	this();
    	this.이름= name;
    }
    
    public Snake(String name, int 사냥확률){
    	
    	this(name);
    	this.set사냥확률(사냥확률);
    }
    public void 기어다니기(){
    	System.out.println(this.이름 +" :"+"다리가 생기면 난 지구를 정복할 수 있어");
    }

    public void 똬리틀기(){
    	System.out.println(this.이름 +" :"+"똬리 틀기는 내 취미야");
    }

    public void 놀기(){
    	System.out.println(this.이름 +" :"+"놀기만 해도 부자가 되면 얼마나 좋을까?");
    	기어다니기();
    }
    public void 재주부리기(){
    	System.out.println(this.이름+" :"+"저 강아지보단 내가 먼저 탈출할거야 0_0");
    	똬리틀기();
    	this.power+=10;
      }
    public void escape() {
    	System.out.println(this.이름+" :"+"프리덤~~");
    }

}
