package com.mycompany.crudconsola;

import java.util.Scanner;

public class CrudConsola {
    
    Consultar consulta = new Consultar();
    Insertar inserta = new Insertar();
    Modificar mod = new Modificar();
    Eliminar elimina = new Eliminar();
    
      public void menu(){
        while(true){
            Scanner sc = new Scanner(System.in);
            Scanner sc1 = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            Scanner sc3 = new Scanner(System.in);
            Scanner sc4 = new Scanner(System.in);
            System.out.println("------------------------------");
            System.out.println("|      MENU PRINCIPAL        |");
            System.out.println("|   1. MOSTRAR               |");
            System.out.println("|   2. CREAR                 |");
            System.out.println("|   3. MODIFICAR             |");
            System.out.println("|   4. ELIMINAR              |");
            System.out.println("|   5. CERRAR                |");
            System.out.println("------------------------------");
            
            int resp = sc.nextInt();
            
            int codigo;
            String nombre;
            String direccion;
            int tel;
                    
            switch(resp){
                case 1://MOSTRAR
                    consulta.consultarBase();
                    break;
                case 2://CREAR O INSERTAR
                    System.out.println("Escriba el nombre: ");
                    nombre = sc1.nextLine();
                    System.out.println("Escriba la dirección: ");
                    direccion = sc2.nextLine();
                    System.out.println("Escriba el telefono: ");
                    tel = sc3.nextInt();
                    inserta.crear(nombre,direccion,tel);
                    break;
                case 3:// MODIFICAR
                    System.out.println("Escriba el CODIGO a modificar: ");
                    codigo=sc1.nextInt();
                    System.out.println("Escriba el nombre: ");
                    nombre = sc2.nextLine();
                    System.out.println("Escriba el telefono: ");
                    tel = sc3.nextInt();
                    System.out.println("Escriba la dirección: ");
                    direccion = sc4.nextLine();
                    
                    mod.modificar(codigo,  nombre, direccion ,  tel);
                    break;
                case 4://ELIMINAR
                    System.out.println("Escriba el CODIGO A ELIMINAR: ");
                    codigo=sc1.nextInt();
                    elimina.eliminar(codigo);
                    break;
                case 5://CERRAR
                    System.exit(0);
                    break;     
            }
        }
      }
    public static void main(String[] args) {
        CrudConsola cc = new CrudConsola();
        cc.menu();
    }
}
