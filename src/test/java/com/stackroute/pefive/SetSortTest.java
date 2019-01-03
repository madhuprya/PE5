package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class SetSortTest {
    SetSort setSort;
    @Before
    public void setUp() throws Exception {
        setSort=new SetSort();
    }

    @After
    public void tearDown() throws Exception {
        setSort=null;
    }

    @Test
    public void setSortOne() {
        String[] strings={"Harry","Olive","Alice","Bluto","Eugene"};
        TreeSet set=new TreeSet();
        set.add("Alice");
        set.add("Bluto");
        set.add("Eugene");
        set.add("Harry");
        set.add("Olive");
        assertEquals(set,setSort.setSort(strings));

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.addAll(set);

        assertEquals(arrayList,setSort.setSortArr(set));
    }


    @Test
    public void setSortTwo() {
        String[] strings={"Chandu","Anagha","Durga","Jayashree","Madhu"};
        TreeSet set=new TreeSet();
        set.add("Anagha");
        set.add("Chandu");
        set.add("Durga");
        set.add("Madhu");
        set.add("Jayashree");
        assertEquals(set,setSort.setSort(strings));

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.addAll(set);

        assertEquals(arrayList,setSort.setSortArr(set));
    }

}