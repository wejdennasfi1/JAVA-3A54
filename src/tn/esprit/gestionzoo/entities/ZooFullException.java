package tn.esprit.gestionzoo.entities;

public class ZooFullException extends RuntimeException {
    public ZooFullException() {
        System.out.println("Le zoo est plein. Impossible d'ajouter plus d'animaux.");
    }
}
