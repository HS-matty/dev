package Radmaster.Std.Array;
import Radmaster.Std.ArrayClass;

import Radmaster.StdClass;

import java.util.HashMap; 
import java.util.Map; 

public class R_Array extends ArrayClass {
    public static  R_Array self;
    
    protected HashMap _array;
    
    public R_Array() {
        super();
        //init array
        HashMap<String, StdClass> map = new HashMap<String, StdClass>();
        this._array = map;
        
    }
    public StdClass set(String key,StdClass value){
        this._array.put(key,value);
        return this;
        
    }
    public Object get(String key){
        //
        return this._array.get(key);
    }
    
    public String export(){
        return this._array.toString();
    }
    
}
