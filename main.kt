

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
        fun sum(a:Int = 10,  b:Int = 20){
    val c =a+b
    println(c)
}
fun main(){
    sum(20,50)
    sum()
}
fun main(args: Array<String>){
    val a= 10
    val b= 20
    val result = sum(a,b)
    println(result)
}
fun sum(a:Int, b:Int):Int{
    val x = a+b
    return x
}
//create a fun to convert tem from celsius to fahrenheit
fun main() {
    println("Choose an option:")
    println("1. Convert °C to °F")
    println("2. Convert °F to °C")
    val option = Integer.valueOf(readLine())

    if (option == 1) {
        println("Enter the value of Celsius to convert:")
        val c = readLine()?.toDoubleOrNull()
        if (c != null) {
            val fahrenheit = celsiusToFahrenheit(c)
            println("After conversion of $c°C to °F, we get %.1f°F.".format(fahrenheit))
        } else {
            println("Please enter a valid number for Celsius.")
        }
    } else if (option == 2) {
        println("Enter the value of Fahrenheit to convert:")
        val f = readLine()?.toDoubleOrNull()
        if (f != null) {
            val celsius = fahrenheitToCelsius(f)
            println("After conversion of $f°F to °C, we get %.1f°C.".format(celsius))
        } else {
            println("Please enter a valid number for Fahrenheit.")
        }
    } else {
        println("Please choose a valid option: 1 or 2.")
    }
}

fun celsiusToFahrenheit(c: Double): Double {
    return (c * 9 / 5) + 32
}

fun fahrenheitToCelsius(f: Double): Double {
    return (f - 32) * 5 / 9
}



// create a programme for factorial and fibonacci series using recursive funtions
//factorial
fun factorial(n: Int): Long {
    return if (n == 0 || n == 1) 1 else n * factorial(n - 1)
}

fun main() {
    println("Enter a number to calculate its factorial:")
    val num = Integer.valueOf(readLine())
    val result = factorial(num)
    println("The factorial of $num is $result")
}

// fibonacci series
fun fibonacci(n: Int): Int {
    return if (n <= 1) n else fibonacci(n - 1) + fibonacci(n - 2)
}

fun main() {
    println("Enter the number of terms for the Fibonacci series:")
    val terms = Integer.valueOf(readLine())
    println("Fibonacci series up to $terms terms:")

    for (i in 0 until terms) {
        print("${fibonacci(i)} ")
    }
}


}
