package map;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class numONE {
    public static void main(String[] args) {
        Map<String,int[]>Student=new LinkedHashMap<>();
        Student.put("bschir",new int[]{1,3,4,5,6,6});
        Student.put("mouhand",new int[]{8,2,4,4,2,10});
        Student.put("mizeoup",new int[]{2,7,4,8,5,10});
        Student.put("kachir",new int[]{10,2,8,10,6,6});
       Student.forEach((k,v)->{
           System.out.println(k+":"+Arrays.toString(v));
       });
        }




    }

