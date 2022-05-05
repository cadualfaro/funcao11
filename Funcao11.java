/*
Atividade 3
    Faça uma função recursiva que verifique se uma palavra (String) é palíndromo
        Exemplo de palíndromos: arara, aba, abcba
 */
package funcao11;
import java.util.Scanner;
public class Funcao11 {
    static void palindro(String pp){
        
        StringBuilder b = new StringBuilder(pp);
        String np = b.reverse().toString();
        
        if(pp.equals(np)){
            System.out.println("A palavra e um palindromo");    
        }
        
        else if(!pp.equals(np)){
            System.out.println("A palavra nao e um palindromo");    
        }
    }
    public static void main(String[] args) {
    Scanner my_scan = new Scanner(System.in);
    
        System.out.println("Digite a palavra para verificar se ela e um palindromo: ");
            String palavra = my_scan.next();
                System.out.println("");
    
            palindro(palavra);
    }
    
}