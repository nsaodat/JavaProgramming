package day32_ConstructorOverloading;

public class CarpetObjects {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(8,12,8,true);

        Carpet carpet2 = new Carpet(10,25,8,false);
        System.out.println(carpet1);
        System.out.println(carpet2);

    }
}
