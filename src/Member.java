/**
 * Merepresentasikan satu member yang terdaftar di FitTrack.
 * Class ini menyimpan data pribadi member.
 */
public class Member {

    private String nama = "Belum diisi";
    private String noTelepon = "0000000000";
    private String tanggalDaftar = "Belum diisi";
    private String jenisPaket = "Basic";

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

    
    /**
     * Mengubah tanggal pendaftaran member jika tanggal tidak kosong.
     *
     * @param tanggalDaftar tanggal pendaftaran member
     */
    public void setTanggalDaftar(String tanggalDaftar) {
        if (tanggalDaftar != null && !tanggalDaftar.trim().isEmpty()) {
            this.tanggalDaftar = tanggalDaftar;
        } else {
            System.out.println(
                    "Tanggal pendaftaran tidak boleh kosong."
            );
        }
    }

    /**
     * Mengambil tanggal pendaftaran member.
     *
     * @return tanggal pendaftaran member
     */
    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    
    /**
     * Mengubah jenis paket member.
     * Jika paket tidak sesuai pilihan, paket diatur menjadi Basic.
     *
     * @param jenisPaket jenis paket yang dipilih member
     */
    public void setJenisPaket(String jenisPaket) {
        if ("Basic".equals(jenisPaket)
                || "Premium".equals(jenisPaket)
                || "VIP".equals(jenisPaket)) {
            this.jenisPaket = jenisPaket;
        } else {
            this.jenisPaket = "Basic";
            System.out.println(
                    "Jenis paket tidak valid. Paket diatur menjadi Basic."
            );
        }
    }

    /**
     * Mengambil jenis paket member.
     *
     * @return jenis paket member
     */
    public String getJenisPaket() {
        return jenisPaket;
    }

    
    /**
     * Membuat objek member dengan seluruh data.
     *
     * @param nama nama member
     * @param noTelepon nomor telepon member
     * @param tanggalDaftar tanggal pendaftaran member
     * @param jenisPaket jenis paket keanggotaan
     */
    public Member(String nama, String noTelepon,
                  String tanggalDaftar, String jenisPaket) {
        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }

    
    /**
     * Membuat objek member dengan paket Basic secara otomatis.
     *
     * @param nama nama member
     * @param noTelepon nomor telepon member
     * @param tanggalDaftar tanggal pendaftaran member
     */
    public Member(String nama, String noTelepon, String tanggalDaftar) {
        this(nama, noTelepon, tanggalDaftar, "Basic");
    }

    
    /**
     * Mengubah data member menjadi teks yang mudah dibaca.
     *
     * @return seluruh data member dalam format teks
     */
    @Override
    public String toString() {
        return "Nama: " + nama
                + "\nNomor Telepon: " + noTelepon
                + "\nTanggal Daftar: " + tanggalDaftar
                + "\nJenis Paket: " + jenisPaket;
    }

}