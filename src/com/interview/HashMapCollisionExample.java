package com.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Key {
    private String value;

    public Key(String value) {
        this.value = value;
    }

    // Forcefully return same hashCode to simulate collision
    @Override
    public int hashCode() {
        return 42; // constant hash
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Key)) return false;
        Key key = (Key) o;
        return Objects.equals(value, key.value);
    }

    @Override
    public String toString() {
        return value;
    }
}
public class HashMapCollisionExample {

	public static void main(String[] args) {
		Map<Key, String> map = new HashMap<>();

        Key key1 = new Key("Apple");
        Key key2 = new Key("Banana");
        Key key3 = new Key("Mango");

        map.put(key1, "Red");
        map.put(key2, "Yellow");
        map.put(key3, "Orange");

        for (Map.Entry<Key, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Fetch each value to show collision didn't break retrieval
        System.out.println("Retrieve key1: " + map.get(key1));
        System.out.println("Retrieve key2: " + map.get(key2));
        System.out.println("Retrieve key3: " + map.get(key3));

	}

}
