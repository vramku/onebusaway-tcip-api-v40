//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package lrms_final_09_07_for_atis_im;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkGeneral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkGeneral"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startLocation" type="{http://www.lrms-final-09-07-for-atis-im}PointLocation"/&gt;
 *         &lt;element name="endLocation" type="{http://www.lrms-final-09-07-for-atis-im}PointLocation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkGeneral", propOrder = {
    "startLocation",
    "endLocation"
})
public class LinkGeneral {

    @XmlElement(required = true)
    protected PointLocation startLocation;
    @XmlElement(required = true)
    protected PointLocation endLocation;

    /**
     * Gets the value of the startLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PointLocation }
     *     
     */
    public PointLocation getStartLocation() {
        return startLocation;
    }

    /**
     * Sets the value of the startLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointLocation }
     *     
     */
    public void setStartLocation(PointLocation value) {
        this.startLocation = value;
    }

    /**
     * Gets the value of the endLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PointLocation }
     *     
     */
    public PointLocation getEndLocation() {
        return endLocation;
    }

    /**
     * Sets the value of the endLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointLocation }
     *     
     */
    public void setEndLocation(PointLocation value) {
        this.endLocation = value;
    }

}
