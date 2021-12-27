package Animal;
public class Shark extends Animal {

	public Shark() {
		this.이름 = "사메";
		this.set사냥확률(40); //사냥확률: 상어<독수리<뱀<강아지 
		this.power = 40;
		this.setMoney(1000); //상어를 동물원에 팔면 1000원
	}

	public Shark(String name) {
		this();
		this.이름 = name;
	}

	public Shark(String name, int 사냥확률) {
		
		this(name);
		this.set사냥확률(사냥확률);
	}
    public void 헤엄치기(){
    	System.out.println(this.이름+" :"+"헤~~엄");
    }

    public void 움직이기(){
    	System.out.println(this.이름+" :"+"수족관은 너무 좁다..");
    }

    public void 놀기(){
    	헤엄치기();
    	System.out.println(this.이름+" :"+"상어는 잠을 안 자, 알고 있었어?");
    }
    public void 재주부리기(){
    	움직이기();
    	System.out.println(this.이름+" :"+"우습군, 나는 수족관이 어울리지 않은걸");
    	this.power+=10;
    	
      }
    public void escape() {
    	System.out.println(this.이름+" :"+"프리덤~~");
    }

}
