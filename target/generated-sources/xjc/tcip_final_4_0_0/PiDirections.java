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
import org.joda.time.DateTime;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for PiDirections complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PiDirections"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriptionInfo" type="{http://www.TCIP-Final-4-0-0}CPTSubscriptionHeader"/&gt;
 *         &lt;element name="languages" type="{http://www.TCIP-Final-4-0-0}CPTLanguageList" minOccurs="0"/&gt;
 *         &lt;element name="from-geoloc" type="{http://www.lrms-final-09-07}GeoLocation" minOccurs="0"/&gt;
 *         &lt;element name="from-indoor" type="{http://www.TCIP-Final-4-0-0}SPInteriorLocation" minOccurs="0"/&gt;
 *         &lt;element name="from-lm-name" type="{http://www.TCIP-Final-4-0-0}PI-LandmarkName" minOccurs="0"/&gt;
 *         &lt;element name="from-lm-id" type="{http://www.TCIP-Final-4-0-0}PI-LandmarkID" minOccurs="0"/&gt;
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
@XmlType(name = "PiDirections", propOrder = {
    "subscriptionInfo",
    "languages",
    "fromGeoloc",
    "fromIndoor",
    "fromLmName",
    "fromLmId"
})
public class PiDirections {

    @XmlElement(required = true)
    protected CPTSubscriptionHeader subscriptionInfo;
    protected CPTLanguageList languages;
    @XmlElement(name = "from-geoloc")
    protected GeoLocation fromGeoloc;
    @XmlElement(name = "from-indoor")
    protected SPInteriorLocation fromIndoor;
    @XmlElement(name = "from-lm-name")
    protected String fromLmName;
    @XmlElement(name = "from-lm-id")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger fromLmId;
    @XmlAttribute(name = "created", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime created;
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
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime activation;
    @XmlAttribute(name = "deactivation")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime deactivation;

    /**
     * Gets the value of the subscriptionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CPTSubscriptionHeader }
     *     
     */
    public CPTSubscriptionHeader getSubscriptionInfo() {
        return subscriptionInfo;
    }

    /**
     * Sets the value of the subscriptionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTSubscriptionHeader }
     *     
     */
    public void setSubscriptionInfo(CPTSubscriptionHeader value) {
        this.subscriptionInfo = value;
    }

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
     * Gets the value of the fromGeoloc property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getFromGeoloc() {
        return fromGeoloc;
    }

    /**
     * Sets the value of the fromGeoloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setFromGeoloc(GeoLocation value) {
        this.fromGeoloc = value;
    }

    /**
     * Gets the value of the fromIndoor property.
     * 
     * @return
     *     possible object is
     *     {@link SPInteriorLocation }
     *     
     */
    public SPInteriorLocation getFromIndoor() {
        return fromIndoor;
    }

    /**
     * Sets the value of the fromIndoor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPInteriorLocation }
     *     
     */
    public void setFromIndoor(SPInteriorLocation value) {
        this.fromIndoor = value;
    }

    /**
     * Gets the value of the fromLmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromLmName() {
        return fromLmName;
    }

    /**
     * Sets the value of the fromLmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromLmName(String value) {
        this.fromLmName = value;
    }

    /**
     * Gets the value of the fromLmId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFromLmId() {
        return fromLmId;
    }

    /**
     * Sets the value of the fromLmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFromLmId(BigInteger value) {
        this.fromLmId = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getCreated() {
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
    public void setCreated(DateTime value) {
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
    public DateTime getActivation() {
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
    public void setActivation(DateTime value) {
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
    public DateTime getDeactivation() {
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
    public void setDeactivation(DateTime value) {
        this.deactivation = value;
    }

}
