package projectpkg;

public class Personinfo {
	public String 	first;
	public String last;
	public String Email;
	public String Password;
	public String ID;
		public Personinfo(String fname, String lname, String email,String password,String id) {
			first = fname;
			last = lname;
			Email = email;
			Password = password;
			ID = id;
		}
		public Personinfo() {
			first = null;
			last = null;
			Email = null;
			Password = null;
			ID = null;
		}
}
