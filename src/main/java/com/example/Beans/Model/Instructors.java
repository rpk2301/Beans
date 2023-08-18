package com.example.Beans.Model;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Instructors  extends People<Instructor>{


    public Instructors(Instructor...stus)
    {
        super(stus);
    }
    public Instructors()
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
