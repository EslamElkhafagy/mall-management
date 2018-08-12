/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chating;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Enjoy
 */
public class Client {
     public static ObjectOutputStream output;
    public static ObjectInputStream input;
    public static ServerSocket server;
    public static Socket connection;
    public static String message="";
    public static String serverip;

    public Client() throws IOException {
    startRunning();
    }
    
    public void startRunning() throws IOException{
        
        try{
                        
           connection= new Socket("localhost",4444);
                setupstream();
                whilechating();
                
           
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex+"\n in method startrunning at server class");
        }
        finally{
            closecrap(); 
        }
        
    }
    
    public static void setupstream()throws IOException{
    
    output = new ObjectOutputStream(connection.getOutputStream());
    output.flush();
    input=new ObjectInputStream(connection.getInputStream());
    showmessage(" streams are now setup ...");
    
}
    
    public static void whilechating(){
    try{
   
    message = (String)input.readObject();
    showmessage("\n"+message);
    
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex+"\n in method whilechating at class server");
    }
}
    
     public static void showmessage(String text){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
        
            text_area.append(text);
            
            }
        });
        
        
        
    }
    
     public static void closecrap()throws IOException{
         showmessage(" closing connection ...");
        output.close();
        input.close();
        connection.close();
    }
   
     
     
}
