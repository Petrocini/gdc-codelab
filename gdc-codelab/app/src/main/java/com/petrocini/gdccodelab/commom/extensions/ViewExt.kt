package com.petrocini.gdccodelab.commom.extensions

import android.view.View
import android.view.animation.Animation

fun View.startAnimation(anim: Animation, onEnd: () -> Unit) {
    anim.setAnimationListener(object : Animation.AnimationListener {
        override fun onAnimationStart(p0: Animation?) = onEnd()

        override fun onAnimationEnd(p0: Animation?) = Unit

        override fun onAnimationRepeat(p0: Animation?) = Unit
    })
    this.startAnimation(anim)
}

fun View.SetVisible(show: Boolean) {
    if (show) this.visibility = View.VISIBLE else this.visibility = View.GONE
}