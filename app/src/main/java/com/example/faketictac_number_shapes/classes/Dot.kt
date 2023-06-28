package com.example.faketictac_number_shapes.classes

import java.util.Random
import android.graphics.Paint
import android.graphics.Canvas

/**
 * Class represents dot object to be drawn on the screen.
 */
class Dot(private val radius: Float) {

    /**
     * Class instance for random number generation.
     */
    private val random = Random()

    /**
     * Method is responsible for drawing dots withing given square.
     */
    fun drawDots(canvas: Canvas, square: Square, painter: Paint) {
        val dotNumber = random.nextInt(10)

        for (i in 0 until dotNumber) {
            val x = square.randomPosX(radius)
            val y = square.randomPosY(radius)

            canvas.drawCircle(x, y, radius, painter)
        }
    }
}
