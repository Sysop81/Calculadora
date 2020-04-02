/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_git;

/**
 * Clase Calculadora
 * Esta clase se encarga de crear objetos del tipo calculadora, constando cada objeto
 * de dos atributos que seran los operadores de cada uno de los metodos de los que consta
 * la clase.
 * Subido a GitHub el 30/03/2020
   ------------>Comentario modificado en el apartado 9 rama2 <-------- 
 * @author Jose Ramon Lopez Guillen
 * @version 1.0,  20 de Marzo de 2020
 * @since 20 de Marzo de 2020
 */


public class Calculadora implements NewInterface {
    private int num1;
    private int num2;
    
    
    /**
    * Constructor de la clase Calculadora, recibe como parametros:
    * @param a operador 1 de tipo entero
    * @param b operador 2 de tipo entero
    * 
    */
    public Calculadora(int a, int b){
     this.num1 = a;
     this.num2 = b;
    }
    
    /**
     * Metodo suma() suma los valores pasados como parametro al objeto Calculadora
     * @return Retorna la suma de ambos operadores
     */
    @Override
    public int suma(){
        return this.num1 + this.num2;
    }
    
    /**
     * Metodo resta() resta los valores pasados como parametro al objeto Calculadora
     * @return Retorna la resta de ambos operadores
     */
    @Override
    public int resta(){
        if (this.num1 >= this.num2){
            return this.num1 - this.num2;
        }else{
            return this.num2 -this.num1;
        }
    }
    
    /**
     * Metodo multiplicar() multiplica los valores pasados como parametro al objeto Calculadora
     * @return Retorna el producto de ambos operadores
     */
    @Override
     public int multiplicar(){
        return this.num1 * this.num2;
    }
     
    /**
     * Metodo dividir() divide los valores pasados como parametro al objeto Calculadora
     * @return Retorna la division de ambos operadores
     * @throws ArithmeticException si el operador 2 es cero
     */
    @Override
      public int dividir(){
          
          if (num2 == 0){
              throw new java.lang.ArithmeticException("División por 0"); 
          }else{
            return this.num1 / this.num2;
             
          }
          
    }
}
