import java.util.Scanner;

//Faça um programa que receba a temperatura média de cada mês do ano
//armazenando-as em um vetor. Mostre a maior e a menor temperatura
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] temperaturas = new int[12];
        int maior = temperaturas[0];
        int menor = temperaturas[0];
        
        System.out.println("Digite as temperaturas do ano: ");
        for(int i=0; i<temperaturas.length; i++){
            temperaturas[i] = sc.nextInt();
        }

        for(int i=0; i<temperaturas.length; i++){
            if(temperaturas[i] > maior){
                maior = temperaturas[i];
                
            }
        }
        
        for(int i=0; i<temperaturas.length; i++){
            if(temperaturas[i] <= menor){
                menor = temperaturas[i];
            }
        }

        System.out.println("Maior temperatura " + maior + " e menor temperatura " + menor);

        sc.close();
    }
}
 