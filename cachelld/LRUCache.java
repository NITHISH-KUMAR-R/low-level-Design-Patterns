package com.designpattern.lld.cachelld;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    class Node{
        int key;
        int val;
        Node  next;
        Node prev;
        public Node(int key , int val){
            this.key = key;
            this.val = val;
        }

    }

    private int capacity ;
    public Map<Integer, Node>  cacheMap;
    public Node head, tail;

    public  LRUCache(int capacity){
        this.capacity = capacity;
        this.cacheMap = new HashMap<>();
        this.head = new Node(-1,-1);
        this.tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key){
        if(!cacheMap.containsKey(key)){
            return 1;
        }
        Node nodeCache = cacheMap.get(key);
        remove(nodeCache);
        insertNodeToFront(nodeCache);
        return nodeCache.val;

    }


    public void put(int key , int val){
        if(cacheMap.containsKey(key)){
            remove(cacheMap.get(key));
        }else if(cacheMap.size()==capacity){
            Node lru = tail.prev;
            remove(lru);
            cacheMap.remove(lru.key);

        }

        Node node = new Node(key,val);
        insertNodeToFront(node);
        cacheMap.put(key,node);
    }

    public void remove(Node node){

        node.prev.next = node.next;
        node.next.prev = node.prev;


    }

    public void insertNodeToFront(Node node){
        node.next = head.next;
        node.prev= head;
        head.next  = node;
        head.next.prev = node;

    }




    public static void main(String a[]){
        //LRUCache obj = new LRUCache(5);

        LRUCache obj = new LRUCache(2);
        obj.put(1, 10);
        obj.put(2, 20);
        System.out.println(obj.get(1)); // 10
        obj.put(3, 30); // evicts key 2
        System.out.println(obj.get(2)); // -1
        System.out.println(obj.get(3)); // 30
    }



}
