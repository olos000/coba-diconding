package com.kelas.cobadicoding

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detail.*

class Detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val name = intent.getStringExtra("nama")
        val from = intent.getStringExtra("from")
        val photo = intent.getStringExtra("photo")

        Glide.with(applicationContext)
            .load(photo)
            .apply(RequestOptions().override(55, 55))
            .into(
                detail_photo
            )

        detail_photo.setTag(photo)
        text_nama.setText(name)
        text_from.setText(from)

    }
}
