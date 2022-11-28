package com.politecnicomalaga.hotel;

import java.util.ArrayList;

public class Hotel 
{

   private final String description, name, address, phone, email;
   private final ArrayList<Client> client;

   public Hotel(){

      this.description = "Hotel 5* situado a 1,5 km de la Malagueta.";
      this.name = "Only YOU Hotel Málaga.";
      this.address = "Alameda Principal 1, Centro de Málaga, 29001 Málaga, España";
      this.phone = "910 05 27 46";
      this.email = "onlyyouhotel@gmail.com";
      this.client = new ArrayList<>();
   }

   public void showClients(){

      if (!client.isEmpty()){

         for (int i = 0; i < client.size(); i++){

            System.out.println("\n\nDNI: " + client.get(i));
         }
      }
   }

        public static void main( String[] args )
    {
    
       
   
   
   }
       
       }
    

