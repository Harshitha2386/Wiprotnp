package Sets.HandsOnAssignment4;
import java.util.TreeSet;
import java.util.Iterator;
public class Country {
	TreeSet<String> H1 = new TreeSet<String>();
    public TreeSet<String> saveCountryNames(String CountryName){
        H1.add(CountryName);
        return H1;
    }
    public String getCountry(String CountryName){
        Iterator<String> itr = H1.iterator();
        while (itr.hasNext()){
            String country = itr.next();
            if (country.equals(CountryName)) {
                return country;
            }
        }

        return null;
    }
}
