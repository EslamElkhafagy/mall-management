/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Enjoy
 */
public class A_CHAT_SERVER {
    public static ArrayList<Socket> connectionarray = new ArrayList<Socket>();
    public static ArrayList<String> currentuser = new ArrayList<String>();
    
    
    
    public static void main(String[] args) {
        
        try{
        
            final int port=444;
            ServerSocket server = new ServerSocket(port);
            System.out.println("wating for clients ....................");
            
            while(true){
                
                Socket sock = server.accept();
                connectionarray.add(sock);
                System.out.println("client connecting from "+sock.getLocalSocketAddress());
                
                AddUserName(sock);
                
                A_CHAT_SERVER_RETURN chat = new A_CHAT_SERVER_RETURN(sock);
                Thread x = new Thread(chat);
                x.start();
                
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex+"\n in main chat server");
        }
    }
    
    public static void AddUserName(Socket x)throws IOException{
        
        Scanner input = new Scanner(x.getInputStream());
        String username = input.nextLine();
        currentuser.add(username);
        
        for(int i=1;i<=A_CHAT_SERVER.connectionarray.size();i++){
            
            Socket temp_sock = (Socket) A_CHAT_SERVER.connectionarray.get(i-1);
            PrintWriter out = new PrintWriter(temp_sock.getOutputStream());
            out.print("#?!"+currentuser);
            out.flush();
            
        }
        
    }
    
    
    
    
    
}
