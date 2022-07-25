package com.example.pick_image

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.example.pick_image.pick_image.PickImageFromCamera
import com.example.pick_image.pick_image.PickImageFromGallery
import com.example.pick_image.ui.theme.PickimageTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PickimageTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                 PickImageFromGallery()
                   // PickImageFromCamera()
                }
            }
        }
    }
}
