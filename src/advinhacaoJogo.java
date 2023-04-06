import java.util.Random;
import java.util.Scanner;

public class advinhacaoJogo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá, qual é o seu nome?");
        String userName = leitor.nextLine();

        int numeroAleatorio = new Random().nextInt(100);

        int contadorTentativas = 0;

        while(contadorTentativas < 5){
            System.out.println(userName+", tente adivinhar um numero aleatório de 0 a 100, você terá 5 chances");
            int userChute = leitor.nextInt();
            contadorTentativas++;

            if(userChute == numeroAleatorio){
                System.out.println("Parabéns você acertou!");
            }
            else if(userChute < numeroAleatorio){
                System.out.println("Você errou, o numero aleatório é maior que esse");
            }
            else{
                System.out.println("Você errou, o numero aleatório é menor que esse");
            }
            }
        if (contadorTentativas == 5){
            System.out.println("Que pena você não conseguiu adivinhar");
        }
        }
    }

