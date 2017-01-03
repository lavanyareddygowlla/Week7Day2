package com.aspl.problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by localadmin on 03/01/17.
 */
public class Problem1 {

    public static void main(String args[]) {
    }

    public static List<Office> findLocation(List<Office> officeList, String location) {
        List<Office> officeWithBelfastLocation = officeList.stream().filter(off -> off.getLocation().equals(location)).collect(Collectors.toList());
        System.out.println(officeWithBelfastLocation);
        return officeWithBelfastLocation;
    }

    public static List<Office> getEmployeesCount(List<Office> officeList, int numberOfemployees) {
        List<Office> EmployeeListLessThanTen = officeList.stream().filter(off -> off.getNumberOfEmployees()<numberOfemployees).collect(Collectors.toList());
        System.out.println("EmployeeListLessThanTen"+EmployeeListLessThanTen);
        return EmployeeListLessThanTen;
    }

    public static List<Office> getEmployeesCountOverHundred(List<Office> officeList, int numberOfemployees) {
        List<Office> EmployeeListOverHundred = officeList.stream().filter(off -> off.getNumberOfEmployees()>numberOfemployees).collect(Collectors.toList());
        System.out.println("EmployeeListOverHundred"+EmployeeListOverHundred);
        return EmployeeListOverHundred;
    }
    public static List<Office> findByName(List<Office> officeList, String name) {
        List<Office> officeListWithName = officeList.stream().filter(off -> off.getName().equals(name)).collect(Collectors.toList());
        System.out.println(officeListWithName);
        return officeListWithName;
    }


    public static List<Office> checkNamesBeginWithAtoK(List<Office> officeList) {

        List<Office> officeListWithName=new ArrayList<Office>();
            //System.out.println(alphabet);
            officeListWithName = officeList.stream().filter(off -> off.getName().charAt(0)>=65 && off.getName().charAt(0)<=76).collect(Collectors.toList());
            //System.out.println(officeListWithName.get(0));

        return officeListWithName;
    }

    public static List<Office> NamesWithVowelsAndEmployeesOverFifteen(List<Office> officeList) {

        List<Office> officeListWithVowels=new ArrayList<Office>();
        //char[] vowles={'a','e','i','o','u'};
        officeListWithVowels = officeList.stream().filter(off -> off.getName().startsWith("A")|| off.getName().startsWith("E")||off.getName().startsWith("I")||off.getName().startsWith("O")||off.getName().startsWith("U")).collect(Collectors.toList());

        return officeListWithVowels;
    }



}

