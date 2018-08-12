
package BackApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;


public class DB {
    PreparedStatement pre;
    ResultSet res;
    static Connection con = null;
    String div ;
    
    public DB(){}
    
    public static Connection getConnection(){

       try {
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost/soft", "root","root");
           return con;
       }catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Not Connected \n in connction database");
           return null;
       }
   }
        
    public Vector show(){
        if(authorization.division.equalsIgnoreCase("Electronics")){
            div = "elect_items" ;
        }else if (authorization.division.equalsIgnoreCase("Clothes")){
            div = "clothes_items" ;
        }else if (authorization.division.equalsIgnoreCase("Food")){
            div = "food_items" ;
        }else if (authorization.division.equalsIgnoreCase("Library")){
            div = "lib_items" ;
        }else if (authorization.division.equalsIgnoreCase("Pharmacy")){
            div = "pharm_items" ;
        }else if (authorization.division.equalsIgnoreCase("Cinema")){
            div = "Cinema_items" ;
        }
        
        Vector all= new Vector();
        Vector row = new Vector();
        try {
            pre= con.prepareStatement("select * from "+div+" WHERE shop_id='"+authorization.shop_id+"'");
            res=pre.executeQuery();
            while(res.next()){
                row.add(res.getString(2));
                row.add(res.getString(3));
                row.add(res.getInt(4));
                row.add(res.getDouble(5));
                row.add(res.getString(6));
                row.add(res.getString(8));
                all.add(row);
                row=new Vector();
            }
            return all;
        } catch (Exception e) {
        }
        
        return  null;
    }
    
    public Vector showAudit(){
        Vector all= new Vector();
        Vector row = new Vector();
        try {
            if (authorization.manager){
                pre= con.prepareStatement("select * from audit WHERE shop_id = '"+authorization.shop_id+"'");
                res=pre.executeQuery();
            }else if (authorization.admin){
                pre= con.prepareStatement("select * from audit");
                res=pre.executeQuery();
            }
            while(res.next()){
                row.add(res.getInt(1));
                row.add(res.getInt(2));
                row.add(res.getString(3));
                row.add(res.getString(4));
                row.add(res.getString(5));
                row.add(res.getString(6));
                all.add(row);
                row=new Vector();
            }
            return all;
            
        } catch (Exception e) {
        }
        return  null;
    }
    
    public Vector showUsers(){ 
        Vector all= new Vector();
        Vector row = new Vector();
        try {
            if (authorization.manager){
                pre= con.prepareStatement("select * from users WHERE shop_id = '"+authorization.shop_id+"'");
                res=pre.executeQuery();
            }else if (authorization.admin){
                pre= con.prepareStatement("select * from users");
                res=pre.executeQuery();
            }
            while(res.next()){
                row.add(res.getInt(1));
                row.add(res.getString(2));
                row.add(res.getString(3));
                row.add(res.getString(4));
                row.add(res.getString(5));
                row.add(res.getString(6));
                all.add(row);
                row=new Vector();
            }
            return all;
            
        } catch (Exception e) {
        }
        return  null;
    }
    
    public Vector showBill(){ 
        Vector all= new Vector();
        Vector row = new Vector();
        try {
            if (authorization.staff){
                pre= con.prepareStatement("select cart_id , date , status , price from bill_history WHERE shop_id = '"+authorization.shop_id+"'"
                +" and status = 'false'");
                res=pre.executeQuery();
            }
            
            while(res.next()){
                row.add(res.getInt(1));
                row.add(res.getString(2));
                row.add(res.getString(3));
                row.add(res.getDouble(4));
                all.add(row);
                row=new Vector();
            }
            return all;
            
        } catch (Exception e) {
        }
        return  null;
    }
    
    public List<items_caps> getdata(){
        if(authorization.division.equalsIgnoreCase("Electronics")){
            div = "elect_items" ;
        }else if (authorization.division.equalsIgnoreCase("Clothes")){
            div = "clothes_items" ;
        }else if (authorization.division.equalsIgnoreCase("Food")){
            div = "food_items" ;
        }else if (authorization.division.equalsIgnoreCase("Library")){
            div = "lib_items" ;
        }else if (authorization.division.equalsIgnoreCase("Pharmacy")){
            div = "pharm_items" ;
        }else if (authorization.division.equalsIgnoreCase("Cinema")){
            div = "Cinema_items" ;
        }
        try {
            pre= con.prepareStatement("select * from "+div);
            res=pre.executeQuery();
            List<items_caps> list = new ArrayList<>();
            items_caps obj;
            while(res.next()){
            
            obj= new items_caps(res.getString(2),res.getString(3),res.getInt(4),res.getDouble(5),res.getString(6),res.getBytes(7),res.getString(8));

              list.add(obj);
            
            }
            return list;
            } catch (Exception e) {
        }
        
        return  null;
    }
      
    public void delete(String code){
        if(authorization.division.equalsIgnoreCase("Electronics")){
            div = "elect_items" ;
        }else if (authorization.division.equalsIgnoreCase("Clothes")){
            div = "clothes_items" ;
        }else if (authorization.division.equalsIgnoreCase("Food")){
            div = "food_items" ;
        }else if (authorization.division.equalsIgnoreCase("Library")){
            div = "lib_items" ;
        }else if (authorization.division.equalsIgnoreCase("Pharmacy")){
            div = "pharm_items" ;
        }else if (authorization.division.equalsIgnoreCase("Cinema")){
            div = "Cinema_items" ;
        }
        try {
            pre= con.prepareStatement("delete from "+div+" where code=?");
            pre.setString(1, code);
            pre.execute();
            
               JOptionPane.showMessageDialog(null, "deleted");
        } catch (Exception ex) {
        }
      }
    
    
    
    
    
    
    
    
    
    
}
