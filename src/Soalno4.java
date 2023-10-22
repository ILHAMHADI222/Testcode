public class Soalno4    {
    public static void main(String[] args) {
        int nilai = 89;
        int nilaiAkanDiubah = ConvertNegatifJikaPositif(nilai);
        System.out.println("Nilai setelah diubah: " + nilaiAkanDiubah);
    }

    public static int ConvertNegatifJikaPositif(int nilai) {
        if (nilai > 0) {
            return -nilai;
        } else {
            return nilai;
        }
    }
}
