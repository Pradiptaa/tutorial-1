<details>
<summary>

## Modul 1
</summary>

### Refleksi 1
Clean code principles yang sudah diterapkan adalah penamaan variabel dan fungsi yang singkat padat dan jelas, sehingga kode dapat dijelaskan dengan sendirinya tanpa memerlukan comments. Sementara dengan secure coding practices yang telah diterapkan adalah dengan menggunakan method POST untuk membuat product. Terkait dengan kesulitan yang ditemukan adalah ketika pengimplementasian edit dan delete, karena masih bingung dengan apa yang diperlukan, tetapi setelah belajar dan mencoba mengerti terkait fungsi tiap kode, solusi masalah tersebut ditemukan.

### Refleksi 2
1. Unit test membuat saya percaya diri akan kode yang saya ciptakan. Menurut saya, jumlah unit test yang dibuat di kelas harus menyesuaikan tingkat kesulitan soal. Seperti menyesuaikan jumlah metode yang digunakan. Memiliki code coverage 100% tidak menjamin Meskipun semua bagian kode telah diuji, masih mungkin terdapat kesalahan logis atau kasus uji penting yang luput diuji.
2. Saat menambahkan fungsionalitas baru, perlu mementingkan kejelasan kode. Penambahan Functional Test baru dengan kelas Java yang serupa dengan Functional Test sebelumnya mungkin akan mengakibatkan duplikasi kode dan kompleksitas yang tidak perlu. Untuk meningkatkan kebersihan kode, diperlukan agar tidak mengulangi apa yang sudah pernah ditulis dengan mengumpulkan prosedur dan variabel instance ke class yang dapat digunakan secara bersamaan oleh berbagai Functional Test.

</details>

<details>
<summary>

## Modul 2
</summary>

1. <strong>List the code quality issue(s) that you fixed during the exercise and explain your strategy on fixing them.</strong>
   - Error pada percobaan code scanning: Mencoba menggunakan code scanning lain
   - Error pada deployment: Pemeriksaan ulang keseluruhan kode dan fungsionalitasnya
   - Code coverage 100% pada test: Percobaan dan perbaikan berkali-kali 
<br><br>
2. <strong>Look at your CI/CD workflows (GitHub)/pipelines (GitLab). Do you think the current implementation has met the definition of Continuous Integration and Continuous Deployment? Explain the reasons (minimum 3 sentences)!</strong>
   - Kode yang telah saya kerjakan sudah menerapkan Continous Integration (CI) karena sudah mengatur kode dengan teratur dan menjalankan tes otomatis untuk mendeteksi error dengan cepat.
   - Kode yang telah saya kerjakan belum menerapkan Continous Deployment (CD) dengan kuat, karena deployment yang dilakukan masih gagal. Namun, kode ini sudah melalui tahap testing, staging, dan production, sehingga sudah mengimplementasikan Continous Deployment (CD).



</details>

