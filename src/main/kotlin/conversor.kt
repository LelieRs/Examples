import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.round


fun main () {
    ejercicio29()
}
// Ingresar una cantidad en metros y convertir a kilómetros, sabiendo que 1km=1000m

fun ejercicio1() {
    println("ingrese el valor en metros a convertir en kilómetros: ")
    var valEnM = readLine()?.toFloat()
    var valEnKm = valEnM?.div(1000)
    /* ¿por qué si lo intento hacer de esta forma:

     var valEnM = readLine()?.toFloat()
     var valEnKm = 0
     valEnKm = valEnM?.div(1000)  me tira error?
     */
    println("el valor en kilómetros es : ${valEnKm}")
}

//Ingresar un cantidad en Gramos y transformar a Libras, sabiendo que 1lb = 453.59g

fun ejercicio2() {
    println("ingrese los gramos que desea trasnformar: ")
    var grs = readLine()?.toFloat()
    var lbs = grs?.div(453.59)
    println("los gramos ingresados equivalen a $lbs libras")
}

//Convertir de micrómetros a nanómetros, sabiendo que 1microm = 1000nm

fun ejercicio3() {
    println("¿cuántos micrómetros deseas convertir? ")
    var microm = readLine()?.toFloat()
    var nm = microm?.div(1000)
    println("los micrómetros ingresados equivalen a ${nm} nanómetros")
}

// Convertir de Galones a barriles, sabiendo que 1barril = 34,97galones

fun ejercicio4() {
    println("ingresa los galones a convertir: ")
    var gal = readLine()?.toFloat()
    var barr = gal?.div(34.97)
    println("${gal} equivalen a ${barr} barriles")
}

//Convertir de metros a: Kilómetros, centímetros y decímetros, sabiendo que 1Km=10000dm y 1dm=10cm.

fun ejercicio5() {
    println("ingresa los metros a convertir:")
    var m = readLine()?.toDouble()
    var km = m?.div(1000)
    var cm = m?.times(100)
    var dm = m?.times(10)
    println("los metros ingresados equivalen a ${km} kilómetros, ${cm} centímetros y ${dm} decímetros")
}


//Ingresar un valor en Dólares y convertir a Pesos argentinos, y Euros.

fun ejercicio6() {
    println("ingresa la cantidad de dólares a convertir:")
    var dolar = readLine()?.toFloat()
    var pesos = dolar?.times(94.07)
    pesos = pesos?.let { round(it) }
    var euros = dolar?.div(1.22)
    euros = euros?.let { round(it) }
    println("serían un total de ${pesos} argentinos o ${euros} euros") //le puse el round porque si no, tiraba un número decimal interminable
}

//Ingresar un valor en grados Celsius y convertir a grados Fahrenheit

fun ejercicio7() {
    print("ingresa el valor a convertir a Fahrenheit: ")
    var celcius = readLine()?.toFloat()
    var fahr = celcius?.times(1.8)?.plus(32)
    println("los ${celcius} grados Celcius equivalen a ${fahr} grados Fahrenheit")
}


//Calcular el Área de un triángulo, dada su altura y su base

fun ejercicio8() {
    println("ingresa la altura del triángulo: ")
    var altura = readLine()?.toInt()
    println("ingresa la base del triángulo: ")
    var base = readLine()?.toInt()
    var area = altura?.let { base?.times(it)?.div(2) }
    println("el área de tu triángulo es: ${area}")
}


//Calcular el Área de un rectángulo, dado sus lados

fun ejercicio9() {
    println("ingresa la altura del cuadrado: ")
    var altura = readLine()?.toInt()
    println("ingresa la base del cuadrado: ")
    var base = readLine()?.toInt()
    var area = base?.let { altura?.times(it) }
    println("el área de tu rectángulo es: ${area}")
}

//Calcular el Area de un circulo, dado su diametro

fun ejercicio10() {
    println("ingresa el díámetro de tu círculo")
    var diametro = readLine()?.toFloat()
    var pi = 3.14f
    var radio = diametro?.div(2)?.pow(2)
    var area = radio?.times(pi)
    println("el área de tu círculo es $area")
}

