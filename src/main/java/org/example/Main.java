package org.example;

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

//            MyGenericClass myGenericClass = new MyGenericClass();
//        myGenericClass.getMax(stu1,stu2);
    }
}