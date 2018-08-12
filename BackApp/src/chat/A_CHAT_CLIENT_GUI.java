/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author Enjoy
 */
public class A_CHAT_CLIENT_GUI {
    
    public static A_CHAT_CLIENT chatclient;
    public static String username="anonymouse";
    
    
    
    public static void connect(){
        
        try{
            final int port = 444;
            final String host ="localhost";
            Socket sock= new Socket(host,port);
            chatclient = new A_CHAT_CLIENT(sock);
            
            
            //send name to and at online list
            PrintWriter out = new PrintWriter(sock.getOutputStream());
            out.println(username);
            out.flush();
            
            Thread x = new Thread(chatclient);
            x.start();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex+"\n in method connect at class chat cllient gui");
            JOptionPane.showMessageDialog(null, "server not responding ");
            System.exit(0);
        }
        
        
    }
}
