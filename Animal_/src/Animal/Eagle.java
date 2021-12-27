package Animal;
public class Eagle extends Animal {

    public Eagle(){
    	this.이름="술희";
    	this.set사냥확률(50);  //독수리 사냥확률을 30%
    	this.power = 90;     //독수리가 가장 탈출하고 싶어 한다.
    	this.setMoney(500); //독수리를 동물원에 팔면 500원 벌기
    }

    public Eagle(String name){    	
    	this();
    	this.이름= name;
    }
    
    public void 움직이기(){
    	System.out.println(this.이름+" :"+"나는 곧 대머리가 되겠지!?");
    }

    public void 날기(){
    	System.out.println(this.이름+" :"+"오늘 바람이 좋군-!");
    }

    public void 놀기(){
    	System.out.println(this.이름+" :"+"노는 게 제일 싫어!! 객지프 공부나 할거야!!");
    	공부하기();
    	날기();
    }
    public void 공부하기() {
    	System.out.println(this.이름+" :"+"객지프 공부하는 중~");
    }
    public void 재주부리기(){
    	움직이기();
    	System.out.println(this.이름+" :"+"새장 속의 새는 되기 싫어");
    	this.power+=10;
      }
    public void escape() {
    	System.out.println(this.이름+" :"+"프리덤~~");
    }

}
