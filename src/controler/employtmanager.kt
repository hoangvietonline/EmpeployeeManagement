package controler

import model.Develop
import model.Employee
import model.Tester

/**
 * class employee is controler
 */
class EmployeeManagement {
    //list contain employee include develop and tester
    var employeeList = mutableListOf<Employee>()

    // add develop to employee list
    fun addDevelop() {
        val develop = Develop()
        develop.input()
        employeeList.add(develop)
    }

    // add tester to employee list
    fun addTester() {
        val tester = Tester()
        tester.input()
        employeeList.add(tester)
    }

    //get list develop
    fun getDevelopList() {
        for (x in employeeList) {
            if (x is Develop) {
                x.show()
            }
        }
    }

    //get list tester
    fun getTesterList() {
        for (x in employeeList) {
            if (x is Tester) {
                x.show()
            }
        }
    }

    //show menu of application employee management
    fun showMenu() {
        println("==MENU==")
        println("1.Add Develop")
        println("2.Add Tester")
        println("3.Show Develop")
        println("4.Show Tester")
    }

    //calculate average salary of list employee
    private fun avgSalary(): Long {
        var avgSalary: Long = 0
        for (x in employeeList) {
            avgSalary += x.payroll()
        }
        avgSalary /= employeeList.size
        return avgSalary
    }

    //Employee list is lower than average salary
    fun showEmployeeSalaryLower() {
        println("Employee list is lower than average salary")
        for (x in employeeList) {
            if (x.payroll() < avgSalary()) {
                x.show()
            }
        }
    }
}