package com.politecnicomalaga.triage;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class triaje
{
    public static void main( String[] args )
    {
        boolean continuar = true;
        Scanner kb = new Scanner(System.in);
        String opcion, respuesta;

        int verde, amarillo, rojo, negro;
        
        verde = 0;
        amarillo = 0;
        rojo = 0;
        negro = 0;

        //Creo la estructura de un menú con un bucle while
        while(continuar){
            //Aqui mostraremos las posibles opciones para el usuario, dandole información clave.
            System.out.println("############################");
            System.out.println("Opciones:");
            System.out.println("1. Triaje");
            System.out.println("2. Estadísticas");
            System.out.println("Presione cualquier otra tecla para salir.");
            System.out.println("###########################");

            //Solicitamos una opción nueva. En este caso con la variable String opcion.
            opcion = kb.nextLine();

            switch(opcion){
                //Opcion de triaje
                //Ejecutamos el triaje

                case "1": //Preguntar si el paciente puede caminar o no.
                            System.out.println("¿Puede caminar el paciente? [SI/NO] - Cualquier otro input -> NO");
                            respuesta = kb.nextLine();
                            if (respuesta.equals("SI")){
                                //Si puede caminar
                                System.out.println("Prioridad Verde");
                                verde++;
                            }else {
                               //No puede caminar
                               System.out.println("¿El paciente respira? [SI/NO] - Cualquier otro input -> NO");
                               respuesta = kb.nextLine();
                               if (respuesta.equals("SI")){
                                //Si puede Respirar
                                //Procedemos con la FR
                                    System.out.println("¿FR mayor a 30? [SI/NO] - Cualquier otro input -> NO");
                                    respuesta = kb.nextLine();
                                    if (respuesta.equals("SI")){
                                        //La FR es mayor
                                        System.out.println("Prioridad roja");
                                        rojo++;
                                    }else{
                                        //La FR no es mayor. Entra la pregunta del pulso.
                                        System.out.println("¿Pulso Radial? [SI/NO] - Cualquier otro input -> NO");
                                        respuesta = kb.nextLine();
                                        if(respuesta.equals("SI")){
                                            //Si tiene pulso radial. Entra la pregunta de si está orientado.
                                            System.out.println("¿Está orientado? [SI/NO] - Cualquier otro input -> NO");
                                            respuesta = kb.nextLine();
                                            if(respuesta.equals("SI")){
                                                //Sí está orientado.
                                                System.out.println("Prioridad Amarilla");
                                                amarillo++;

                                            } else {
                                                // No
                                                System.out.println("Prioridad Roja");
                                                rojo++;
                                            }
                                        } else {
                                            //No tiene pulso radial
                                            System.out.println("Posible hemorragia. Controlar");
                                            System.out.println("Prioridad Roja");
                                            rojo++;
                                        }
                                    }

                               } else {
                                  //No puede. Reposición.
                                  System.out.println("Al reposicionar respira? [SI/NO] - Cualquier otro input -> NO");
                                  respuesta = kb.nextLine();
                                  if (respuesta.equals("SI")){
                                    //Si respira al ser posicionado.
                                    System.out.println("Prioridad Roja");
                                    rojo++;
                                  } else {
                                    //No respira al ser posicionado.
                                    System.out.println("Prioridad Negra");
                                    negro++;
                                  }
                               }
                            }
                break;

                //Opcion B. Estadisticas
                case "2": // Tengo que mostrar estadísticas
                            System.out.println("Estadísticas: ");
                            System.out.println("#######################");
                            System.out.println("Verde: " + String.valueOf(verde));
                            System.out.println("Amarillo: " + String.valueOf(amarillo));
                            System.out.println("Rojo: " + String.valueOf(rojo));
                            System.out.println("Negro: " + String.valueOf(negro));
                            break;

                            //Salimos del bucle
                            default: continuar = false;
                            

            }
        }


    }
}
