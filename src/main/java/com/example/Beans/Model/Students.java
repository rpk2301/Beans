package com.example.Beans.Model;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Students<StudentType extends Student> extends People
{




    public Students(StudentType...stus)
    {
        super(stus);
    }


    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return super.spliterator();
    }
}
