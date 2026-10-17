FitTrack — Sistem Keanggotaan Gym


- Nama: Mellani Sofie
- NIM: 250810701100069
- Mata Kuliah: Praktikum Pemrograman Berorientasi Objek (PBO)
- Tugas: Remedial UTS Praktikum PBO — Tugas 1


Deskripsi
FitTrack adalah program berbasis Java untuk mengelola dan menampilkan data keanggotaan gym. Program ini menerapkan konsep pemrograman berorientasi objek dengan class 'Member', constructor, enkapsulasi, validasi data, dan method 'toString()'.


Fitur
- Menyimpan data member berupa nama, nomor telepon, tanggal pendaftaran, dan jenis paket.
- Memvalidasi nama agar tidak kosong atau hanya berisi spasi.
- Memvalidasi nomor telepon agar diawali angka 0 dan memiliki minimal 10 karakter.
- Memvalidasi tanggal pendaftaran agar tidak kosong.
- Memvalidasi jenis paket agar hanya menerima Basic, Premium, atau VIP.
- Menyediakan constructor lengkap dan constructor dengan paket Basic secara otomatis.
- Mempertahankan nilai sebelumnya ketika setter menerima input tidak valid, kecuali jenis paket yang diatur kembali menjadi Basic.
- Menampilkan data member melalui method toString().
- Menguji beberapa objek Member menggunakan array dan perulangan for.
- Menampilkan pesan ketika input tidak valid.


Konsep OOP yang Digunakan
- Class dan Object
Member merupakan class untuk merepresentasikan member gym. Setiap pemanggilan constructor menghasilkan objek member.
- Encapsulation
Atribut nama, noTelepon, tanggalDaftar, dan jenisPaket menggunakan modifier private. Akses dan perubahan data dilakukan melalui getter dan setter.
- Constructor
Constructor lengkap menerima empat parameter, sedangkan constructor overload menerima tiga parameter dan menetapkan paket Basic secara otomatis.
- Constructor Overloading
Class Member memiliki dua constructor dengan jumlah parameter berbeda.
- Method Overriding
Method toString() ditulis ulang untuk menampilkan data member dalam format yang mudah dibaca.
- Validasi Data
Setter memeriksa input sebelum mengubah atribut sehingga data yang tidak valid ditolak sesuai aturan program.
- Array dan Perulangan
Array Member[] menyimpan empat objek member dan perulangan for digunakan untuk menampilkan data setiap objek.


Struktur Proyek
tugas1-fittrack/
├── src/
│   ├── Member.java
│   └── TesFitTrack.java
├── out/
├── .gitignore
└── README.md

Keterangan:
src/Member.java: menyimpan class Member, atribut, getter, setter, constructor, validasi, dan method toString().
src/TesFitTrack.java: menjalankan pengujian objek Member dan menampilkan hasilnya.
out/: menyimpan hasil kompilasi program Java. Folder ini dikecualikan dari Git melalui .gitignore.
.gitignore: mencegah file hasil kompilasi dan folder tertentu ikut disimpan ke repository.
README.md: berisi dokumentasi proyek FitTrack.


Kebutuhan Perangkat Lunak
Bahasa pemrograman: Java
JDK: JDK yang mendukung javac dan java.
IDE/editor: Visual Studio Code
Terminal: PowerShell atau terminal lain yang mendukung perintah Java.


Cara Menjalankan Program
Menggunakan Visual Studio Code
1. Buka folder proyek 'tugas1-fittrack' di Visual Studio Code.
2. Pastikan JDK sudah terpasang dan perintah 'java' serta '`javac' dapat digunakan di terminal.
3. Buka terminal melalui menu Terminal → New Terminal.
4. Jalankan perintah berikut untuk mengompilasi program: javac -d out src/Member.java src/TesFitTrack.java
5. Setelah kompilasi berhasil, jalankan program: java -cp out TesFitTrack    
6. Hasil pengujian akan tampil di terminal.
Menggunakan IntelliJ IDEA
1. Buka IntelliJ IDEA dan pilih 'Open'.
2. Pilih folder proyek 'tugas1-fittrack'.
3. Pastikan JDK sudah dikonfigurasi pada proyek.
4. Tandai folder 'src' sebagai Sources Root jika diperlukan.
5. Buka 'TesFitTrack.java'.
6. Klik ikon Run di samping method 'main()' atau klik kanan file tersebut, lalu pilih Run 'TesFitTrack.main()'.
7. Hasil pengujian akan tampil pada jendela Run.


Nilai Default dan Alasan Pemilihan
Program menggunakan nilai awal untuk menjaga agar objek Member tetap memiliki data ketika menerima input yang tidak valid.
nama - Belum diisi - Menunjukkan bahwa nama belum berhasil diisi dengan nilai yang valid.
noTelepon - 0000000000 - Menyediakan nilai awal berupa string dengan panjang 10 karakter yang diawali angka 0.
tanggalDaftar - Belum diisi - Menunjukkan bahwa tanggal pendaftaran belum berhasil diisi.
jenisPaket - Basic - Menetapkan paket dasar sebagai pilihan default jika jenis paket tidak valid.

Jika setter menerima nilai tidak valid untuk nama, nomor telepon, atau tanggal pendaftaran, nilai atribut sebelumnya dipertahankan. Khusus jenisPaket, nilai tidak valid menyebabkan paket diatur menjadi Basic.


Keterbatasan Program
- Program masih berjalan melalui terminal dan belum memiliki antarmuka grafis.
- Data member hanya disimpan selama program berjalan dan belum menggunakan database.
- Tanggal pendaftaran hanya diperiksa agar tidak kosong, belum divalidasi berdasarkan format tanggal tertentu.
- Nomor telepon diperiksa berdasarkan awalan 0 dan panjang minimal 10 karakter, belum memeriksa apakah seluruh karakter berupa angka.
- Program belum menyediakan fitur untuk mengubah, menghapus, atau mencari member melalui menu interaktif.
- Rencana Pengembangan
- Menambahkan menu interaktif untuk mengelola data member.
- Menggunakan database agar data member dapat disimpan secara permanen.
- Memperketat validasi tanggal pendaftaran dan nomor telepon.
- Menambahkan fitur pencarian dan pengelolaan data member.
