package com.example.Beans.Configs;


import com.example.Beans.Model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomCofig {
    @Bean
    @DependsOn({"instructors","students"})
    public Classroom currentCohort()
    {
        return new Classroom(new Instructors(new Instructor(14L,"FRANK")),new Students(new Student(14L,"Ricky")));
    }

    @Bean
    @DependsOn({"instructors","students"})
    public Classroom previousCohort()
    {
        return new Classroom(new Instructors(new Instructor(14L,"Leon")),new Students(new Student(14L,"Brian")));
    }

}
