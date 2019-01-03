package com.stackroute;

import java.util.ArrayList;

public class ReplaceElement {

    ArrayList<String> replaceElement(ArrayList<String> elements,String stringOne,String stringTwo){
        int index=elements.indexOf(stringOne);
        elements.remove(index);
        elements.add(index,stringTwo);
        return elements;

    }
}
