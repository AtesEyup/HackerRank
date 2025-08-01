package com.eyp.algorithms.hackerrank

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eyp.algorithms.hackerrank.algorithms.week2.countingSort
import com.eyp.algorithms.hackerrank.algorithms.week2.countingValleys
import com.eyp.algorithms.hackerrank.algorithms.week2.diagonalDifference
import com.eyp.algorithms.hackerrank.algorithms.week2.flippingBits
import com.eyp.algorithms.hackerrank.algorithms.week2.marsExploration
import com.eyp.algorithms.hackerrank.algorithms.week2.pangrams

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        breakingRecords fonskiyonu
//        main(arrayOf("10", "5", "20", "20", "4", "5", "2", "25", "1"))

//        camelcase fonksyionu
//        main(arrayOf("S;V;iPad", "C;M;mouse pad", "C;C;code swarm", "S;C;OrangeHighlighter","C;M;santa claus","S;M;sweatTea()"))

//        divisibleSumPairs fonksyionu
//        main(arrayOf("6", "3", "1", "3", "2", "6", "1", "2"))

//        lonelyInteger(arrayOf(1, 1, 2))

//        main(
//            arrayOf(
//                "1",
//                "1",
//                "1", "2",
//                "3", "4"
//            )
//        )

        //gradingStudents fonksiyonu
//        gradingStudents(arrayOf(4, 73, 67, 38, 33))

        //flippingBits fonksiyonu
//        flippingBits(3)

        //diagonalDifference fonksiyonu
//        diagonalDifference(arrayOf(arrayOf(11, 2, 4), arrayOf(4, 5, 6), arrayOf(10, 8, -12)))

        //countingSort fonksiyonu
//        countingSort(arrayOf(1, 1, 3, 2, 1))

        //countingValleys fonksiyonu
//        countingValleys(8, "UDDDUDUU")

        //pangrams fonksiyonu
//        pangrams("We promptly judged antique ivory buckles for the next prize")

        //marsExploration fonksiyonu
        marsExploration("SOSSPSSQSSOR")
    }
}