//Ingresar una cantidad en pesos y desglosar el número de billetes de 5,10, 20, 50, 100, 500, 1000, informar el resto si corresponde.
fun ejercicio11(){
    println("inserta la cantidad de pesos a deglosar: ")
    var pesos = readLine()?.toInt()
    var restante: Int

    if (pesos!= null) {
        if (pesos >= 1000) {
            restante = pesos / 1000
            print("se necesitan ${restante} billetes de 1000, ")
            pesos %= 1000

        }
        if (pesos >= 500) {
            restante = pesos / 500
            print("${restante} billetes de 500, ")
            pesos %= 500
        }
        if (pesos >= 100) {
            restante = pesos / 100
            print("${restante} billetes de 100, ")
            pesos %= 100
        }
        if (pesos >= 50) {
            restante = pesos / 50
            print("${restante} billetes de 50, ")
            pesos %= 50
        }
        if (pesos >= 20) {
            restante = pesos / 20
            print("${restante} billetes de 20, ")
            pesos %= 20
        }
        if (pesos >= 10) {
            restante = pesos / 10
            print("${restante} monedas de 10, ")
            pesos %= 10
        }
        if (pesos >= 5) {
            restante = pesos / 5
            print("y ${restante} monedas de 5, ")
            pesos %= 5

        }
    }
    println("quedando ${pesos} pesos.")
}
//Ingresar un número y verificar si es múltiplo de 10

fun ejercicio12() {
    println("ingresa el número a verificar: ")
    var multiploDiez = readLine()?.toInt()
    var divisor= 10
    var resto= multiploDiez?.rem(divisor)
    if (resto==0){
        println ("el $multiploDiez es múltiplo de 10")
    } else
        println("el $multiploDiez no es múltiplo de 10")
}
/* Crear una función que calcule el valor de elevar un número 'A', a un exponente entero 'B', 'A' elevado a 'B'
(multiplicando b veces el número a) por ej 2 elevado a la 3 debe devolver 8
 */
fun ejercicio13(){
    println("ingresa el primer número: ")
    var primerValor = readLine()?.toInt()
    println("ingresa el segundo valor ")
    var segundoValor = readLine()?.toInt()
    val resultado = primerValor?.let { segundoValor?.let { it1 -> Math.pow(it.toDouble(), it1.toDouble()) } }
    println("el número $primerValor elevado a $segundoValor es igual a: $resultado")

}

//Generar 5,10,15,20,25,30,35...n, donde n se pasa por parametro

fun ejercicio14(valor: Int){
    for (i in 0..valor step 5){
        println ("$i ")
    }
}

//Función que pida números de cuatro cifras e indique si los números son capicúas o no.

fun ejercicio15(){
    println("ingrese un número de 4 cifras a evaluar: ")
    var numeros= readLine()
    var numerosReverse = ""
    if (numeros != null) {
        for (numero in numeros.length -1 downTo 0) {
            numerosReverse = numerosReverse + numeros[numero]
        }
    }
    if (numeros==numerosReverse){
        println("los numeros ingresados son capicúa")
    }else
        println("los números ingresados no son capicúa")
   }

//Ingresar una lista de n números y sacar su promedio.

fun ejercicio16(){
    var lista= mutableListOf(20, 15, 30,90)
    println(lista.average())
    // o
    var list= listOf(20.0, 15.0, 30.0, 90.0)
    var prom = 0.0
    for (i in list){
        prom= list.sum()/list.size
    }
    println(prom)
}

//ESTRUCTURAS DE DECISIÓN

//Ingrese dos números y mostrar el número mayor.

fun ejercicio17(){
    println("ingresa un número: ")
    var primerNumero= readLine()?.toInt()
        println("ingresa el número a comparar: ")
    var segundoNumero= readLine()?.toInt()

    if (primerNumero != null && segundoNumero != null) {
        if (primerNumero>segundoNumero){
            println("el número mayor es $primerNumero")
        }else
            println("el número mayor es $segundoNumero")
    }
}
//Ingresar tres números y mostrar el número intermedio.
fun ejercicio18(){
    println("ingresa un número: ")
    var primerNumero= readLine()?.toInt()
    println("ingresa el segundo número: ")
    var segundoNumero= readLine()?.toInt()
    println("ingresa el tercer número: ")
    var tercerNumero= readLine()?.toInt()

    if (primerNumero != null && segundoNumero != null && tercerNumero != null) {
        if (primerNumero>segundoNumero && primerNumero<tercerNumero || primerNumero<segundoNumero && primerNumero>tercerNumero){
            print("el $primerNumero es el número intermedio")
        }else if (segundoNumero>primerNumero && segundoNumero<tercerNumero || segundoNumero<primerNumero && segundoNumero>tercerNumero){
            print("el $segundoNumero es el número intermedio")
        }else if (tercerNumero>primerNumero && tercerNumero<segundoNumero || tercerNumero<primerNumero && tercerNumero>segundoNumero) {
            println("el $tercerNumero es el número intermedio")
        }else
            println("na, dale. Dejate de j*der y coloca bien los números.")
    }
}
//Ingresar tres números y ordenar (de forma ascendente y descendente) y mostrar el resultado

