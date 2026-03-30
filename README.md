# PASD Jobsheet 5 BRUTE FORCE DAN DIVIDE CONQUER 
## 5.2.2.Verifikasi Hasil Percobaan
![alt text](image.png)

## 5.2.3.Pertanyaan
## 1.Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!
## a. Bagian if (n == 1)
Bagian ini disebut base case (kondisi dasar) pada rekursi.
Digunakan untuk menghentikan proses pemanggilan fungsi secara terus-menerus.
Secara matematis diketahui bahwa:
1!=1
Jadi ketika nilai n sudah mencapai 1, program langsung mengembalikan nilai 1 tanpa memanggil fungsi lagi.

## b. Bagian else
Bagian ini disebut recursive case.
Digunakan untuk membagi masalah menjadi masalah yang lebih kecil.
Program menghitung faktorial dengan rumus:
n!=n×(n−1)!
Fungsi akan memanggil dirinya sendiri dengan nilai yang lebih kecil (n-1) sampai mencapai kondisi base case.

## 2.Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan for? Buktikan!
Ya, bisa.
Perulangan dapat diganti menggunakan while atau do-while. penjelasannya Perulangan while melakukan proses yang sama dengan for, yaitu: Mengalikan nilai fakto dengan i, Menambah nilai i, Mengulang sampai i <= n
## 3.Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !
## a. fakto = fakto * i;, Digunakan pada perulangan (iteratif / brute force): Nilai fakto terus diperbarui setiap iterasi.

## b.int fakto = n * faktorialDC(n-1);
Digunakan pada rekursi (Divide and Conquer): Nilai n dikalikan dengan hasil dari pemanggilan fungsi faktorial lagi dengan nilai lebih kecil (n-1).