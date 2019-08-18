package Radmaster;
import javax.swing.*;

public class RadmasterGuiServer {
    
    public static void main ( String [] arguments )
    {
        System.out.println("Hello, world");
        
        RadmasterGuiServer guiserver = new RadmasterGuiServer();
        
        guiserver.messageBox("testmessage");
        
        
        
    }
    public RadmasterGuiServer() {
        super();
    }
    
    public void messageBox(String message){
        JOptionPane.showMessageDialog(null, message);
    }
}
