package com.phwnam.lab2_ph35329


fun main() {
    var year = 0
    var s: String?
    println("Kiểm tra năm nhuận")
    do{
        print("Nhập năm: ")
        s = readLine()
        while (s == null || s.toInt() < 0){
            print("Nhập sai năm, nhập lại: ")
            s = readLine()
        }
        year = s.toInt()
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ){
            println("Năm $year là năm nhuận")
        }else{
            println("Năm $year không phải là năm nhuận")
        }
        print("Tiếp tục? y/n: ")
        s = readLine()
        if (s == "n")
            break;
    }while (true)
    println("Kết thúc chương trình")
}
class Bai3 {
}