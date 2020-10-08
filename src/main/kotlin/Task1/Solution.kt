package Task1

import Task1.InfoPrinter as InfoPrinter

interface PersonInfo {
    fun getName()
    fun getAge()
}

abstract class InfoPrinter<T : PersonInfo> {
    internal abstract fun getInfo(): String
}

class Student : InfoPrinter<Student>(),PersonInfo {
    override fun getName() {
        println("getName Student")
    }

    override fun getAge() {
        println("getAge Student")
    }

    override fun getInfo(): String =
        "Name: ${getName()},Age: ${getAge()}"
}

class Teacher : InfoPrinter<Teacher>(),PersonInfo {
    override fun getName() {
        println("getAge Teacher")
    }

    override fun getAge() {
        println("getAge Teacher")
    }

    override fun getInfo(): String =
        "Name: ${getName()},Age: ${getAge()}"

}

class StudentImpl : InfoPrinter<Student>() {
    private val student = Student()
    override fun getInfo(): String =
        "Name: ${student.getName()},Age: ${student.getAge()}"
}

class TeacherImpl : InfoPrinter<Teacher>() {
    private val teacher = Teacher()
    override fun getInfo(): String =
        "Name: ${teacher.getName()},Age: ${teacher.getAge()}"
}

fun main(args: Array<String>) {
    val student = Student()
    val teacher = Teacher()
    student.getInfo()
    teacher.getInfo()
}