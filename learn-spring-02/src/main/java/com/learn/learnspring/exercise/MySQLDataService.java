package com.learn.learnspring.exercise;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class MySQLDataService implements DataService{
    @Override
    public int [] retrieveData () {
        return new int [] {1,2,3,4,5};
    }
}
