//Vendedor recebe salário 55 mais 5% do valor total de suas vendas
//vetor para preço e vetor para qtda de peças vendidas [10]
//valor total de vnda de cada objeto
//valor do objeto mais vendido
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] precos = new int[10];
        int[] quantidadeVendida = new int[10];
        int precoObjMais = precos[0];
        int ObjetoMais =0;
        
        System.out.println("Digite os preços dos objetos: ");
        for(int i=0; i<precos.length; i++){
            precos[i] = sc.nextInt();
        }

        System.out.println("Digite a quantidade de objetos vendidos: ");
        for(int i=0; i<precos.length; i++){
            quantidadeVendida[i] = sc.nextInt();
        }

        for(int i=0; i<precos.length; i++){
            if(quantidadeVendida[i] > precoObjMais){
                ObjetoMais++; 
            }
        }
        System.out.println("O valor doobjeto mais vendido foi de " + precos[ObjetoMais]);

      
        for(int j = 0;  j < 10; j++){
            System.out.print("Total de vendas objeto " + j + " é de " + (quantidadeVendida[j] * precos[j]) + "\n");
            }
        
       

       

        sc.close();
    }
}
