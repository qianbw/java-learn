package com.example.collection;

import java.util.*;

/**
 * Created by qianbw on 2017/3/9.
 */
public class Demo {
    // 线程安全，但速度慢，已被ArrayList替代。底层数据结构是数组结构
    List vectorlist = new Vector<>();

    // 线程不安全，查询速度快。底层数据结构是数组结构 
    List arrayList = new ArrayList<>();

    // 线程不安全。增删速度快。底层数据结构是链表结构 
    List linkedList = new LinkedList<>();


    // 线程不安全，存取速度快，基于HashMap实现
    Set<String> hashSet = new HashSet<>();

    // 线程不安全，可以对Set集合中的元素进行排序，基于TreeMap实现
    Set<String> treeSet = new TreeSet<>();

    // 基于LinkedHashMap实现
    Set<String> linkedHashSet =  new LinkedHashSet();

    // 线程安全，速度慢。底层是哈希表数据结构。是同步的。 不允许null作为键，null作为值
    Map<String, String> hashtable = new Hashtable<>();

    // 线程不安全，速度快。底层也是哈希表数据结构。是不同步的。 允许null作为键，null作为值。替代了Hashtable. 
    Map<String, String> hashMap = new HashMap();

    // 可以保证HashMap集合有序。存入的顺序和取出的顺序一致
    Map<String, String> linkedHashMap = new LinkedHashMap();

    // 可以用来对Map集合中的键进行排序
    Map<String, String> treeMap = new TreeMap();

    public void listTest() {
        vectorlist.add("a");
        arrayList.add("b");
        linkedList.add("c");
    }

    public void setTest() {
        hashSet.add("a");

        treeSet.add("b");
        treeSet.add("ad");
        treeSet.add("ab");
        treeSet.add("aa");
        treeSet.add("a");
        treeSet.add("c");

        // 打印出来的数据是有序的
        for (String str : treeSet) {
            System.out.println(str);
        }
    }

    public void mapTest() {
        Iterator iter = null;

        System.out.println("hashtable 打印出来的数据不是输入时的顺序-------------------------");
        hashtable.put("a", "aa");
        hashtable.put("b", "bb");
        hashtable.put("c", "cc");
        hashtable.put("d", "dd");
        // 打印出来的数据不是输入时的顺序
        iter = hashtable.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println(key + ":" + val);
        }

        System.out.println("hashMap 打印出来的数据不是输入时的顺序-------------------------");
        hashMap.put("a", "aa");
        hashMap.put("b", "bb");
        hashMap.put("ba", "bb");
        hashMap.put("c", "cc");
        hashMap.put("ab", "bb");
        hashMap.put("d", "dd");
        // 打印出来的数据不是输入时的顺序
        iter = hashMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println(key + ":" + val);
        }

        System.out.println("linkedHashMap 打印出来的数据是输入时的顺序-------------------------");
        linkedHashMap.put("a", "aa");
        linkedHashMap.put("b", "bb");
        linkedHashMap.put("c", "cc");
        linkedHashMap.put("d", "dd");

        // 打印出来的数据是输入时的顺序
        iter = linkedHashMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println(key + ":" + val);
        }

        System.out.println("treeMap 打印出来的数据是有序的-------------------------");
        treeMap.put("a", "aa");
        treeMap.put("b", "bb");
        treeMap.put("ba", "bb");
        treeMap.put("c", "cc");
        treeMap.put("ab", "bb");
        treeMap.put("d", "dd");

        // 打印出来的数据是有序的
        iter = treeMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println(key + ":" + val);
        }
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        // demo.setTest();
        demo.mapTest();
    }
}
