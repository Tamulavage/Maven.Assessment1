package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    String name ;
    private Pet[] pets;

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
         this.name = name;
         this.pets = pets;
         if(this.pets != null){
         for(Pet ele: pets)  {
             ele.setOwner(this);
         }}

    }

    public PetOwner(String name) {
        this.name = name;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        int len = 1;


        if(this.pets != null) {
            len = this.pets.length;

        }
            Pet[] newPet = new Pet[len];

            newPet[len-1] = pet;
            newPet[len-1].setOwner(this);


        this.pets = newPet;
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {

        if(this.pets.length > 1) {
            ArrayList<Pet> petLost = new ArrayList<Pet>();

            for (int i = 0; i < this.pets.length; i++) {
                if (this.pets[i].equals(pet)) {
                    i++;
                } else {
                    petLost.add(this.pets[i]);
                }
            }


            Pet[] newPetList = new Pet[this.pets.length - 1];


            this.pets = newPetList;
        }
        else {
            this.pets[0] = null;
        }

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        Boolean retVal = false;

        for(int i = 0;i < pets.length;i++){
            if(pets[i].equals(pet)){
                retVal = true;
            }
        }

        return retVal;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int currentAge = 0;
        int lowestAge = 5000;
        Integer retVal = 0;


        for(int index=0; index < pets.length;index++ ){
            currentAge = this.pets[index].getAge();
            if(currentAge<lowestAge) {
                lowestAge = currentAge;
                retVal = currentAge;
            }
        }

        return retVal;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int currentAge = 0;
        int HighestAge = 0;
        Integer retVal = 0;


        for(int index=0; index < pets.length;index++ ){
            currentAge = this.pets[index].getAge();
            if(currentAge>HighestAge) {
                HighestAge = currentAge;
                retVal = currentAge;
            }
        }

        return retVal;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        int sum = 0;
        int len = pets.length;

        for(int index=0; index < pets.length;index++ ){
            sum = sum +this.pets[index].getAge();
        }

        return (float) sum/len;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return (this.pets.length);
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return this.pets;
    }


}
