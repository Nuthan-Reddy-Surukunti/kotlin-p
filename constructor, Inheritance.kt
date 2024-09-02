import kotlin.reflect.typeOf
class Person {
    var name: String
    var age: Int

    constructor(x: String, y: Int){

    this.name=x
    this.age=y
}
    constructor(x: String){
        this.name="Rahul"
        this.age=32


    }    }
fun Intro(){
    println("my name is $name and age is $age")
}
fun main(){
    var a =Person("Riya",32)
    a.Intro()
    var b = person()
    b.intro()
    var c = Person("Heena")
    c.Intro()
    
}




