//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package lrms_final_09_07_for_atis_im;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrossStreets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrossStreets"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="locationName" type="{http://www.lrms-final-09-07-for-atis-im}Text-name255" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="crossStreetsPoint" type="{http://www.lrms-final-09-07-for-atis-im}CrossStreetsPoint"/&gt;
 *           &lt;element name="crossStreetsLink" type="{http://www.lrms-final-09-07-for-atis-im}CrossStreetsLink"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="locationID" type="{http://www.lrms-final-09-07-for-atis-im}String-index64" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossStreets", propOrder = {
    "locationName",
    "crossStreetsPoint",
    "crossStreetsLink"
})
public class CrossStreets {

    protected String locationName;
    protected CrossStreetsPoint crossStreetsPoint;
    protected CrossStreetsLink crossStreetsLink;
    @XmlAttribute(name = "locationID")
    protected String locationID;

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the crossStreetsPoint property.
     * 
     * @return
     *     possible object is
     *     {@link CrossStreetsPoint }
     *     
     */
    public CrossStreetsPoint getCrossStreetsPoint() {
        return crossStreetsPoint;
    }

    /**
     * Sets the value of the crossStreetsPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossStreetsPoint }
     *     
     */
    public void setCrossStreetsPoint(CrossStreetsPoint value) {
        this.crossStreetsPoint = value;
    }

    /**
     * Gets the value of the crossStreetsLink property.
     * 
     * @return
     *     possible object is
     *     {@link CrossStreetsLink }
     *     
     */
    public CrossStreetsLink getCrossStreetsLink() {
        return crossStreetsLink;
    }

    /**
     * Sets the value of the crossStreetsLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossStreetsLink }
     *     
     */
    public void setCrossStreetsLink(CrossStreetsLink value) {
        this.crossStreetsLink = value;
    }

    /**
     * Gets the value of the locationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationID(String value) {
        this.locationID = value;
    }

}
