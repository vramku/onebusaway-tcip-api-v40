//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package tcip_final_4_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CPTShelter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CPTShelter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shelter" type="{http://www.TCIP-Final-4-0-0}CPTShelterIden"/&gt;
 *         &lt;element name="metadata" type="{http://www.TCIP-Final-4-0-0}CPTRowMetaData" minOccurs="0"/&gt;
 *         &lt;element name="shelterType" type="{http://www.TCIP-Final-4-0-0}CPT-ShelterType"/&gt;
 *         &lt;element name="padType" type="{http://www.TCIP-Final-4-0-0}CPT-PadType" minOccurs="0"/&gt;
 *         &lt;element name="stoppoint" type="{http://www.TCIP-Final-4-0-0}CPTStoppointIden" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPTShelter", propOrder = {
    "shelter",
    "metadata",
    "shelterType",
    "padType",
    "stoppoint"
})
public class CPTShelter {

    @XmlElement(required = true)
    protected CPTShelterIden shelter;
    protected CPTRowMetaData metadata;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String shelterType;
    @XmlSchemaType(name = "anySimpleType")
    protected String padType;
    protected CPTStoppointIden stoppoint;

    /**
     * Gets the value of the shelter property.
     * 
     * @return
     *     possible object is
     *     {@link CPTShelterIden }
     *     
     */
    public CPTShelterIden getShelter() {
        return shelter;
    }

    /**
     * Sets the value of the shelter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTShelterIden }
     *     
     */
    public void setShelter(CPTShelterIden value) {
        this.shelter = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link CPTRowMetaData }
     *     
     */
    public CPTRowMetaData getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTRowMetaData }
     *     
     */
    public void setMetadata(CPTRowMetaData value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the shelterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShelterType() {
        return shelterType;
    }

    /**
     * Sets the value of the shelterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShelterType(String value) {
        this.shelterType = value;
    }

    /**
     * Gets the value of the padType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPadType() {
        return padType;
    }

    /**
     * Sets the value of the padType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPadType(String value) {
        this.padType = value;
    }

    /**
     * Gets the value of the stoppoint property.
     * 
     * @return
     *     possible object is
     *     {@link CPTStoppointIden }
     *     
     */
    public CPTStoppointIden getStoppoint() {
        return stoppoint;
    }

    /**
     * Sets the value of the stoppoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTStoppointIden }
     *     
     */
    public void setStoppoint(CPTStoppointIden value) {
        this.stoppoint = value;
    }

}
