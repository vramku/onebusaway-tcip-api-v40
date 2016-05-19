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


/**
 * <p>Java class for PIServiceBulletinIden complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIServiceBulletinIden"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.TCIP-Final-4-0-0}PI-GeoZoneName" minOccurs="0"/&gt;
 *         &lt;element name="nameLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.TCIP-Final-4-0-0}PI-ServiceBulletinID"/&gt;
 *         &lt;element name="desig" type="{http://www.TCIP-Final-4-0-0}PI-ServiceBulletinDes" minOccurs="0"/&gt;
 *         &lt;element name="ag" type="{http://www.TCIP-Final-4-0-0}CPT-AgencyID" minOccurs="0"/&gt;
 *         &lt;element name="agdesig" type="{http://www.TCIP-Final-4-0-0}CPT-AgencyDesignator" minOccurs="0"/&gt;
 *         &lt;element name="agdesigLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="desigLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIServiceBulletinIden", propOrder = {
    "name",
    "nameLangs",
    "id",
    "desig",
    "ag",
    "agdesig",
    "agdesigLangs",
    "desigLangs"
})
public class PIServiceBulletinIden {

    protected String name;
    protected CPTAdditionalLanguageContents nameLangs;
    @XmlElement(required = true)
    protected String id;
    protected String desig;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger ag;
    protected String agdesig;
    protected CPTAdditionalLanguageContents agdesigLangs;
    protected CPTAdditionalLanguageContents desigLangs;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nameLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getNameLangs() {
        return nameLangs;
    }

    /**
     * Sets the value of the nameLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setNameLangs(CPTAdditionalLanguageContents value) {
        this.nameLangs = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the desig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesig() {
        return desig;
    }

    /**
     * Sets the value of the desig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesig(String value) {
        this.desig = value;
    }

    /**
     * Gets the value of the ag property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAg() {
        return ag;
    }

    /**
     * Sets the value of the ag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAg(BigInteger value) {
        this.ag = value;
    }

    /**
     * Gets the value of the agdesig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgdesig() {
        return agdesig;
    }

    /**
     * Sets the value of the agdesig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgdesig(String value) {
        this.agdesig = value;
    }

    /**
     * Gets the value of the agdesigLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getAgdesigLangs() {
        return agdesigLangs;
    }

    /**
     * Sets the value of the agdesigLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setAgdesigLangs(CPTAdditionalLanguageContents value) {
        this.agdesigLangs = value;
    }

    /**
     * Gets the value of the desigLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getDesigLangs() {
        return desigLangs;
    }

    /**
     * Sets the value of the desigLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setDesigLangs(CPTAdditionalLanguageContents value) {
        this.desigLangs = value;
    }

}
