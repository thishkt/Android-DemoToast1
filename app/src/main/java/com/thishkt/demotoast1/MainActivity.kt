package com.thishkt.demotoast1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_show_toast.setOnClickListener {
            Toast.makeText(this, "哈囉！提示訊息", Toast.LENGTH_LONG).show()
        }
    }
}
