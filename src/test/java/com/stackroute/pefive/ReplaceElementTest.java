package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ReplaceElementTest {
    ReplaceElement replaceElement;
    @Before
    public void setUp() throws Exception {
        replaceElement=new ReplaceElement();
    }

    @After
    public void tearDown() throws Exception {
        replaceElement=null;
    }

    @Test
    public void replaceElementOne() {

        ArrayList<String> arrayList1=new ArrayList<String>();
        arrayList1.add("Apple");
        arrayList1.add("Grape");
        arrayList1.add("Melon");
        arrayList1.add("Berry");

        ArrayList<String> arrayList2=new ArrayList<String>();

        assertEquals(arrayList2,replaceElement.emptyElement(arrayList1));
    }

    @Test
    public void replaceElementTwo() {

        ArrayList<String> arrayList1=new ArrayList<String>();
        arrayList1.add("Hai");
        arrayList1.add("Hello");
        arrayList1.add("Chandu");
        arrayList1.add("Bye");

        ArrayList<String> arrayList2=new ArrayList<String>();
        arrayList2.add("Hai");
        arrayList2.add("Hello");
        arrayList2.add("Chandu");
        arrayList2.add("Welcome");

        assertEquals(arrayList2,replaceElement.replaceElement(arrayList1,"Bye","Welcome"));
    }
}