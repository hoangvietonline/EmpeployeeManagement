package model

import common.BASE_SALARY

data class Tester(
    var bugs: Int? = 0,
    override var id: Int? = 0,
    override var name: String? = null,
    override var age: Int? = 0,
    override var phoneNumber: String? = null,
    override var email: String? = null
) : Employee(id, name, age, phoneNumber, email) {
    override fun payroll(): Long {
        return BASE_SALARY + bugs!! * 50000
    }

    override fun input() {
        super.input()
        println("Enter bugs number")
        bugs = readLine()?.toInt()
    }
}