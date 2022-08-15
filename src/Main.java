public class Main {
    public static void main(String[] args) {
        People p1 = new People("Adam", "Lost", new Dog());
        People p2 = new People("Lucy", "Dobraya", new Cat());
        People p3 = new People("Icar", "Lost", new Cicada());

        p1.animalsVoice();
        p2.animalsVoice();
        p3.animalsVoice();
    }
}