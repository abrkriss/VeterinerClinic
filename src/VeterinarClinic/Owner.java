package VeterinarClinic;

public class Owner extends AbstractPerson{
    public String name;

    public Owner(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Владелец - " + name;
    }
}
