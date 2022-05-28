package com.ru.Rushikesh
fun main() {
    val stringlist : List<String> = listOf("Rushikesh","Frank","Michael","Garry")
    val Mixedtypelist : List<Any> = listOf("Rushi",21,98,"Bday",70.5,"Weight","KG")

    for(value in Mixedtypelist)
    {
        if(value is Int){
            println("Interger = $value")
        }
        else if(value is Double){
            println("Double = $value with the the floor value ${Math.floor(value)}")
        }
        else if(value is String) {
            println("String = $value of Length ${value.length}")
        }
        else
        {
            println("unkonen Type")
        }
    }
//Alternatively
    for(v in Mixedtypelist)
    {
        when(v)
        {
            is Int -> println("Integer = $v")
            is Double -> println("Double - $v With the floor value ${Math.floor(v)}")
            is String -> println("String = $v of Length ${v.length}")
            else -> println("Unknown Type")
        }
    }

    val obj1:Any = "I have a dream"
    if(obj1 !is String){
        println("Not a String")
    }
    else{
        println("Found a String of length ${obj1.length}")
    }

    val str1 :String = obj1 as String
    println("$str1 length is ${str1.length}")

    val obj2 :Any = 1337
    val str2:Int = obj2 as Int
    println("$str2")

    val obj3 :Any = 1337
    val str3:String? = obj3 as? String
    println("$str3")


}
