import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        List<City> cities = new ArrayList<>();
        cities.add(new City(1, "Moscow"));
        cities.add(new City(2, "Bishkek"));
        cities.add(new City(3, "Dubai"));
        cities.add(new City(4, "Seoul"));
        cities.add(new City(5, "Paris"));
        cities.add(new City(6, "Canada"));

        Set<City> citySet = new TreeSet<>(City.comparator);
        for (City city1 : cities) {
            if (city1.getCode() % 2 == 0) {
                citySet.add(city1);
            }
        }

        for (City city1 : citySet) {
            System.out.println(city1);
        }


    }
}