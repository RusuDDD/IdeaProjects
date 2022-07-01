package de.telran;

import java.util.Iterator;

public interface Map<K, V> {

    /**
     * The method puts the value corresponding to the key,
     * if tje pair with the key exist, than the value will be replaced
     * @param key not null
     * @return  old value
     */
    V put(K key, V value);

    /**
     * returns the value corresponding to the key.
     * If there is no such a key , the null will be returned
     * @param key not null
     * @return
     */
    V get(K key);

    /**
     * Removes the pait with the key and returns the value.
     * Or returns null , if there is no such a key
     * @param key not null
     * @return
     */
    V remove(K key);

    /**
     * returns true if there is a pair with the key, false otherwise
     * @param key not null
     * @return
     */
    boolean contains(K key);

    int  size();

    Iterator<K> keyIterator();

    Iterator<V> valueIterator();
}
