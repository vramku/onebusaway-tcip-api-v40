//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package tcip_final_4_0_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import atis_partial_03_00_74.Route;


/**
 * <p>Java class for SCHTimepointInterval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCHTimepointInterval"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpi-id" type="{http://www.TCIP-Final-4-0-0}SCH-TimepointIntervalID" minOccurs="0"/&gt;
 *         &lt;element name="tpi-designator" type="{http://www.TCIP-Final-4-0-0}SCH-TimepointIntervalDes" minOccurs="0"/&gt;
 *         &lt;element name="tpi-designatorLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="startPointID" type="{http://www.TCIP-Final-4-0-0}SCHTimepointIden"/&gt;
 *         &lt;element name="endPointID" type="{http://www.TCIP-Final-4-0-0}SCHTimepointIden"/&gt;
 *         &lt;element name="location" type="{http://www.atis-partial-03-00-74}Route" minOccurs="0"/&gt;
 *         &lt;element name="mode" type="{http://www.TCIP-Final-4-0-0}CPT-Mode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCHTimepointInterval", propOrder = {
    "tpiId",
    "tpiDesignator",
    "tpiDesignatorLangs",
    "startPointID",
    "endPointID",
    "location",
    "mode"
})
public class SCHTimepointInterval {

    @XmlElement(name = "tpi-id")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger tpiId;
    @XmlElement(name = "tpi-designator")
    protected String tpiDesignator;
    @XmlElement(name = "tpi-designatorLangs")
    protected CPTAdditionalLanguageContents tpiDesignatorLangs;
    @XmlElement(required = true)
    protected SCHTimepointIden startPointID;
    @XmlElement(required = true)
    protected SCHTimepointIden endPointID;
    protected Route location;
    protected String mode;

    /**
     * Gets the value of the tpiId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTpiId() {
        return tpiId;
    }

    /**
     * Sets the value of the tpiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTpiId(BigInteger value) {
        this.tpiId = value;
    }

    /**
     * Gets the value of the tpiDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpiDesignator() {
        return tpiDesignator;
    }

    /**
     * Sets the value of the tpiDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpiDesignator(String value) {
        this.tpiDesignator = value;
    }

    /**
     * Gets the value of the tpiDesignatorLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getTpiDesignatorLangs() {
        return tpiDesignatorLangs;
    }

    /**
     * Sets the value of the tpiDesignatorLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setTpiDesignatorLangs(CPTAdditionalLanguageContents value) {
        this.tpiDesignatorLangs = value;
    }

    /**
     * Gets the value of the startPointID property.
     * 
     * @return
     *     possible object is
     *     {@link SCHTimepointIden }
     *     
     */
    public SCHTimepointIden getStartPointID() {
        return startPointID;
    }

    /**
     * Sets the value of the startPointID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHTimepointIden }
     *     
     */
    public void setStartPointID(SCHTimepointIden value) {
        this.startPointID = value;
    }

    /**
     * Gets the value of the endPointID property.
     * 
     * @return
     *     possible object is
     *     {@link SCHTimepointIden }
     *     
     */
    public SCHTimepointIden getEndPointID() {
        return endPointID;
    }

    /**
     * Sets the value of the endPointID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHTimepointIden }
     *     
     */
    public void setEndPointID(SCHTimepointIden value) {
        this.endPointID = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Route }
     *     
     */
    public Route getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Route }
     *     
     */
    public void setLocation(Route value) {
        this.location = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

}
