package model

abstract class Employee(
    open var id: Int? = 0, open var name: String? = null
    , open var age: Int? = 0, open var phoneNumber: String? = null, open var email: String? = null
) {
    abstract fun payroll(): Long
    open fun show() {
        println("Information employee")
        println("id : $id")
        println("name : $name")
        println("age : $age")
        println("phoneNumber : $phoneNumber")
        println("email : $email")
        println("salary : ${payroll()}")
        println("=============================")
    }

    open fun input() {
        println("Enter information employee")
        println("Enter id")
        id = readLine()?.toInt()
        println("Enter name")
        name = readLine().toString()
        println("Enter age")
        age = readLine()?.toInt()
        println("Enter phoneNumber")
        phoneNumber = readLine().toString()
        println("Enter email")
        email = readLine().toString()
    }
}
