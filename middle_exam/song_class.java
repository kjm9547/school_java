package CP3;
class Eong{
	private String title;
	private String artist;
	private int year;
	private String country;
	public Eong() {
		title="";
		artist="";
		year =0;
		country="";
	}
	public Eong(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	public void show() {System.out.print(year+"��"+country+"������"+artist+"�� �θ�"+title);};
}
public class song_class{
	public static void main(String[] args) {
		Eong s_1 = new Eong();
		Eong s_2 = new Eong("������ �� �״뿩","ī ������",2022,"�ѱ�");
		s_2.show();
	}
}