public class Soalno2 {
    public static void main(String[] args) {
        int MaksMataDadu = 6;
        int JmlAngkaGnp = 0;

        for (int dadu1 = 1; dadu1 <= MaksMataDadu; dadu1++) {
            for (int dadu2 = 1; dadu2 <= MaksMataDadu; dadu2++) {
                int jumlahMata = dadu1 + dadu2;
                if (jumlahMata % 2 == 0) {
                    JmlAngkaGnp++;
                }
            }
        }
        System.out.println("angka genap yang terbentuk: " + JmlAngkaGnp);
    }
}
