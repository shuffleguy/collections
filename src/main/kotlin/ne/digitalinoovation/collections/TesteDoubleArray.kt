package ne.digitalinoovation.collections

fun main(){

    val salarios = DoubleArray(3)

    salarios[0] = 1000.0
    salarios[1] = 2000.0
    salarios[2] = 1200.0

    salarios.forEach { println(it) }

    println("----------------------------")

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    println("novo exemplo \n---------------------------------")
    val salarios2 = doubleArrayOf(1000.0, 1200.0, 5000.0)
    salarios2.sort()
    salarios2.forEach { println(it) }

    println("----------------------------")
    salarios2.forEachIndexed { index, salario ->
        salarios2[index] = salario * 1.1
    }
    salarios2.forEach { println(it) }


    }

