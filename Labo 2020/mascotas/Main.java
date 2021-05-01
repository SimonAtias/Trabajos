package mascotas;
import personas.Persona;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    // No se que es un metodo "static", solo lo hice asi porque me indicaba que lo haga
    public static boolean checkearQueNoCompartaNombre(HashSet<Mascota> mascotas, Mascota mascota){
        for(Mascota m: mascotas){
            if(m.getNombre()==mascota.getNombre()){
                return true;
            }
        }
        return false;
    }

    public static Mascota getMascotaConNombre(HashSet<Mascota> mascotas, String nombre){
        Mascota mascota=new Mascota();
        for(Mascota m: mascotas){
            if(m.getNombre()==nombre){
                mascota=m;
                break;
            }
        }
        return mascota;
    }

    public static boolean existeDuenio(HashSet<Persona> personas, int DNI){
        for(Persona p: personas){
            if(p.getDNI()==DNI){
                return true;
            }
        }
        return false;
    }

    public static Persona getDuenio(HashSet<Persona> personas, int DNI){
        Persona x = new Persona("abc",-1, -1);
        for(Persona p: personas){
            if(p.getDNI()==DNI){
                return p;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        HashSet<Mascota> mascotas =  new HashSet<>();
        HashSet<Persona> duenios = new HashSet<>();
        Mascota rico = new Pajaro();

        Scanner ingreso = new Scanner(System.in);
        while(true){
            Persona usuario = new Persona();
            System.out.println("Esta registrado? (si o no)");
            String rtaString = ingreso.nextLine();
            if(rtaString=="si"){
                System.out.println("Ingrese dni");
                int rtaInt = ingreso.nextInt();
                Persona aux=getDuenio(duenios,rtaInt);
                if(usuario==aux){
                    System.out.println("No esta ingresado en el sistema. Registrese");
                }
                else{
                    System.out.println("Que desea hacer?");
                    System.out.println("1. Saludar");
                    System.out.println("2. Alimentar");
                    System.out.println("3. Dar de alta una mascota");
                    System.out.println("4. Dar de baja una mascota");
                    rtaInt = ingreso.nextInt();
                    if(rtaInt==1){
                        System.out.println("Ingrese el nombre de la mascota con la que desea interactuar");
                        rtaString = ingreso.nextLine();
                        Mascota animal = getMascotaConNombre(mascotas,rtaString);
                        animal.imprimirSaludo(usuario);
                    }
                    else if(rtaInt==2){
                        System.out.println("Ingrese el nombre de la mascota con la que desea interactuar");
                        rtaString = ingreso.nextLine();
                        Mascota animal = getMascotaConNombre(mascotas,rtaString);
                        animal.alimentar();
                    }
                    else if(rtaInt==3){
                        Mascota m;
                        System.out.println("Ingresar tipo de la mascota:");
                        System.out.println("1. pajaro");
                        System.out.println("2. gato");
                        System.out.println("3. perro");
                        System.out.println("4. pez");
                        rtaString=ingreso.nextLine();
                        if(rtaInt==1){
                            m = new Pajaro();
                            System.out.println("Ingresar nombre:");
                            m.setNombre(ingreso.nextLine());
                            m.setDuenio(usuario);
                            mascotas.add(m);
                        }
                        else if(rtaInt==2){
                            m = new Gato();
                            System.out.println("Ingresar nombre:");
                            m.setNombre(ingreso.nextLine());
                            m.setDuenio(usuario);
                            mascotas.add(m);
                        }
                        else if(rtaInt==3){
                            m = new Perro();
                            System.out.println("Ingresar nombre:");
                            m.setNombre(ingreso.nextLine());
                            m.setDuenio(usuario);
                            mascotas.add(m);
                        }
                        else if(rtaInt==4){
                            m = new Pez();
                            System.out.println("Ingresar nombre:");
                            m.setNombre(ingreso.nextLine());
                            m.setDuenio(usuario);
                            mascotas.add(m);
                        }
                    }
                    else if(rtaInt==4){
                        System.out.println("Ingrese el nombre de la mascota que desee eliminar");
                        rtaString = ingreso.nextLine();
                        Mascota animal = getMascotaConNombre(mascotas,rtaString);
                        mascotas.remove(animal);
                    }
                }
            }
            else if(rtaString=="no"){
                System.out.println("Ingrese dni");
                int rtaInt = ingreso.nextInt();
                if(existeDuenio(duenios, rtaInt)){
                    System.out.println("usted esta registrado");
                }
                else{
                    Persona p = new Persona(rtaInt);
                    p.setEdad(ingreso.nextInt());
                    p.setNombre(ingreso.nextLine());
                }
            }



        }

    }
}
