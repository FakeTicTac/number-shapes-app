package com.example.faketictac_number_shapes.views

import android.view.View
import android.graphics.Paint
import android.graphics.Color
import android.graphics.Point
import android.content.Context
import android.graphics.Canvas
import com.example.faketictac_number_shapes.classes.Dot

import com.example.faketictac_number_shapes.classes.Square

/**
 * Class responsible for view with squares and dots on canvas.
 */
class SquareDotsView(context: Context) : View(context) {

    /**
     * Class instance to hold the style and color information about how to draw squares.
     */
    private val squarePainter = Paint();

    /**
     * Class instance to hold the style and color information about how to draw dots.
     */
    private val dotPainter = Paint();

    /**
     * Class instance to hold dot logic.
     */
    private val dot = Dot(10f)

    /**
     * Collection of displayed squares.
     */
    private val squares = mutableListOf<Square>()

    /**
     * View constructor. Defines colors of dot and square painters.
     */
    init {
        squarePainter.color = Color.BLACK
        dotPainter.color = Color.RED
    }

    /**
     * Method is used for drawing shapes on the screen.
     */
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        /**
         * Draw all squares on the screen.
         */
        for (square in squares) {
            square.drawSquare(canvas, squarePainter)
            dot.drawDots(canvas, square, dotPainter)
        }
    }

    /**
     * Method is responsible for adding square to the view.
     */
    fun addSquare(startPoint: Point, endPoint: Point) {
        squares.add(Square(startPoint, endPoint))
        invalidate()
    }
}
