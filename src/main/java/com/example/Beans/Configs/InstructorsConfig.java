package com.example.Beans.Configs;


import com.example.Beans.Model.Instructor;
import com.example.Beans.Model.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {
    @Bean(name = "tcUsaIntructors")
    public Instructors tcUsaInstructors()
    {
        return new Instructors(new Instructor(13L,"Santonia"));
    }

    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors()
    {
        return new Instructors(new Instructor(14L,"Ed Sheeran"));
    }


    @Bean(name = "instructors")
    @Primary
    public Instructors instructors()
    {
        return new Instructors(new Instructor(15L,"Kris"),new Instructor(16L,"Dolio"));
    }

}