fun ejercicio19(){
    var lista= mutableListOf(0)
    println("ingresa primer número: ")
    var numero1 = readLine()?.toInt()
    println("ingresa segundo número: ")
    var numero2 = readLine()?.toInt()
    println("ingresa tercer número: ")
    var numero3 = readLine()?.toInt()
    if (numero1 != null && numero2 != null && numero3 != null) {
        lista.add(numero1)
        lista.add(numero2)
        lista.add(numero3)
        lista.removeAt(0)
        lista.sort()
        println("la lista ordenada de manera asendiente sería: $lista")
        lista.sortDescending()
        println("la lista ordenada de manera asendiente sería: $lista")
    }
}
//Verificar si un número es par o impar
fun ejercicio20(){
    val divisor= 2
    println("ingresa un número: ")
    val nro= readLine()?.toInt()

    if (nro != null) {
        if (nro % divisor == 0){
            println("el número $nro es par")
        } else
            println("el número $nro es impar")
        }
    }
//Saber si un número es divisible por otro número entero
fun ejercicio21(){
    println("ingresa el primer número: ")
    val nro1= readLine()?.toInt()
    println("ingresa el segundo número: ")
    val nro2= readLine()?.toInt()
    if (nro1 != null && nro2 != null){
        if(nro1 % nro2 == 0){
            println("los números $nro1 y $nro2 son divisibles")
        }else
            println("los números $nro1 y $nro2 no son divisibles")
    }
}
//Verificar si un número es positivo o negativo o es cero
fun ejercicio22(){
    println("ingresa un número: ")
    var num= readLine()?.toInt()
    if (num!= null){
        if (num>0){
            println("el número ingresado es positivo")
        }else if (num==0){
            println("el número ingresado es cero")
        }else if (num<0){
            println("el número ingresado es negativo")
        }else
            println("por favor, ingresa un número válido")
    }
}
//Ingresar una calificación (01 – 10) y calificar con la siguiente equivalencia. 9 y 10 Sobresaliente 7 y 8 Muy Buena 6 Buena 4 y 5 Regular 2 y 3 Mal 1 Volve a tu casa
fun ejercicio23(){
    println("Del 1 al 10, indicá tu calificación: ")
    val calificacion= readLine()?.toInt()
    when(calificacion){
        1 -> println("Volvé a tu casa")
        2,3 -> println("Mal")
        4,5 -> println("Regular")
        6 -> println("Buena")
        7,8 -> println("Muy Buena")
        9,10 -> println("volvé a tu casa")
        else -> println("El número ingresado está fuera del rango informado.")
    }
}
//Ingresar un número (de hasta 3 cifras) y mostrar su equivalente en números romanos.
fun ejercicio24(){

}
//Ingresar año, mes y día actual, e ingresar año, mes y día de nacimiento y calcular la edad con años, meses y días.
fun ejercicio25(){
    println("ingresa el año de tu nacimiento: ")
    var añoNac= readLine()?.toInt()
    println("ingresa el mes de tu nacimiento: ")
    var mesNac= readLine()?.toInt()
    println("ingresa el día de tu nacimiento: ")
    var diaNac= readLine()?.toInt()
    println("ingresa el año actual: ")
    var añoActual= readLine()?.toInt()
    println("ingresa el mes actual: ")
    var mesActual= readLine()?.toInt()
    println("ingresa el día actual: ")
    var diaActual= readLine()?.toInt()

    if (mesActual != null) {
        if (diaActual != null) {
            println("tienes ${añoActual!! - añoNac!!} años con ${mesActual- mesNac!!} meses y ${diaActual- diaNac!!} días")
        }
    }
}
//Dada una palabra que la muestre por consola 10 veces.
fun ejercicio26(){
    println("escribe una palabra: ")
    var palabra = readLine()?.toString()
    if (palabra != null) {
        for (i in 1..10){
            println(palabra)
        }
    }
}
//Preguntar al usuario su edad y mostrar por consola todos los años que ha cumplido (desde 1 hasta su edad).
fun ejercicio27(){
    println("ingresa tu edad: ")
    var edad= readLine()?.toInt()
    for (i in 1..edad!!){
        println("has cumplido "+ i + " años")
    }
}
/*Pedir al usuario un número entero positivo y muestrar por consola todos los números impares desde 1 hasta
ese número separados por comas.*/
fun ejercicio28(){
    println("ingresa un número entero: ")
    val num= readLine()?.toInt()
    for (i in 1..num!! step 2) {
        print("$i, ")
    }
}
//Pedir al usuario un número entero positivo y muestrar por pantalla la cuenta atrás desde ese número hasta cero separados por comas.
fun ejercicio29(){
print("ingresa un número: ")
    val num= readLine()?.toInt()
    if (num != null) {
        for(i in num downTo 0){
            print("$i, ")
        }
    }
}