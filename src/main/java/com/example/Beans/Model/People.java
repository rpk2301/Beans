package com.example.Beans.Model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public  abstract class People<PersonType extends Person> implements Iterable<PersonType>{



    List<PersonType> PersonList;

    public People(List<PersonType> persons)
    {
        this.PersonList = persons;
    }


    public People (PersonType... people)
    {
        for(PersonType f : people)
        {
            PersonList.add(f);
        }
    }

    public void add(PersonType f)
    {
        PersonList.add(f);
    }

    public void remove(PersonType f)
    {
        PersonList.remove(f);
    }

    public int size()
    {
        return PersonList.size();
    }

    public void clear()
    {
        PersonList.clear();
    }

    public void addAll(Iterable<PersonType> it)
    {
        for(PersonType p : it)
        {
            PersonList.add(p);
        }
    }

    public PersonType findById(int id)
    {
        for(PersonType p: PersonList)
        {
            if(p.getId() == id)
            {
                return p;
            }
        }
        return null;
    }

    public List<PersonType> findAll() {
        return PersonList;
    }




}
