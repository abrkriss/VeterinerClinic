package VeterinarClinic;

public class Program {
    public static void main(String[] args) {
        Owner Ivan = new Owner("Иван");
        Doctor Maria = new Doctor("Мария");
        Pet p1 = new Pet("Пуся", PetType.cat, Ivan, Maria);
        Pet p2 = new Pet("Рекс", PetType.dog, Ivan, Maria);
        PetClinic petClinic = new PetClinic();
        petClinic.add(p1);
        petClinic.add(p2);
        petClinic.ShowClinic();
        petClinic.foundPet("Пуся");
    }
}
