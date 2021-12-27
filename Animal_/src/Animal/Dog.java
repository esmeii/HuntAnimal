package Animal;
public class Dog extends Animal {
	//디폴트생성자
    public Dog(){
    	this.이름="댕댕";
    	this.set사냥확률(90);  //강아지 사냥확률을 90%
    	this.power = 0;    //강아지는 탈출할 마음이 별로 없나 보다
    	this.setMoney(50); // 강아지를 동물원에 팔면 50원이다.
    }

    public Dog(String name){    	
    	//공통적인 처리부분은 기본생성자에서 처리하고 호출해서 사용하자.
    	this();    	
    	this.이름= name;
    }
    
    public Dog(String name, int 사냥확률){
    	//변수에 직접 대입하는 방식도 가능하고, 아래처럼 호출하는 것도 가능
    	this(name);
    	this.set사냥확률(사냥확률);
    }
    
    public void 움직이기(){
    	
    }

    public void 놀기(){
    	System.out.println(this.이름+" :"+"신나게 놀자~(멍멍)");
    	공부하기();
    
    }
    public void 공부하기(){  
    	System.out.println(this.이름 + " :"+"공부는 안 할래(멍멍)"); 
    }
    
    public void 인형물어뜯기(){
   	System.out.println(this.이름 + " :"+"인형을 물어뜯어볼까? (멍멍)");
    }

    public void 신발물고도망가기(){
    	System.out.println(this.이름 + " :"+"신발을 물고 도망을 가볼까? (멍멍)");
    }
    
    //동물원에서 재주를 부릴 때마다 power가 증가한다.
    public void 재주부리기(){
    	인형물어뜯기();
    	System.out.println(this.이름+" :"+"나는 자본주의의 노예! 인간보다 돈이 좋아! 멍멍");
    	this.power+=10;
      }
    public void escape() {
    	System.out.println(this.이름+" :"+"프리덤~~멍멍");
    }
    

}
