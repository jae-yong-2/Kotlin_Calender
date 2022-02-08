# Kotlin_Calender

This is my first Kotlin side Project

The readme file is a space for writing Kotlin syntax. The contents of the file are the same as "KotlinSyntax" file in this project.


/**
 * Memo
 *
 * VS 1
 *
 * expression --> Return something or Make value
 * statement --> Just sentence
 *
 * java's void is statement VS kotlin's unit is expression
 *
 * Every kotlin functions are using expression
 *
 *
 *
 * VS 2 --> fun Array_VS_List
 *
 * immutable List VS Mutable List
 *
 * immutable list can't change value in runtime
 * VS
 * Mutable List can change value in runtime
 *
 */
fun main(){
    helloWorld()
}

/**
 * Memo
 * Study Kotlin Syntax
 *
 * 1. function
 * java's void is very similar to kotlin's Unit
 *
 */
fun helloWorld() : Unit{
    println("Hello World!")
}


/**
 * Memo
 *
 * @param a : Int
 * @param b : Int
 *
 * 리턴 함수의 반환형을 정해주면 return이 필수이다.
 * @return a+b
 */
fun add(a:Int, b:Int):Int {
    return a+b
}

/**
 * Memo
 *
 * var can not change in runtime
 * val can change in runtime
 *
 */
fun val_and_var(){
    val a: Int = 10
    var b: Int =9
    b = 10
}

fun StringTemplate(){
    val name = "재용"

    println("this is String Template ${name}")
    println("this is String Template ${1==1}")
    println("this is String Template \$")
}

/**
 * Memo
 * Must famous mutable list is Array
 * Must famous immutable list is List
 *
 * It is possible that add some value and change value
 *
 * but array already have storage space
 * add some value mean using empty storage space
 *
 * val array and add value, how?
 *
 * ex) if you add value : 1
 *
 * Array allocate value in storage,
 * however this operation is not change value.
 * so you can you add some value in array
 *
 *
 */

fun Array_VS_List(){
    val array : Array<Int> = arrayOf(1,2,3)
    val list : List<Int> = listOf(1,2,3)

    array[1] = 4
    //list[0] = 2 make error
}

fun for_and_while(){
    val students :ArrayList<String> = arrayListOf("1","2","3","4")

    for (name : String in students){
        print("${name}")
    }
    /**
     * 1..10
     * this Syntax add 1 to 10
     * 1..10 step
     * this Syntax add values by adding 2 from 1 to 10
     *
     * 1 until 10
     * this Syntax sum 1 to 9
     * %Do not include 10
     *
     * 10 downTo 1
     * this Syntax sum 10 to 1
     */

    /**
     * for
     */
    var sum :Int = 0
    for (i :Int in 1..10){
        sum += i
    }

    /**
     * while
     */
    var index = 0
    while(index<10){
        println("공부중입니다.")
        index++
    }

    /**
     * withIndex()
     */

    for( (index:Int, name :String) in students.withIndex()){
        println("${index}'s student : $name")
    }

}
