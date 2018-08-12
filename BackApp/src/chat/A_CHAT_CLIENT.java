package chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class A_CHAT_CLIENT implements Runnable {

   static Socket sock;
   static Scanner input;
   static Scanner send = new Scanner(System.in);
   static PrintWriter out;

    
    public A_CHAT_CLIENT(Socket x){
        this.sock=x;
    }
    
    
    
    @Override
    public void run() {

        try{
            
            input= new Scanner(sock.getInputStream());
            out= new PrintWriter(sock.getOutputStream());
            out.flush();
            checkstream();
            
            
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, ex+"\n in method run at class chat client ");
        }
        finally{
            try {
                sock.close();
            } catch (IOException ex) {
             JOptionPane.showMessageDialog(null, ex+"\n in method run at class chat client in finally ");
            }
        }
        
    }

    
    public static void checkstream(){
        while(true){
            receive();
        }
    }

public static void receive(){
    
    if(input.hasNext()){
        String message=input.nextLine();
        
        
        
    }
    
    
}



}
