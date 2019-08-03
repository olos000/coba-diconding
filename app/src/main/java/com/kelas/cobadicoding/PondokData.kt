package layout

object PondokData {
    var data = arrayOf(
        arrayOf(
            "Pondok Assalaam",
            "adalah sebuah pondok pesantren Islam yang berlokasi di desa Pabelan kecamatan Kartasura Kabupaten Sukoharjo, Jawa Tengah. Pondok Pesantren Modern Islam Assalaam, biasa disingkat dengan PPMI Assalaam, adalah lembaga pendidikan swasta Islam yang berada di bawah naungan Yayasan Majelis Pengajian Islam Surakarta (YMPIS).",
            "https://upload.wikimedia.org/wikipedia/id/c/cf/Logo_assalaam.jpg"
        ),
        arrayOf(
            "Pondok Pesantren Langitan",
            "adalah salah satu lembaga pendidikan Islam tertua di Indonesia. Berdirinya lembaga ini jauh sebelum Indonesia merdeka yaitu tepatnya pada tahun 1852, di Dusun Mandungan, Desa Widang, Kecamatan Widang, Kabupaten Tuban, Jawa Timur. Komplek Pondok Pesantren Langitan terletak di samping bengawan Solo dan berada di atas areal tanah seluas kurang lebih 7 hektare.",
            "https://upload.wikimedia.org/wikipedia/id/8/81/Langitan_Clr.jpg"
        ),
        arrayOf(
            "Pondok Al Ma’soem Bandung",
            "Lulusan Al Ma’soem dapat dipastikan tahfidz Al Qur’an juz ke-30, dan dengan dukungan berbagai program yang diselenggarakan setiap lulusan diproyeksikan dan dimotivasi agar mampu menghapal Al Qur’an lebih dari 1 juz (juz ke-30). Program tahfidz Qur’an di Al Ma’soem telah berjalan sejak tahun 2015, dan telah menghasilkan banyak hafiz-hafiz yang baik dan berprestasi.",
            "https://almasoem.sch.id/wp-content/uploads/2015/01/bendera-yayasan-.jpg"
        ),
        arrayOf(
            "Pondok Pesantren Al-Khoirot",
            "PPA Malang adalah salah satu lembaga pendidikan Islam di Indonesia yang ada sejak lama. Lembaga ini didirikan pada tahun 1963, di desa Karangsuko, kecamatan Pagelaran (dulu, Gondanglegi), kabupaten Malang, Jawa Timur. Kampus Pondok Pesantren Al-Khoirot terletak di antara jalan raya Kepanjen-Gondanglegi di atas areal tanah seluas kurang lebih 2.5 hektare",
            "https://upload.wikimedia.org/wikipedia/commons/7/7a/Apel_Hari_Santri_22_Oktober_2016.jpg"
        ),
        arrayOf(
            "Pondok Pesantren Musthafawiyah",
            "merupakan salah satu pondok pesantren yang terletak di kabupaten Mandailing Natal dan berlokasi di desa Purba Baru, Lembah Sorik Merapi, Mandailing Natal. Merupakan salah satu pesantren tertua di pulau Sumatra dengan usia sekitar 1 abad dan telah banyak mencetak ulama di Indonesia.",
            "https://upload.wikimedia.org/wikipedia/id/0/0f/Musthafawiyah.jpg"
        ),
        arrayOf(
            "Pondok Pesantren Sunan Drajat",
            "didirikan pada tanggal 7 September 1977 di desa Banjarwati Kecamatan Paciran Kabupaten Lamongan oleh KH Abdul Ghofur Menilik dari namanya pondok pesantren ini memang mempunyai ikatan historis, psikologis, dan filosofis yang sangat lekat dengan nama Kanjeng Sunan Drajat",
            "https://upload.wikimedia.org/wikipedia/id/e/e6/Logo_Pondok_Pesantren_Sunan_Drajat.jpeg"
        ),
        arrayOf(
            "Pondok Pesantren Al-Falah",
            "didirikan pada tahun 1963 oleh KH Abdur Rosyid, pada awal pendirian Pesantren tersebut diberi nama Pondok Pesantren Tarbiyatul Athfal, menurut anjuran K. Rohmat Suyuti Demak (pendiri PP.Miftahul Falah Kalisusukan Demak) yang merupakan guru KH. Abdur Rosyid seyogyanya Pondok Pesantren Tarbiyatul Athfal diganti dengan nama yang mirip pesantrennya Mbah Suyuti,",
            "https://upload.wikimedia.org/wikipedia/id/1/13/Logo_Al-Falah2.png"
        ),
        arrayOf(
            "Pondok Pesantren An-Nawawi",
            " adalah salah satu lembaga pendidikan Islam di Dusun Berjan, Desa Gintungan, Kecamatan Gebang, Purworejo, Jawa Tengah. Pesantren ini mengajarkan pendidikan agama maupun pendidikan umum dengan menggunakan sistem madrasi atau klasikal dan pendidikan formal. ",
            "https://upload.wikimedia.org/wikipedia/commons/1/14/Logo_Pesantren_An-Nawawi.jpg"
        ),
        arrayOf(
            "Pondok Pesantren Daarut Tauhiid",
            "berdiri sejak tanggal 4 September 1990, sesuai tanggal penerbitan Akta Notaris Wiratni Ahmadi, SH., tentang pendirian Yayasan Daarut Tauhiid. Dalam hal ini dapat difahami bahwa Yayasan Daarut Tauhiid merupakan badan hukum pengelola Pesantren Daarut Tauhiid. ",
            "https://upload.wikimedia.org/wikipedia/id/b/b7/Daaruttauhiid.png"
        ),
        arrayOf(
            "Pondok Pesantren Al-Mubarok Serang",
            "Berawal dari tumbangnya orde Baru pada tahun 1996-1997 melihat keberutalan massa, tawuran pelajar, dan maraknya penggunaan obat-obat terlarang ( Narkotika ) yang hampir menguasai belahan dunia, khususnya Indonesia, maka Bapak KH. Mahmudi, MSI merasa terpanggil untuk ikut serta memperbaiki moral anak bangsa dengan mendirikan lembaga pendidikan Islam yang disebut Pondok Pesantren.\n" +
                    "\n" +
                    "Pada tahun 1997, setelah Dia melaksanakan ibadah haji ke tanah suci Makkah, mulailah dia menggarap tanah yang seluas 9,340 M2, yang masih berbentuk rawa dan dikenal angker ( Jawa ) dan rawan di daerah Sumur Pecung Serang. ",
            "https://upload.wikimedia.org/wikipedia/id/8/85/Pondok_Pesantren_Al-mubarok_Serang.jpg"
        )


    )
    val listData: ArrayList<Pondok>
        get() {
            val list = ArrayList<Pondok>()
            for (aData in data) {
                val pondok = Pondok()
                pondok.name = aData[0]
                pondok.from = aData[1]
                pondok.photo = aData[2]
                list.add(pondok)
            }
            return list
        }
}

