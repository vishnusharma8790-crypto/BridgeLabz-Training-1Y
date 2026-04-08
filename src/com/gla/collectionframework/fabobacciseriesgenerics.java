package com.generics;

public class fabobacciseriesgenerics {

    //  unbounded method
    // (no limit of datatype)

//    public static<T> void fabonacci( T n){
//
//   int num = Integer.parseInt(n.toString());
//
//        int a=0; int b=1;
//        System.out.println(a+ "\n" +b);
//        for(int i=0;i<num;i++){
//            int sum = a+b;
//            System.out.println(sum);
//            a=b;
//            b=sum;
//
//        }
//
//    }
//
  //  public static void main(String[] args) {
//         fabonacci(8);
//    }



    // bounded method

    // limit of datatype
    //use only=  int, long ,double, float,short
 public static<T extends Number> void fibbo(int n){
     int a =0;int b= 1;
     System.out.println(a+"\n" +b);
     for(int i=0;i<n;i++){
         int sum = a+b;
         System.out.println(sum);
         a=b;
         b=sum;
     }
 }

    public static void main(String[] args) {

     fibbo(7);
    }
}
