package dev.tnavarro.app.ui

import android.graphics.drawable.Animatable2
import android.graphics.drawable.AnimatedVectorDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import dev.tnavarro.app.R

class IndeterminateProgressActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.indeterminate_progress_layout)

//        findViewById<ImageView>(R.id.progress_bar_animated).apply {
//            setImageResource(R.drawable.)
//            val drawable = drawable
//
//            if (drawable is AnimatedVectorDrawable) {
//                drawable.start()
//            }
//        }

        val imageView = findViewById<ImageView>(R.id.progress_bar_animated)
        val drawable = imageView.drawable

        if (drawable is AnimatedVectorDrawable) {
            drawable.registerAnimationCallback(object : Animatable2.AnimationCallback() {
                override fun onAnimationEnd(drawable: Drawable?) {
                    (drawable as? AnimatedVectorDrawable)?.start()
                }
            })
            drawable.start()
        }

//        val imageView = findViewById<ImageView>(R.id.progress_bar_animated)
//        val drawable = imageView.drawable
//
//        if (drawable is AnimatedVectorDrawable) {
//            drawable.start()
//        }

    }




}