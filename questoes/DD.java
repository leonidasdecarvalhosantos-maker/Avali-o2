Se a média for menor que 18 °C: "Temperatura Baixa: Ligar Aquecimento"
➢ Se a média for de 18 °C até 28 °C (inclusive): "Temperatura Ideal"
➢ Se a média for maior que 28 °C: "Temperatura Alta: Ligar Ventilação"









void main() {
    double soma = 0.0;
    int quantidade = 0;

    IO.println("=== Monitoramento de Temperatura da Estufa ===");
    IO.println("Digite as temperaturas em °C (ou 999 para encerrar):");

    while (true) {
        double temp = Double.parseDouble(IO.readln("Leitura " + (quantidade + 1) + ": "));

        if (temp == 999) {
            break; // Interrompe imediatamente sem somar nem contar o 999
        }

        soma += temp;
        quantidade++;
    }

    IO.println("\n--- Resultado do Monitoramento ---");

    if (quantidade == 0) {
        IO.println("Aviso: Nenhuma leitura válida foi registrada.");
    } else {
        double media = soma / quantidade;
        IO.println(String.format("Total de leituras válidas: %d", quantidade));
        IO.println(String.format("Temperatura média: %.2f °C", media));

        if (media < 18) {
            IO.println("Status: Temperatura Baixa: Ligar Aquecimento");
        } else if (media <= 28) {
            IO.println("Status: Temperatura Ideal");
        } else {
            IO.println("Status: Temperatura Alta: Ligar Ventilação");
        }
    }
}