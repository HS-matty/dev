package Radmaster;

public class Functions {
    public Functions() {
        super();
    }
    
    public static void alert(String message){
        Radmaster.Swing.Api api = new Radmaster.Swing.Api();
        api.alert(message);
    }
    
    public static void echo(String message){
        Console.echo(message);
    }
}
