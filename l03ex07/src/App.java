import java.util.Scanner;

//ler 6 números
//Exibir números pares
//Números ímpares
//Quantidade de números ímpares

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numeros[] = new int[6];
        int impares = 0;

        System.out.println("Digite 6 números: ");

        for(int i=0; i<6; i++){
            numeros[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("Os números pares são: ");
        for(int i=0; i<6; i++){
            if(numeros[i]%2==0){
                System.out.println("número " + numeros[i] + " na posição " + i);
            }
        }

        System.out.println("Os números ímpares são: ");
        for(int i=0; i<6; i++){
            if(numeros[i]%2==1){
                System.out.println("número " + numeros[i] + " na posição " + i);
                impares++;
            }
        }

        System.out.println("Quantidade de números ímpares: " + impares);
    }
}
