package com.bridgelabz.genric;

public class Main {
    public static void main(String[] args) {
        Integer nums[] = {10, 2, 5,};
        Character chs[] = {'v', 'p', 's',};
        Double d[] = {20.2, 45.4, 71.6,};
        MyClass<Integer> iob = new MyClass(nums);
        MyClass<Character> cob = new MyClass(chs);
        MyClass<Double> dob = new MyClass(d);
        System.out.println("Max value in nums: " + iob.max());

        System.out.println("Max value in chs: " + cob.max());

        System.out.println("Max value in Floats: " + dob.max());
    }
    }