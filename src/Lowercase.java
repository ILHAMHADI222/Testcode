class Lowercasebook {
    public static Boolean Reduplikasi(String word)  {
        word = word.toLowerCase().replace("-", "").replace("-", "");
        return word.equals(new StringBuilder(word).reverse().toString());
    }
    public static Boolean Palindrome (String word)  {
        word = word.toLowerCase().replace("-", "").replace("-", "");
        return word.equals(new StringBuilder(word).reverse().toString());
    }
    public static void Halaman(int totalhalaman) {
        for (int page = 1; page <= totalhalaman; page++) {
            String marks = "";

            if (page % 4 == 0) {
                marks += "Favorit ";
            }
            if (page % 5 == 0) {
                marks += "Halaman ";
            }

            if (marks.isEmpty()) {
                marks = "Favorit Halaman";
            }

            System.out.println("Halaman " + page + "dengan:" + marks);
        }
    }
    public static void main(String[] args) {
        String kata1 = "angan-angan";
        String kata2 = "katak";
        int jumlahhalaman = 20;

        System.out.println("'" + kata1 + "' merupakan kata reduplikasi: " + Reduplikasi(kata1));
        System.out.println("'" + kata2 + "' adalah palindrom: " + Palindrome(kata2));
        Halaman(jumlahhalaman);
    }
}