/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Github;

/**
 *
 * @author dofh0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resultado = sumar(5,10);
        System.out.print(resultado);
    }
    public static int sumar(int inicio, int fin){
        if(fin>inicio){
            return fin + sumar (inicio, fin-1);
        }else{
            return fin;
        }
    }
}
