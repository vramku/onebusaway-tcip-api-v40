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
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for SchTripDetailList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchTripDetailList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriptionInfo" type="{http://www.TCIP-Final-4-0-0}CPTSubscriptionHeader"/&gt;
 *         &lt;element name="languages" type="{http://www.TCIP-Final-4-0-0}CPTLanguageList" minOccurs="0"/&gt;
 *         &lt;element name="beginDate" type="{http://www.TCIP-Final-4-0-0}CPT-Date"/&gt;
 *         &lt;element name="beginTime" type="{http://www.TCIP-Final-4-0-0}CPT-Time"/&gt;
 *         &lt;element name="endDate" type="{http://www.TCIP-Final-4-0-0}CPT-Date"/&gt;
 *         &lt;element name="endTime" type="{http://www.TCIP-Final-4-0-0}CPT-Time"/&gt;
 *         &lt;element name="trips" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="100000"&gt;
 *                   &lt;element name="trip" type="{http://www.TCIP-Final-4-0-0}SCHTripIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="timepoints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="500"&gt;
 *                   &lt;element name="timepoint" type="{http://www.TCIP-Final-4-0-0}SCHTimepointIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="stoppoints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="25000"&gt;
 *                   &lt;element name="stoppoint" type="{http://www.TCIP-Final-4-0-0}CPTStoppointIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="routes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="100"&gt;
 *                   &lt;element name="route" type="{http://www.TCIP-Final-4-0-0}SCHRouteIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="trip-details"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="500"&gt;
 *                   &lt;element name="trip-detail" type="{http://www.TCIP-Final-4-0-0}SCHTripDetailInfo"/&gt;
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
@XmlType(name = "SchTripDetailList", propOrder = {
    "subscriptionInfo",
    "languages",
    "beginDate",
    "beginTime",
    "endDate",
    "endTime",
    "trips",
    "timepoints",
    "stoppoints",
    "routes",
    "tripDetails"
})
public class SchTripDetailList {

    @XmlElement(required = true)
    protected CPTSubscriptionHeader subscriptionInfo;
    protected CPTLanguageList languages;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected LocalDate beginDate;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected LocalTime beginTime;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected LocalDate endDate;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected LocalTime endTime;
    protected SchTripDetailList.Trips trips;
    protected SchTripDetailList.Timepoints timepoints;
    protected SchTripDetailList.Stoppoints stoppoints;
    protected SchTripDetailList.Routes routes;
    @XmlElement(name = "trip-details", required = true)
    protected SchTripDetailList.TripDetails tripDetails;
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
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginDate(LocalDate value) {
        this.beginDate = value;
    }

    /**
     * Gets the value of the beginTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getBeginTime() {
        return beginTime;
    }

    /**
     * Sets the value of the beginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginTime(LocalTime value) {
        this.beginTime = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(LocalDate value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(LocalTime value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the trips property.
     * 
     * @return
     *     possible object is
     *     {@link SchTripDetailList.Trips }
     *     
     */
    public SchTripDetailList.Trips getTrips() {
        return trips;
    }

    /**
     * Sets the value of the trips property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchTripDetailList.Trips }
     *     
     */
    public void setTrips(SchTripDetailList.Trips value) {
        this.trips = value;
    }

    /**
     * Gets the value of the timepoints property.
     * 
     * @return
     *     possible object is
     *     {@link SchTripDetailList.Timepoints }
     *     
     */
    public SchTripDetailList.Timepoints getTimepoints() {
        return timepoints;
    }

    /**
     * Sets the value of the timepoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchTripDetailList.Timepoints }
     *     
     */
    public void setTimepoints(SchTripDetailList.Timepoints value) {
        this.timepoints = value;
    }

    /**
     * Gets the value of the stoppoints property.
     * 
     * @return
     *     possible object is
     *     {@link SchTripDetailList.Stoppoints }
     *     
     */
    public SchTripDetailList.Stoppoints getStoppoints() {
        return stoppoints;
    }

    /**
     * Sets the value of the stoppoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchTripDetailList.Stoppoints }
     *     
     */
    public void setStoppoints(SchTripDetailList.Stoppoints value) {
        this.stoppoints = value;
    }

    /**
     * Gets the value of the routes property.
     * 
     * @return
     *     possible object is
     *     {@link SchTripDetailList.Routes }
     *     
     */
    public SchTripDetailList.Routes getRoutes() {
        return routes;
    }

    /**
     * Sets the value of the routes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchTripDetailList.Routes }
     *     
     */
    public void setRoutes(SchTripDetailList.Routes value) {
        this.routes = value;
    }

    /**
     * Gets the value of the tripDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SchTripDetailList.TripDetails }
     *     
     */
    public SchTripDetailList.TripDetails getTripDetails() {
        return tripDetails;
    }

    /**
     * Sets the value of the tripDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchTripDetailList.TripDetails }
     *     
     */
    public void setTripDetails(SchTripDetailList.TripDetails value) {
        this.tripDetails = value;
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
     *       &lt;sequence maxOccurs="100"&gt;
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
     *       &lt;sequence maxOccurs="25000"&gt;
     *         &lt;element name="stoppoint" type="{http://www.TCIP-Final-4-0-0}CPTStoppointIden"/&gt;
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
        "stoppoint"
    })
    public static class Stoppoints {

        @XmlElement(required = true)
        protected List<CPTStoppointIden> stoppoint;

        /**
         * Gets the value of the stoppoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the stoppoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStoppoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CPTStoppointIden }
         * 
         * 
         */
        public List<CPTStoppointIden> getStoppoint() {
            if (stoppoint == null) {
                stoppoint = new ArrayList<CPTStoppointIden>();
            }
            return this.stoppoint;
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
     *         &lt;element name="timepoint" type="{http://www.TCIP-Final-4-0-0}SCHTimepointIden"/&gt;
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
        "timepoint"
    })
    public static class Timepoints {

        @XmlElement(required = true)
        protected List<SCHTimepointIden> timepoint;

        /**
         * Gets the value of the timepoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the timepoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTimepoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHTimepointIden }
         * 
         * 
         */
        public List<SCHTimepointIden> getTimepoint() {
            if (timepoint == null) {
                timepoint = new ArrayList<SCHTimepointIden>();
            }
            return this.timepoint;
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
     *         &lt;element name="trip-detail" type="{http://www.TCIP-Final-4-0-0}SCHTripDetailInfo"/&gt;
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
        "tripDetail"
    })
    public static class TripDetails {

        @XmlElement(name = "trip-detail", required = true)
        protected List<SCHTripDetailInfo> tripDetail;

        /**
         * Gets the value of the tripDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tripDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTripDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHTripDetailInfo }
         * 
         * 
         */
        public List<SCHTripDetailInfo> getTripDetail() {
            if (tripDetail == null) {
                tripDetail = new ArrayList<SCHTripDetailInfo>();
            }
            return this.tripDetail;
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
     *       &lt;sequence maxOccurs="100000"&gt;
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
