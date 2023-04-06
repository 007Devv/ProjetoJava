import static java.lang.System.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        out.println("Esse é o Screen Match");
        out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        //System.out.println("Ano do lançamento: "+anoDeLancamento);
        boolean incluidoNoPlano = true;
        double media = (9.8 + 6.3 + 8) /3;
        double notaDoFilme = media;
        out.println(String.format("Nota: %.2f", notaDoFilme));
        String sinopse = """
                Filme Top Gun
                Filme de ação com galã dos anos 80
                Muito bom!
                Ano de lançamento: """ +anoDeLancamento;
        out.println("Sinopse: "+sinopse);

        int classificacao = (int) notaDoFilme/2;
        out.println("Estrelas: "+classificacao);



        }
    }
