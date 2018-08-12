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
public class Server {
    
    public static ObjectOutputStream output;
    public static ObjectInputStream input;
    public static ServerSocket server;
    public static Socket connection;
    
    public Server() throws IOException{
        
       startRunning();
    }
    
    public void startRunning() throws IOException{
        
        try{
            server= new ServerSocket(4444);
            while (true) {                
                connection=server.accept();
                setupstream();
                whilechating();
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex+"\n in method startrunning at server class");
        }
        finally{
            closecrap(); 
        }
        
    }
  
    
    public static void showmessage(String text){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
        
//            text_area.append(text);
            
            }
        });
        
        
        
    }
    public static void closecrap()throws IOException{
         showmessage(" closing connection ...");
        output.close();
        input.close();
        connection.close();
    }
public static void setupstream()throws IOException{
    
    output = new ObjectOutputStream(connection.getOutputStream());
    output.flush();
    input=new ObjectInputStream(connection.getInputStream());
    
    
}

public static void whilechating(){
    try{
   // sendmessage(message);
    //message = (String)input.readObject();
    //showmessage("\n"+message);
    
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex+"\n in method whilechating at class server");
    }
}







}
