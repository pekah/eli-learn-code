package com.eli.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by elizhou on 2018/6/6.
 */
public class CompareTest {
    public static void main(String[] args) {
        List<Person> plist = new ArrayList<Person>();
        //创建3个Person对象，年龄分别是32、20、25，并将他们依次放入List中
        Person p1 = new Person("0001","zhangsan",32);
        Person p2 = new Person("0002","lisi",20);
        Person p3 = new Person("0003","wangwu",25);
        plist.add(p1);
        plist.add(p2);
        plist.add(p3);
        System.out.println("排序前的结果：");
        for (Person p : plist) {
            System.out.println(p.getAge());
        }

        Collections.sort(plist, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        System.out.println("排序后的结果：");

        for (Person p : plist) {
            System.out.println(p.getAge());
        }

    }
}
