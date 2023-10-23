package tn.esprit.gestionzoo.entities;

public class Zoo {

    public static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private String name, city;
    private int nbrAnimals;
    private int nbraquatic;
    private Aquatic[] aquaticAnimals =new Aquatic[10];

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        this.name = name;
        this.city = city;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    public int getNbraquatic() {
        return nbraquatic;
    }

    public void setNbraquatic(int nbraquatic) {
        this.nbraquatic = nbraquatic;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public void setName(String name) {
        if (name.isBlank())
            System.out.println("The Zoo name cannot be empty");
        else
            this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (isZooFull())
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    public boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    @Override
    public String toString() {
        return "Zoo{ Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals + "}";
    }

    public int searchAquatic(Aquatic aquatic) {
        int index = -1;
        for (int i = 0; i < 10; i++) {
            if ( aquaticAnimals[i] != null&& aquatic.getName() == aquaticAnimals[i].getName())
                return i;
        }
        return index;
    }
    public void addAquaticAnimal(Aquatic aquatic){

        int i =searchAquatic( aquatic);
        if(i==-1) {
            aquaticAnimals[nbraquatic]=aquatic;
            nbraquatic++;
            System.out.println("DONE ");

        } else{
            System.out.println("existe deja ");
            }


        }


        public void displayaquatics(){
        for(int i =0;i<aquaticAnimals.length;i++)  {
            if (aquaticAnimals[i] != null)
                aquaticAnimals[i].swim();

            }
        }
        public float maxPenguinSwimmingDepth(){
        float max=0f;
        for (int i=0;i<aquaticAnimals.length;i++)
        {
            if(aquaticAnimals[i]!=null&& aquaticAnimals[i] instanceof Penguin)
            {
                if(((Penguin) aquaticAnimals[i]).getSwimmingDepth()>max)
                    max=((Penguin) aquaticAnimals[i]).getSwimmingDepth();
            }
        }
        return max;
        }

        public void displayNumberOfAquaticsByType(){
        int nbrD=0;
        int nbrP=0;
            for (int i=0;i<aquaticAnimals.length;i++)
            {
                if(aquaticAnimals[i]!=null&& aquaticAnimals[i] instanceof Penguin)
                {
                    nbrP++;
                }
                if(aquaticAnimals[i]!=null&& aquaticAnimals[i] instanceof  Dolphin)
                {
                    nbrD++;
                }
            }
            System.out.println("nombre dolphin : "+nbrD+" \nnombre Penguin :"+nbrP);

        }

}
