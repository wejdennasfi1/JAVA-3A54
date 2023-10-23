package tn.esprit.gestionzoo.entities;

public abstract non-sealed class Aquatic extends Animal {

    protected String habitat;

    public Aquatic() {
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }


    public abstract void  swim();

    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }
}
