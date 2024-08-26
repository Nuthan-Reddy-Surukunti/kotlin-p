

fun main()
{
//   val a =10
//    val b = 120*5
//    val result = "sum of $a and $b is ${a+b}"
//    println(result)

//    val letter: Char = 'A'
//    print("$letter")
//    print('\n')
//    print('\$')
//    print('\\')
//    val x:String="Nuthan\n"
//    var y:String="""Nuthan
//        |        nuthan
//       |
//        |        nuthan
//    """.trimMargin()
//    print(y)

    val num = arrayOf(1,2,3,4,5)
    val words: Array<String> = arrayOf("Kotlin")

    val firstNumber = num[0]
    val secondWord = words[1]
    println("First number: $firstNumber")
    println("second number: $secondWord")
    num[0]= 10
    print(num)
    for (num in )

}


fun main()
{
//   val a =10
//    val b = 120*5
//    val result = "sum of $a and $b is ${a+b}"
//    println(result)

//    val letter: Char = 'A'
//    print("$letter")
//    print('\n')
//    print('\$')
//    print('\\')
//    val x:String="Nuthan\n"
//    var y:String="""Nuthan
//        |        nuthan
//       |
//        |        nuthan
//    """.trimMargin()
//    print(y)

    val num = arrayOf(1,2,3,4,5)
    val words: Array<String> = arrayOf("Kotlin")

    val firstNumber = num[0]
    val secondWord = words[1]
    println("First number: $firstNumber")
    println("second number: $secondWord")
    num[0]= 10
    print(num)
    // Arithmetic OP
    var a = 10
    var b = 25
    var Add = a+b
    println("Add :$a+$b:$Add")
    var Sub = a-b
    println("Sub : $a-$b:$Sub")
    var Mul = a*b
    println("Mult : $a*$b:$Mul")
    var Dev = a/b
    println("Division : $a/$b : $Dev")
    println("Mod : $a//$b:${a%b}")
    //Relational OP
    println("GT : $a>$b:${a>b}")
    println("LT : $a<$b:${a<b}")
    println("GTE : $a>=$b:${a>=b}")
    println("LTE : $a<=$b:${a<=b}")
    println("EE : $a==$b:${a==b}")
    println("NE: $a!=$b:${a!=b}")
    //Assignment OP
    a+=b
    println("AE : $a+=$b:$a")
    a-=b
    println("NE : $a-=$b=${b}")
    a*=b
    println("ME: $a*=$b =${a}")
    a/=b
    println("DE:$a/=$b = ${a}")
    

}
