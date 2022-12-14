package day31_CustomClass_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("LA", "Microsoft", "SDET", 110000, true, false, true, true);

        Offer offer2 = new Offer();
        offer2.setInfo("CA", "Sony Inc", "QA", 120000, true, false, false, true);

        Offer offer3 = new Offer();
        offer3.setInfo("FL", "Apple Inc", "QE", 125000, true, true, true, false);

        Offer offer4 = new Offer();
        offer4.setInfo("TX", "CapitalOne", "SM", 115000, false, false, true, true);

        Offer offer5 = new Offer();
        offer5.setInfo("WA", "Bank Of America", "BA", 130000, true, true, false, true);

        System.out.println("offer1 = " + offer1);
        System.out.println("offer2 = " + offer2);
        System.out.println("offer3 = " + offer3);
        System.out.println("offer4 = " + offer4);
        System.out.println("offer5 = " + offer5);

        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5};// array

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p -> !p.isFullTime); // removes the offer if the offer isNotFullTime

        System.out.println(fullTimeOffers.size()); // 4

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p -> !(p.location.equals("LA") || p.location.equals("VA")));

        System.out.println(localOffers.size()); // 1

        // we can extract the attributes from localOffers ArrayList after removing the offers that are not local.
        for (Offer each : localOffers) {
            System.out.println(each.companyName + ": $" + each.salary);// Microsoft: $110000.0
    }

        ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(myOffers));
        offersWithBenefits.removeIf(p -> !(p.hasBenefit == true || p.hasPTO == true));

        System.out.println(offersWithBenefits.size()); // 4

        ArrayList<Offer> sdetOffers = new ArrayList<>(Arrays.asList(myOffers));
        sdetOffers.removeIf(p -> !p.jobTitle.equals("SDET"));

        System.out.println(sdetOffers.size());// 1

        ArrayList <Offer> offersWith100K = new ArrayList<>(Arrays.asList(myOffers));
        offersWith100K.removeIf(p-> p.salary > 100000);
        System.out.println(offersWith100K.size()); // 0

        for (Offer each : offersWith100K) {
            System.out.println(each.companyName + ": $" + each.salary); // 0
        }

    }
}


/*
 Create a class named MyOffers:

				2.1 Create 7 objects of Offer
				2.2 Create an array of Offers named myOffers and store all 7 objects of offers
				2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
						2.3.1 Write a program that can remove the offer objects that are not full-time
				2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
						2.4.1 Write a program that can remove all the offers that are not from local
				2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
						2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
				2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
						2.6.1 Write a program that can remove all the offers that are not for SDET
				2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
						2.7.1 Write a program that can remove all the offers that are offering less than 100K salary

 */