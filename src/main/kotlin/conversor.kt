// Ingresar una cantidad en metros y convertir a kilómetros, sabiendo que 1km=1000m

fun main (){
ejercicio1()

}

fun ejercicio1(){
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
