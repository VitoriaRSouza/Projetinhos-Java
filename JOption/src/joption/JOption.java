/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joption;
    import javax.swing.JOptionPane;
/**
 *
 * @author Vitoria
 */
public class JOption {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    String N1=JOptionPane.showInputDialog("Digite o valor de N1");
    JOptionPane.showMessageDialog(null, "O numero digitado e: "+N1);
    JOptionPane.showConfirmDialog(null, "O professor é legal?","Escolha o sim", JOptionPane.YES_NO_OPTION);
    
    }
    
}
