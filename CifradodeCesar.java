/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cifradodecesar;

import java.util.Scanner;

/**Declaracion de la clase CifradodeCesar
 *@author  Gabriel
 * @author Alejandra
 * @version 3/03/2017
 */
public class CifradodeCesar {

    //Declaracion de variables globales 
    
        String frase1,frase2;
        int clave;
        // Vectores para cifrado
        String min = "abcdefghijklmnopqrstuvwxyz ";
        String may = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        //Vectores para descifrar
        String min1 = " zyxwvutsrqponmlkjihgfedcba";
        String may1 = " ZYXWVUTSRQPONMLKJIHGFEDCBA";
       
       
    
        //metodo para ingresar los datos 
    public void  ingresoDatosC(){

         Scanner S=new Scanner (System.in);
        
            frase2="";

         System.out.println("Digite la linea que desea cifrar o descifrar");
         frase1=S.nextLine();
         System.out.println(frase1);
         System.out.println("Introduce la clave ");
         clave=S.nextInt();
    
    }

   
    //metodo para cifrar 
    public void cifrado(){
        for(int i=0;i<frase1.length(); i++){
            for(int j =0;j<min.length();j++){
                if (frase1.charAt(i)==min.charAt(j)){
                    if(j+clave>=min.length()){
                        frase2+=min.charAt((j+clave)% min.length());
                    }else{
                        frase2 += min.charAt(j+ clave);
                    }
                }
                else if(frase1.charAt(i)==may.charAt(j)){
                    if(j+clave>=may.length()){
                        frase2+=may.charAt((j+clave)% may.length());
          
                    }
                    else{
                        frase2 += may.charAt(j+ clave);
                    }
            }
        }
}
        System.out.println(frase1);
        System.out.println(frase2);
     }

    //metodo de descifrado realiza lo mismo que el metodo cifrar, pero los vectores tienen valores invertidos 
    public void descifrado(){
        for(int i=0;i<frase1.length(); i++){
            for(int j =0;j<min.length();j++){
                if (frase1.charAt(i)==min1.charAt(j)){
                    if(j+clave>=min1.length()){
                        frase2+=min1.charAt((j+clave)% min1.length());
          
                    }else{
                        frase2 += min1.charAt(j+ clave);
                    }
                }
                else if(frase1.charAt(i)==may1.charAt(j)){
                    if(j+clave>=may1.length()){
                        frase2+=may1.charAt((j+clave)% may1.length());
          
                    }else{
                        frase2 += may1.charAt(j+ clave);
                    }
                
            }
    
        }  
}
         System.out.println(frase1);
         System.out.println(frase2);   
     }
   
    /**
     *
     * @param args
     */
    //llama los metodos para ser ejecutados
    public static void main(String[] args) {
         Scanner numero=new Scanner (System.in);
         int num;
         CifradodeCesar ob = new CifradodeCesar ();
        // TODO code application logic here
         CifradodeCesar datos= new  CifradodeCesar();
         System.out.println("Que desea realizar\n");
         System.out.println("Si es cifrado.Digite el numero 1\n");
         System.out.println("Si es descifrado.Digite el numero 2 \n");
         num=numero.nextInt();
         // toma la decision de lo que se va a ejecutar
        if (num==1){
            datos.ingresoDatosC(); 
            datos.cifrado();
          
        }else if(num==2){

             datos.ingresoDatosC(); 
             datos.descifrado();
           
        }

    }   
}

