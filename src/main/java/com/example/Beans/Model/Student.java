package com.example.Beans.Model;

import com.example.Beans.Repos.Learner;

public class Student extends Person implements Learner {



    private double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
    }


    @Override
    public void learn(double numberOfHours) {
        this.totalStudyTime = this.totalStudyTime+numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
