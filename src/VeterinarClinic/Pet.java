package VeterinarClinic;

public class Pet extends AbstractPerson{
    public String name;
    public PetType type;
    public Owner owner;
    public Doctor doctor;

    public Pet(String name, PetType type, Owner owner, Doctor doctor){
        super(name);
        this.type = type;
        this.owner = owner;
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "\nПитомец " + name + '\n' +
                "тип животного " + type + '\n' +  owner  + '\n'+ doctor + "\n";
    }

    public String getName() {
        return name;
    }
}
