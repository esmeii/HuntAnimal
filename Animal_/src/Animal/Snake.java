package Animal;
public class Snake extends Animal {
   
    public Snake(){
    	this.�̸�="���";
    	this.set���Ȯ��(80);  //�� ���Ȯ���� 20%
    	this.power = 80;
    	this.setMoney(100);  //���� �������� �ȸ� 100��
    }

    public Snake(String name){    	
    	this();
    	this.�̸�= name;
    }
    
    public Snake(String name, int ���Ȯ��){
    	
    	this(name);
    	this.set���Ȯ��(���Ȯ��);
    }
    public void ���ٴϱ�(){
    	System.out.println(this.�̸� +" :"+"�ٸ��� ����� �� ������ ������ �� �־�");
    }

    public void �̸�Ʋ��(){
    	System.out.println(this.�̸� +" :"+"�̸� Ʋ��� �� ��̾�");
    }

    public void ���(){
    	System.out.println(this.�̸� +" :"+"��⸸ �ص� ���ڰ� �Ǹ� �󸶳� ������?");
    	���ٴϱ�();
    }
    public void ���ֺθ���(){
    	System.out.println(this.�̸�+" :"+"�� ���������� ���� ���� Ż���Ұž� 0_0");
    	�̸�Ʋ��();
    	this.power+=10;
      }
    public void escape() {
    	System.out.println(this.�̸�+" :"+"������~~");
    }

}
