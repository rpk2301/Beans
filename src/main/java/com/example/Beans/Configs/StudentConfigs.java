package com.example.Beans.Configs;

import com.example.Beans.Model.Classroom;
import com.example.Beans.Model.Student;
import com.example.Beans.Model.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfigs {
    @Bean(name= "students")
    public Students currentStudents()
    {
    return new Students(new Student(12L,"Joe++"));
    }



    @Bean(name="prevStudents")
    public Students previousStudents()
    {
    return new Students(new Student(13L,"AverageJoe"));
    }
}
