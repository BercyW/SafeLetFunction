package com.example.safeletfunction


/**
 *
 * these two functions are used for avoid forced unwrappers( !! )
 *
 * Use it for 2++ values checks.
 *
 *
 * only 1 value check use kotlin ?.let{}
 *
 * how to use it:
 *
 * doubleLet(value1, value2) { value1, value2->
 *      //do something
 * }
 *
 * **/

fun <T1 : Any, T2 : Any, R : Any> doubleLet(p1: T1?, p2: T2?, fn: (T1, T2) -> R?): R? {
    return if (p1 != null && p2 != null) fn(p1, p2) else null
}

//for triple values
fun <T1 : Any, T2 : Any, T3 : Any, R:Any> tripleLet(p1:T1?,p2: T2?,p3 :T3?,fn:(T1,T2,T3)->R?) : R? {
    return if (p1!=null && p2 !=null && p3 != null) fn(p1,p2,p3) else null
}