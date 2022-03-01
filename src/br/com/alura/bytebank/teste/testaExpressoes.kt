fun testaExprecoes() {
    val entrada = "1,9"
    val taxas: Double? = try {
        println("Valore de entrada $entrada")
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Erro no momento da conversão")
        null
    }
    val valorComTaxas: Double? = if (taxas != null) {
        taxas + 0.1
    } else {
        null
    }
    println("valor de entrada $valorComTaxas")
}