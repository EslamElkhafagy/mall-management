package FrontApp.Classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class staticV {
    public static String div ;
    public static String cat ;
    
    public static String getCurrentDateTime(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date); 
    }
}
