public class condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double media = (9.8 + 6.3 + 8) /3;
        double notaDoFilme = media;
        String tipoPlano = "Plus";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }
        if(incluidoNoPlano || tipoPlano .equals("Plus")){
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Faça o upgrade do seu plano!");
        }
    }
}
