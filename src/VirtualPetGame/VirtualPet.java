package VirtualPetGame;

public class VirtualPet {
    private String name;
    private int age;
    private PetNeeds petNeeds;

    public interface PetActions{
        void feed();
        void drink();
        void play();
    }


}
