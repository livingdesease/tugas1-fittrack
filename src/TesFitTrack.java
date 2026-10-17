
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
    }

}
