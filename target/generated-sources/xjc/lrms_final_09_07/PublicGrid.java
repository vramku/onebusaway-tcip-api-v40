//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package lrms_final_09_07;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicGrid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicGrid"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gridName" type="{http://www.lrms-final-09-07}Text-name255" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="usng" type="{http://www.lrms-final-09-07}PublicGridUSNG"/&gt;
 *           &lt;element name="localReference" type="{http://www.lrms-final-09-07}PublicGridLocalReference"/&gt;
 *           &lt;element name="statePlane" type="{http://www.lrms-final-09-07}PublicGridStatePlane"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="locationID" type="{http://www.lrms-final-09-07}String-index64" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicGrid", propOrder = {
    "gridName",
    "usng",
    "localReference",
    "statePlane"
})
public class PublicGrid {

    protected String gridName;
    protected PublicGridUSNG usng;
    protected PublicGridLocalReference localReference;
    protected PublicGridStatePlane statePlane;
    @XmlAttribute(name = "locationID")
    protected String locationID;

    /**
     * Gets the value of the gridName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGridName() {
        return gridName;
    }

    /**
     * Sets the value of the gridName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGridName(String value) {
        this.gridName = value;
    }

    /**
     * Gets the value of the usng property.
     * 
     * @return
     *     possible object is
     *     {@link PublicGridUSNG }
     *     
     */
    public PublicGridUSNG getUsng() {
        return usng;
    }

    /**
     * Sets the value of the usng property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicGridUSNG }
     *     
     */
    public void setUsng(PublicGridUSNG value) {
        this.usng = value;
    }

    /**
     * Gets the value of the localReference property.
     * 
     * @return
     *     possible object is
     *     {@link PublicGridLocalReference }
     *     
     */
    public PublicGridLocalReference getLocalReference() {
        return localReference;
    }

    /**
     * Sets the value of the localReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicGridLocalReference }
     *     
     */
    public void setLocalReference(PublicGridLocalReference value) {
        this.localReference = value;
    }

    /**
     * Gets the value of the statePlane property.
     * 
     * @return
     *     possible object is
     *     {@link PublicGridStatePlane }
     *     
     */
    public PublicGridStatePlane getStatePlane() {
        return statePlane;
    }

    /**
     * Sets the value of the statePlane property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicGridStatePlane }
     *     
     */
    public void setStatePlane(PublicGridStatePlane value) {
        this.statePlane = value;
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