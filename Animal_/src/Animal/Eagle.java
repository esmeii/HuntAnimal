package Animal;
public class Eagle extends Animal {

    public Eagle(){
    	this.�̸�="����";
    	this.set���Ȯ��(50);  //������ ���Ȯ���� 30%
    	this.power = 90;     //�������� ���� Ż���ϰ� �;� �Ѵ�.
    	this.setMoney(500); //�������� �������� �ȸ� 500�� ����
    }

    public Eagle(String name){    	
    	this();
    	this.�̸�= name;
    }
    
    public void �����̱�(){
    	System.out.println(this.�̸�+" :"+"���� �� ��Ӹ��� �ǰ���!?");
    }

    public void ����(){
    	System.out.println(this.�̸�+" :"+"���� �ٶ��� ����-!");
    }

    public void ���(){
    	System.out.println(this.�̸�+" :"+"��� �� ���� �Ⱦ�!! ������ ���γ� �Ұž�!!");
    	�����ϱ�();
    	����();
    }
    public void �����ϱ�() {
    	System.out.println(this.�̸�+" :"+"������ �����ϴ� ��~");
    }
    public void ���ֺθ���(){
    	�����̱�();
    	System.out.println(this.�̸�+" :"+"���� ���� ���� �Ǳ� �Ⱦ�");
    	this.power+=10;
      }
    public void escape() {
    	System.out.println(this.�̸�+" :"+"������~~");
    }

}
