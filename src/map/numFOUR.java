package map;

import java.util.LinkedHashMap;
import java.util.*;

public class numFOUR {
    public static void main(String[] args) {
        Map<Integer, String[]> groups = new LinkedHashMap();
        groups.put(1,new String[]{"hamid","zoufri","taxi","mahdjouba","lilia","Dora"});
        groups.put(2,new String[]{"hliwa","Flenn","Zedk","milisa","sousam"});
        groups.put(3,new String[]{"hafida","makloub","bklawa","imad","mouhand","zineb"});
        groups.put(4,new String[]{"mkran","lhadi","youcef","hadjer","milfya","razika","chouchak"});
        groups.put(5,new String[]{"Rdwan","sami","mouloud","syfax","fax","fedex","bolouna"});
        System.out.println("Group 1");
        for (String s : groups.get(1)) {
            System.out.print(s+" ");
        }
        System.out.println("\n-------------------------");
        for (int i = 1; i  <groups.size() ; i++) {
            System.out.println("Groupe "+i+"\n");
            for (String s : groups.get(i)) {
                System.out.println(s);
            }
        }
        }







    }

