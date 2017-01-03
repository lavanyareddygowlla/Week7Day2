package com.aspl.problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by localadmin on 03/01/17.
 */
public class Office {
    private String name;
    private String location;
    private int numberOfEmployees;



    private List<Office> emp;


    public List<Office> getEmp() {
        return emp;
    }


    public Office(String name, String location, int numberOfEmployees) {
        this.name = name;
        this.location = location;
        this.numberOfEmployees = numberOfEmployees;
        this.emp=new ArrayList<Office>();
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void addOffice(Office office){
        this.emp.add(office);
    }





}
