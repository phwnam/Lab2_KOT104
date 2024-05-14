package com.phwnam.lab2_ph35329

import java.util.Scanner
import kotlin.system.exitProcess

class Bai4 {
}

class Sinhvien(var tenSV: String, var mssv: String, var diemTB: Float) {
    var daTotNghiep: Boolean? = null
    var tuoi: Int? = 0

    constructor(tenSV: String, mssv: String, diemTB: Float, daTotNghiep: Boolean, tuoi: Int) : this(
        tenSV,
        mssv,
        diemTB
    ) {
        if (daTotNghiep !== null) this.daTotNghiep = daTotNghiep
        if (tuoi !== null) this.tuoi = tuoi
    }

    fun hienThiSinhVien(): String {
        if (daTotNghiep == null || tuoi == null || tuoi == 0) {
            return "Tên: $tenSV, MSSV: $mssv, Điểm TB: $diemTB"
        } else {
            return "Tên: $tenSV, MSSV: $mssv, Điểm TB: $diemTB, Đã tốt nghiệp: $daTotNghiep, Tuổi: $tuoi"
        }
    }

}

var danhSachSV = mutableListOf<Sinhvien>()

fun themSinhVien() {
    val scanner = Scanner(System.`in`)
    do {
        println("Thêm sinh viên")
        print("Nhập tên sinh viên: ")
        var tenSV = scanner.nextLine()
        print("Nhập mssv: ")
        var mssv = scanner.nextLine()
        print("Nhập điểm TB: ")
        var diemTB = scanner.nextFloat()
        scanner.nextLine()
        print("Đã tốt nghiệp? (true/false): ")
        var daTotNghiep = scanner.nextBoolean()
        scanner.nextLine()
        print("Nhập tuổi: ")
        var tuoi = scanner.nextInt()
        scanner.nextLine()

        var sv = Sinhvien(tenSV, mssv, diemTB, daTotNghiep, tuoi)
        danhSachSV.add(sv)
        println("Thêm thành công")

        print("Thêm tiếp? (y/n): ")
        var tiepTuc = scanner.nextLine()
        if (tiepTuc == "n") {
            println("Kết thúc chương trình")
        }
    } while (tiepTuc == "y")
    menu()
}

fun xoaSinhVien() {
    do {
        println("Xoá sinh viên theo Mã SV")
        print("Nhập mã SV: ")
        var mssv = readLine()
        var SVxoa = danhSachSV.find { it.mssv == mssv }
        if (SVxoa == null) {
            println("Mã SV không tồn tại")
        } else {
            danhSachSV.remove(SVxoa)
            println("Xoá thành công")
        }
        print("Xoá tiếp? (y/n): ")
        var tiepTuc = readLine()
        if (tiepTuc == "n") {
            println("Kết thúc chương trình")
        }
    }while (tiepTuc == "y")
    menu()
}

fun dssv() {
    danhSachSV.forEach { sv -> println(sv.hienThiSinhVien()) }
    print("Trở về menu? (y/n): ")
    var s = readLine()
    if (s == "y") {
        menu()
    }else{
        println("Kết thúc chương trình")
    }
}

fun menu() {
    println("Quản lý sinh viên")
    println("-------------------")
    println("1. Thêm sinh viên")
    println("2. Danh sách sinh viên")
    println("3. Xoá sinh viên")
    println("0. Thoát")
    println("-------------------")
    print("Lựa chọn: ")
    var s = readLine()
    when (s) {
        "1" -> themSinhVien()
        "2" -> dssv()
        "3" -> xoaSinhVien()
        "0" -> {
            println("Kết thúc chương trình")
            exitProcess(0)
        }
        else -> {
            println("Lựa chọn không hợp lệ")
            menu()
        }
    }
}


fun main() {
    println(menu())

}

