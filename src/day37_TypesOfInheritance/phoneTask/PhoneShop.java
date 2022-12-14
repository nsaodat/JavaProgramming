package day37_TypesOfInheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {


    Iphone iphone = new Iphone("SCE", "10 inches", 850, "white");

    Samsung samsung = new Samsung("galaxy S20", "6 inches", 900, "black");

    Nokia nokia = new Nokia("Brick", "5 inches", 550, "grey");


        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(9999);
        iphone.text(654578787);
        iphone.faceTime(588898);
        iphone.faceTime("lnhkh@gmail.com");

        System.out.println("_____________________________");

        samsung.call(455456565);
        samsung.text(25456656);
        samsung.freeze();

        System.out.println("_____________________________");

        nokia.call(646565);
        nokia.text(56655);
        nokia.selfDefence();

        System.out.println("_____________________________");

        System.out.println(iphone.hasBattery);
        System.out.println(Phone.hasBattery);
        System.out.println(samsung.hasBattery);
        System.out.println(Nokia.hasBattery);


}


}