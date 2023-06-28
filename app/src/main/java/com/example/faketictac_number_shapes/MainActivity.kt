package com.example.faketictac_number_shapes

import android.os.Bundle
import android.graphics.Point
import androidx.activity.ComponentActivity

import com.example.faketictac_number_shapes.views.SquareDotsView

/**
 * Number Shapes game main activity view.
 */
class MainActivity : ComponentActivity() {

    /**
     * Method is responsible for loading activity view.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val squareDotsView = SquareDotsView(this);
        setContentView(squareDotsView);

        squareDotsView.addSquare(Point(100, 100), Point(300, 300))
    }
}
