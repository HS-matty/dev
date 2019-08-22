package Radmaster;

import java.lang.reflect.*;

public class StdClass {
    protected static StdClass self;

    protected static StdClass _instance;

    protected String _name;
    protected String _value;

//    static
//       {
//           System.loadLibrary( "classname" );
//       }
    //    public static Std _get() {
    //        return RadmasterGuiServer.guiServer;
    //    }
    //
    //    public static void _set(RadmasterGuiServer guiServer) {
    //        RadmasterGuiServer.guiServer = guiServer;
    //
    //    }


    public StdClass StdClass() {
        // super();
        return _this();
    }

    public StdClass  _this(){
        return this;
    }


    public static StdClass getInstance() {
        if (self._instance == null) {
            self.createInstance();
        }
        return self.getInstance();
        //return
    }

    public String getClassName() {
        return this.getClass().getName();
    }

    public static StdClass getSelf(){
        return self;
    }
    protected static void createInstance() {
        
        String class_name = StdClass.class.getSimpleName();
        //self._instance = new class_name;
        try {
            
            //Object _obj = null; //(StdClass) StdClass.foname().fornewInstance();
            
            //_obj = Class.forName(class_name).newInstance();
            StdClass _obj = new StdClass();
            //_obj = _obj.getClass().cast(obj)
            
            
            self._instance = (StdClass)_obj;
        } catch (Exception e) {
            Console.echo(e.getMessage());
        }


    }


    public StdClass name(String name) {
        this.setName(name);
        return _this();

    }

    public StdClass value(String value) {
        this.setValue(value);
        return _this();
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public String getName() {
        return _name;
    }

    public void setValue(String _value) {
        this._value = _value;
    }

    public String getValue() {
        return _value;
    }
}
