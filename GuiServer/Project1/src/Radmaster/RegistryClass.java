/*
 * Class RegistryClass is needed for storing variables, objects.
 * @company Hytex Solutions Limited (Minsk/BY)
 * @package Radmaster
 * @class RegistryClass
 * @seenby HS-matty (22-08-2019)
 */
package Radmaster;

public class RegistryClass extends StdClass{
    
    
    
    public static  RegistryClass self;
    
    
    protected static StdClass _instance;
    
    public String registryString = "registryString";
    
   // public RegistryClass
    
    public static StdClass getInstance(){
        
        self.createInstance();
        return self._instance;
        //return (StdClass) _this();
    }
    
    public static StdClass get(String name){
               return new RegistryClass(); 
    }
    
    public RegistryClass() {
        super();
    }


    @Override
    public StdClass _this() {
        return this;
    }
}


