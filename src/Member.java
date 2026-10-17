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

}