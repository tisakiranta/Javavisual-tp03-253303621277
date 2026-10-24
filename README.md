
# AP13 — AppTheme dan MainWindow v0.4

## 1. Tujuan
Tugas ini menerapkan tema terpusat menggunakan AppTheme
dan memperbarui tampilan aplikasi Java Swing menjadi v0.4.

## 2. Implementasi AppTheme
AppTheme berada di package view dan mengatur warna, font,
border, serta warna kartu berdasarkan role karakter.

Konstanta HIGH_LEVEL_THRESHOLD digunakan untuk menentukan
batas level tinggi, yaitu level 5.

## 3. Mini-Challenge
Karakter dengan level minimal 5 ditampilkan menggunakan
teks berwarna emas dan font tebal. Karakter dengan level
di bawah 5 menggunakan tampilan teks normal.

## 4. Dua Properti Tambahan

### Tooltip karakter
Kartu karakter menampilkan HP dan ATK ketika pointer
diarahkan ke kartu. Fitur ini memudahkan pengguna melihat
detail tanpa memenuhi tampilan utama.

### Border berdasarkan role
Border kartu disesuaikan dengan role karakter. Hal ini
membantu membedakan Tank, Mage, dan Assassin.

## 5. Analisis Konseptual
Aturan tampilan ditempatkan di layer View karena warna,
font, border, layout, dan tooltip merupakan aspek presentasi.

Model bertanggung jawab atas data dan aturan domain karakter.
Pemisahan ini membuat tema dapat diubah tanpa mengubah data
karakter serta mengurangi ketergantungan Model terhadap Swing.

## 6. Pengujian
- Enam karakter ditampilkan.
- Warna kartu mengikuti role.
- Level minimal 5 menggunakan teks emas dan tebal.
- Tooltip menampilkan detail karakter.
- Border kartu berbeda berdasarkan role.
- Jendela menggunakan pack().

## 7. Screenshot
- screenshots/v03-before.png: belum tersedia karena proyek
  v0.3 asli belum ditemukan.
- screenshots/v04-after.png: tampilan setelah pembaruan.

## 8. Catatan
Proyek ini dibuat ulang sebagai latihan karena proyek lama
belum ditemukan. Oleh sebab itu, kesamaan package model
dengan Sprint #3 belum dapat dibuktikan melalui Git.
