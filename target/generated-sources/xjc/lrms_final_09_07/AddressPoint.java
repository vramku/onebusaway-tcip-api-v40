//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package lrms_final_09_07;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressPoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="structureNumber" type="{http://www.lrms-final-09-07}Text-name255"/&gt;
 *         &lt;element name="streetInfo" type="{http://www.lrms-final-09-07}StreetInfo" minOccurs="0"/&gt;
 *         &lt;element name="side" type="{http://www.lrms-final-09-07}Side" minOccurs="0"/&gt;
 *         &lt;element name="height" type="{http://www.lrms-final-09-07}Height" minOccurs="0"/&gt;
 *         &lt;element name="adminAreas" type="{http://www.lrms-final-09-07}AdminAreaGroup" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressPoint", propOrder = {
    "structureNumber",
    "streetInfo",
    "side",
    "height",
    "adminAreas"
})
public class AddressPoint {

    @XmlElement(required = true)
    protected String structureNumber;
    protected StreetInfo streetInfo;
    @XmlSchemaType(name = "anySimpleType")
    protected String side;
    protected Height height;
    protected AdminAreaGroup adminAreas;

    /**
     * Gets the value of the structureNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStructureNumber() {
        return structureNumber;
    }

    /**
     * Sets the value of the structureNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStructureNumber(String value) {
        this.structureNumber = value;
    }

    /**
     * Gets the value of the streetInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StreetInfo }
     *     
     */
    public StreetInfo getStreetInfo() {
        return streetInfo;
    }

    /**
     * Sets the value of the streetInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetInfo }
     *     
     */
    public void setStreetInfo(StreetInfo value) {
        this.streetInfo = value;
    }

    /**
     * Gets the value of the side property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSide() {
        return side;
    }

    /**
     * Sets the value of the side property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSide(String value) {
        this.side = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Height }
     *     
     */
    public Height getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Height }
     *     
     */
    public void setHeight(Height value) {
        this.height = value;
    }

    /**
     * Gets the value of the adminAreas property.
     * 
     * @return
     *     possible object is
     *     {@link AdminAreaGroup }
     *     
     */
    public AdminAreaGroup getAdminAreas() {
        return adminAreas;
    }

    /**
     * Sets the value of the adminAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdminAreaGroup }
     *     
     */
    public void setAdminAreas(AdminAreaGroup value) {
        this.adminAreas = value;
    }

}
