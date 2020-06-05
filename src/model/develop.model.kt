package model

import common.BASE_SALARY
import java.util.*

data class Develop(
    var overtimeHouse: Int? = 0,
    override var id: Int? = 0,
    override var name: String? = null,
    override var age: Int? = null,
    override var phoneNumber: String? = null,
    override var email: String? = null
) : Employee(id, name, age, phoneNumber, email) {
    override fun payroll(): Long {
        return BASE_SALARY + overtimeHouse!! * 200000
    }

    override fun input() {
        super.input()
        println("Enter overtime")
        overtimeHouse = readLine()?.toInt()
    }
}