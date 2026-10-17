
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

        
        System.out.println("=== Pengujian Setter Tidak Valid ===");

        System.out.println("Nomor telepon sebelum perubahan: "
                + daftarMember[0].getNoTelepon());

        daftarMember[0].setNoTelepon("12345");

        System.out.println("Nomor telepon setelah perubahan: "
                + daftarMember[0].getNoTelepon());

        System.out.println();
        
        System.out.println("=== Pengujian Nama Tidak Valid ===");

        Member memberUji = new Member(
                "",
                "081234567890",
                "21-08-2026",
                "Premium"
        );

        System.out.println(memberUji);
        System.out.println();

        
        System.out.println("=== Pengujian Nomor Telepon Tidak Valid ===");

        Member memberUjiTelepon = new Member(
                "Eko",
                "12345",
                "22-08-2026",
                "VIP"
        );

        System.out.println(memberUjiTelepon);
        System.out.println();

        for (Member member : daftarMember) {
            System.out.println(member);
            System.out.println();
        }
    }
}
