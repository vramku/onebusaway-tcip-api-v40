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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="linkName" type="{http://www.lrms-final-09-07}Text-name255" minOccurs="0"/&gt;
 *         &lt;element name="linkEndpoints" type="{http://www.lrms-final-09-07}LinkGeneral" minOccurs="0"/&gt;
 *         &lt;element name="linkId" type="{http://www.lrms-final-09-07}IdType" minOccurs="0"/&gt;
 *         &lt;element name="addressLink" type="{http://www.lrms-final-09-07}AddressLink" minOccurs="0"/&gt;
 *         &lt;element name="linearReferenceLink" type="{http://www.lrms-final-09-07}LinearReference" minOccurs="0"/&gt;
 *         &lt;element name="crossStreetsLink" type="{http://www.lrms-final-09-07}CrossStreetsLink" minOccurs="0"/&gt;
 *         &lt;element name="geoLocationLink" type="{http://www.lrms-final-09-07}GeoLocationLink" minOccurs="0"/&gt;
 *         &lt;element name="gridLink" type="{http://www.lrms-final-09-07}GridPointPair" minOccurs="0"/&gt;
 *         &lt;element name="preCodedLink" type="{http://www.lrms-final-09-07}PreCoded" minOccurs="0"/&gt;
 *         &lt;element name="adminAreas" type="{http://www.lrms-final-09-07}AdminAreaGroup" minOccurs="0"/&gt;
 *         &lt;element name="linkType" type="{http://www.lrms-final-09-07}LinkType" minOccurs="0"/&gt;
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
@XmlType(name = "LinkLocation", propOrder = {
    "linkName",
    "linkEndpoints",
    "linkId",
    "addressLink",
    "linearReferenceLink",
    "crossStreetsLink",
    "geoLocationLink",
    "gridLink",
    "preCodedLink",
    "adminAreas",
    "linkType"
})
public class LinkLocation {

    protected String linkName;
    protected LinkGeneral linkEndpoints;
    protected IdType linkId;
    protected AddressLink addressLink;
    protected LinearReference linearReferenceLink;
    protected CrossStreetsLink crossStreetsLink;
    protected GeoLocationLink geoLocationLink;
    protected GridPointPair gridLink;
    protected PreCoded preCodedLink;
    protected AdminAreaGroup adminAreas;
    @XmlSchemaType(name = "anySimpleType")
    protected String linkType;
    @XmlAttribute(name = "locationID")
    protected String locationID;

    /**
     * Gets the value of the linkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkName() {
        return linkName;
    }

    /**
     * Sets the value of the linkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkName(String value) {
        this.linkName = value;
    }

    /**
     * Gets the value of the linkEndpoints property.
     * 
     * @return
     *     possible object is
     *     {@link LinkGeneral }
     *     
     */
    public LinkGeneral getLinkEndpoints() {
        return linkEndpoints;
    }

    /**
     * Sets the value of the linkEndpoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkGeneral }
     *     
     */
    public void setLinkEndpoints(LinkGeneral value) {
        this.linkEndpoints = value;
    }

    /**
     * Gets the value of the linkId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getLinkId() {
        return linkId;
    }

    /**
     * Sets the value of the linkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setLinkId(IdType value) {
        this.linkId = value;
    }

    /**
     * Gets the value of the addressLink property.
     * 
     * @return
     *     possible object is
     *     {@link AddressLink }
     *     
     */
    public AddressLink getAddressLink() {
        return addressLink;
    }

    /**
     * Sets the value of the addressLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressLink }
     *     
     */
    public void setAddressLink(AddressLink value) {
        this.addressLink = value;
    }

    /**
     * Gets the value of the linearReferenceLink property.
     * 
     * @return
     *     possible object is
     *     {@link LinearReference }
     *     
     */
    public LinearReference getLinearReferenceLink() {
        return linearReferenceLink;
    }

    /**
     * Sets the value of the linearReferenceLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearReference }
     *     
     */
    public void setLinearReferenceLink(LinearReference value) {
        this.linearReferenceLink = value;
    }

    /**
     * Gets the value of the crossStreetsLink property.
     * 
     * @return
     *     possible object is
     *     {@link CrossStreetsLink }
     *     
     */
    public CrossStreetsLink getCrossStreetsLink() {
        return crossStreetsLink;
    }

    /**
     * Sets the value of the crossStreetsLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossStreetsLink }
     *     
     */
    public void setCrossStreetsLink(CrossStreetsLink value) {
        this.crossStreetsLink = value;
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
     * Gets the value of the gridLink property.
     * 
     * @return
     *     possible object is
     *     {@link GridPointPair }
     *     
     */
    public GridPointPair getGridLink() {
        return gridLink;
    }

    /**
     * Sets the value of the gridLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link GridPointPair }
     *     
     */
    public void setGridLink(GridPointPair value) {
        this.gridLink = value;
    }

    /**
     * Gets the value of the preCodedLink property.
     * 
     * @return
     *     possible object is
     *     {@link PreCoded }
     *     
     */
    public PreCoded getPreCodedLink() {
        return preCodedLink;
    }

    /**
     * Sets the value of the preCodedLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreCoded }
     *     
     */
    public void setPreCodedLink(PreCoded value) {
        this.preCodedLink = value;
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
     * Gets the value of the linkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkType() {
        return linkType;
    }

    /**
     * Sets the value of the linkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkType(String value) {
        this.linkType = value;
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
