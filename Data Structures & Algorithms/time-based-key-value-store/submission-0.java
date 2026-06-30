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
                int lastStamp = Integer.MAX_VALUE;
                for (int stamp : map.keySet()){
                    if (stamp < timestamp){
                        lastStamp = stamp;
                    } else {
                        break;
                    }
                }
                return lastStamp != Integer.MAX_VALUE ? map.get(lastStamp) : "";
            }
        }
        return "";
    }
}
