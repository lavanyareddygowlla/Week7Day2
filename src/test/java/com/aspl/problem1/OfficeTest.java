package com.aspl.problem1;

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
public class OfficeTest {
    @Test
    public void testOfficeParams() throws Exception {
        Office off=new Office("test","bangalore",10);
        assertEquals(off.getName(),"test");
        assertEquals(off.getLocation(), "bangalore");
        assertEquals(off.getNumberOfEmployees(),10);
        assertNotNull(off);
    }


    @Test
    public void testLocationIfExists()
    {

        Office off=new Office("ASPL","Belfast, Northern Ireland",100);

        List<Office> offList=new ArrayList<Office>();
        offList.add(off);
        System.out.println(offList);
         assertNotNull(offList);

    }



}