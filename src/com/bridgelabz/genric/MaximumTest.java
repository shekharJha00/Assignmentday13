package com.bridgelabz.genric;

public class MaximumTest<T extends Comparable<T>>
        {
        T x,y,z;
public MaximumTest(T x,T y,T z) {


    this.x = x;
    this.y = y;
    this.z = z;
}
        public T maximum() {
        return MaximumTest.maximum(x,y,z);
        }

public static<T extends Comparable<T>>T maximum(T x,T y,T z) {
    T max = x;
    if (y.compareTo(max) > 0) {
        max = y;
    }

    if (z.compareTo(max) > 0) {
        max = z;

         }printMax(x,y,z,max);
    return max;}

public static String testMaximum(String x,String y,String z){
        String max = x;
        if(y.compareTo(max)>0){
        max = y;
        }
        if(z.compareTo(max)>0){
        max = z;



} printMax(x,y,z,max);
        return max;}
public static <T> void printMax(T x , T y , T z , T max){

    System.out.printf("Max of %s,%s and %s is %s\n",x,y,z,max);
}
    public static void main(String[] args) {
      Integer xint =3,yint=5,zint=9;
      Float xF1= 3.9f ,yF1=9.8f,zF1=6.9f;
      String xstr="peach",ystr="apple",zstr="orange";

      new MaximumTest(xint,yint,zint).maximum();
      new MaximumTest(xF1,yF1,zF1).maximum();
      new MaximumTest(xstr,ystr,zstr).maximum();
    }}

  