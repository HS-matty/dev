package Radmaster.Swing;

import Radmaster.NetClient;
import Radmaster.RadmasterGuiServer;

import javax.swing.JOptionPane;

public class Api {
    public Api() {
        super();
    }

    public void  alert(String message) {

        RadmasterGuiServer guiserver = new RadmasterGuiServer();
        guiserver.messageBox(message);
        //  return this;
        //JOptionPane.showMessageDialog(null, message);
    }
    
    public void messageBox(String message){
        
    }

}
