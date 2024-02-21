package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyGenericClass<Integer> oi =new MyGenericClass<>();
        System.out.println(oi.getMax(5,7));

        MyGenericClass<Double> od =new MyGenericClass<>();
        System.out.println(od.getMax(10.2,10.1));

        MyGenericClass<String> os =new MyGenericClass<>();
        System.out.println(os.getMax("Shuvo","shuv"));

        Student stu1 = new Student(1L,"Shuvo");
        Student stu2 = new Student(2L,"Elaf");
        MyGenericClass<Student> ostu =new MyGenericClass<>();
        System.out.println(ostu.getMax(stu2,stu1));

        List<Integer> l =new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println(findTarget(l,20));
        List<Integer> m = getRev(l);
        System.out.println(m.toString());
        List<String> s =new ArrayList<>();
        s.add("a");
        s.add("b");
        s.add("30");
        s.add("40");
        System.out.println(findTarget(s,"30"));
        List<String> n = getRev(s);
        System.out.println(n.toString());
    }

    public static <T> List<T> getRev(List<T> ara){
        Collections.reverse(ara);
        return (List<T>) ara;
    }

    public static <T> Integer findTarget(List<T> ara,T targetData){
        for(int i=0;i<ara.size();i++){
            if(ara.get(i)==targetData){
                return i;
            }
        }
        return -1;
    }
}