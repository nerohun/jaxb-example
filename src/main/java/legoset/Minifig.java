package legoset;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlValue;

public class Minifig {


    @XmlValue
    private String name;
    @XmlAttribute
    private int count;

    public Minifig(){}

    public Minifig(String name,int count) {
        this.name = name;
        this.count = count;

    }


}
