package deneme;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ornek_1 {

	public static void main(String[] args) {
		
		
		 JSONObject obje = new JSONObject();
		 
		 JSONObject obje2=new JSONObject();
		 JSONArray dizi=new JSONArray();
		 
		 String deneme1="deneme1";
		 String deneme2="deneme2";
		 
		 
		 

	      try {
			obje.put("name", "foo");
			obje.put("num", new Integer(100));
			obje.put("balance", new Double(1000.21));
			obje.put("is_vip", new Boolean(true));
			
			obje2.put("deneme1", deneme1);
			obje2.put("deneme2", deneme2);
			
			dizi.put(obje2);
			obje.put("denemeler", dizi);
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      

	      System.out.print(obje);
	   
	}

}
