package org.example;

public class MyGenericClass <T  extends Comparable<T>>{
//public class MyGenericClass {
    public  T getMax(T x, T y){
//        System.out.println(x.compareTo(y));
        if(x.compareTo(y)>0) {
            return x;
        } else return y;
    }

//    public <T  extends Comparable<T>> T getMax(T x, T y){
////        System.out.println(x.compareTo(y));
//        if(x.compareTo(y)>0) {
//            return x;
//        } else return y;
//    }
}
