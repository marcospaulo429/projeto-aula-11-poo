package org.example;
public class TorreDeHanoi {
    public static int torreDeHanoi(int numDiscos, char hasteOrigem, char hasteDestino, char hasteAuxiliar) {
        if (numDiscos == 1) {
            return 1;
        }

        int movimentos = torreDeHanoi(numDiscos - 1, hasteOrigem, hasteAuxiliar, hasteDestino);

        movimentos += torreDeHanoi(numDiscos - 1, hasteAuxiliar, hasteDestino, hasteOrigem);

        return movimentos;
    }
}
