package main

import controler.EmployeeManagement
import java.lang.Exception

fun main() {
    val manager = EmployeeManagement()
    var a = true
    var choose: Int
    while (a) {
        manager.showMenu()
        try {
            choose = readLine()!!.toInt()
            when (choose) {
                1 -> manager.addDevelop()
                2 -> manager.addTester()
                3 -> manager.getDevelopList()
                4 -> manager.getTesterList()
                5 -> manager.showEmployeeSalaryLower()
                else -> a = false
            }
        }catch (e : Exception){
            println("please choose again!")
        }
    }
}