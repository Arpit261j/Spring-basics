package com.learn.learnspring.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BusinessCalculationService {
    DataService dataService;
    @Autowired
    public BusinessCalculationService(DataService dataService) {
        System.out.println("Using----- "+ dataService);
        this.dataService=dataService;
    }
    public int findMax () {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
