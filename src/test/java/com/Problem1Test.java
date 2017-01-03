package com;

import com.aspl.problem1.Office;
import com.aspl.problem1.Problem1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 03/01/17.
 */
@RunWith(JUnit4.class)
public class Problem1Test {
    @Test
    public void testFindByName() throws Exception {


        List<Office> officeList = new ArrayList<Office>();
        officeList.add(new Office("ASPL","Belfast",100));
        officeList.add(new Office("Allstate","ANI",1000));
        officeList.add(new Office("ASPL","Pune, India",500));
        officeList.add(new Office("ASPL","Bangalore",200));
        officeList.add(new Office("Northland","Dallas",10));
        officeList.add(new Office("ASPL","Belfast",5));

        Problem1 problem=new Problem1();
        List<Office> offices =  problem.findByName(officeList, "Northland");
        assertEquals(1, offices.size());
        assertEquals("Northland", offices.get(0).getName());

    }


    @Test
    public void testFindByNameBeginsWithAtoK() throws Exception {


        List<Office> officeList = new ArrayList<Office>();
        officeList.add(new Office("ASPL","Belfast",100));
        officeList.add(new Office("Allstate","ANI",1000));
        officeList.add(new Office("ASPL","Pune, India",500));
        officeList.add(new Office("ASPL","Bangalore",200));
        officeList.add(new Office("Northland","Dallas",10));
        officeList.add(new Office("ASPL","Belfast",5));
        officeList.add(new Office("KPIT","Pune, India",500));
        Problem1 problem=new Problem1();



            List<Office> offices = problem.checkNamesBeginWithAtoK(officeList);
            assertEquals(6, offices.size());
            assertEquals("ASPL", offices.get(0).getName());

    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void testFindLocation()
    {
        List<Office> officeList = new ArrayList<Office>();
        officeList.add(new Office("ASPL","Belfast",100));
        officeList.add(new Office("Allstate","ANI",1000));
        officeList.add(new Office("ASPL","Pune, India",500));
        officeList.add(new Office("ASPL","Bangalore",200));
        officeList.add(new Office("Northland","Dallas",10));
        officeList.add(new Office("ASPL","Belfast",5));

        Problem1 problem=new Problem1();
        List<Office> offices =  problem.findLocation(officeList, "Belfast");
        assertEquals(2, offices.size());
        assertEquals("Belfast", offices.get(0).getLocation());
    }


    @Test
    public void testGetEmployeesCount()
    {
        List<Office> officeList = new ArrayList<Office>();
        officeList.add(new Office("ASPL","Belfast",100));
        officeList.add(new Office("Allstate","ANI",1000));
        officeList.add(new Office("ASPL","Pune, India",500));
        officeList.add(new Office("ASPL","Bangalore",7));
        officeList.add(new Office("ASPL","Dallas",10));
        officeList.add(new Office("ASPL","Belfast",5));

        Problem1 problem=new Problem1();
        List<Office> offices =  problem.getEmployeesCount(officeList, 10);
        assertEquals(2, offices.size());
        assertEquals("Bangalore", offices.get(0).getLocation());



    }


    @Test
    public void testGetEmployeesCountOverHundred()
    {
        List<Office> officeList = new ArrayList<Office>();
        officeList.add(new Office("ASPL","Belfast",100));
        officeList.add(new Office("Allstate","ANI",1000));
        officeList.add(new Office("ASPL","Pune, India",500));
        officeList.add(new Office("ASPL","Bangalore",7));
        officeList.add(new Office("ASPL","Dallas",10));
        officeList.add(new Office("ASPL","Belfast",5));

        Problem1 problem=new Problem1();
        List<Office> offices =  problem.getEmployeesCountOverHundred(officeList, 100);
        assertEquals(2, offices.size());
        assertEquals("ANI", offices.get(0).getLocation());

    }



    @Test
    public void testGetNamesWithVowelsAndEmployeesOverFifteen()
    {
        List<Office> officeList = new ArrayList<Office>();
        officeList.add(new Office("ASPL","Belfast",100));
        officeList.add(new Office("DALLAS","ANI",1000));
        officeList.add(new Office("RAJASTHAN","Pune, India",500));
        officeList.add(new Office("OHIO","Bangalore",7));
        officeList.add(new Office("UTTARPRADESH","Dallas",10));
        officeList.add(new Office("ASPL","Belfast",5));

        Problem1 problem=new Problem1();
        List<Office> offices =  problem.NamesWithVowelsAndEmployeesOverFifteen(officeList);
        System.out.println("Size:"+offices.size());
        assertEquals(4, offices.size());
        assertEquals("ASPL", offices.get(0).getName());

    }



}
