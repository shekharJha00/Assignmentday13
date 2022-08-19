package com.bridgelabz.genric;

class MyClass<T extends Comparable<T>>
{
    T[] values;
    MyClass(T[] o)
    {
        values = o;
    }


    public T max()
    {
        T v = values[0];
        for(int i=1; i < values.length;i++)
            if(values[i].compareTo(v) > 0)
                v = values[i];
        return v;
    }


    }

  