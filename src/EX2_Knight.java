public class EX2_Knight extends EX2_Soldier {

    public EX2_Knight(String name) {
        super(name);
        this.price = 245;
        this.phrase = "Наше дело правое, а врага — найдем";
    }
    public void feed(){
        System.out.println("Horse feeding");
    }
}
