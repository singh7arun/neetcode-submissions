class TimeMap {

    Map<String, TreeMap<Integer, String>> timeMap;

    public TimeMap() {
        timeMap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        TreeMap<Integer, String> map = timeMap.get(key);
        if (Objects.isNull(map)){
            map = new TreeMap<>();
            timeMap.put(key, map);
        }
        map.put(timestamp, value);
        
    }
    
    public String get(String key, int timestamp) {
        TreeMap<Integer, String> map = timeMap.get(key);
        if (!Objects.isNull(map)){
            String val = map.get(timestamp);
            if (!Objects.isNull(val)){
                return val;
            } else {
                Map.Entry<Integer, String> entry = map.floorEntry(timestamp);
                return Objects.nonNull(entry) ? entry.getValue() : "";
            }
        }
        return "";
    }
}
