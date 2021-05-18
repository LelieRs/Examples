

fun main (){

ejercicio5()
}
// Ingresar una cantidad en metros y convertir a kilómetros, sabiendo que 1km=1000m

/* fun ejercicio1(){
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

fun ejercicio2(){
    println("ingrese los gramos que desea trasnformar: ")
    var grs= readLine()?.toFloat()
    var lbs = grs?.div(453.59)
    println("los gramos ingresados equivalen a $lbs libras")
    }

//Convertir de micrómetros a nanómetros, sabiendo que 1microm = 1000nm

fun ejercicio3(){
    println("¿cuántos micrómetros deseas convertir? ")
    var microm= readLine()?.toFloat()
    var nm = microm?.div(1000)
    println("los micrómetros ingresados equivalen a ${nm} nanómetros")
}

// Convertir de Galones a barriles, sabiendo que 1barril = 34,97galones

fun ejercicio4(){
    println("ingresa los galones a convertir: ")
    var gal= readLine()?.toFloat()
    var barr= gal?.div(34.97)
    println("${gal} equivalen a ${barr} barriles")
} */

//Convertir de metros a: Kilómetros, centímetros y decímetros, sabiendo que 1Km=10000dm y 1dm=10cm.

fun ejercicio5(){
    println("ingresa los metros a convertir:" )
    var m= readLine()?.toDouble()
    var km= m?.div(1000)
    var cm= m?.times(100)
    var dm= m?.times(10)
    println("los metros ingresados equivalen a ${km} kilómetros, ${cm} centímetros y ${dm} decímetros")
}
