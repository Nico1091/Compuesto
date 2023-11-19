/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones_matematicas;
import java.util.Stack;
import java.util.Scanner;
/**
 *
 * @author Nico
 */
public class Operaciones_Matematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Nodo lista = new Nodo();
        Nodo igual = lista.actual;
        Nodo siguiente = lista.sig;
        Nodo anterior = lista.ant;
         String expresion = null;
        Operaciones_Matematicas llamados = new Operaciones_Matematicas();
        Stack <String> pila  = new  Stack <String>();
        llamados.expresion_aritmetica(expresion, pila,igual,siguiente,anterior);
        System.out.println("Inorden");
        llamados.Inorden(expresion, pila, igual, siguiente, anterior, igual, igual,igual);
        System.out.println("Preorden");
        llamados.Preorden(expresion, pila, igual, siguiente, anterior, igual);
        System.out.println("Posorden");
        llamados.Posorden(expresion, pila, igual, siguiente, anterior,igual);
     //  Stack <String> pila = new Stack();
      // pila.add("+"+"-"+"*"+"/"+"1"+"2"+"3"+"4"+"5"+"6"+"/"+"8"+"9");        
    }  
    public void ArbolBinario( Nodo nodo,Nodo raiz){
        nodo=raiz;
    }
    public void expresion_aritmetica(String expresion,Stack pila,Nodo igual,Nodo siguiente,Nodo anterior){
        System.out.println("Digite una expresion Aritmetica");
        Scanner Sc = new Scanner(System.in);
        expresion= Sc.nextLine();
        System.out.println("Expresion Aritmetica");
        pila.add(expresion);
        System.out.println(pila);
    }
   /* public boolean Returnar_vacio(){
        Nodo lista = new Nodo();
        return lista.raiz==null;
    }*/
   /* public void comprobacion(String expresion){
        if(expresion==null)
            System.out.println("la expresion aritmetica esta vacia");
    }*/
    public void Inorden(String expresion,Stack pila,Nodo igual,Nodo siguiente,Nodo anterior,Nodo nodo,Nodo raiz,Nodo actual){
         actual=raiz;
        while(actual!=null||pila.isEmpty()){
            while(actual!=null){
            pila.add(actual);
                actual=actual.ant;}
             actual=(Nodo) pila.pop();
            System.out.println(actual.dato+" ");
            actual=actual.sig;
        } 
   }
    public void Preorden(String expresion,Stack pila,Nodo igual,Nodo siguiente,Nodo anterior,Nodo actual){
   preorden(expresion);
    }
     public void Posorden(String expresion,Stack pila,Nodo igual,Nodo siguiente,Nodo anterior,Nodo actual){
        while(actual!=null||pila.isEmpty()){
            for (int i = 0; i < pila.size(); i++) {
                actual=actual.ant;
                pila.pop();
                actual=actual.sig;
                System.out.println(actual.dato);  
            }
        }
    }
}