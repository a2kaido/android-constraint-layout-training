package io.github.a2kaido.constraint.layout.carousel.view

import android.content.Context
import android.support.v7.widget.CardView
import android.util.AttributeSet

class CustomWidthCardView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : CardView(context, attrs, defStyleAttr) {

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val widthSize = MeasureSpec.getSize(widthMeasureSpec)
        val small = MeasureSpec.makeMeasureSpec(widthSize - 60, MeasureSpec.EXACTLY)

        super.onMeasure(small, heightMeasureSpec)
    }
}