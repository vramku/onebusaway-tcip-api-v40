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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PIGeoZone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIGeoZone"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="zone" type="{http://www.TCIP-Final-4-0-0}PIGeoZoneIden"/&gt;
 *         &lt;element name="zone-boundary" type="{http://www.TCIP-Final-4-0-0}SPPolygon"/&gt;
 *         &lt;element name="localPIGeoZone" type="{http://www.tcip-4-0-0-local}PIGeoZone" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIGeoZone", propOrder = {
    "zone",
    "zoneBoundary",
    "localPIGeoZone"
})
public class PIGeoZone {

    @XmlElement(required = true)
    protected PIGeoZoneIden zone;
    @XmlElement(name = "zone-boundary", required = true)
    protected SPPolygon zoneBoundary;
    protected tcip_4_0_0_local.PIGeoZone localPIGeoZone;

    /**
     * Gets the value of the zone property.
     * 
     * @return
     *     possible object is
     *     {@link PIGeoZoneIden }
     *     
     */
    public PIGeoZoneIden getZone() {
        return zone;
    }

    /**
     * Sets the value of the zone property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIGeoZoneIden }
     *     
     */
    public void setZone(PIGeoZoneIden value) {
        this.zone = value;
    }

    /**
     * Gets the value of the zoneBoundary property.
     * 
     * @return
     *     possible object is
     *     {@link SPPolygon }
     *     
     */
    public SPPolygon getZoneBoundary() {
        return zoneBoundary;
    }

    /**
     * Sets the value of the zoneBoundary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPPolygon }
     *     
     */
    public void setZoneBoundary(SPPolygon value) {
        this.zoneBoundary = value;
    }

    /**
     * Gets the value of the localPIGeoZone property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_4_0_0_local.PIGeoZone }
     *     
     */
    public tcip_4_0_0_local.PIGeoZone getLocalPIGeoZone() {
        return localPIGeoZone;
    }

    /**
     * Sets the value of the localPIGeoZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_4_0_0_local.PIGeoZone }
     *     
     */
    public void setLocalPIGeoZone(tcip_4_0_0_local.PIGeoZone value) {
        this.localPIGeoZone = value;
    }

}
