package com.eyp.algorithms.hackerrank

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eyp.algorithms.hackerrank.algorithms.week2.countingSort
import com.eyp.algorithms.hackerrank.algorithms.week2.countingValleys
import com.eyp.algorithms.hackerrank.algorithms.week2.diagonalDifference
import com.eyp.algorithms.hackerrank.algorithms.week2.flippingBits
import com.eyp.algorithms.hackerrank.algorithms.week2.marsExploration
import com.eyp.algorithms.hackerrank.algorithms.week2.pangrams
import com.eyp.algorithms.hackerrank.algorithms.week3.migratoryBirds
import com.eyp.algorithms.hackerrank.algorithms.week3.permutingTwoArrays
import com.eyp.algorithms.hackerrank.algorithms.week3.sockMerchant
import com.eyp.algorithms.hackerrank.algorithms.week3.subArrayDivision
import com.eyp.algorithms.hackerrank.algorithms.week3.xorStrings3

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
//        marsExploration("SOSSPSSQSSOR")

        //permutingTwoArrays fonksiyonu
//        permutingTwoArrays(10, arrayOf(2, 1, 3), arrayOf(7, 8, 9))

        //subArrayDivision 2 fonksiyonu
//        subArrayDivision(arrayOf(2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1),18,7)

        //xorStrings fonksiyonu
//        xorStrings3(arrayOf("10101", "00101"))

        //stockMerchant fonksiyonu
//        sockMerchant(9, arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20))

        //migratoryBirds fonksiyonu
        migratoryBirds(arrayOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4))
    }
}