package com.example.faketictac_number_shapes.classes

import java.util.Random
import android.graphics.Paint
import android.graphics.Point
import android.graphics.Canvas

/**
 * Class represents square object to be drawn on the screen.
 */
class Square(private val topLeft: Point, private val bottomRight: Point) {

    /**
     * Method provides square width.
     */
    private fun width() : Int = bottomRight.x - topLeft.x

    /**
     * Method provides square height.
     */
    private fun height() : Int = bottomRight.y - topLeft.y

    /**
     * Class instance for random number generation.
     */
    private val random = Random();

    /**
     * Method is responsible for drawing square on canvas.
     */
    fun drawSquare(canvas: Canvas, squarePaint: Paint) {
        canvas.drawRect(
            topLeft.x.toFloat(),
            topLeft.y.toFloat(),
            bottomRight.x.toFloat(),
            bottomRight.y.toFloat(),
            squarePaint
        )
    }

    /**
     * Method generates random X coordinate inside the square.
     */
    fun randomPosX(dotRadius: Float) : Float =
        random.nextFloat() * (width() - 2 * dotRadius) + topLeft.x + dotRadius

    /**
     * Method generates random Y coordinate inside the square.
     */
    fun randomPosY(dotRadius: Float) : Float =
        random.nextFloat() * (height() - 2 * dotRadius) + topLeft.y + dotRadius
}
