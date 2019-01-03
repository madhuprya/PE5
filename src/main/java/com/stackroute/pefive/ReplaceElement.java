package com.stackroute.pefive;

import java.util.ArrayList;

public class ReplaceElement {

    ArrayList<String> replaceElement(ArrayList<String> elements,String stringOne,String stringTwo){
        int index=elements.indexOf(stringOne);
        elements.remove(index);
        elements.add(index,stringTwo);
        return elements;

    }


    ArrayList<String> emptyElement(ArrayList<String> elements){

        elements.removeAll(elements);
        System.out.println(elements);
        return elements;

    }
}
