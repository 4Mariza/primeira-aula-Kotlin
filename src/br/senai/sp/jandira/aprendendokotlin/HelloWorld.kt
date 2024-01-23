package br.senai.sp.jandira.aprendendokotlin

import kotlin.math.pow

fun main() {
    println("Hello World!")

    //criacao de variaveis
    var idade = 23
    var nome = "Maria"
    val pi = 3.14
    var nomeCidade: String = "Jandira"

    print("Qual o seu peso?")
    var peso = readln().toDouble()

    print("Qual a sua altura?")
    var altura = readln().toDouble()

    //chamada de outra função
    var imc = calcularIMC(peso, altura)
    println("$nome, seu IMC é ${String.format("%.2f", imc)}")

    //impressao
    println("Eu me chamo $nome e tenho $idade anos!")

    idade = 17

    println("Eu me chamo $nome e tenho $idade anos!")

    //condicional
    if (idade >= 18){
        println("$nome é maior de idade.")
    }else{
        println("$nome é menor de idade.")
    }

    //looping
    var i = 0
    while(i < 10){
        println(nome)
        i++
    }

    //simplificacao para (int x = 0; i < 10; i++)
    for (x in 1..10){
        println("$x - SENAI Sesi")
    }

    //tabuada 7
    for (x in 0..10){
        println("7 x $x = ${7 * x}")
    }

    println(falarBomDia())
}

//nova funcao
fun calcularIMC(peso:Double, altura:Double):Double = peso / altura.pow(2)


//quando a função tem uma linha só, pode ser simplificada:
fun falarBomDia():String = "BOM DIA!!"
