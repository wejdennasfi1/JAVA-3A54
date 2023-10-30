package tn.esprit.gestionzoo.entities;

public class InvalidAgeException extends RuntimeException{
    public InvalidAgeException()
    {
        System.out.println("on peut pas ajouter un animal avec un age negatif ");
    }

}
