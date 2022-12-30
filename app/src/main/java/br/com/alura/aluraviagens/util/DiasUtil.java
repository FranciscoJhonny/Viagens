package br.com.alura.aluraviagens.util;

import androidx.annotation.NonNull;

public class DiasUtil {

    public static final String PLURAL = " dias";
    public static final String SIMGULAR = " dia";

    @NonNull
    public static String formataEmTexto(int quantidadeDeDias) {


        if (quantidadeDeDias > 1){
            return quantidadeDeDias + PLURAL;
        }
        return quantidadeDeDias + SIMGULAR;


    }
}
