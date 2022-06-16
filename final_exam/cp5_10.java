package cp5_10;
abstract class PairMap{
	protected String keyArray[]; //키들을 저장하는 배열
	protected String valueArray[]; //밸류 저장
	abstract String get(String key); //키 값을 가진 밸류 리턴 없으면 널
	abstract void put(String key, String value); // 저장
	abstract String delete(String key);	//삭제
	abstract int length();	//아이템 개수
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
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 "+ dic.get("이재문"));
		System.out.println("황기태의 값은 "+ dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 "+ dic.get("황기태"));
		
	}
}
