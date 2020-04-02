package legoset;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Weight {
    @XmlValue
    private double weight;

    @XmlAttribute
    private String unit;


    public Weight() {}

    public Weight(double weight, String unit) {
        this.weight = weight;
        this.unit = unit;
    }

}
