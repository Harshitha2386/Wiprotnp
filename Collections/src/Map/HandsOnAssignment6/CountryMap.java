package Map.HandsOnAssignment6;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
public class CountryMap {
	Hashtable<String, String> M1 = new Hashtable<String, String>();
    public Hashtable<String, String> saveCountryCapital(String CountryName, String Capital) {
        M1.put(CountryName, Capital);
        return M1;
    }
    public String getCapital(String CountryName){
        return M1.get(CountryName);
    }
    public String getCountry(String CapitalName){
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(CapitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }
    public Hashtable<String, String> createReverseMap() {

        Hashtable<String, String> M2 = new Hashtable<String, String>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }

        return M2;
    }
    public ArrayList<String> getCountryList() {
        ArrayList<String> list = new ArrayList<String>();

        for (String country : M1.keySet()) {
            list.add(country);
        }

        return list;
    }
}
