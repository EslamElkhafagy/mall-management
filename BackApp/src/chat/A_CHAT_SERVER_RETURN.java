/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import static chat.A_CHAT_SERVER.currentuser;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Enjoy
 */
public class A_CHAT_SERVER_RETURN implements Runnable {

    Socket sock;
    private Scanner input;
    private PrintWriter out;
    String message = "";

    public A_CHAT_SERVER_RETURN(Socket x) {
        this.sock = x;
    }

    public void checkconnection() throws IOException {

        if (!sock.isConnected()) {

            for (int i = 1; i <= A_CHAT_SERVER.connectionarray.size(); i++) {

                if (A_CHAT_SERVER.connectionarray.get(i) == sock) {
                    A_CHAT_SERVER.connectionarray.remove(i);
                }
            }

            for (int i = 1; i <= A_CHAT_SERVER.connectionarray.size(); i++) {

                Socket temp_sock = (Socket) A_CHAT_SERVER.connectionarray.get(i - 1);
                PrintWriter out = new PrintWriter(temp_sock.getOutputStream());
                out.println(temp_sock.getLocalAddress().getHostName() + " disconnect");

                out.flush();
                out.println(temp_sock.getLocalAddress().getHostName() + " disconnect");

            }

        }

    }

    @Override
    public void run() {

        try{
            
        input= new Scanner(sock.getInputStream());
        out = new PrintWriter(sock.getOutputStream());
        
        while(true){
            checkconnection();
            
            if(!input.hasNext()){
                
                return;
            }
            
            message= input.nextLine();
            
            System.out.println("client saied "+message);
            
             for(int i=1;i<=A_CHAT_SERVER.connectionarray.size();i++){
            
            Socket temp_sock = (Socket) A_CHAT_SERVER.connectionarray.get(i-1);
            PrintWriter out = new PrintWriter(temp_sock.getOutputStream());
            out.print(message);
            out.flush();
                 System.out.println(" sent to : "+temp_sock.getLocalAddress().getHostName());
            
        }
        }    
            
            
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, ex+"in method run at chat server class return ");
        }
        finally{
            try {
                sock.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex+"in method run at chat server class return in finally ");
            }
        }
            
        
        
        
        
    }

}
