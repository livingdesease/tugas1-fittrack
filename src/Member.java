/**
 * Merepresentasikan satu member yang terdaftar di FitTrack.
 * Class ini menyimpan data pribadi member.
 */
public class Member {

    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;

    /**
     * Mengubah nama member jika nama tidak kosong.
     *
     * @param nama nama baru member
     */
    public void setNama(String nama) {
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama;
        } else {
            System.out.println("Nama tidak boleh kosong atau hanya berisi spasi.");
        }
    }

    /**
     * Mengambil nama member.
     *
     * @return nama member
     */
    public String getNama() {
        return nama;
    }

        /**
     * Mengubah nomor telepon member setelah melalui validasi.
     *
     * @param noTelepon nomor telepon baru, wajib diawali angka 0
     *                   dan memiliki panjang minimal 10 karakter
     */
    public void setNoTelepon(String noTelepon) {
        if (noTelepon != null
                && noTelepon.startsWith("0")
                && noTelepon.length() >= 10) {
            this.noTelepon = noTelepon;
        } else {
            System.out.println(
                    "Nomor telepon harus diawali angka 0 dan minimal 10 digit."
            );
        }
    }

    /**
     * Mengambil nomor telepon member.
     *
     * @return nomor telepon member
     */
    public String getNoTelepon() {
        return noTelepon;
    }

}