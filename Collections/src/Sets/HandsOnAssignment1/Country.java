package Sets.HandsOnAssignment1;
import java.util.HashSet;
import java.util.Iterator;

public class Country {
    HashSet<String> H1 = new HashSet<String>();
    public HashSet<String> saveCountryNames(String CountryName){
        H1.add(CountryName);
        return H1;
    }
    public String getCountry(String CountryName){
        Iterator<String> itr = H1.iterator();
        while (itr.hasNext()) {
            String country = itr.next();
            if (country.equals(CountryName)) {
                return country;
            }
        }
        return null;
    }
}
