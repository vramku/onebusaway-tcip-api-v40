//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package lrms_local_atis_im;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedPointType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExtendedPointType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="dummy1"/&gt;
 *     &lt;enumeration value="dummy2"/&gt;
 *     &lt;enumeration value="dummy3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExtendedPointType")
@XmlEnum
public enum ExtendedPointType {

    @XmlEnumValue("dummy1")
    DUMMY_1("dummy1"),
    @XmlEnumValue("dummy2")
    DUMMY_2("dummy2"),
    @XmlEnumValue("dummy3")
    DUMMY_3("dummy3");
    private final String value;

    ExtendedPointType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExtendedPointType fromValue(String v) {
        for (ExtendedPointType c: ExtendedPointType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
