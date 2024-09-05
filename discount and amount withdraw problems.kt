fun main(){
   println("Enter the total value of Purchase:")
   val Customer = Integer.valueOf(readln())
   println("Do you have membership:")
   val MSHIP = true
   if (Customer >=1000){
       if (MSHIP){
           println("You are elgible for membership for 20%")
       }
       else{
           println("you have 10% discount")
       }
   }
   else{
       println("No discount")
   }
    val account1 = 1000
    println("enter amount to withdraw:")
    val amountenter = Integer.valueOf(readln())
    if (account1<amountenter){
        println("Less amount")
    }
    else{
        val newamount = account1-amountenter
        println("amount withdraw is done")
        println("Remaining amount is $newamount")
    }

}




