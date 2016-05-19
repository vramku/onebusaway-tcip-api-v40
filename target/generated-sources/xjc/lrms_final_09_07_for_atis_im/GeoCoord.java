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
 * <p>Java class for GeoCoord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoCoord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="locationName" type="{http://www.lrms-final-09-07-for-atis-im}Text-name255" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="geoLocationPoint" type="{http://www.lrms-final-09-07-for-atis-im}GeoLocation"/&gt;
 *           &lt;element name="geoLocationLink" type="{http://www.lrms-final-09-07-for-atis-im}GeoLocationLink"/&gt;
 *           &lt;element name="polarCoordinates" type="{http://www.lrms-final-09-07-for-atis-im}PolarCoordinates"/&gt;
 *           &lt;element name="geoLocationDelta" type="{http://www.lrms-final-09-07-for-atis-im}GeoLocationDelta"/&gt;
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
@XmlType(name = "GeoCoord", propOrder = {
    "locationName",
    "geoLocationPoint",
    "geoLocationLink",
    "polarCoordinates",
    "geoLocationDelta"
})
public class GeoCoord {

    protected String locationName;
    protected GeoLocation geoLocationPoint;
    protected GeoLocationLink geoLocationLink;
    protected PolarCoordinates polarCoordinates;
    protected GeoLocationDelta geoLocationDelta;
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
     * Gets the value of the geoLocationPoint property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getGeoLocationPoint() {
        return geoLocationPoint;
    }

    /**
     * Sets the value of the geoLocationPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setGeoLocationPoint(GeoLocation value) {
        this.geoLocationPoint = value;
    }

    /**
     * Gets the value of the geoLocationLink property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocationLink }
     *     
     */
    public GeoLocationLink getGeoLocationLink() {
        return geoLocationLink;
    }

    /**
     * Sets the value of the geoLocationLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocationLink }
     *     
     */
    public void setGeoLocationLink(GeoLocationLink value) {
        this.geoLocationLink = value;
    }

    /**
     * Gets the value of the polarCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link PolarCoordinates }
     *     
     */
    public PolarCoordinates getPolarCoordinates() {
        return polarCoordinates;
    }

    /**
     * Sets the value of the polarCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolarCoordinates }
     *     
     */
    public void setPolarCoordinates(PolarCoordinates value) {
        this.polarCoordinates = value;
    }

    /**
     * Gets the value of the geoLocationDelta property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocationDelta }
     *     
     */
    public GeoLocationDelta getGeoLocationDelta() {
        return geoLocationDelta;
    }

    /**
     * Sets the value of the geoLocationDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocationDelta }
     *     
     */
    public void setGeoLocationDelta(GeoLocationDelta value) {
        this.geoLocationDelta = value;
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
