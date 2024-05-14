package com.phwnam.lab2_ph35329

class trenlop {
}
fun main() {
    // khai báo mảng và sử dụng mảng

    val arrX = intArrayOf(1,2,3,4)
    println(arrX.asList())

    println("Các phần tử trong mảng X: ")
    //cách 1
    for (x in arrX){
        println(x)
    }
    arrX[0] = 5
    arrX[1] = 7
    arrX[arrX.size -1] = 8
    //cách 2
    for (i in arrX.indices){
        println("Phần tử thứ $i trong mảng x là: ${arrX[i]}")
    }

    //danh sách
    val listX = arrX.asList().toMutableList()
    listX.add(6)

    //cách 2
    for(i in listX.indices){
        println("Phần tử thứ $i trong list X: ${listX[i]}")
    }

    val listY = mutableListOf(3,4,5,6)
    listY.add(0,1)
    listY.removeAt(listY.size -1)
    println("ListY: $listY")

    println("Nhập tên SV: ")
    var s = readLine()
    if(s != null){
        println(getMssv(s))
    }
}



private val MAP_DSSV : Map<String, String> = mutableMapOf("Nguyen Van Long" to "PH11311", "Nguyễn Văn Bình" to "PH11261", "Nguyễn Văn Nhất" to "PH32553")

// cú pháp when trong kotlin (thay thế switch case)
fun getMssv(tenSV: String) : String? {
    when (tenSV){
        "Nguyen Van Long" -> {
            val mssv = MAP_DSSV.get(tenSV)
            return mssv
        }
        "Nguyễn Văn Bình" -> {
            return MAP_DSSV.get(tenSV)
        }
    }
    return "Không có dữ liệu"
}