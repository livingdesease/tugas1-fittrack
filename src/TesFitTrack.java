
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
        Member[] daftarMember = {
                new Member(
                        "Andi",
                        "081234567890",
                        "17-08-2026",
                        "Premium"
                ),
                new Member(
                        "Budi",
                        "082345678901",
                        "18-08-2026"
                ),
                new Member(
                        "Citra",
                        "083456789012",
                        "19-08-2026",
                        "VIP"
                ),
                new Member(
                        "Dina",
                        "084567890123",
                        "20-08-2026",
                        "Basic"
                )
        };

        for (Member member : daftarMember) {
            System.out.println(member);
            System.out.println();
        }
    }
}
