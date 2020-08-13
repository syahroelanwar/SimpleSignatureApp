package com.example.signaturepad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submit.setOnClickListener {
            if (signature_view.isBitmapEmpty) {
                Toast.makeText(this, "Signature Is Empty", Toast.LENGTH_SHORT).show();
            } else {
                val bitmap = signature_view.signatureBitmap
                img_signature.setImageBitmap(bitmap)
            }
        }

        clear.setOnClickListener {
            signature_view.clearCanvas()
            img_signature.setImageResource(0)
        }
    }
}
