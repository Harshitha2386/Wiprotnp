package Map.HandsOnAssignment5;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
public class CountryMap {
	 TreeMap<String, String> M1 = new TreeMap<String, String>();
	    public TreeMap<String, String> saveCountryCapital(String CountryName, String Capital){
	        M1.put(CountryName, Capital);
	        return M1;
	    }
	    public String getCapital(String CountryName){
	        return M1.get(CountryName);
	    }
	    public String getCountry(String CapitalName){
	        for (Map.Entry<String, String> entry : M1.entrySet()){
	            if (entry.getValue().equals(CapitalName)){
	                return entry.getKey();
	            }
	        }
	        return null;
	    }
	    public TreeMap<String, String> createReverseMap(){
	        TreeMap<String, String> M2 = new TreeMap<String, String>();
	        for (Map.Entry<String, String> entry : M1.entrySet()){
	            M2.put(entry.getValue(), entry.getKey());
	        }
	        return M2;
	    }
	    public ArrayList<String> getCountryList(){
	        ArrayList<String> list = new ArrayList<String>();
	        for (String country : M1.keySet()){
	            list.add(country);
	        }
	        return list;
	    }
}
