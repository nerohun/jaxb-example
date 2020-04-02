package legoset;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Year;
import java.util.ArrayList;
import java.util.Set;


import jaxb.JAXBHelper;


public class Main {
    public static void main(String[] args) throws Exception {

        LegoSet legoset = new LegoSet();
        Weight weight = new Weight();
        legoset.setNumber("75211");
        legoset.setName("Imperial TIE Fighter");
        legoset.setTheme("Star Wars");
        legoset.setSubtheme("Solo");
        legoset.setYear(Year.of(2018));
        legoset.setPieces(519);
        legoset.setTags(Set.of("Starfighter","Stormtrooper","Star Wars","Solo"));
        legoset.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");
        ArrayList<Minifig> minifigs = new ArrayList<>();
        minifigs.add(new Minifig("Imperial Mudtrooper",2));
        minifigs.add(new Minifig("Imperial Pilot", 1));
        minifigs.add(new Minifig("Mimban Stormtrooper", 1));

        legoset.setMinifigs(minifigs);

        ArrayList<Weight> weights = new ArrayList<>();
        weights.add(new Weight(0.89,"kg"));

        legoset.setWeight(weights);



        JAXBHelper.toXML(legoset, System.out);

        JAXBHelper.toXML(legoset, new FileOutputStream("legoset.xml"));
        System.out.println(JAXBHelper.fromXML(LegoSet.class, new FileInputStream("legoset.xml")));
    }
}
