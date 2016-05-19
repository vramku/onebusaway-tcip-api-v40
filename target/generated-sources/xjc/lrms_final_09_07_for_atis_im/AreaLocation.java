//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package lrms_final_09_07_for_atis_im;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AreaLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AreaLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="locationName" type="{http://www.lrms-final-09-07-for-atis-im}Text-name255" minOccurs="0"/&gt;
 *         &lt;element name="areaId" type="{http://www.lrms-final-09-07-for-atis-im}IdType" minOccurs="0"/&gt;
 *         &lt;element name="adminAreas" type="{http://www.lrms-final-09-07-for-atis-im}AdminAreaGroup" minOccurs="0"/&gt;
 *         &lt;element name="polygon" type="{http://www.lrms-final-09-07-for-atis-im}Polygon" minOccurs="0"/&gt;
 *         &lt;element name="preCoded" type="{http://www.lrms-final-09-07-for-atis-im}PreCoded" minOccurs="0"/&gt;
 *         &lt;element name="roads" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="255" minOccurs="3"&gt;
 *                   &lt;element name="road" type="{http://www.lrms-final-09-07-for-atis-im}StreetInfo"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "AreaLocation", propOrder = {
    "locationName",
    "areaId",
    "adminAreas",
    "polygon",
    "preCoded",
    "roads"
})
public class AreaLocation {

    protected String locationName;
    protected IdType areaId;
    protected AdminAreaGroup adminAreas;
    protected Polygon polygon;
    protected PreCoded preCoded;
    protected AreaLocation.Roads roads;
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
     * Gets the value of the areaId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getAreaId() {
        return areaId;
    }

    /**
     * Sets the value of the areaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setAreaId(IdType value) {
        this.areaId = value;
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

    /**
     * Gets the value of the polygon property.
     * 
     * @return
     *     possible object is
     *     {@link Polygon }
     *     
     */
    public Polygon getPolygon() {
        return polygon;
    }

    /**
     * Sets the value of the polygon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Polygon }
     *     
     */
    public void setPolygon(Polygon value) {
        this.polygon = value;
    }

    /**
     * Gets the value of the preCoded property.
     * 
     * @return
     *     possible object is
     *     {@link PreCoded }
     *     
     */
    public PreCoded getPreCoded() {
        return preCoded;
    }

    /**
     * Sets the value of the preCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreCoded }
     *     
     */
    public void setPreCoded(PreCoded value) {
        this.preCoded = value;
    }

    /**
     * Gets the value of the roads property.
     * 
     * @return
     *     possible object is
     *     {@link AreaLocation.Roads }
     *     
     */
    public AreaLocation.Roads getRoads() {
        return roads;
    }

    /**
     * Sets the value of the roads property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaLocation.Roads }
     *     
     */
    public void setRoads(AreaLocation.Roads value) {
        this.roads = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="255" minOccurs="3"&gt;
     *         &lt;element name="road" type="{http://www.lrms-final-09-07-for-atis-im}StreetInfo"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "road"
    })
    public static class Roads {

        @XmlElement(required = true)
        protected List<StreetInfo> road;

        /**
         * Gets the value of the road property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the road property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoad().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StreetInfo }
         * 
         * 
         */
        public List<StreetInfo> getRoad() {
            if (road == null) {
                road = new ArrayList<StreetInfo>();
            }
            return this.road;
        }

    }

}
