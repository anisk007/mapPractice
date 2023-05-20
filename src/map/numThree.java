package map;


import jdk.jfr.Name;

import java.time.LocalDate;
import java.util.*;
public class numThree {



    public static void main(String[] args) {
        Map<String, LocalDate> map = new LinkedHashMap<>();
        map.put("John", LocalDate.of(2018, 9, 5));
        map.put("Antony", LocalDate.of(2012, 7, 29));
        map.put("Jimmy", LocalDate.of(2014, 4, 1));
        map.put("James", LocalDate.of(2016, 11, 2));
        map.put("Josh", LocalDate.of(2020, 5, 15));
        map.put("Cory", LocalDate.of(2015, 6, 19));
        map.put("Anderson", LocalDate.of(2013, 8, 24));
        map.put("Steven", LocalDate.of(2017, 10, 2));
        for (Map.Entry<String, LocalDate> ea : map.entrySet()) {
            if (ea.getValue().isBefore(LocalDate.of(2015, 1, 1))) {
                System.out.println(( ea.getKey()));
            }
        }
        System.out.println();
            for (Map.Entry<String, LocalDate> ea : map.entrySet()) {
                if (ea.getValue().equals(LocalDate.of(2020, 05, 15))) {
                    System.out.println( ea.getKey());
                }
            }
            int l=0;
                for (Map.Entry<String, LocalDate> ea : map.entrySet()) {
             if(ea.getValue().isAfter(LocalDate.of(2014,1,1)));
             l++;
                }
        System.out.println("numnber of Employes that got hired after 2014:  "+l);
        }















    }

