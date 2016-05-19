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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lrms_final_09_07.GeoLocation;


/**
 * <p>Java class for CcWheelchairPickup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CcWheelchairPickup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="languages" type="{http://www.TCIP-Final-4-0-0}CPTLanguageList" minOccurs="0"/&gt;
 *         &lt;element name="requester-id" type="{http://www.TCIP-Final-4-0-0}CC-TravelerRequestID"/&gt;
 *         &lt;element name="requester-time" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime"/&gt;
 *         &lt;element name="requester-vehicle" type="{http://www.TCIP-Final-4-0-0}CPTVehicleIden" minOccurs="0"/&gt;
 *         &lt;element name="pickupStoppoint" type="{http://www.TCIP-Final-4-0-0}CPTStoppointIden" minOccurs="0"/&gt;
 *         &lt;element name="pickupLocation" type="{http://www.lrms-final-09-07}GeoLocation" minOccurs="0"/&gt;
 *         &lt;element name="requester-route" type="{http://www.TCIP-Final-4-0-0}SCHRouteIden"/&gt;
 *         &lt;element name="requester-route-direction" type="{http://www.lrms-final-09-07}Direction" minOccurs="0"/&gt;
 *         &lt;element name="to-stoppoint" type="{http://www.TCIP-Final-4-0-0}CPTStoppointIden"/&gt;
 *         &lt;element name="requester-eta-at-stoppoint" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="central-id" type="{http://www.TCIP-Final-4-0-0}CC-TravelerRequestID"/&gt;
 *         &lt;element name="wait-until" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime"/&gt;
 *         &lt;element name="pickup-PTV" type="{http://www.TCIP-Final-4-0-0}CPTVehicleIden"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.TCIP-Final-4-0-0}tcipMsgAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CcWheelchairPickup", propOrder = {
    "languages",
    "requesterId",
    "requesterTime",
    "requesterVehicle",
    "pickupStoppoint",
    "pickupLocation",
    "requesterRoute",
    "requesterRouteDirection",
    "toStoppoint",
    "requesterEtaAtStoppoint",
    "centralId",
    "waitUntil",
    "pickupPTV"
})
public class CcWheelchairPickup {

    protected CPTLanguageList languages;
    @XmlElement(name = "requester-id", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger requesterId;
    @XmlElement(name = "requester-time", required = true, type = String.class)
    @XmlJavaTypeAdapter(tcip_final_4_0_0.Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected org.joda.time.DateTime requesterTime;
    @XmlElement(name = "requester-vehicle")
    protected CPTVehicleIden requesterVehicle;
    protected CPTStoppointIden pickupStoppoint;
    protected GeoLocation pickupLocation;
    @XmlElement(name = "requester-route", required = true)
    protected SCHRouteIden requesterRoute;
    @XmlElement(name = "requester-route-direction")
    @XmlSchemaType(name = "anySimpleType")
    protected String requesterRouteDirection;
    @XmlElement(name = "to-stoppoint", required = true)
    protected CPTStoppointIden toStoppoint;
    @XmlElement(name = "requester-eta-at-stoppoint", type = String.class)
    @XmlJavaTypeAdapter(tcip_final_4_0_0.Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected org.joda.time.DateTime requesterEtaAtStoppoint;
    @XmlElement(name = "central-id", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger centralId;
    @XmlElement(name = "wait-until", required = true, type = String.class)
    @XmlJavaTypeAdapter(tcip_final_4_0_0.Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected org.joda.time.DateTime waitUntil;
    @XmlElement(name = "pickup-PTV", required = true)
    protected CPTVehicleIden pickupPTV;
    @XmlAttribute(name = "created", required = true)
    @XmlJavaTypeAdapter(org.w3._2001.xmlschema.Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected org.joda.time.DateTime created;
    @XmlAttribute(name = "schVersion")
    protected String schVersion;
    @XmlAttribute(name = "sourceapp", required = true)
    protected String sourceapp;
    @XmlAttribute(name = "sourceip")
    protected String sourceip;
    @XmlAttribute(name = "sourceport")
    protected BigInteger sourceport;
    @XmlAttribute(name = "noNameSpaceSchemaLocation")
    @XmlSchemaType(name = "anyURI")
    protected String noNameSpaceSchemaLocation;
    @XmlAttribute(name = "activation")
    @XmlJavaTypeAdapter(org.w3._2001.xmlschema.Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected org.joda.time.DateTime activation;
    @XmlAttribute(name = "deactivation")
    @XmlJavaTypeAdapter(org.w3._2001.xmlschema.Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected org.joda.time.DateTime deactivation;

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link CPTLanguageList }
     *     
     */
    public CPTLanguageList getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTLanguageList }
     *     
     */
    public void setLanguages(CPTLanguageList value) {
        this.languages = value;
    }

    /**
     * Gets the value of the requesterId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequesterId() {
        return requesterId;
    }

    /**
     * Sets the value of the requesterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequesterId(BigInteger value) {
        this.requesterId = value;
    }

    /**
     * Gets the value of the requesterTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.joda.time.DateTime getRequesterTime() {
        return requesterTime;
    }

    /**
     * Sets the value of the requesterTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterTime(org.joda.time.DateTime value) {
        this.requesterTime = value;
    }

    /**
     * Gets the value of the requesterVehicle property.
     * 
     * @return
     *     possible object is
     *     {@link CPTVehicleIden }
     *     
     */
    public CPTVehicleIden getRequesterVehicle() {
        return requesterVehicle;
    }

    /**
     * Sets the value of the requesterVehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTVehicleIden }
     *     
     */
    public void setRequesterVehicle(CPTVehicleIden value) {
        this.requesterVehicle = value;
    }

    /**
     * Gets the value of the pickupStoppoint property.
     * 
     * @return
     *     possible object is
     *     {@link CPTStoppointIden }
     *     
     */
    public CPTStoppointIden getPickupStoppoint() {
        return pickupStoppoint;
    }

    /**
     * Sets the value of the pickupStoppoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTStoppointIden }
     *     
     */
    public void setPickupStoppoint(CPTStoppointIden value) {
        this.pickupStoppoint = value;
    }

    /**
     * Gets the value of the pickupLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getPickupLocation() {
        return pickupLocation;
    }

    /**
     * Sets the value of the pickupLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setPickupLocation(GeoLocation value) {
        this.pickupLocation = value;
    }

    /**
     * Gets the value of the requesterRoute property.
     * 
     * @return
     *     possible object is
     *     {@link SCHRouteIden }
     *     
     */
    public SCHRouteIden getRequesterRoute() {
        return requesterRoute;
    }

    /**
     * Sets the value of the requesterRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHRouteIden }
     *     
     */
    public void setRequesterRoute(SCHRouteIden value) {
        this.requesterRoute = value;
    }

    /**
     * Gets the value of the requesterRouteDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterRouteDirection() {
        return requesterRouteDirection;
    }

    /**
     * Sets the value of the requesterRouteDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterRouteDirection(String value) {
        this.requesterRouteDirection = value;
    }

    /**
     * Gets the value of the toStoppoint property.
     * 
     * @return
     *     possible object is
     *     {@link CPTStoppointIden }
     *     
     */
    public CPTStoppointIden getToStoppoint() {
        return toStoppoint;
    }

    /**
     * Sets the value of the toStoppoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTStoppointIden }
     *     
     */
    public void setToStoppoint(CPTStoppointIden value) {
        this.toStoppoint = value;
    }

    /**
     * Gets the value of the requesterEtaAtStoppoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.joda.time.DateTime getRequesterEtaAtStoppoint() {
        return requesterEtaAtStoppoint;
    }

    /**
     * Sets the value of the requesterEtaAtStoppoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterEtaAtStoppoint(org.joda.time.DateTime value) {
        this.requesterEtaAtStoppoint = value;
    }

    /**
     * Gets the value of the centralId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCentralId() {
        return centralId;
    }

    /**
     * Sets the value of the centralId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCentralId(BigInteger value) {
        this.centralId = value;
    }

    /**
     * Gets the value of the waitUntil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.joda.time.DateTime getWaitUntil() {
        return waitUntil;
    }

    /**
     * Sets the value of the waitUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitUntil(org.joda.time.DateTime value) {
        this.waitUntil = value;
    }

    /**
     * Gets the value of the pickupPTV property.
     * 
     * @return
     *     possible object is
     *     {@link CPTVehicleIden }
     *     
     */
    public CPTVehicleIden getPickupPTV() {
        return pickupPTV;
    }

    /**
     * Sets the value of the pickupPTV property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTVehicleIden }
     *     
     */
    public void setPickupPTV(CPTVehicleIden value) {
        this.pickupPTV = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.joda.time.DateTime getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(org.joda.time.DateTime value) {
        this.created = value;
    }

    /**
     * Gets the value of the schVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchVersion() {
        return schVersion;
    }

    /**
     * Sets the value of the schVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchVersion(String value) {
        this.schVersion = value;
    }

    /**
     * Gets the value of the sourceapp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceapp() {
        return sourceapp;
    }

    /**
     * Sets the value of the sourceapp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceapp(String value) {
        this.sourceapp = value;
    }

    /**
     * Gets the value of the sourceip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceip() {
        return sourceip;
    }

    /**
     * Sets the value of the sourceip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceip(String value) {
        this.sourceip = value;
    }

    /**
     * Gets the value of the sourceport property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSourceport() {
        return sourceport;
    }

    /**
     * Sets the value of the sourceport property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSourceport(BigInteger value) {
        this.sourceport = value;
    }

    /**
     * Gets the value of the noNameSpaceSchemaLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoNameSpaceSchemaLocation() {
        return noNameSpaceSchemaLocation;
    }

    /**
     * Sets the value of the noNameSpaceSchemaLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoNameSpaceSchemaLocation(String value) {
        this.noNameSpaceSchemaLocation = value;
    }

    /**
     * Gets the value of the activation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.joda.time.DateTime getActivation() {
        return activation;
    }

    /**
     * Sets the value of the activation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivation(org.joda.time.DateTime value) {
        this.activation = value;
    }

    /**
     * Gets the value of the deactivation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.joda.time.DateTime getDeactivation() {
        return deactivation;
    }

    /**
     * Sets the value of the deactivation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeactivation(org.joda.time.DateTime value) {
        this.deactivation = value;
    }

}
