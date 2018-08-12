/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackApp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class authorization {
    public static boolean admin ;
    public static boolean manager ;
    public static boolean staff ;
    public static int emp_id ;
    public static String fName ;
    public static String lName ;
    public static String type ;
    public static String shop_id ;
    public static String division ;
    
    public static String getCurrentDateTime(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date); 
    }
}
