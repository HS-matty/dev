package Radmaster;

public class Registry extends StdClass{
    
    
    
    public static  Registry self;
    
    
    public static StdClass get(String name){
               return new Registry(); 
    }
    
    public Registry() {
        super();
    }

 
}
