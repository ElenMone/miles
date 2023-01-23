public class Main {
    public static void main(String[] args) {
        int price = 10000;
        byte oneMile = 20;
        int calculation = (price / oneMile);
        int bonusMile = (calculation / oneMile);


        System.out.println("Начислено миль " + bonusMile);
    }
}