package org.example

import org.bytedeco.opencv.opencv_core.*
import org.bytedeco.opencv.global.opencv_imgproc.*
import org.bytedeco.opencv.global.opencv_imgcodecs.*


fun main() {
    val image = imread("src/image.jpg")

    if (image.empty()) {
        return
    }

    val grayImage = Mat()
    cvtColor(image, grayImage, COLOR_BGR2GRAY)

    imwrite("gray_image.jpg", grayImage)
    println("done")
}