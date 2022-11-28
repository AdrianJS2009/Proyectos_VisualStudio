package com.politecnicomalaga.hotel;

public class Client {

private final String name, surname, dni, address, email, phone, birthdate, age;


public Client(String name, String surname, String dni, String address, String email, String phone, String birthdate, age);

this.name = name;
this.surname = surname;
this.dni = dni;
this.address = address;
this.email = email;
this.phone = phone;
this.birthdate = birthdate;
this.age = age;

}

public String[] getClientInformation(){

    String[] objects = {this.name, this.surname, this.dni, this.address, this.email, this.phone, this.birthdate, this.age};

    return objects;

}
}







