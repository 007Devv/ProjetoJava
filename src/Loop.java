import java.util.Objects;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int notaFilme = 0;
        int contadorMedia = 0;
        int notaMediaFilme = 0;
        System.out.println("Olá, qual é o seu nome?");
        String userName = leitura.nextLine();
        System.out.println(userName + ", digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("Qual é o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Colete avaliações para gerar uma média de avaliação para o filme ou digite -1 para encerrar");

        while (notaFilme != -1) {
            System.out.println("Adicione uma nota");
            notaFilme = leitura.nextInt();
            if (notaFilme != -1) {
                notaMediaFilme += notaFilme;
                contadorMedia++;
            }
        }
        notaMediaFilme = notaMediaFilme / contadorMedia;
        System.out.println(userName + ", seu filme favorito é: " + filme + ", ele foi lançado em: " + anoDeLancamento + " e a sua nota para ele é: " + notaMediaFilme);
    }
}
