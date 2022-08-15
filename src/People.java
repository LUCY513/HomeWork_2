public class People {
    private String name;
    private String surname;
    private Animals pet;

    public People(String name, String surname, Animals pet){
        this.name = name;
        this.surname = surname;
        this.pet = pet;
    }

    public void animalsVoice(){
        pet.voice();
    }
}
