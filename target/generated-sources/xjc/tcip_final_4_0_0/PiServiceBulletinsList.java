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
 * <p>Java class for PiServiceBulletinsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PiServiceBulletinsList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriptionHeader" type="{http://www.TCIP-Final-4-0-0}CPTSubscriptionHeader"/&gt;
 *         &lt;element name="languages" type="{http://www.TCIP-Final-4-0-0}CPTLanguageList" minOccurs="0"/&gt;
 *         &lt;element name="routes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="500"&gt;
 *                   &lt;element name="route" type="{http://www.TCIP-Final-4-0-0}SCHRouteIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="stops" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="500"&gt;
 *                   &lt;element name="stop" type="{http://www.TCIP-Final-4-0-0}CPTStoppointIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="trips" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="5000"&gt;
 *                   &lt;element name="trip" type="{http://www.TCIP-Final-4-0-0}SCHTripIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="bulletins" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="500"&gt;
 *                   &lt;element name="bulletin" type="{http://www.TCIP-Final-4-0-0}PIServiceBulletin"/&gt;
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
@XmlType(name = "PiServiceBulletinsList", propOrder = {
    "subscriptionHeader",
    "languages",
    "routes",
    "stops",
    "trips",
    "bulletins"
})
public class PiServiceBulletinsList {

    @XmlElement(required = true)
    protected CPTSubscriptionHeader subscriptionHeader;
    protected CPTLanguageList languages;
    protected PiServiceBulletinsList.Routes routes;
    protected PiServiceBulletinsList.Stops stops;
    protected PiServiceBulletinsList.Trips trips;
    protected PiServiceBulletinsList.Bulletins bulletins;
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
     * Gets the value of the subscriptionHeader property.
     * 
     * @return
     *     possible object is
     *     {@link CPTSubscriptionHeader }
     *     
     */
    public CPTSubscriptionHeader getSubscriptionHeader() {
        return subscriptionHeader;
    }

    /**
     * Sets the value of the subscriptionHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTSubscriptionHeader }
     *     
     */
    public void setSubscriptionHeader(CPTSubscriptionHeader value) {
        this.subscriptionHeader = value;
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
     * Gets the value of the routes property.
     * 
     * @return
     *     possible object is
     *     {@link PiServiceBulletinsList.Routes }
     *     
     */
    public PiServiceBulletinsList.Routes getRoutes() {
        return routes;
    }

    /**
     * Sets the value of the routes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PiServiceBulletinsList.Routes }
     *     
     */
    public void setRoutes(PiServiceBulletinsList.Routes value) {
        this.routes = value;
    }

    /**
     * Gets the value of the stops property.
     * 
     * @return
     *     possible object is
     *     {@link PiServiceBulletinsList.Stops }
     *     
     */
    public PiServiceBulletinsList.Stops getStops() {
        return stops;
    }

    /**
     * Sets the value of the stops property.
     * 
     * @param value
     *     allowed object is
     *     {@link PiServiceBulletinsList.Stops }
     *     
     */
    public void setStops(PiServiceBulletinsList.Stops value) {
        this.stops = value;
    }

    /**
     * Gets the value of the trips property.
     * 
     * @return
     *     possible object is
     *     {@link PiServiceBulletinsList.Trips }
     *     
     */
    public PiServiceBulletinsList.Trips getTrips() {
        return trips;
    }

    /**
     * Sets the value of the trips property.
     * 
     * @param value
     *     allowed object is
     *     {@link PiServiceBulletinsList.Trips }
     *     
     */
    public void setTrips(PiServiceBulletinsList.Trips value) {
        this.trips = value;
    }

    /**
     * Gets the value of the bulletins property.
     * 
     * @return
     *     possible object is
     *     {@link PiServiceBulletinsList.Bulletins }
     *     
     */
    public PiServiceBulletinsList.Bulletins getBulletins() {
        return bulletins;
    }

    /**
     * Sets the value of the bulletins property.
     * 
     * @param value
     *     allowed object is
     *     {@link PiServiceBulletinsList.Bulletins }
     *     
     */
    public void setBulletins(PiServiceBulletinsList.Bulletins value) {
        this.bulletins = value;
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
     *       &lt;sequence maxOccurs="500"&gt;
     *         &lt;element name="bulletin" type="{http://www.TCIP-Final-4-0-0}PIServiceBulletin"/&gt;
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
        "bulletin"
    })
    public static class Bulletins {

        @XmlElement(required = true)
        protected List<PIServiceBulletin> bulletin;

        /**
         * Gets the value of the bulletin property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bulletin property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBulletin().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PIServiceBulletin }
         * 
         * 
         */
        public List<PIServiceBulletin> getBulletin() {
            if (bulletin == null) {
                bulletin = new ArrayList<PIServiceBulletin>();
            }
            return this.bulletin;
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
     *       &lt;sequence maxOccurs="500"&gt;
     *         &lt;element name="route" type="{http://www.TCIP-Final-4-0-0}SCHRouteIden"/&gt;
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
        "route"
    })
    public static class Routes {

        @XmlElement(required = true)
        protected List<SCHRouteIden> route;

        /**
         * Gets the value of the route property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the route property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHRouteIden }
         * 
         * 
         */
        public List<SCHRouteIden> getRoute() {
            if (route == null) {
                route = new ArrayList<SCHRouteIden>();
            }
            return this.route;
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
     *       &lt;sequence maxOccurs="500"&gt;
     *         &lt;element name="stop" type="{http://www.TCIP-Final-4-0-0}CPTStoppointIden"/&gt;
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
        "stop"
    })
    public static class Stops {

        @XmlElement(required = true)
        protected List<CPTStoppointIden> stop;

        /**
         * Gets the value of the stop property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the stop property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStop().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CPTStoppointIden }
         * 
         * 
         */
        public List<CPTStoppointIden> getStop() {
            if (stop == null) {
                stop = new ArrayList<CPTStoppointIden>();
            }
            return this.stop;
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
     *       &lt;sequence maxOccurs="5000"&gt;
     *         &lt;element name="trip" type="{http://www.TCIP-Final-4-0-0}SCHTripIden"/&gt;
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
        "trip"
    })
    public static class Trips {

        @XmlElement(required = true)
        protected List<SCHTripIden> trip;

        /**
         * Gets the value of the trip property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trip property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrip().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHTripIden }
         * 
         * 
         */
        public List<SCHTripIden> getTrip() {
            if (trip == null) {
                trip = new ArrayList<SCHTripIden>();
            }
            return this.trip;
        }

    }

}
