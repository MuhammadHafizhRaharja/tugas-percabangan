Buatlah pseudocode untuk menghitung gaji berdasarkan masa kerja dan jumlah jam kerja dalam 1 bulan
Ketentuan perhitungan gaji adalah sebagai berikut:
1. Jika masa kerja di bawah 5 tahun maka tidak akan diberikan tambahan 
2. Jika masa kerja di antara 5-10 tahun, akan diberikan tambahan sebanyak 5% dari gaji pokok
3. Jika masa kerja di ataas 10 tahun, akan diberikan tambahan 10% dari gaji pokok

Standar gaji pokok adalah Rp 5.000.000. Sedangkan untuk perhitungan uang lembur per jam adalah 
Rp 50.000. Jam kerja yang dihitung adalah jam kerja di atas 8 jam kerja dalam sehari atau 
40 jam per minggu. Hitunglah gaji yang diterima oleh seorang karyawan dengan input masa kerja dan
jumlah jam kerja dengan input dari user.

Program menghitung_gaji

DEKLARASI:
Deklarasi variables: lamaKerja, jumlahJamKerja : integer
Deklarasi variables: totalGaji, tarifLemburPerJam, uangLembur : double
Set tarifLemburPerJam = 50000
Set jamRegulerPerMinggu = 40
Set jamLembur = 0

ALGORITMA:
INPUT lamaKerja
INPUT jumlahJamKerja

IF lamaKerja < 5 AND lamaKerja >= 0 THEN
      Set totalGaji = 5000000
ELSE IF lamaKerja <= 10 AND lamaKerja >= 5 THEN
      Set totalGaji = 5000000 + (5000000 * 5 / 100)
ELSE IF lamaKerja > 10 THEN
      Set totalGaji = 5000000 + (5000000 * 10 / 100)
ELSE
      PRINT "Input lama kerja dengan benar!";
END IF

IF jumlahJamKerja > jamRegulerPerMinggu THEN
      Set jamLembur = jumlahJamKerja - jamRegulerPerMinggu
ELSE IF jumlahJamKerja < 40 THEN
      PRINT "Kerja lebih keras!"
      
END IF

Set uangLembur = jamLembur * tarifLemburPerJam
Set totalGaji = totalGaji + uangLembur

PRINT totalGaji;

END
