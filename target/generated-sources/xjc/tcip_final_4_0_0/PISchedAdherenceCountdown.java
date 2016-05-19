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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lrms_final_09_07.GeoLocation;
import org.joda.time.DateTime;


/**
 * <p>Java class for PISchedAdherenceCountdown complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PISchedAdherenceCountdown"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stoppoint" type="{http://www.TCIP-Final-4-0-0}CPTStoppointIden"/&gt;
 *         &lt;element name="route" type="{http://www.TCIP-Final-4-0-0}SCHRouteIden" minOccurs="0"/&gt;
 *         &lt;element name="routeDirection" type="{http://www.TCIP-Final-4-0-0}SCH-RouteDirectionName" minOccurs="0"/&gt;
 *         &lt;element name="routeDirectionLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="destination" type="{http://www.TCIP-Final-4-0-0}PI-DMSMessage" minOccurs="0"/&gt;
 *         &lt;element name="destinationLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="gate-bay" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="trip" type="{http://www.TCIP-Final-4-0-0}SCHTripIden" minOccurs="0"/&gt;
 *         &lt;element name="vehicle" type="{http://www.TCIP-Final-4-0-0}CPTVehicleIden" minOccurs="0"/&gt;
 *         &lt;element name="nextArrivalCountdown" type="{http://www.TCIP-Final-4-0-0}CPT-Duration" minOccurs="0"/&gt;
 *         &lt;element name="tolerance" type="{http://www.TCIP-Final-4-0-0}CPT-Duration" minOccurs="0"/&gt;
 *         &lt;element name="estimated-departure" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="comment" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="commentLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="available-seats" type="{http://www.TCIP-Final-4-0-0}CPT-SeatCount" minOccurs="0"/&gt;
 *         &lt;element name="nextArrivalCurrentLocation" type="{http://www.lrms-final-09-07}GeoLocation" minOccurs="0"/&gt;
 *         &lt;element name="nextArrivalCurrentLocationNameLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="bulletins" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="10"&gt;
 *                   &lt;element name="bulletin" type="{http://www.TCIP-Final-4-0-0}PIServiceBulletin"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="metadata" type="{http://www.TCIP-Final-4-0-0}CPTRowMetaData" minOccurs="0"/&gt;
 *         &lt;element name="nextArrivalCurrentLocationName" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="nextScheduledArrival" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="scheduled-departure" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PISchedAdherenceCountdown", propOrder = {
    "stoppoint",
    "route",
    "routeDirection",
    "routeDirectionLangs",
    "destination",
    "destinationLangs",
    "gateBay",
    "trip",
    "vehicle",
    "nextArrivalCountdown",
    "tolerance",
    "estimatedDeparture",
    "comment",
    "commentLangs",
    "availableSeats",
    "nextArrivalCurrentLocation",
    "nextArrivalCurrentLocationNameLangs",
    "bulletins",
    "metadata",
    "nextArrivalCurrentLocationName",
    "nextScheduledArrival",
    "scheduledDeparture"
})
public class PISchedAdherenceCountdown {

    @XmlElement(required = true)
    protected CPTStoppointIden stoppoint;
    protected SCHRouteIden route;
    protected String routeDirection;
    protected CPTAdditionalLanguageContents routeDirectionLangs;
    protected String destination;
    protected CPTAdditionalLanguageContents destinationLangs;
    @XmlElement(name = "gate-bay")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger gateBay;
    protected SCHTripIden trip;
    protected CPTVehicleIden vehicle;
    @XmlSchemaType(name = "anySimpleType")
    protected String nextArrivalCountdown;
    @XmlSchemaType(name = "anySimpleType")
    protected String tolerance;
    @XmlElement(name = "estimated-departure", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime estimatedDeparture;
    protected String comment;
    protected CPTAdditionalLanguageContents commentLangs;
    @XmlElement(name = "available-seats")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer availableSeats;
    protected GeoLocation nextArrivalCurrentLocation;
    protected CPTAdditionalLanguageContents nextArrivalCurrentLocationNameLangs;
    protected PISchedAdherenceCountdown.Bulletins bulletins;
    protected CPTRowMetaData metadata;
    protected String nextArrivalCurrentLocationName;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime nextScheduledArrival;
    @XmlElement(name = "scheduled-departure", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime scheduledDeparture;

    /**
     * Gets the value of the stoppoint property.
     * 
     * @return
     *     possible object is
     *     {@link CPTStoppointIden }
     *     
     */
    public CPTStoppointIden getStoppoint() {
        return stoppoint;
    }

    /**
     * Sets the value of the stoppoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTStoppointIden }
     *     
     */
    public void setStoppoint(CPTStoppointIden value) {
        this.stoppoint = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link SCHRouteIden }
     *     
     */
    public SCHRouteIden getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHRouteIden }
     *     
     */
    public void setRoute(SCHRouteIden value) {
        this.route = value;
    }

    /**
     * Gets the value of the routeDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteDirection() {
        return routeDirection;
    }

    /**
     * Sets the value of the routeDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteDirection(String value) {
        this.routeDirection = value;
    }

    /**
     * Gets the value of the routeDirectionLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getRouteDirectionLangs() {
        return routeDirectionLangs;
    }

    /**
     * Sets the value of the routeDirectionLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setRouteDirectionLangs(CPTAdditionalLanguageContents value) {
        this.routeDirectionLangs = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the destinationLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getDestinationLangs() {
        return destinationLangs;
    }

    /**
     * Sets the value of the destinationLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setDestinationLangs(CPTAdditionalLanguageContents value) {
        this.destinationLangs = value;
    }

    /**
     * Gets the value of the gateBay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGateBay() {
        return gateBay;
    }

    /**
     * Sets the value of the gateBay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGateBay(BigInteger value) {
        this.gateBay = value;
    }

    /**
     * Gets the value of the trip property.
     * 
     * @return
     *     possible object is
     *     {@link SCHTripIden }
     *     
     */
    public SCHTripIden getTrip() {
        return trip;
    }

    /**
     * Sets the value of the trip property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHTripIden }
     *     
     */
    public void setTrip(SCHTripIden value) {
        this.trip = value;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link CPTVehicleIden }
     *     
     */
    public CPTVehicleIden getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTVehicleIden }
     *     
     */
    public void setVehicle(CPTVehicleIden value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the nextArrivalCountdown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextArrivalCountdown() {
        return nextArrivalCountdown;
    }

    /**
     * Sets the value of the nextArrivalCountdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextArrivalCountdown(String value) {
        this.nextArrivalCountdown = value;
    }

    /**
     * Gets the value of the tolerance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTolerance() {
        return tolerance;
    }

    /**
     * Sets the value of the tolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTolerance(String value) {
        this.tolerance = value;
    }

    /**
     * Gets the value of the estimatedDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getEstimatedDeparture() {
        return estimatedDeparture;
    }

    /**
     * Sets the value of the estimatedDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedDeparture(DateTime value) {
        this.estimatedDeparture = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the commentLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getCommentLangs() {
        return commentLangs;
    }

    /**
     * Sets the value of the commentLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setCommentLangs(CPTAdditionalLanguageContents value) {
        this.commentLangs = value;
    }

    /**
     * Gets the value of the availableSeats property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvailableSeats() {
        return availableSeats;
    }

    /**
     * Sets the value of the availableSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvailableSeats(Integer value) {
        this.availableSeats = value;
    }

    /**
     * Gets the value of the nextArrivalCurrentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getNextArrivalCurrentLocation() {
        return nextArrivalCurrentLocation;
    }

    /**
     * Sets the value of the nextArrivalCurrentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setNextArrivalCurrentLocation(GeoLocation value) {
        this.nextArrivalCurrentLocation = value;
    }

    /**
     * Gets the value of the nextArrivalCurrentLocationNameLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getNextArrivalCurrentLocationNameLangs() {
        return nextArrivalCurrentLocationNameLangs;
    }

    /**
     * Sets the value of the nextArrivalCurrentLocationNameLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setNextArrivalCurrentLocationNameLangs(CPTAdditionalLanguageContents value) {
        this.nextArrivalCurrentLocationNameLangs = value;
    }

    /**
     * Gets the value of the bulletins property.
     * 
     * @return
     *     possible object is
     *     {@link PISchedAdherenceCountdown.Bulletins }
     *     
     */
    public PISchedAdherenceCountdown.Bulletins getBulletins() {
        return bulletins;
    }

    /**
     * Sets the value of the bulletins property.
     * 
     * @param value
     *     allowed object is
     *     {@link PISchedAdherenceCountdown.Bulletins }
     *     
     */
    public void setBulletins(PISchedAdherenceCountdown.Bulletins value) {
        this.bulletins = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link CPTRowMetaData }
     *     
     */
    public CPTRowMetaData getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTRowMetaData }
     *     
     */
    public void setMetadata(CPTRowMetaData value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the nextArrivalCurrentLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextArrivalCurrentLocationName() {
        return nextArrivalCurrentLocationName;
    }

    /**
     * Sets the value of the nextArrivalCurrentLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextArrivalCurrentLocationName(String value) {
        this.nextArrivalCurrentLocationName = value;
    }

    /**
     * Gets the value of the nextScheduledArrival property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getNextScheduledArrival() {
        return nextScheduledArrival;
    }

    /**
     * Sets the value of the nextScheduledArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextScheduledArrival(DateTime value) {
        this.nextScheduledArrival = value;
    }

    /**
     * Gets the value of the scheduledDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getScheduledDeparture() {
        return scheduledDeparture;
    }

    /**
     * Sets the value of the scheduledDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledDeparture(DateTime value) {
        this.scheduledDeparture = value;
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
     *       &lt;sequence maxOccurs="10"&gt;
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

}