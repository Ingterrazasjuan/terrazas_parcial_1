/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.terrazas_parcial_1;

/**
 *
 * @author Lenovo
 */
public class Terrazas_parcial_1 {
    public String terrazas_metodo_saludo( String valor1)
    {
        String saludo=" Soy Juan Pablo Terrazas Mojica "
                + "Del grupo 3C PARCIAL1 "
                + "05/06/2025 "
                + "Nuestra mayor debilidad radica en renunciar. La forma más segura de tener éxito es intentarlo";
        return saludo;
    }
    public float terrazas_metodo_veloci(float valor1,float valor2)
    {
        float velocidad=valor1/valor2;
        return velocidad;
    }

    public static void main(String[] args) {
        Terrazas_parcial_1 invocar_metodos=new Terrazas_parcial_1();
        System.out.println(""+invocar_metodos.terrazas_metodo_saludo("Hello"));
        System.out.println("La Velocidad es:"+invocar_metodos.terrazas_metodo_veloci(100,3));
    }
}
