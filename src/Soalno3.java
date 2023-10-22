import java.util.HashMap;

public class Soalno3 {
       public static void main(String[] args) {
            String kata = "Tyrannosaurus";
            HashMap<Character, Integer> hurufKemunculan = new HashMap<>();
            for (int i = 0; i < kata.length(); i++) {
                char karakter = kata.charAt(i);
                if (hurufKemunculan.containsKey(karakter)) {
                    hurufKemunculan.put(karakter, hurufKemunculan.get(karakter) + 1);
                } else {
                    hurufKemunculan.put(karakter, 1);
                }
            }
            for (char karakter : hurufKemunculan.keySet()) {
                int jumlahKemunculan = hurufKemunculan.get(karakter);
                if (jumlahKemunculan > 1) {
                    System.out.println("Huruf '" + karakter + "' memiliki " + jumlahKemunculan + " kemunculan.");
                }
            }
        }
    }
