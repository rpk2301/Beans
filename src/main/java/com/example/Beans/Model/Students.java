package com.example.Beans.Model;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Students extends People<Student>
{




    public Students(Student...stus)
    {
        super(stus);
    }
    public Students()
    {
        super();
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
