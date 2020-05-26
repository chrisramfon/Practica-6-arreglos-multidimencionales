/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasearreglos;
import java.util.Scanner;
/**
 *
 * @author ali
 */
public class ArreglosMulti {
    private int c;int f;
    private int LimiteF;int LimiteC;
    persona[][] APersonas;
    Scanner leer=new Scanner(System.in);
    public ArreglosMulti(int filas,int columnas){
        APersonas=new persona[filas][columnas];
        f=0;
        c=0;
        LimiteF=filas;
        LimiteC=columnas;
        inicializar();
    }
    
    public void menu(){
        int opc=0;
        do{
            System.out.println("Menu Principal");
            System.out.println("1.-Agregar");
            System.out.println("2.-Mostrar");
            System.out.println("3.-MostrarTodo");
            System.out.println("4.-Buscar");
            System.out.println("5.-Salir");
            opc=leer.nextInt();
            switch(opc){
                case 1: persona px=new persona();
                       System.out.println("Agregar Persona-->");
                       System.out.println("Ingresa Nombre-->");
                       String nom=leer.next();
                       px.setNombre(nom);
                       System.out.println("Ingresa Edad-->");
                       int edad=leer.nextInt();
                       px.setEdad(edad);
                       Agregar(px);
                    break;
                case 2: this.Mostrar();
                        break; 
                case 3: this.MostrarTodo();break;
                case 4: String nombre;
                        System.out.println("Buscar Persona");
                        System.out.println("Escribe el nombre de la persona");
                        nombre=leer.next();
                        persona p=this.Buscar(nombre);
                        if(p!=null){
                            System.out.println("Persona Encontrada");
                            p.mostrar();
                        }else{
                            System.out.println("persona no encontrada");
                        }
                    
                        ;break;
                default:
                    System.out.println("Elige una opcion valida");
            }
        }while(opc<5);
    }
    
    public void Agregar(persona P){
        if(f<LimiteF ){
            if(c<LimiteC){
                this.APersonas[f][c++]=P;
            }else{
                
                c=0;
                if(f<(LimiteF-1)){
                  this.APersonas[++f][c++]=P;                
                }else{
                    System.out.println("Matriz llena");
                }
            }
            
        }else{
            System.out.println("Matriz llena");
        }
        
    }
   
   public void MostrarTodo(){
     for(int y=0;y<LimiteF;y++){
         for(int x=0;x<LimiteC;x++){
             if(APersonas[y][x]!=null){
              System.out.println("posicion Fila "+y+" col "+x+":"+APersonas[y][x].getNombre());}
             }
         }
     }    
   
   public void Mostrar(){
     for(int y=0;y<=f;y++){
         for(int x=0;x<LimiteC;x++){
             if(APersonas[y][x]!=null){
                if(APersonas[y][x].getNombre()!=null){
                  System.out.println("posicion Fila "+y+" col "+x+":"+APersonas[y][x].getNombre());
                }  
             }
            }
         }
     }    

   public persona Buscar(String nom){
     for(int y=0;y<=f;y++){
         for(int x=0;x<LimiteC;x++){
             if(APersonas[y][x]!=null && APersonas[y][x].getNombre()!=null ){
                if(APersonas[y][x].getNombre().equals(nom)){
                  //System.out.println("posicion Fila "+y+" col "+x+":"+APersonas[y][x].getNombre());
                  return APersonas[y][x];
                }  
             }
             
            }
         }
     return null;
     }    

   
   public void inicializar(){
     for(int y=0;y<LimiteF;y++){
         for(int x=0;x<LimiteC;x++){
             
              APersonas[y][x]=new persona();
             
         }
     }    
   }
}
   

    
   
   
   
    

