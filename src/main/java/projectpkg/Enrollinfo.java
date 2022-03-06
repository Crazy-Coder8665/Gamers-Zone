package projectpkg;

public class Enrollinfo {
	private String id;
	private String opid;
	private String day;
	private String year;
	private String month;
	private String game;
	public Enrollinfo(String id, String opid, String day, String year, String month, String game) {
		this.id = id;
		this.opid = opid;
		this.day = day;
		this.year = year;
		this.month = month;
		this.game = game;
	}
	public Enrollinfo() {
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOpid() {
		return opid;
	}
	public void setOpid(String opid) {
		this.opid = opid;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	
		
}
