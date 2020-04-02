package legoset;

import lombok.Data;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@Data
public class Weight {

    private String value;

    private double weight;


    public Weight() {}

    public Weight(String value,double weight) {
        this.value = value;
        this.weight = weight;

    }

}
