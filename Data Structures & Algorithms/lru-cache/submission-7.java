class LRUCache {

    private LinkedHashMap<Integer, Integer> cache;
    private int capacity;

    public LRUCache(int capacity) {
        cache = new LinkedHashMap(capacity);
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if (cache.containsKey(key)){
            int val = cache.get(key);
            put(key, val);
            return val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(capacity == cache.size() && !cache.containsKey(key)){
            cache.pollFirstEntry();
        }
        if (cache.containsKey(key)){
            cache.remove(key);
        } 
        cache.put(key, value);
        
    }
}
