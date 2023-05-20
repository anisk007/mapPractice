package map;

import java.util.*;

public class numTWo {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);
int min=Integer.MAX_VALUE;
int max=0;
int avrage=0;
String Z=null;
String K=null;
List<String>S=new ArrayList<>();
        for (Map.Entry<String, Integer> ea : map.entrySet()) {
           if(ea.getValue()>max){
               max= ea.getValue();
               Z=ea.getKey();
           }
           if (map.get(ea.getKey())<min){
               min=ea.getValue();
               K=ea.getKey();
           }
           if(ea.getValue()>125000&&ea.getValue()<150000){
               avrage++;
           }
           if(ea.getValue()<118000){
               S.add(ea.getKey());
           }
           if(ea.getValue()<120000){
               map.replace(ea.getKey(),ea.getValue()+10000);
           }
        }
        System.out.println("MIN salary is "+K+" "+min);
        System.out.println("MAX salary is "+Z+" "+max);
        System.out.println("employees has the salary between 120k ~ 150K: "+avrage);
        for (String s : S) {
            System.out.print(s+" ");
        }
        System.out.println(map);
    }
}
