package Radmaster;

//import Radmaster.Swing.Api;
import Radmaster.*;

import Radmaster.Std.Array.R_Array;
import Radmaster.Std.Element;


import Radmaster.Swing.Window;

import javax.swing.*;

public class RadmasterGuiServer {

    public static RadmasterGuiServer self;

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

        StdClass _obj1 = new StdClass();
        _obj1.setName("test_name_1");
        _obj1.setValue("test_value_1");

        StdClass _obj2 =
            new StdClass().name("test_name_2").value("test_value_2");

        Element _obj3 =
            new Element().name("test_name_3").value("test_value_3");
        R_Array _arr = new R_Array();
        _arr.set("test_1", _obj1);
        _arr.set("test_2", _obj2);
        _arr.set("test_3", _obj3);

        Console.echo(_arr.export());
       // Window window = Window() ;
        Window.createWindow();
        //window.c

        //        RegistryClass _registry = (RegistryClass) RegistryClass.getInstance();
        //       Console.echo(_registry.getClassName().toString());
        //       Console.echo(_registry.registryString);
        // Radmaster.Swing.Api _class = null;
       // _class = Class.forName("Radmaster.Swing.Api").getConstructor().newInstance();
//        try {
//            Class clazz = Class.forName(Radmaster.Swing.Api.class.getName());
//           _class = (Radmaster.Swing.Api)clazz.newInstance();
//        } catch (Exception e) {
//            e.printStackTrace();
        //}
       // System.out.println(_class); // Output: created object reflection.MyClass@60e53b93

        //Object obj = Class.forName("Radmaster.Swing.Api").newInstance();
        //System.out.println("Object created for class:"
        //                    + obj.getClass().getName());


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
