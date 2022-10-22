import java.util.Scanner;

//Programa que pede uma lista e exibe o inverso dela

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n, cont;
        int [] vetor, inverso;

        System.out.println("Digite o tamanho do vetor");
        n = sc.nextInt();

        vetor = new int[n];

        inverso = new int[n];
        cont = vetor.length-1; //o número total de índicies

        System.out.println("Digite " + n + " valores: ");

        for(int i=0; i<vetor.length; i++){
            vetor[i]=sc.nextInt();
        }

        for(int i=0; i<vetor.length; i++){
            inverso[cont]=vetor[i];
            cont--;
        }

        for(int i=0; i<vetor.length; i++){
            System.out.println(inverso[i]);
        }
    }
}
