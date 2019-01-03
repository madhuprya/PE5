package com.stackroute.pefive;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSorter implements Comparator<Student> {

        public int compare(Student st1,Student st2){
            int sortAge = st1.getAge().compareTo(st2.getAge());

            int sortName = st1.getName().compareTo(st2.getName());

            int sortId = st1.getId().compareTo(st2.getId());

            if(sortAge == 0) {
                return ((sortName == 0) ? sortId : sortName);
            }
            else {
                return sortAge;
            }
        }
//          Collections.sort(List<Student> sList, compare(Student s1,Student s2));
    public Student sortingStudent(List<Student> sList){
        Collections.sort(sList,
                new StudentSorter());
        Collections.reverse(sList);
        Student ss=null;
        for(Student student : sList) {
            //System.out.println(student);
            ss=student;

        }
            return ss;


    }


}
