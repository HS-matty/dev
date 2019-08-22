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

    @Override
    public Element _this() {
        return this;
    }

    @Override
    public Element value(String value) {
        return (Element)super.value(value);
    }

    @Override
    public Element name(String name) {
        return (Element)super.name(name);
    }
}
