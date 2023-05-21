package map;
import java.util.*;
public class numFIve {
    public static void main(String[] args) {
        List<String> group1 = new ArrayList<>(Arrays.asList( "Duygu","Magda","Farangez","Edison","Kerem","Farangis" ));
        List<String> group2 = new ArrayList<>(Arrays.asList( "Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat" ));
        List<String> group9 = new ArrayList<>(Arrays.asList( "Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem" ));
        List<String> group24 = new ArrayList<>(Arrays.asList( "Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas" ));
        List<String> group5 = new ArrayList<>(Arrays.asList("Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene" ));
Map<Integer,List<String>>GR= new LinkedHashMap<>();
GR.put(1,group1);
GR.put(2,group2);
GR.put(3,group24);
GR.put(4,group5);
        for (List<String> value : GR.values()) {
            System.out.println();
            for (String s : value) {
                System.out.print(s+" ");
            }

        }

    }
}
