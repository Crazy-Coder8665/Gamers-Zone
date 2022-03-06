package projectpkg;

import java.io.PrintWriter;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonDAO { public PersonDAO() 
	{        
	
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    
   }
          
    catch(Exception e){
        System.out.println(e);

    }
	
	}
    public Boolean newrecord(String fname, String lname, String email,String password,String ID)throws Exception{
        Boolean flag = validate(email, ID);
        if (flag == true){
            return false;
        }
        String url = "jdbc:mysql://127.0.0.1/users";
        Connection con=DriverManager.getConnection(url,"root","root");
        Statement st=con.createStatement();
    
    
        
    
         String query="insert into login(fname,lname,email,password,ID) values('"+fname+"','"+lname+"','"+email+"','"+password+"','"+ID+"' )";

    
        
         int rs = st.executeUpdate( query );
         return true;

        
    }
    public Boolean validate(String email,String ID)throws Exception{

        String url = "jdbc:mysql://127.0.0.1/users";
        Connection con=DriverManager.getConnection(url,"root","root");
        Statement st=con.createStatement();
    
    
        
    
         String query="select* from login ";
    
        
         ResultSet rs = st.executeQuery( query );
         while(rs.next()){
             if(email.equals(rs.getString("email")) || ID.equals(rs.getString("ID"))){
            
           return true;}
           
            }
            return false;

}
    public String Login(String Email,String pass)throws Exception{

        String url = "jdbc:mysql://127.0.0.1/users";
        Connection con=DriverManager.getConnection(url,"root","root");
        Statement st=con.createStatement();
    
    
        
    
         String query="select* from login ";
    
        
         ResultSet rs = st.executeQuery( query );
         while(rs.next()){
             if(Email.equals(rs.getString("email")) && pass.equals(rs.getString("password"))){
            	 return rs.getString("ID"); 
       
            }
           
            }
            return "null";
            }
    public Personinfo profile(String Email)throws Exception{

        String url = "jdbc:mysql://127.0.0.1/users";
        Connection con=DriverManager.getConnection(url,"root","root");
        Statement st=con.createStatement();
        
    
        
    
         String query="select* from login ";
    
        
         ResultSet rs = st.executeQuery( query );
         while(rs.next()){
             if(Email.equals(rs.getString("email"))){
            	 Personinfo pi =new Personinfo(rs.getString("fname"),rs.getString("lname"),rs.getString("email"),rs.getString("password"),rs.getString("ID"));
            	 return pi;
            }
           
            }
            return null;
            }
    public void delete(String Email)throws Exception{

        String url = "jdbc:mysql://127.0.0.1/users";
        Connection con=DriverManager.getConnection(url,"root","root");
        Statement st=con.createStatement();
        
    
    
        String query="delete from login where email = '"+Email+"'";
    
        
         int rs = st.executeUpdate( query );
         
            return;
            }
    public Boolean check(String ID)throws Exception{

        String url = "jdbc:mysql://127.0.0.1/users";
        Connection con=DriverManager.getConnection(url,"root","root");
        Statement st=con.createStatement();
    
    
        
    
         String query="select* from login ";
    
        
         ResultSet rs = st.executeQuery( query );
         while(rs.next()){
             if(ID.equals(rs.getString("ID"))){
            
           return true;}
           
            }
            return false;

}
    public Boolean edit(Enrollinfo ei)throws Exception{
    	Boolean flag = check(ei.getId());
    	Boolean opflag = check(ei.getOpid());
        if (flag == false && opflag == false ){
            return false;
        }
        //Insertion
        try{
            
            String url = "jdbc:mysql://127.0.0.1/users";
            Connection con=DriverManager.getConnection(url,"root","root");
            Statement st=con.createStatement();
        
            String query="delete from login where email = '"+ei.getId()+"'";
            
            
            int rts = st.executeUpdate( query );
            
        
             query="select* from enroll ";
             	
            String date = ei.getYear()+"-"+ei.getMonth()+"-"+ei.getDay();
             ResultSet rs = st.executeQuery( query );
             query="insert into enroll(ID,OPID,Game,Date) values('"+ei.getId()+"','"+ei.getOpid()+"','"+ei.getGame()+"','"+date+"' )";
             int resultset = st.executeUpdate( query );    
             
             }
            catch(Exception e){
                System.out.println(e);
            }
        
        return true;

        
    }
    public Enrollinfo geten(String id)throws Exception{

        String url = "jdbc:mysql://127.0.0.1/users";
        Connection con=DriverManager.getConnection(url,"root","root");
        Statement st=con.createStatement();
        
    
        
    
         String query="select* from enroll ";
    
        
         ResultSet rs = st.executeQuery( query );
         while(rs.next()){
             if(id.equals(rs.getString("ID"))){
            	 String d=rs.getString("Date");
            	 String s1[] = d.split("-");
            	 
            	 
            	 Enrollinfo pi =new Enrollinfo(rs.getString("ID"),rs.getString("OPID"),s1[2],s1[0],s1[1],rs.getString("Game"));
            	 return pi;
            }
           
            }
            return null;
            }
    public ArrayList<Personinfo> search(String b)throws Exception{
    		
        String url = "jdbc:mysql://127.0.0.1/users";
        Connection con=DriverManager.getConnection(url,"root","root");
        Statement st=con.createStatement();
        String query="SELECT* FROM login WHERE ID LIKE '%"+b+"%'";
         ResultSet rs = st.executeQuery( query );
         ArrayList<Personinfo> al=new ArrayList<Personinfo>();
         while(rs.next()){
             
            	 Personinfo pi =new Personinfo(rs.getString("fname"),rs.getString("lname"),rs.getString("email"),rs.getString("password"),rs.getString("ID"));
            	 al.add(pi);
            	
            
           
            }
         return al;
           
            }
    public Boolean savefriend(friendinfo fi) {
    	try {
    	Boolean flag = check(fi.getId());
    	Boolean opflag = check(fi.getFid());
        if (flag == false && opflag == false ){
            return false;
        }
        String id= fi.getId();
        String fid= fi.getFid();
         String url = "jdbc:mysql://127.0.0.1/users";
         Connection con=DriverManager.getConnection(url,"root","root");
         Statement st=con.createStatement();
         String query="select* from friends";
         ResultSet rts = st.executeQuery( query );
         while(rts.next()) {
        	 if(id.equals(rts.getString("id")) && fid.equals(rts.getString("fid"))) {
        		 return false;
        		 
        	 }
         }
     
     
         
     
          query="insert into friends(id,fid,rsend,rrecieve,raccept) values('"+fi.getId()+"','"+fi.getFid()+"',"+fi.getRsend()+","+fi.getRrecieve()+","+fi.getRaccept()+" )";

     
         
          
			int rs = st.executeUpdate( query );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          return true;

      
    	
    	
    }

}
