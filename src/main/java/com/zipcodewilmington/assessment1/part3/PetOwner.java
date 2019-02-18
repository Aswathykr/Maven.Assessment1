package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    private String name;
    private ArrayList<Pet> pets;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.pets = new ArrayList<Pet>();
        if(pets!= null) {
            for (Pet pet : pets) {
                pet.setOwner(this);
                this.pets.add(pet);
            }
        }
        this.name = name;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        if(pet != null)
            pets.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        pets.remove(pet);

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {

        return pets.contains(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Pet youngest = null;
        for(Pet pet : pets)
        {
            if(youngest == null || pet.getAge() < youngest.getAge()){
                youngest = pet;
            }
        }
        return youngest.getAge();
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Pet oldest = null;
        for(Pet pet : pets)
        {
            if(oldest == null || pet.getAge() > oldest.getAge()){
                oldest = pet;
            }
        }
        return oldest.getAge();
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Integer sumOfAges = 0;
        for(Pet pet : pets)
        {
            sumOfAges += pet.getAge();
        }
        return (float)(sumOfAges / pets.size());
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets.size() == 0 ? new Pet[1] :  pets.toArray(new Pet[pets.size()]);

    }
}
