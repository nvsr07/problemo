package leetcode.paypal;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    /**
     * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put.
     *
     * get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
     * put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.
     *
     * Follow up:
     * Could you do both operations in O(1) time complexity?
     *
     * Example:
     *
     *
             *cache.put(1,1);
     *cache.put(2,2);
     *cache.get(1);       // returns 1
     *cache.put(3,3);    // evicts key 2
     *cache.get(2);       // returns -1 (not found)
     *cache.put(4,4);    // evicts key 1
     *cache.get(1);       // returns -1 (not found)
     *cache.get(3);       // returns 3
     *cache.get(4);       // returns 4
     * */

    private Map<Integer, Integer> keyValueMapping;
    private ArrayDeque<Integer> keys;
    private int capacity;
    private int counter = 0;
    public LRUCache(int capacity) {
        keyValueMapping = new HashMap<>();
        keys = new ArrayDeque<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        if(keyValueMapping.containsKey(key)){
            keys.remove(key);
            keys.addLast(key);
            return keyValueMapping.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if(keyValueMapping.containsKey(key)){
            keyValueMapping.put(key, value);
            keys.remove(key);
            keys.addLast(key);
        }else{
            if(counter >= capacity){
                int element = keys.removeFirst();
                keyValueMapping.remove(element);
                keyValueMapping.put(key, value);
                keys.addLast(key);
            }else{
                keyValueMapping.put(key, value);
                keys.addLast(key);
                counter++;
            }
        }

    }
}
