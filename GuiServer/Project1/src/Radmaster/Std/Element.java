package Radmaster.Std;

import Radmaster.StdClass;


public class Element extends StdClass {

    public static  Element self;
    protected String _name;
    //protected String 

    public void  setName(String name){
        this._name = name;
    }
    public String getName(){
        return this._name;
    }

    public Element() {
        super();
    }
}
