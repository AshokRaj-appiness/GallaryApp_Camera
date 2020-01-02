package com.example.gallaryapp

import android.Manifest.permission.CAMERA
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.os.Build



class MainActivity : AppCompatActivity() {
    lateinit var myBitmap: Bitmap
    lateinit var picUri: Uri




    private val ALL_PERMISSIONS_RESULT = 107

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}