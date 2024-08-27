

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
     val temperature = 21
    if (temperature>20){
        println("warm day")
    }
    else {
        println("cool day")
    }
    val marks = 60
    if (marks >=90){
        println("A grade")
    }
    else if (marks>=85){
        println("B gade")
    }
    else if (marks >=70){
        println("C gade")
    }
    else{
        println("Unqualified")
    }
    val Value1 = 10
    val Value2 = 20
    var Operation = "*"
    if (Operation =="+"){
        println(Value1+Value2)
    }
    else if (Operation == "-"){
        println(Value1-Value2)
    }
    else if (Operation == "*"){
        println(Value1*Value2)
    }
    else{
        println(Value1/Value2)
    }
}
 val age = 19
    if (age < 13){
        println("Child")
    }
    else if (age in 13..19){
        println("Teenager")
    }
    else if (age in 20..64){
        println("Adult")
    }
    else {
        println("You are Senior")
    }
    val dayOfWeek = 5
    val DayName = when(dayOfWeek){
        1-> "Monday"
        2 -> "Tuesday"
        3->"Wednesday"
        4 -> "Thusday"
        5 -> "Friday"
        6 -> "Saturday"
        7 ->"Sunday"
        else ->"Invalid"
        
    }
    println(DayName)
    val number = 9
    when{
        number % 2 ==0 -> println("Even Number")
        number %2 != 0 -> println("Odd Number")
        else ->println("Error")
    }
         for (i in 1..10){
         println(i)

     }
    println("End")
    for (i in 1 until 10){
        println(i)
    }
    for (i in 5 downTo 1){
        println(i)
    }
  for (i in 5 downTo 1 step 2){
      println(i)
  }
  val fruits = listOf("Apple,banana,orange")
    for (fruit in fruits){
        println(fruit)
    }
    for (index in fruits.indices){
        println("index of $index:${fruits[index]}")
    }
      var value = 0
    while (value>0){
        value--
        println("value is:$value")
    }
    do {
        println(value)
        value++
    }
        while (value<=5)


}
