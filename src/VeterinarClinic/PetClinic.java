package VeterinarClinic;
import java.util.ArrayList;
import java.util.List;


public class PetClinic implements InterClinicAddPet, InterFoundByName {
    public List<Pet> petList;
    public PetClinic(){
        this(new ArrayList<>());
    }
    public PetClinic( List<Pet> petList){
        this.petList = petList;
    }

    @Override
    public boolean add(Pet pet) {
        if(pet==null){
            return false;
        }
        if (!petList.contains(pet)){
            petList.add(pet);
        }
        return false;
    }

    @Override
    public Pet foundPet(String name){
        for (Pet pet:petList) {
            if(pet.getName().equals(name)){
                System.out.println("\nРезультат поиска: " + pet);
                return pet;
            }
        }return null;
    }

    public void ShowClinic(){
        System.out.println("\nСейчас в клинике: " + petList);
    }


}
