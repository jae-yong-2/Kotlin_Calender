package com.example.kotlincalender

/**
 * TODO
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
 * TODO
 * 코틀린 문법 익히기
 *
 * 1. 함수
 * 자바의 void 와 같은 함수형은 Unit
 *
 */
fun helloWorld() : Unit{
    println("Hello World!")
}


/**
 * TODO
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
 * TODO
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
 * TODO
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

