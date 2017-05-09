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
public class Arrays {
    int [] vetorDeInteiros = new int [10];
    
    public int soma (){
        int soma=0;
        
      /*  soma = vetorDeInteiros[0]+
                vetorDeInteiros[1]+
                vetorDeInteiros[2]+
                vetorDeInteiros[3]+
                vetorDeInteiros[4]+
                vetorDeInteiros[5]+
                vetorDeInteiros[6]+
                vetorDeInteiros[7]+
                vetorDeInteiros[8]+
                vetorDeInteiros[9]+ */
       
          for (int i = 0; i < vetorDeInteiros.length; i++){
              soma = soma + vetorDeInteiros[i];
          }
               
        
        return soma;
      
    }
        
            

}
