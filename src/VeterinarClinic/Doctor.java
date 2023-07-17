package VeterinarClinic;

public class Doctor extends AbstractPerson {
    public String name;

    public Doctor(String name) {
        super(name);
    }


    @Override
    public String toString() {
        return "Врач - " + name;
    }
}