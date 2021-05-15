fun main () {
    // para hacer la sumatoria de dos números dentro de una cadena de texto,
    // podemos hacer lo siguiente:

    var primerImporte = 2
    var segundoImporte = 3

    println ("la suma de de $primerImporte + $segundoImporte es igual a: ${primerImporte+segundoImporte}")

    // algoritmo secuencial de cálculo y promedio:

    var num1 = 9.0
    var num2 = 3.0
    var num3 = 2.0
    var promedio = (num1+num2+num3)/num3
    println("el promedio de \nnum1= $num1 \nnum2= $num2 \nnum3= $num3 \nes= $promedio")

    // operadores unarios:
    var cosa = 1
    cosa++
    println("el valor de cosa incrementado es: $cosa")

    cosa--
    println("el valor de cosa decrementado es: $cosa")

    println("el valor de cosa es ${cosa++}") // incremento post-fijo: con esto el sistema primero printea el valor original y luego incrementa
    println("el valor de cosa es ${++cosa}") // incremento post-fijo: primero incrementa y luego imprime el importe
    println(cosa)
}