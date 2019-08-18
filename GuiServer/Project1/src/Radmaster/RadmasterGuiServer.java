package Radmaster;

//import Radmaster.Swing.Api;
import Radmaster.*;

import Radmaster.Std.Element;

import javax.swing.*;

public class RadmasterGuiServer {

    public static  RadmasterGuiServer self;
    
    protected static RadmasterGuiServer guiServer;

    public static RadmasterGuiServer _get() {
        return RadmasterGuiServer.guiServer;
    }

    public static void _set(RadmasterGuiServer guiServer) {
        RadmasterGuiServer.guiServer = guiServer;
        
    }

    public static RadmasterGuiServer getInstance() {
        if (self.guiServer == null) {
            RadmasterGuiServer.createInstance();
        }
        return RadmasterGuiServer.getInstance();
        //return
    }

    protected static void createInstance() {
        RadmasterGuiServer guiserver = new RadmasterGuiServer();
        RadmasterGuiServer._set(guiServer);
        
    }

    public static void main(String[] arguments) {
        Console.echo("Helloy from gui server");

        // System.out.println("Hello from gui server");


        Radmaster.Swing.Api api = new Radmaster.Swing.Api();
        api.alert("alert from swing api!");
        

        Element el = new Element();
        Console.echo(el.getClassName());
        

        //        RadmasterGuiServer guiserver = new RadmasterGuiServer();

        //
        //        NetClient netClient = new NetClient();
        //        String queryResult = netClient.getQueryResult();
        //        guiserver.messageBox(queryResult);


    }

    public RadmasterGuiServer() {
        super();
    }


    public void messageBox(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
