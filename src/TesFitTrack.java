
/**
 * Menjalankan pengujian sistem keanggotaan gym FitTrack.
 * Class ini digunakan untuk menguji objek Member.
 */
public class TesFitTrack {

    /**
     * Titik awal program FitTrack.
     *
     * @param args argumen dari command line
     */

    public static void main(String[] args) {
        Member member1 = new Member(
                "Andi",
                "081234567890",
                "17-08-2026",
                "Premium"
        );

        System.out.println(member1);

        
        System.out.println();

        Member member2 = new Member(
                "Budi",
                "082345678901",
                "18-08-2026"
        );

        System.out.println(member2);

        
        System.out.println();

        Member member3 = new Member(
                "Citra",
                "083456789012",
                "19-08-2026",
                "VIP"
        );

        System.out.println(member3);

    }

}
