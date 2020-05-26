/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasearreglos;

/**
 *
 * @author ali
 */
public class persona {
    private int edad;
private String apellidos;
private int codigo;
    
    private String nombre;
    public persona(){
        edad=0;
        nombre=null;
        apellidos = null;
        codigo = 0;
        
    }
    public void setApellidos(String apellidos){
    this.apellidos = apellidos;
}
    public String getApellidos(){
        return apellidos;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setNombre(String n){
        nombre=n;
    }
    public String getNombre(){
        return nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    
    public void mostrar(){
        System.out.println("Nombre -> "+getNombre());
        System.out.println("Apellidos -> "+getApellidos());
        System.out.println("Edad -> "+getEdad());
        System.out.println("Código -> "+getCodigo());
                
    }
    
    
    
    
    
}
