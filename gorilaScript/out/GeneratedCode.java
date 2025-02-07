public class GeneratedCode {

    public static float calcularInvestimento(float valorInicial , float taxaJuros , int anos , float aporteMensal ) {
        float valorFinal = valorInicial;
        int i = 0;
        float taxaAux = taxaJuros / 100;
        float taxaMensal = taxaAux / 12;
        float multiplicador = 1;
        int meses = anos * 12;
        while (i<meses) {
            multiplicador = 1 + taxaMensal;
            valorFinal = valorFinal * multiplicador + aporteMensal;
            i = i + 1;
        } 
        return valorFinal;
    }
}

