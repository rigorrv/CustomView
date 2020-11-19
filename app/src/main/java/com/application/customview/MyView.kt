package com.application.customview


import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout


class MyView : FrameLayout {
    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyle: Int
    ) : super(context!!, attrs, defStyle) {
        initView()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(
        context!!,
        attrs
    ) {
        initView()
    }

    constructor(context: Context?) : super(context!!) {
        initView()
    }

    private fun initView() {
        View.inflate(context, R.layout.color_layout, this)
    }
}