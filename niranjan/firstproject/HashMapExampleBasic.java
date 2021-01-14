package com.niranjan.firstproject;

import java.util.HashMap;

class Key { 
    String key; 
    Key(String key) 
    { 
        this.key = key; 
    } 
  
    @Override
    public int hashCode() 
    { 
        int hash = (int)key.charAt(0); 
        System.out.println("hashCode for key: "
                           + key + " = " + hash); 
        return hash; 
    } 
  
    @Override
    public boolean equals(Object obj) 
    { 
        return key.equals(((Key)obj).key); 
    } 
} 
  
// Driver class 
public class HashMapExampleBasic { 
    public static void main(String[] args)
    { 
        HashMap<Key, Integer> map = new HashMap<Key, Integer>(); 
        map.put(new Key("vishal"), 20); 
        map.put(new Key("sachin"), 30); 
        map.put(new Key("vaibhav"), 40); 
  
        System.out.println(); 
        System.out.println("Value for key sachin: " + map.get(new Key("sachin"))); 
        System.out.println("Value for key vaibhav: " + map.get(new Key("vaibhav"))); 
        System.out.println("Value for key vishal: " + map.get(new Key("vishal"))); 
    } 
} 