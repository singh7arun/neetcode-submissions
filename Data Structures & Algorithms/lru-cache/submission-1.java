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
            cache.remove(key);
            cache.put(key, val);
            return val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        System.out.println("size: "+ cache.size());
        System.out.println("capacity: "+ capacity);
        if(capacity == cache.size() && !cache.containsKey(key)){
            cache.pollFirstEntry();
            System.out.println("size: "+ cache.size());
        }
        if (cache.containsKey(key)){
            cache.remove(key);
        } 
        cache.put(key, value);
        
    }
}
