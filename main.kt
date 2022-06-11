import java.util.Scanner 
import kotlin.math.pow

fun elevaAoQuadrado(numero: Int): Int {
    return numero* numero
}

fun elevaAoCubo(numero: Int): Int {
    return numero* numero * numero
}

fun raizCubica(numero:Double):Double {
  return numero.pow(1/3.toDouble())
} 

fun main() {
  
   val reader = Scanner(System.`in`)
   print("Digite um número: ")

   var num:Int = reader.nextInt()
  
   println("o número $num ao quadrado é: "  + elevaAoQuadrado(num))

   println("o número $num ao cubo é: "  + elevaAoCubo(num))
}




