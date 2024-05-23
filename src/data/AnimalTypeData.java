package data;

public enum AnimalTypeData {
    CAT("кот"),
    DOG("собака"),
    DUCK("утка");

   private String animalType;

   AnimalTypeData(String animalType) {
        this.animalType = animalType;
   }

    public String getAnimalType() {
        return animalType;
    }
}