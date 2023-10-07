package entities;

import java.time.LocalDate;

public class Client {
    private int clientCode;
    private String name;
    private String surname;
    private String email;
    /*private LocalDate date;*/

    public Client(int clientCode, String name, String surname, String email,  String[] strings) {
        this.clientCode = clientCode;
        this.name = name;
        this.surname = surname;
        this.email = email;

    }

    public void call(){
        System.out.println("hello my name and surname are " + this.name + " " + this.surname +
                ". I would like to make a clarification on a product i ordered. My code is: " + this.clientCode);
    }


    @Override
    public String toString() {
        return "Client{" +
                "clientCode=" + clientCode +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getClientCode() {
        return clientCode;
    }

    public void setClientCode(int clientCode) {
        this.clientCode = clientCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
