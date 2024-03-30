package maps;

public class TestSortedTableMap {
    public static void main(String[] args) {
        SortedTableMap<Integer, String> map = new SortedTableMap<>();

        // Add some entries to the map
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Test containKey method
        System.out.println("Does map contain key 2? " + map.containKey(2));
        System.out.println("Does map contain key 5? " + map.containKey(5));
    }
}
