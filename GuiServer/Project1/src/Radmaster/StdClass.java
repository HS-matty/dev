package Radmaster;

import java.lang.reflect.*;

public abstract class StdClass {
    protected static StdClass self;

    protected static StdClass _instance;

    //    public static Std _get() {
    //        return RadmasterGuiServer.guiServer;
    //    }
    //
    //    public static void _set(RadmasterGuiServer guiServer) {
    //        RadmasterGuiServer.guiServer = guiServer;
    //
    //    }

    public static StdClass getInstance() {
        if (self._instance == null) {
            self.createInstance();
        }
        return self.getInstance();
        //return
    }
    public String getClassName(){
        return this.getClass().getName();
    }

    protected static void createInstance() {
        String class_name = self.getClass().getSimpleName();
        //self._instance = new class_name;
        try {
            Object _obj = Class.forName("Std").newInstance();
        } catch (Exception e) {
            Console.echo(e.getMessage());
        }


    }


    public StdClass() {
        super();
    }
}
