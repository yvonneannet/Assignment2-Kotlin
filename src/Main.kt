//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
modulus(10, 2)
    modulus(8, 3)

    sum(3,6,8,9)
    sum(15,70,111,46)

    printsalutation("Zach")
    printsalutation("Fiona")

funFact("I love poultry farming and keeping pets.")
    funFact("I am an athlete")
}

fun printsalutation( givenName: String){
    println("Hello $givenName")
}

        fun modulus(x:Int, y: Int){
            var result= x%y
            println(result)
        }


fun sum(num1:Int, num2:Int, num3:Int , num4:Int){
var result= num1+num2+num3+num4
    println(result)
}

fun funFact(me: String) {
println(me)
}