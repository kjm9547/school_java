package cp5_10;
abstract class PairMap{
	protected String keyArray[]; //Ű���� �����ϴ� �迭
	protected String valueArray[]; //��� ����
	abstract String get(String key); //Ű ���� ���� ��� ���� ������ ��
	abstract void put(String key, String value); // ����
	abstract String delete(String key);	//����
	abstract int length();	//������ ����
}
class Dictionary extends PairMap{
	int size;
	int index;
	public Dictionary(int n) {
		size = n;
		keyArray = new String[10];
		valueArray = new String[10];
		index =0;
	}
	
	void put(String key,String value) {
		Boolean ck_key = false;
		for(int i=0; i<length();i++) {
			if(keyArray[i] == key) {
				valueArray[i] = value;
				ck_key = true;
			}
		}
		
		if(ck_key==false) {
			keyArray[length()] = key;
			valueArray[length()] = value;
			index++;	
		}
		
		
	}
	String get(String key) {
		
		for(int i=0; i<length();i++) {
			if(keyArray[i] == key) {
				return valueArray[i];
			}
			
		}
		return "null";
		
	}
	String delete(String key) {
		String tmp = " ";
		for(int i=0; i<length();i++) {
			if(keyArray[i] == key) {
				tmp = valueArray[i];
				valueArray[i] = "null";
			}
		}
		return tmp;
	}
	int length() {
		return index;
	}
	
}
public class cp5_10 {
	public static void main(String []args) {
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̽�");
		dic.put("���繮", "C++");
		System.out.println("���繮�� ���� "+ dic.get("���繮"));
		System.out.println("Ȳ������ ���� "+ dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� "+ dic.get("Ȳ����"));
		
	}
}
