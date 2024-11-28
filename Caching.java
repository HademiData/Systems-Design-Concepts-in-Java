/*
 * Caching is a process of storing frequently accessed data in a 
 * temporary storage layer (cache) to reduce latency and speed 
 * up data retrieval.
  Example: A web application can cache user data to avoid repeatedly 
  querying a database.
 */
 import java.util.HashMap;

class Caching {
    private HashMap<String, String> cache = new HashMap<>();

    public String getFromCache(String key) {
        return cache.getOrDefault(key, "Data not found in cache");
    }

    public void addToCache(String key, String value) {
        cache.put(key, value);
    }

    public static void main(String[] args) {
        Caching cache = new Caching();
        cache.addToCache("user1", "John Doe");
        System.out.println(cache.getFromCache("user1")); // Output: John Doe
    }
}
