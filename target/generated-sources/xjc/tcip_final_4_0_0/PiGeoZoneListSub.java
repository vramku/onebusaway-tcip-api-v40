//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package tcip_final_4_0_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for PiGeoZoneListSub complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PiGeoZoneListSub"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header" type="{http://www.TCIP-Final-4-0-0}CPTSubscriptionHeader"/&gt;
 *         &lt;element name="languages" type="{http://www.TCIP-Final-4-0-0}CPTLanguageList" minOccurs="0"/&gt;
 *         &lt;element name="points" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="20"&gt;
 *                   &lt;element name="point" type="{http://www.TCIP-Final-4-0-0}SPPoint"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="polygon" type="{http://www.TCIP-Final-4-0-0}SPPolygon" minOccurs="0"/&gt;
 *         &lt;element name="agencies" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="25"&gt;
 *                   &lt;element name="agencie" type="{http://www.TCIP-Final-4-0-0}CPT-AgencyID"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="zones" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="100"&gt;
 *                   &lt;element name="zone" type="{http://www.TCIP-Final-4-0-0}PIGeoZoneIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "PiGeoZoneListSub", propOrder = {
    "header",
    "languages",
    "points",
    "polygon",
    "agencies",
    "zones"
})
public class PiGeoZoneListSub {

    @XmlElement(required = true)
    protected CPTSubscriptionHeader header;
    protected CPTLanguageList languages;
    protected PiGeoZoneListSub.Points points;
    protected SPPolygon polygon;
    protected PiGeoZoneListSub.Agencies agencies;
    protected PiGeoZoneListSub.Zones zones;
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
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link CPTSubscriptionHeader }
     *     
     */
    public CPTSubscriptionHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTSubscriptionHeader }
     *     
     */
    public void setHeader(CPTSubscriptionHeader value) {
        this.header = value;
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
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link PiGeoZoneListSub.Points }
     *     
     */
    public PiGeoZoneListSub.Points getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link PiGeoZoneListSub.Points }
     *     
     */
    public void setPoints(PiGeoZoneListSub.Points value) {
        this.points = value;
    }

    /**
     * Gets the value of the polygon property.
     * 
     * @return
     *     possible object is
     *     {@link SPPolygon }
     *     
     */
    public SPPolygon getPolygon() {
        return polygon;
    }

    /**
     * Sets the value of the polygon property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPPolygon }
     *     
     */
    public void setPolygon(SPPolygon value) {
        this.polygon = value;
    }

    /**
     * Gets the value of the agencies property.
     * 
     * @return
     *     possible object is
     *     {@link PiGeoZoneListSub.Agencies }
     *     
     */
    public PiGeoZoneListSub.Agencies getAgencies() {
        return agencies;
    }

    /**
     * Sets the value of the agencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link PiGeoZoneListSub.Agencies }
     *     
     */
    public void setAgencies(PiGeoZoneListSub.Agencies value) {
        this.agencies = value;
    }

    /**
     * Gets the value of the zones property.
     * 
     * @return
     *     possible object is
     *     {@link PiGeoZoneListSub.Zones }
     *     
     */
    public PiGeoZoneListSub.Zones getZones() {
        return zones;
    }

    /**
     * Sets the value of the zones property.
     * 
     * @param value
     *     allowed object is
     *     {@link PiGeoZoneListSub.Zones }
     *     
     */
    public void setZones(PiGeoZoneListSub.Zones value) {
        this.zones = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="25"&gt;
     *         &lt;element name="agencie" type="{http://www.TCIP-Final-4-0-0}CPT-AgencyID"/&gt;
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
        "agencie"
    })
    public static class Agencies {

        @XmlElement(required = true)
        @XmlSchemaType(name = "unsignedLong")
        protected List<BigInteger> agencie;

        /**
         * Gets the value of the agencie property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the agencie property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAgencie().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getAgencie() {
            if (agencie == null) {
                agencie = new ArrayList<BigInteger>();
            }
            return this.agencie;
        }

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
     *       &lt;sequence maxOccurs="20"&gt;
     *         &lt;element name="point" type="{http://www.TCIP-Final-4-0-0}SPPoint"/&gt;
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
        "point"
    })
    public static class Points {

        @XmlElement(required = true)
        protected List<SPPoint> point;

        /**
         * Gets the value of the point property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the point property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SPPoint }
         * 
         * 
         */
        public List<SPPoint> getPoint() {
            if (point == null) {
                point = new ArrayList<SPPoint>();
            }
            return this.point;
        }

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
     *       &lt;sequence maxOccurs="100"&gt;
     *         &lt;element name="zone" type="{http://www.TCIP-Final-4-0-0}PIGeoZoneIden"/&gt;
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
        "zone"
    })
    public static class Zones {

        @XmlElement(required = true)
        protected List<PIGeoZoneIden> zone;

        /**
         * Gets the value of the zone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the zone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getZone().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PIGeoZoneIden }
         * 
         * 
         */
        public List<PIGeoZoneIden> getZone() {
            if (zone == null) {
                zone = new ArrayList<PIGeoZoneIden>();
            }
            return this.zone;
        }

    }

}
