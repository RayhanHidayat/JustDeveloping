package com.rayhan.infobuah.utils

import com.rayhan.infobuah.R
import com.rayhan.infobuah.data.FruitEntity

object DataDummy {
    fun generateDummyFruits(): ArrayList<FruitEntity> {
        val fruits = ArrayList<FruitEntity>()

        fruits.add(
            FruitEntity(
                "Semangka",
                R.drawable.art_rachen_wtrmln,
                "Citrullus lanatus",
                "Semangka (juga dikenal sebagai tembikai atau mendikai) " +
                        "(Citrullus lanatus, suku ketimun-ketimunan atau Cucurbitaceae) " +
                        "adalah tanaman merambat yang berasal dari daerah setengah gurun di " +
                        "Afrika bagian selatan. Tanaman ini masih sekerabat dengan labu-labuan " +
                        "(Cucurbitaceae), melon (Cucumis melo) dan ketimun (Cucumis sativus). " +
                        "Semangka biasa dipanen buahnya untuk dimakan segar atau dibuat jus.",
                "Tinggi",
                "Tinggi"
            )
        )

        fruits.add(
            FruitEntity(
                "Anggur",
                R.drawable.bill_williams_grape,
                "Vitis labrusca",
                "Anggur merupakan tanaman buah berupa perdu merambat yang termasuk ke " +
                        "dalam keluarga Vitaceae. Buah ini biasanya digunakan untuk membuat jus" +
                        " anggur, jelly, minuman anggur, minyak biji anggur dan kismis, atau " +
                        "dimakan langsung. Buah ini juga dikenal karena mengandung banyak senyawa" +
                        "polifenol dan resveratol yang berperan aktif dalam berbagai metabolisme" +
                        "tubuh, serta mampu mencegah terbentuknya sel kanker dan berbagai" +
                        "penyakit lainnya.",
                "Tinggi",
                "Rendah"
            )
        )

        fruits.add(
            FruitEntity(
                "Pepaya",
                R.drawable.bon_vivant_ppy,
                "Carica papaya",
                "Pepaya (Carica papaya L.), atau betik adalah tumbuhan yang berasal dari" +
                        " Meksiko bagian selatan dan bagian utara dari Amerika Selatan, dan kini" +
                        "menyebar luas dan banyak ditanam di seluruh daerah tropis untuk diambil" +
                        "buahnya. C. papaya adalah satu-satunya jenis dalam genus Carica.",
                "Tinggi",
                "Rendah"
            )
        )

        fruits.add(
            FruitEntity(
                "Pisang",
                R.drawable.charles_deluvio_bnn,
                "Musa acuminata",
                "Pusat keragaman utama pisang terletak di daerah Malesia (Asia Tenggara," +
                        " Papua dan Australia tropika). Pusat keragaman minor juga terdapat di" +
                        " Afrika tropis. Tumbuhan ini menyukai iklim tropis dan lembap, terutama" +
                        " di dataran rendah. Di daerah dengan hujan merata sepanjang tahun, " +
                        "produksi pisang dapat berlangsung tanpa mengenal musim. Indonesia, " +
                        "Kepulauan Pasifik, negara-negara Amerika Tengah, dan Brasil dikenal" +
                        "sebagai negara utama pengekspor pisang.",
                "Rendah",
                "Menengah"
            )
        )

        fruits.add(
            FruitEntity(
                "Kiwi",
                R.drawable.dan_bucko_kw,
                "Actinidia deliciosa",
                "Kiwi adalah sejenis buah beri yang dapat dimakan dari tanaman merambat " +
                        "berkayu dalam genus Actinidia. Actinidia asli berasal dari Shaanxi, " +
                        "Tiongkok. Buah kiwi yang normal berbentuk oval, kira-kira sebesar telur" +
                        "ayam . Buah ini kaya serat, kulit berwarna hijau-kecokelatan dan daging" +
                        "buah berwarna hijau terang atau keemasan dengan biji kecil, hitam, dan" +
                        "bisa dimakan. Tekstur buah ini sangat halus dan rasanya yang unik, saat" +
                        "ini buah kiwi sudah ditanam di berbagai negara.",
                "Tinggi",
                "Rendah"
            )
        )

        fruits.add(
            FruitEntity(
                "Belimbing",
                R.drawable.hugo_kruip_strfrt,
                "Averrhoa carambola",
                "Belimbing / Belimbing Manis adalah tumbuhan penghasil buah berbentuk " +
                        "khas yang berasal dari Indonesia, India, dan Sri Langka. Saat ini, " +
                        "belimbing telah tersebar ke penjuru Asia Tenggara, Republik Dominika, " +
                        "Brasil, Peru, Ghana, Guyana, Tonga, dan Polinesia. Usaha penanaman " +
                        "secara komersial dilakukan di Amerika Serikat, yaitu di Florida Selatan" +
                        "dan Hawaii. Di Indonesia, buah ini menjadi ikon kota Depok, Jawa Barat," +
                        "sejak tahun 2007.",
                "Tinggi",
                "Rendah"
            )
        )

        return fruits
    }
}