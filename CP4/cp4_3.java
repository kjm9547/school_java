package CP3;
class Song{
	String title;
	String artist;
	int year;
	String country;
	public Song() {title =""; artist=""; year =0; country ="";}
	public Song(String title, String artist, int year,String country) {
		this.title = title;
		this.artist= artist;
		this.year = year;
		this.country = country;
		
	}
	public void show() {
		System.out.print(title+artist+year+country);
		
	}
}
public class cp4_3 {
	public static void main(String[] args) {
		Song s = new Song("����� �� �� �״뿩","ī������",2022,"���ѹα�");
		s.show();
	}
}
