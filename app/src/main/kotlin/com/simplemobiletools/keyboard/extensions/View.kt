package com.simplemobiletools.keyboard.extensions

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

fun RecyclerView.onScroll(scroll: (Int) -> Unit) {
    addOnScrollListener(object : RecyclerView.OnScrollListener() {
        override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
            super.onScrolled(recyclerView, dx, dy)
            scroll(computeVerticalScrollOffset())
        }
    })
}

fun View?.removeSelf() {
    this ?: return
    val parentView = parent as? ViewGroup ?: return
    parentView.removeView(this)
}
