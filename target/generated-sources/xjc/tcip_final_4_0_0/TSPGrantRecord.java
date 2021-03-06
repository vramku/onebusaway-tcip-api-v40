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
 * <p>Java class for TSPGrantRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSPGrantRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="grant-type" type="{http://www.TCIP-Final-4-0-0}TSP-GrantType"/&gt;
 *         &lt;element name="grant-time" type="{http://www.TCIP-Final-4-0-0}SCP-TimeInterval"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSPGrantRecord", propOrder = {
    "grantType",
    "grantTime"
})
public class TSPGrantRecord {

    @XmlElement(name = "grant-type", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String grantType;
    @XmlElement(name = "grant-time")
    @XmlSchemaType(name = "unsignedShort")
    protected int grantTime;

    /**
     * Gets the value of the grantType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrantType() {
        return grantType;
    }

    /**
     * Sets the value of the grantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrantType(String value) {
        this.grantType = value;
    }

    /**
     * Gets the value of the grantTime property.
     * 
     */
    public int getGrantTime() {
        return grantTime;
    }

    /**
     * Sets the value of the grantTime property.
     * 
     */
    public void setGrantTime(int value) {
        this.grantTime = value;
    }

}
