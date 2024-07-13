/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meuprimeirojavinha;
    import java.util.Scanner;
/**
 *
 * @author Vitoria
 */
public class Meuprimeirojavinha {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    int n1;
    int n2;
    Scanner entrada = new Scanner (System.in); // Instancia da classe Scanner, Objeto java que permite a leitura e escrita de informação em minha tela
    // instancia de objeto: uma representação do objeto
    System.out.println("Informe o primeiro numero: "); // ln = pula linha
    n1 = entrada.nextInt();// nextint = método para resgatar o valor
    System.out.println("Informe o segundo numero: "); // ln = pula linha
    n2 = entrada.nextInt();// nextint = método para resgatar o valor
    System.out.println();
    System.out.println("O resultado da multiplicacao e: "+(n1*n2)); // + = lógica da concatenação
    }
    
}
