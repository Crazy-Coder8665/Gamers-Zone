package projectpkg;

public class friendinfo {
private String id;
private String fid;
private int rsend;
private int rrecieve;
private int raccept;
public friendinfo() {
	
}
public friendinfo(String id, String fid, int rsend, int rrecieve, int raccept) {
	
	this.id = id;
	this.fid = fid;
	this.rsend = rsend;
	this.rrecieve = rrecieve;
	this.raccept = raccept;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getFid() {
	return fid;
}
public void setFid(String fid) {
	this.fid = fid;
}
public int getRsend() {
	return rsend;
}
public void setRsend(int rsend) {
	this.rsend = rsend;
}
public int getRrecieve() {
	return rrecieve;
}
public void setRrecieve(int rrecieve) {
	this.rrecieve = rrecieve;
}
public int getRaccept() {
	return raccept;
}
public void setRaccept(int raccept) {
	this.raccept = raccept;
}

}
