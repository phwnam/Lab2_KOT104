package com.phwnam.lab2_ph35329

fun main() {
    var a = 0.0
    var b = 0.0
    print("Nhập a: ")
    var s = readLine()
    if (s != null) a = s.toDouble()
    print("Nhập b: ")
    s = readLine()
    if (s != null) b = s.toDouble()
    if (a == 0.0 && b == 0.0){
        println("Vô số nghiệm")
    } else if (a == 0.0 && b != 0.0){
        println("Vô nghiệm")
    } else {
      var x = -b/a
        println("Nghiệm x = $x")
    }
}