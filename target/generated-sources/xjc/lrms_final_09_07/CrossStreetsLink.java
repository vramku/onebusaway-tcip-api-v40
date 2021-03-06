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
 * <p>Java class for CrossStreetsLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrossStreetsLink"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="onStreetInfo" type="{http://www.lrms-final-09-07}StreetInfo"/&gt;
 *         &lt;element name="fromStreetInfo" type="{http://www.lrms-final-09-07}StreetInfo"/&gt;
 *         &lt;element name="toStreetInfo" type="{http://www.lrms-final-09-07}StreetInfo"/&gt;
 *         &lt;element name="startGeoLocation" type="{http://www.lrms-final-09-07}GeoLocation" minOccurs="0"/&gt;
 *         &lt;element name="endGeoLocation" type="{http://www.lrms-final-09-07}GeoLocation" minOccurs="0"/&gt;
 *         &lt;element name="startIntersectionType" type="{http://www.lrms-final-09-07}IntersectionType" minOccurs="0"/&gt;
 *         &lt;element name="endIntersectionType" type="{http://www.lrms-final-09-07}IntersectionType" minOccurs="0"/&gt;
 *         &lt;element name="offset1" type="{http://www.lrms-final-09-07}Distance" minOccurs="0"/&gt;
 *         &lt;element name="offset2" type="{http://www.lrms-final-09-07}Distance" minOccurs="0"/&gt;
 *         &lt;element name="direction" type="{http://www.lrms-final-09-07}Direction" minOccurs="0"/&gt;
 *         &lt;element name="side" type="{http://www.lrms-final-09-07}Side" minOccurs="0"/&gt;
 *         &lt;element name="height" type="{http://www.lrms-final-09-07}Height" minOccurs="0"/&gt;
 *         &lt;element name="adminArea1" type="{http://www.lrms-final-09-07}AdminAreaGroup" minOccurs="0"/&gt;
 *         &lt;element name="adminArea2" type="{http://www.lrms-final-09-07}AdminAreaGroup" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossStreetsLink", propOrder = {
    "onStreetInfo",
    "fromStreetInfo",
    "toStreetInfo",
    "startGeoLocation",
    "endGeoLocation",
    "startIntersectionType",
    "endIntersectionType",
    "offset1",
    "offset2",
    "direction",
    "side",
    "height",
    "adminArea1",
    "adminArea2"
})
public class CrossStreetsLink {

    @XmlElement(required = true)
    protected StreetInfo onStreetInfo;
    @XmlElement(required = true)
    protected StreetInfo fromStreetInfo;
    @XmlElement(required = true)
    protected StreetInfo toStreetInfo;
    protected GeoLocation startGeoLocation;
    protected GeoLocation endGeoLocation;
    @XmlSchemaType(name = "anySimpleType")
    protected String startIntersectionType;
    @XmlSchemaType(name = "anySimpleType")
    protected String endIntersectionType;
    protected Distance offset1;
    protected Distance offset2;
    @XmlSchemaType(name = "anySimpleType")
    protected String direction;
    @XmlSchemaType(name = "anySimpleType")
    protected String side;
    protected Height height;
    protected AdminAreaGroup adminArea1;
    protected AdminAreaGroup adminArea2;

    /**
     * Gets the value of the onStreetInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StreetInfo }
     *     
     */
    public StreetInfo getOnStreetInfo() {
        return onStreetInfo;
    }

    /**
     * Sets the value of the onStreetInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetInfo }
     *     
     */
    public void setOnStreetInfo(StreetInfo value) {
        this.onStreetInfo = value;
    }

    /**
     * Gets the value of the fromStreetInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StreetInfo }
     *     
     */
    public StreetInfo getFromStreetInfo() {
        return fromStreetInfo;
    }

    /**
     * Sets the value of the fromStreetInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetInfo }
     *     
     */
    public void setFromStreetInfo(StreetInfo value) {
        this.fromStreetInfo = value;
    }

    /**
     * Gets the value of the toStreetInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StreetInfo }
     *     
     */
    public StreetInfo getToStreetInfo() {
        return toStreetInfo;
    }

    /**
     * Sets the value of the toStreetInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetInfo }
     *     
     */
    public void setToStreetInfo(StreetInfo value) {
        this.toStreetInfo = value;
    }

    /**
     * Gets the value of the startGeoLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getStartGeoLocation() {
        return startGeoLocation;
    }

    /**
     * Sets the value of the startGeoLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setStartGeoLocation(GeoLocation value) {
        this.startGeoLocation = value;
    }

    /**
     * Gets the value of the endGeoLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getEndGeoLocation() {
        return endGeoLocation;
    }

    /**
     * Sets the value of the endGeoLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setEndGeoLocation(GeoLocation value) {
        this.endGeoLocation = value;
    }

    /**
     * Gets the value of the startIntersectionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartIntersectionType() {
        return startIntersectionType;
    }

    /**
     * Sets the value of the startIntersectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartIntersectionType(String value) {
        this.startIntersectionType = value;
    }

    /**
     * Gets the value of the endIntersectionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndIntersectionType() {
        return endIntersectionType;
    }

    /**
     * Sets the value of the endIntersectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndIntersectionType(String value) {
        this.endIntersectionType = value;
    }

    /**
     * Gets the value of the offset1 property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getOffset1() {
        return offset1;
    }

    /**
     * Sets the value of the offset1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setOffset1(Distance value) {
        this.offset1 = value;
    }

    /**
     * Gets the value of the offset2 property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getOffset2() {
        return offset2;
    }

    /**
     * Sets the value of the offset2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setOffset2(Distance value) {
        this.offset2 = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
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
     * Gets the value of the adminArea1 property.
     * 
     * @return
     *     possible object is
     *     {@link AdminAreaGroup }
     *     
     */
    public AdminAreaGroup getAdminArea1() {
        return adminArea1;
    }

    /**
     * Sets the value of the adminArea1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdminAreaGroup }
     *     
     */
    public void setAdminArea1(AdminAreaGroup value) {
        this.adminArea1 = value;
    }

    /**
     * Gets the value of the adminArea2 property.
     * 
     * @return
     *     possible object is
     *     {@link AdminAreaGroup }
     *     
     */
    public AdminAreaGroup getAdminArea2() {
        return adminArea2;
    }

    /**
     * Sets the value of the adminArea2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdminAreaGroup }
     *     
     */
    public void setAdminArea2(AdminAreaGroup value) {
        this.adminArea2 = value;
    }

}
