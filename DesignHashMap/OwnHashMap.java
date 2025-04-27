package com.designpattern.lld.DesignHashMap;

import java.util.Map;
import java.util.Objects;

public class OwnHashMap<K, V> {

    Map<Integer, Integer> map = new java.util.HashMap<>();
    static final int threshold = 8;

    static final float loadFactor = 0.75f;

    static final int initialCapacity = 16; //1<<4 actual 1 * 2^4 = 16

    static final int maximumCapacity = 1073741824;

    static final int reverseThreshold = 6;
    @SuppressWarnings("unchecked")
    Node<K, V>[] table = (Node<K, V>[]) new Node<?, ?>[initialCapacity];


    static class Node<K, V> {
        final int hash;
        final K key;
        V value;
        Node<K, V> next;

        Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

    }

    //This is used to track the number of key-value pairs
    int count = 0;

    private int hash(K key) {
        if (key == null) {
            return 0;
        }
        //Objects.hashCode(key) & (table.length-1);
        return key.hashCode() & (table.length - 1);
    }

    public void put(K key, V value) {
        int hash = hash(key);
        int bucketIndex = hash & (table.length - 1);
        if (table[bucketIndex] == null) {
            table[bucketIndex] = new Node<>(hash, key, value, null);
        } else {
            Node<K, V> current = table[bucketIndex];
            while (true) {
                if (current.hash == hash && Objects.equals(current.key, key)) {
                    current.value = value;
                    return;
                }
                if (current.next == null) {
                    break;
                }
                current = current.next;

            }
            current.next = new Node(hash, key, value, null);
        }
    }

    public void printTable() {
        for (int i = 0; i < table.length; i++) {
            System.out.print("Bucket " + i + ": ");
            Node<K, V> current = table[i];
            while (current != null) {
                System.out.print("[" + current.key + " -> " + current.value + "] -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public V getValue(K key) {
        int hash = hash(key);
        int bucketIndex = hash & (table.length - 1);

        Node<K, V> current = table[bucketIndex];
        while (current != null) {
            if (current.hash == hash && Objects.equals(current.key, key)) {
                return current.value;
            }
            current = current.next;
        }

        return null;

    }

    public boolean remove(K key) {
        int hash = hash(key);
        int bucketIndex = hash & (table.length - 1);

        if (table[bucketIndex] == null) {
            return false;
        }
        Node<K, V> current = table[bucketIndex];
        Node<K, V> prev = null;

        while (current != null) {
            if (current.hash == hash && Objects.equals(key, key)) {
                if (prev == null) {
                    table[bucketIndex] = current.next;
                } else {
                    prev.next = current;
                }
                return true;
            }
            prev= current;
            current = current.next;
        }
        return  false;

    }




}
