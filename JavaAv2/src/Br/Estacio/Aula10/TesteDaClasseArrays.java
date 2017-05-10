/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Br.Estacio.Aula10;

/**
 *
 * @author aluno
 */
public class TesteDaClasseArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaração do objeto
       
       Arrays objetoDaClasseArrays;
       // Instanciação
       objetoDaClasseArrays = new Arrays();   
       
         boolean retorno;

        for (int i = 0; i < 15; i++) {
            retorno = objetoDaClasseArrays.insereDadosNoVetor(i, 2);
            if (retorno) {
                System.out.println("O valor " + 2 + " foi inserido na posicao " + i);
            } else {
                System.out.println("O valor " + 2 + " não foi inserido na posicao " + i);
            }

        }
        /*
        objetoDaClasseArrays.insereDadosNoVetor(0, 1);
        objetoDaClasseArrays.insereDadosNoVetor(1, 1);
        objetoDaClasseArrays.insereDadosNoVetor(2, 1);
        objetoDaClasseArrays.insereDadosNoVetor(3, 1);
        objetoDaClasseArrays.insereDadosNoVetor(4, 1);
        objetoDaClasseArrays.insereDadosNoVetor(5, 1);
        objetoDaClasseArrays.insereDadosNoVetor(6, 1);
        objetoDaClasseArrays.insereDadosNoVetor(7, 1);
        objetoDaClasseArrays.insereDadosNoVetor(8, 1);
        objetoDaClasseArrays.insereDadosNoVetor(9, 1);
        objetoDaClasseArrays.insereDadosNoVetor(10, 1);
        */
        int resultadoDaSoma;
        
        resultadoDaSoma = objetoDaClasseArrays.soma();
        
        System.out.println(
                "O valor da soma eh: " + resultadoDaSoma);
    
    }
    
}
