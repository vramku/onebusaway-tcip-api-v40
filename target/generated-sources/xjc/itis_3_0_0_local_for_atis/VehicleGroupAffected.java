//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package itis_3_0_0_local_for_atis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleGroupAffected.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleGroupAffected"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="insert-here"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleGroupAffected", namespace = "http://www.itis-3-0-0-local-for-atis")
@XmlEnum
public enum VehicleGroupAffected {

    @XmlEnumValue("insert-here")
    INSERT_HERE("insert-here");
    private final String value;

    VehicleGroupAffected(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleGroupAffected fromValue(String v) {
        for (VehicleGroupAffected c: VehicleGroupAffected.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
