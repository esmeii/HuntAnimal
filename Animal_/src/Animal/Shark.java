package Animal;
public class Shark extends Animal {

	public Shark() {
		this.�̸� = "���";
		this.set���Ȯ��(40); //���Ȯ��: ���<������<��<������ 
		this.power = 40;
		this.setMoney(1000); //�� �������� �ȸ� 1000��
	}

	public Shark(String name) {
		this();
		this.�̸� = name;
	}

	public Shark(String name, int ���Ȯ��) {
		
		this(name);
		this.set���Ȯ��(���Ȯ��);
	}
    public void ���ġ��(){
    	System.out.println(this.�̸�+" :"+"��~~��");
    }

    public void �����̱�(){
    	System.out.println(this.�̸�+" :"+"�������� �ʹ� ����..");
    }

    public void ���(){
    	���ġ��();
    	System.out.println(this.�̸�+" :"+"���� ���� �� ��, �˰� �־���?");
    }
    public void ���ֺθ���(){
    	�����̱�();
    	System.out.println(this.�̸�+" :"+"�����, ���� �������� ��︮�� ������");
    	this.power+=10;
    	
      }
    public void escape() {
    	System.out.println(this.�̸�+" :"+"������~~");
    }

}
