import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

public class QRQueryExample {
public static void main(String[] args) { 
	ArrayList<String> barCodes = new ArrayList<String>();
	barCodes.add("t=20171007T0856&s=279.90&fn=8710000100923403&i=95961&fp=3153580303&n=1");
    for (int codeIndex = 0; codeIndex < barCodes.size(); ++codeIndex) {
        String parameters = barCodes.get(codeIndex);
        int newChecks = 0;
        try {
			String apiUrl = "https://rest-fns-check.herokuapp.com/check/" + parameters;
            URL url = new URL(
                apiUrl
            );
			System.out.println("API URL: " + apiUrl);

            URLConnection urlc = url.openConnection();
            urlc.setAllowUserInteraction(false);
            urlc.setUseCaches(false);
            urlc.setConnectTimeout(30000);
            urlc.setReadTimeout(30000);
            BufferedReader br = new BufferedReader(
                new InputStreamReader(urlc.getInputStream())
            );
            String jsonResult = "";
            String line = null;
            while ((line = br.readLine()) != null) {
                jsonResult += line;
            }
            br.close();
			
            try {
                JSONObject result = new JSONObject(jsonResult);
                JSONArray items = (JSONArray) result.get("items");
                String time = (String) result.get("check_time");
                String check_description = (String) result.get("check_description");
		        
				System.out.println("Check: " + check_description);				
                for (int i = 0; i < items.length(); ++i) {
                    JSONArray itemRaw = (JSONArray) items.get(i);
                    String name = (String) itemRaw.get(0);
                    Float price = ((Number) itemRaw.get(1)).floatValue();
                    Float count = ((Number) itemRaw.get(2)).floatValue();
                    String category = (String) itemRaw.get(3);
					System.out.println("Item: " + name + "\t" + category + "\t" + price.toString() + "\t" + count.toString());				
                }
				String rawResponse = (String) result.get("raw_response");
				System.out.println("Raw response: " + rawResponse);								
            } catch (org.json.JSONException e) {
            }
        } catch (MalformedURLException e) {
        } catch (IOException e) {
        }
    }
	
    }
}


