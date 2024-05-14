package com.phwnam.lab2_ph35329

class trenlop1 {
}

fun main (){
    val xe1 = Xehoi("Xe 1",1000f)
    val xe2 = Xehoi("Xe 2",1500f, 1996)

    println(xe1.hienThiThongTinXe())
    println(xe2.hienThiThongTinXe())

    val tenSV : String? = "Nguyễn Phương Nam"
    getMSSV(tenSV!!)

    xe1.tenXe += "Tên xe mới 2024"
}

fun getMSSV (tenSV: String){
    if(tenSV == null){
        println("Tên SV không được null")
    }else{
        println("Tên SV là: $tenSV")
    }
}

class Xehoi (var tenXe : String, var giaXe: Float){

    var namSX : Int? = 0
    constructor(tenXe: String, giaXe: Float, namSX: Int) : this(tenXe, giaXe){
        if(namSX != null)
            this.namSX = namSX
    }

    fun hienThiThongTinXe () : String{
        if(namSX == null || namSX == 0){
            return "Tên xe: $tenXe, giá xe: $giaXe"
        }else{
            return "Tên xe: $tenXe, giá xe: $giaXe, năm sản xuất: ${namSX!!}"
        }
    }
}