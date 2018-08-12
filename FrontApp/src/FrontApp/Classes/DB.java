package FrontApp.Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;

public class DB {
    static List<electronic_items> list = new ArrayList<electronic_items>();
    static Connection con;
    static PreparedStatement pre;
    static ResultSet res;
    
    public DB(){}
    
    public static Connection getConnection(){

       try {
           con = DriverManager.getConnection("jdbc:mysql://localhost/soft", "root","root");
                 //     JOptionPane.showMessageDialog(null, " Connected");
           return con;
       }catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Not Connected");
           return null;
       }
    }
    
    public Vector show(String s) throws Exception{
        Vector all= new Vector();
        Vector row = new Vector();
        try {
            pre= con.prepareStatement("select * from "+staticV.div+" where name like '"+s+"%'");
            res=pre.executeQuery();
            while(res.next()){
                row.add(res.getString(2));
                row.add(res.getString(3));
                row.add(res.getDouble(5));
                row.add(res.getString(6));
                row.add(res.getString(8));
                row.add(res.getString(9));
                all.add(row);
                row=new Vector();
            }
            
            return all;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e+"\n in method show");
        }
        
        return  null;
    }
    
    public Vector show()throws Exception{
        Vector all= new Vector();
        Vector row = new Vector();
        try {
            pre= con.prepareStatement("select * from "+staticV.div);
            res=pre.executeQuery();
            while(res.next()){
                row.add(res.getString(2));
                row.add(res.getString(3));
                row.add(res.getDouble(5));
                row.add(res.getString(6));
                row.add(res.getString(8));
                row.add(res.getString(9));
                all.add(row);
                row=new Vector();
            }
            
            return all;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e+"\n in method show");
        }
        
        return  null;
    }
    
    public List<electronic_items> getdata()throws Exception{      
        list.clear();
        try {
            if(staticV.cat.length() > 0){
                pre= getConnection().prepareStatement("select * from "+staticV.div+" WHERE " + staticV.cat);
                res=pre.executeQuery();
            }else{
                pre= getConnection().prepareStatement("select * from "+staticV.div);
                res=pre.executeQuery();
            }
            
            electronic_items obj;
            while(res.next()){
                obj= new electronic_items(res.getString(2),res.getString(3),res.getInt(4),res.getDouble(5),
                        res.getString(6),res.getBytes(7),res.getString(8),res.getString(9));
                list.add(obj);
            }
            return list;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e+"\n in method getdata");
        }
        
        return  null;
    }
    
    public static void feedback(String feed){
        
         try {
            pre= con.prepareStatement("insert into feedback(feed,type) values(?,?)");
            pre.setString(1, feed);
            pre.setString(2, "feed");
            pre.execute();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e+"\n in method feedback at class database");
        }
        
    }
    
}
