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
import lrms_final_09_07.Distance;


/**
 * <p>Java class for SPDataQuality complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SPDataQuality"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="qualitative-indicator" type="{http://www.TCIP-Final-4-0-0}SP-QualityLevel" minOccurs="0"/&gt;
 *         &lt;element name="cep-90-percent" type="{http://www.lrms-final-09-07}Distance" minOccurs="0"/&gt;
 *         &lt;element name="cep-95-percent" type="{http://www.lrms-final-09-07}Distance" minOccurs="0"/&gt;
 *         &lt;element name="cep-99-percent" type="{http://www.lrms-final-09-07}Distance" minOccurs="0"/&gt;
 *         &lt;element name="cep-99pt9percent" type="{http://www.lrms-final-09-07}Distance" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SPDataQuality", propOrder = {
    "qualitativeIndicator",
    "cep90Percent",
    "cep95Percent",
    "cep99Percent",
    "cep99Pt9Percent"
})
public class SPDataQuality {

    @XmlElement(name = "qualitative-indicator")
    @XmlSchemaType(name = "anySimpleType")
    protected String qualitativeIndicator;
    @XmlElement(name = "cep-90-percent")
    protected Distance cep90Percent;
    @XmlElement(name = "cep-95-percent")
    protected Distance cep95Percent;
    @XmlElement(name = "cep-99-percent")
    protected Distance cep99Percent;
    @XmlElement(name = "cep-99pt9percent")
    protected Distance cep99Pt9Percent;

    /**
     * Gets the value of the qualitativeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualitativeIndicator() {
        return qualitativeIndicator;
    }

    /**
     * Sets the value of the qualitativeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualitativeIndicator(String value) {
        this.qualitativeIndicator = value;
    }

    /**
     * Gets the value of the cep90Percent property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getCep90Percent() {
        return cep90Percent;
    }

    /**
     * Sets the value of the cep90Percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setCep90Percent(Distance value) {
        this.cep90Percent = value;
    }

    /**
     * Gets the value of the cep95Percent property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getCep95Percent() {
        return cep95Percent;
    }

    /**
     * Sets the value of the cep95Percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setCep95Percent(Distance value) {
        this.cep95Percent = value;
    }

    /**
     * Gets the value of the cep99Percent property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getCep99Percent() {
        return cep99Percent;
    }

    /**
     * Sets the value of the cep99Percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setCep99Percent(Distance value) {
        this.cep99Percent = value;
    }

    /**
     * Gets the value of the cep99Pt9Percent property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getCep99Pt9Percent() {
        return cep99Pt9Percent;
    }

    /**
     * Sets the value of the cep99Pt9Percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setCep99Pt9Percent(Distance value) {
        this.cep99Pt9Percent = value;
    }

}
