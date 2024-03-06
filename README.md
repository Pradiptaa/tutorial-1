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

<details>
<summary>

## Modul 3
</summary>

1. <strong> Explain what principles you apply to your project! </strong> <br>

   - SRP: Memisahkan `CarController` dari `ProductController` untuk memfokuskan kepada Car saja, sehingga memudahkan development.
   - DIP dan OCP: Menggantikan `CarServiceImpl` dengan `CarService`, memudahkan perubahan dan penambahan komponen tanpa mengubah kode yang sudah ada.
   - LSP: Menghindari inheritance langsung dari `ProductController` ke `CarController`, memungkinkan subclass menggantikan superclass tanpa mengubah fungsionalitas.
   - ISP: Memastikan setiap interface fokus pada satu set, sehingga terhindar dari ketergantungan pada fungsi yang tidak digunakan. <br><br>
2. <strong> Explain the advantages of applying SOLID principles to your project with examples.</strong> <br>
   
   - SRP: Penerapan SRP memperjelas kode dan memudahkan pemahaman akan kode yang dibuat dengan memfokuskan setiap kelas dengan sebuah functionality. 
   - OCP: Penerapan OCP mempermudah untuk menambah functionality tanpa mengubah keseluruhan kode, sehingga mengurangi resiko error. OCP juga mempermudah untuk re-use komponen kode dengan efektif.
   - LSP: Penerapan LSP membuat program lebih reliable karena menerapkan konsistensi perilaku seluruh class.
   - ISP: Penerapan ISP meminimalisir kemungkinan untuk perlu mengubah suatu bagian kode ketika ingin mengubah bagian lainnya.
   - DIP: Penerapan DIP dapat meningkatkan kemudahan testing karena mengutamakan kelonggaran integrasi antar komponen. <br><br>
3. <strong> Explain the disadvantages of not applying SOLID principles to your project with examples. </strong> <br>
   Tidak menerapkan prinsip SOLID dalam pengembangan perangkat lunak dapat menyebabkan berbagai kerugian, termasuk sistem yang terlalu bergantung satu sama lain (tight coupling), sulitnya pengujian komponen karena ketergantungan yang kompleks, rendahnya kemampuan untuk menggunakan kembali kode, sistem menjadi kaku dan rapuh sehingga sulit untuk diubah atau diperluas, kode menjadi terlalu kompleks, serta kesulitan dalam penskalaan. Semua ini pada akhirnya meningkatkan waktu dan biaya pengembangan. Menerapkan prinsip SOLID membantu menciptakan basis kode yang lebih fleksibel, dapat diukur, dan mudah dipelihara, memudahkan pembaruan dan peningkatan selama siklus hidup perangkat lunak.
</details>

<details>
<summary>

## Modul 4
</summary>

1. <strong> Reflect based on Percival (2017) proposed self-reflective questions (in “Principles and Best Practice of Testing” submodule, chapter “Evaluating Your Testing Objectives”), whether this TDD flow is useful enough for you or not. If not, explain things that you need to do next time you make more tests. </strong> <br>
   Penggunaan Test-Driven Development (TDD) yang saya terapkan terbukti efektif dalam memastikan program berfungsi dengan baik, sekaligus memberikan kepercayaan untuk melakukan modifikasi kode. Tes-tes yang dikembangkan tidak hanya memperkuat kualitas program tetapi juga meningkatkan kemudahan dalam pemeliharaan, memungkinkan penataan kode yang lebih terstruktur dan desain yang lebih apik, dengan menyesuaikan keseimbangan antara tes unit dan integrasi berdasarkan feedback yang diperoleh. Meskipun demikian, saya terus berupaya untuk meningkatkan, terutama dalam hal efisiensi tes integrasi, guna memastikan proses pengembangan berjalan lebih cepat dan mulus. <br><br>
2. <strong> You have created unit tests in Tutorial. Now reflect whether your tests have successfully followed F.I.R.S.T. principle or not. If not, explain things that you need to do the next time you create more tests. </strong> <br>
   Tes yang saya kembangkan mengadopsi prinsip F.I.R.S.T dengan efektif, menjalankan mereka secepat mungkin untuk tidak menghambat produktivitas dan membedakan antara tes unit dengan fungsional tanpa menunggu ketergantungan eksternal pada tes unit. Setiap tes beroperasi secara independen, tanpa interaksi atau ketergantungan silang, dan memberikan hasil yang konsisten melalui penggunaan teknik Test Double untuk isolasi. Dengan asertasi yang tegas, tes saya menjamin validasi yang kuat dan mencakup spektrum luas skenario, termasuk jalur keberhasilan dan kegagalan serta potensi kesalahan, menjadikannya komprehensif dan responsif terhadap kebutuhan pengujian.
</details>
