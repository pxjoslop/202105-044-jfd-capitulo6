package edu.cibertec.capitulo6.ejercicio1;

public class Ejecutora {
    
    public static void main(String[] args) {
        
        Club partido1local = Club.BARCELONA;
        Club partido1visita = Club.RAYO_VALLECANO;
        
        Club partido2local = Club.REAL_MADRID;
        Club partido2visita = Club.SEVILLA;
        
        System.out.println("El partido uno será: "+partido1local.getNombreClub()+
                " versus "+partido1visita.getNombreClub());

        System.out.println("El partido dos será: "+partido2local.getNombreClub()+
                " versus "+partido2visita.getNombreClub());
        
        Class claseClub = Club.class;
        System.out.println("Clase: "+claseClub.getName());
        System.out.println("Paquete: "+claseClub.getPackage());
        System.out.println("Padre : "+claseClub.getSuperclass());
        
        Class claseString = "HolaMundo".getClass();
        System.out.println("Clase: "+claseString.getName());
        System.out.println("Paquete: "+claseString.getPackage());
        System.out.println("Padre : "+claseString.getSuperclass());
        
    }
    
}
