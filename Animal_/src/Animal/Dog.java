package Animal;
public class Dog extends Animal {
	//����Ʈ������
    public Dog(){
    	this.�̸�="���";
    	this.set���Ȯ��(90);  //������ ���Ȯ���� 90%
    	this.power = 0;    //�������� Ż���� ������ ���� ���� ����
    	this.setMoney(50); // �������� �������� �ȸ� 50���̴�.
    }

    public Dog(String name){    	
    	//�������� ó���κ��� �⺻�����ڿ��� ó���ϰ� ȣ���ؼ� �������.
    	this();    	
    	this.�̸�= name;
    }
    
    public Dog(String name, int ���Ȯ��){
    	//������ ���� �����ϴ� ��ĵ� �����ϰ�, �Ʒ�ó�� ȣ���ϴ� �͵� ����
    	this(name);
    	this.set���Ȯ��(���Ȯ��);
    }
    
    public void �����̱�(){
    	
    }

    public void ���(){
    	System.out.println(this.�̸�+" :"+"�ų��� ����~(�۸�)");
    	�����ϱ�();
    
    }
    public void �����ϱ�(){  
    	System.out.println(this.�̸� + " :"+"���δ� �� �ҷ�(�۸�)"); 
    }
    
    public void ����������(){
   	System.out.println(this.�̸� + " :"+"������ �������? (�۸�)");
    }

    public void �Ź߹���������(){
    	System.out.println(this.�̸� + " :"+"�Ź��� ���� ������ ������? (�۸�)");
    }
    
    //���������� ���ָ� �θ� ������ power�� �����Ѵ�.
    public void ���ֺθ���(){
    	����������();
    	System.out.println(this.�̸�+" :"+"���� �ں������� �뿹! �ΰ����� ���� ����! �۸�");
    	this.power+=10;
      }
    public void escape() {
    	System.out.println(this.�̸�+" :"+"������~~�۸�");
    }
    

}
