package com.example.Beans.Model;

import com.example.Beans.Repos.Learner;
import com.example.Beans.Repos.Teacher;

import java.util.ArrayList;
import java.util.Collection;

public class Instructor extends Person implements Teacher {


    public Instructor(Long id, String name)
    {
        super(id,name);

    }


    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours)
    {
        ArrayList learners1 = new ArrayList<>((Collection) learners);
        learners.forEach(l -> l.learn(numberOfHours/learners1.size()));
    }
}
