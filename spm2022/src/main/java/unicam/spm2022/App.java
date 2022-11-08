package unicam.spm2022;

import org.json.simple.JSONObject; 

public class App 
{
    public static void main( String[] args )
    {
    	JSONObject obj=new JSONObject();    
    	obj.put("name","John");    
    	obj.put("age",new Integer(20));    
    	obj.put("City","Camerino");   
    	
        System.out.println(obj);
    }
}
