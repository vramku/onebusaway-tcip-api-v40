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
import org.joda.time.LocalTime;


/**
 * <p>Java class for OBStoppointRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBStoppointRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entry-to-stop-point-zone" type="{http://www.TCIP-Final-4-0-0}CPT-Time"/&gt;
 *         &lt;element name="exit-to-stop-point-zone" type="{http://www.TCIP-Final-4-0-0}CPT-Time"/&gt;
 *         &lt;element name="stop-time-at-stop-pt" type="{http://www.TCIP-Final-4-0-0}CPT-Time" minOccurs="0"/&gt;
 *         &lt;element name="start-time-at-stop-pt" type="{http://www.TCIP-Final-4-0-0}CPT-Time" minOccurs="0"/&gt;
 *         &lt;element name="doorOpen" type="{http://www.TCIP-Final-4-0-0}CPT-Time" minOccurs="0"/&gt;
 *         &lt;element name="doorClose" type="{http://www.TCIP-Final-4-0-0}CPT-Time" minOccurs="0"/&gt;
 *         &lt;element name="schedule-adh-status" type="{http://www.TCIP-Final-4-0-0}OB-ScheduleAdherenceOffset" minOccurs="0"/&gt;
 *         &lt;element name="time-reported" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="stoppoint" type="{http://www.TCIP-Final-4-0-0}CPTStoppointIden" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://www.lrms-final-09-07}GeoLocation" minOccurs="0"/&gt;
 *         &lt;element name="heading" type="{http://www.TCIP-Final-4-0-0}SP-AngularDirection" minOccurs="0"/&gt;
 *         &lt;element name="pattern-segment" type="{http://www.TCIP-Final-4-0-0}SCHPatternSegmentIden" minOccurs="0"/&gt;
 *         &lt;element name="trip" type="{http://www.TCIP-Final-4-0-0}SCHTripIden" minOccurs="0"/&gt;
 *         &lt;element name="block" type="{http://www.TCIP-Final-4-0-0}SCHBlockIden" minOccurs="0"/&gt;
 *         &lt;element name="route" type="{http://www.TCIP-Final-4-0-0}SCHRouteIden" minOccurs="0"/&gt;
 *         &lt;element name="boarded" type="{http://www.TCIP-Final-4-0-0}OB-PassengerBoarding" minOccurs="0"/&gt;
 *         &lt;element name="alighted" type="{http://www.TCIP-Final-4-0-0}OB-PassengerAlighting" minOccurs="0"/&gt;
 *         &lt;element name="onboard" type="{http://www.TCIP-Final-4-0-0}OB-J1587-PassengerCounterPatronCount" minOccurs="0"/&gt;
 *         &lt;element name="rightDoorBoardAlights" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="75"&gt;
 *                   &lt;element name="rightDoorBoardAlight" type="{http://www.TCIP-Final-4-0-0}OBBoardAlightRecord"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="leftDoorBoardAlights" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="75"&gt;
 *                   &lt;element name="leftDoorBoardAlight" type="{http://www.TCIP-Final-4-0-0}OBBoardAlightRecord"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="lift-activated" type="{http://www.TCIP-Final-4-0-0}CPT-Boolean" minOccurs="0"/&gt;
 *         &lt;element name="odometer-reading" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="localOBStoppointRecord" type="{http://www.tcip-4-0-0-local}OBStoppointRecord" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBStoppointRecord", propOrder = {
    "entryToStopPointZone",
    "exitToStopPointZone",
    "stopTimeAtStopPt",
    "startTimeAtStopPt",
    "doorOpen",
    "doorClose",
    "scheduleAdhStatus",
    "timeReported",
    "stoppoint",
    "location",
    "heading",
    "patternSegment",
    "trip",
    "block",
    "route",
    "boarded",
    "alighted",
    "onboard",
    "rightDoorBoardAlights",
    "leftDoorBoardAlights",
    "liftActivated",
    "odometerReading",
    "localOBStoppointRecord"
})
public class OBStoppointRecord {

    @XmlElement(name = "entry-to-stop-point-zone", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected LocalTime entryToStopPointZone;
    @XmlElement(name = "exit-to-stop-point-zone", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected LocalTime exitToStopPointZone;
    @XmlElement(name = "stop-time-at-stop-pt", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected LocalTime stopTimeAtStopPt;
    @XmlElement(name = "start-time-at-stop-pt", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected LocalTime startTimeAtStopPt;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected LocalTime doorOpen;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected LocalTime doorClose;
    @XmlElement(name = "schedule-adh-status")
    protected Long scheduleAdhStatus;
    @XmlElement(name = "time-reported", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime timeReported;
    protected CPTStoppointIden stoppoint;
    protected GeoLocation location;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer heading;
    @XmlElement(name = "pattern-segment")
    protected SCHPatternSegmentIden patternSegment;
    protected SCHTripIden trip;
    protected SCHBlockIden block;
    protected SCHRouteIden route;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer boarded;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer alighted;
    @XmlSchemaType(name = "unsignedByte")
    protected Short onboard;
    protected OBStoppointRecord.RightDoorBoardAlights rightDoorBoardAlights;
    protected OBStoppointRecord.LeftDoorBoardAlights leftDoorBoardAlights;
    @XmlElement(name = "lift-activated")
    protected Boolean liftActivated;
    @XmlElement(name = "odometer-reading")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger odometerReading;
    protected tcip_4_0_0_local.OBStoppointRecord localOBStoppointRecord;

    /**
     * Gets the value of the entryToStopPointZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getEntryToStopPointZone() {
        return entryToStopPointZone;
    }

    /**
     * Sets the value of the entryToStopPointZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryToStopPointZone(LocalTime value) {
        this.entryToStopPointZone = value;
    }

    /**
     * Gets the value of the exitToStopPointZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getExitToStopPointZone() {
        return exitToStopPointZone;
    }

    /**
     * Sets the value of the exitToStopPointZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExitToStopPointZone(LocalTime value) {
        this.exitToStopPointZone = value;
    }

    /**
     * Gets the value of the stopTimeAtStopPt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getStopTimeAtStopPt() {
        return stopTimeAtStopPt;
    }

    /**
     * Sets the value of the stopTimeAtStopPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopTimeAtStopPt(LocalTime value) {
        this.stopTimeAtStopPt = value;
    }

    /**
     * Gets the value of the startTimeAtStopPt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getStartTimeAtStopPt() {
        return startTimeAtStopPt;
    }

    /**
     * Sets the value of the startTimeAtStopPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTimeAtStopPt(LocalTime value) {
        this.startTimeAtStopPt = value;
    }

    /**
     * Gets the value of the doorOpen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getDoorOpen() {
        return doorOpen;
    }

    /**
     * Sets the value of the doorOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoorOpen(LocalTime value) {
        this.doorOpen = value;
    }

    /**
     * Gets the value of the doorClose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getDoorClose() {
        return doorClose;
    }

    /**
     * Sets the value of the doorClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoorClose(LocalTime value) {
        this.doorClose = value;
    }

    /**
     * Gets the value of the scheduleAdhStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getScheduleAdhStatus() {
        return scheduleAdhStatus;
    }

    /**
     * Sets the value of the scheduleAdhStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setScheduleAdhStatus(Long value) {
        this.scheduleAdhStatus = value;
    }

    /**
     * Gets the value of the timeReported property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getTimeReported() {
        return timeReported;
    }

    /**
     * Sets the value of the timeReported property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeReported(DateTime value) {
        this.timeReported = value;
    }

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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setLocation(GeoLocation value) {
        this.location = value;
    }

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeading(Integer value) {
        this.heading = value;
    }

    /**
     * Gets the value of the patternSegment property.
     * 
     * @return
     *     possible object is
     *     {@link SCHPatternSegmentIden }
     *     
     */
    public SCHPatternSegmentIden getPatternSegment() {
        return patternSegment;
    }

    /**
     * Sets the value of the patternSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHPatternSegmentIden }
     *     
     */
    public void setPatternSegment(SCHPatternSegmentIden value) {
        this.patternSegment = value;
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
     * Gets the value of the block property.
     * 
     * @return
     *     possible object is
     *     {@link SCHBlockIden }
     *     
     */
    public SCHBlockIden getBlock() {
        return block;
    }

    /**
     * Sets the value of the block property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHBlockIden }
     *     
     */
    public void setBlock(SCHBlockIden value) {
        this.block = value;
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
     * Gets the value of the boarded property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBoarded() {
        return boarded;
    }

    /**
     * Sets the value of the boarded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBoarded(Integer value) {
        this.boarded = value;
    }

    /**
     * Gets the value of the alighted property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAlighted() {
        return alighted;
    }

    /**
     * Sets the value of the alighted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAlighted(Integer value) {
        this.alighted = value;
    }

    /**
     * Gets the value of the onboard property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOnboard() {
        return onboard;
    }

    /**
     * Sets the value of the onboard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOnboard(Short value) {
        this.onboard = value;
    }

    /**
     * Gets the value of the rightDoorBoardAlights property.
     * 
     * @return
     *     possible object is
     *     {@link OBStoppointRecord.RightDoorBoardAlights }
     *     
     */
    public OBStoppointRecord.RightDoorBoardAlights getRightDoorBoardAlights() {
        return rightDoorBoardAlights;
    }

    /**
     * Sets the value of the rightDoorBoardAlights property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBStoppointRecord.RightDoorBoardAlights }
     *     
     */
    public void setRightDoorBoardAlights(OBStoppointRecord.RightDoorBoardAlights value) {
        this.rightDoorBoardAlights = value;
    }

    /**
     * Gets the value of the leftDoorBoardAlights property.
     * 
     * @return
     *     possible object is
     *     {@link OBStoppointRecord.LeftDoorBoardAlights }
     *     
     */
    public OBStoppointRecord.LeftDoorBoardAlights getLeftDoorBoardAlights() {
        return leftDoorBoardAlights;
    }

    /**
     * Sets the value of the leftDoorBoardAlights property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBStoppointRecord.LeftDoorBoardAlights }
     *     
     */
    public void setLeftDoorBoardAlights(OBStoppointRecord.LeftDoorBoardAlights value) {
        this.leftDoorBoardAlights = value;
    }

    /**
     * Gets the value of the liftActivated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLiftActivated() {
        return liftActivated;
    }

    /**
     * Sets the value of the liftActivated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLiftActivated(Boolean value) {
        this.liftActivated = value;
    }

    /**
     * Gets the value of the odometerReading property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOdometerReading() {
        return odometerReading;
    }

    /**
     * Sets the value of the odometerReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOdometerReading(BigInteger value) {
        this.odometerReading = value;
    }

    /**
     * Gets the value of the localOBStoppointRecord property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_4_0_0_local.OBStoppointRecord }
     *     
     */
    public tcip_4_0_0_local.OBStoppointRecord getLocalOBStoppointRecord() {
        return localOBStoppointRecord;
    }

    /**
     * Sets the value of the localOBStoppointRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_4_0_0_local.OBStoppointRecord }
     *     
     */
    public void setLocalOBStoppointRecord(tcip_4_0_0_local.OBStoppointRecord value) {
        this.localOBStoppointRecord = value;
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
     *       &lt;sequence maxOccurs="75"&gt;
     *         &lt;element name="leftDoorBoardAlight" type="{http://www.TCIP-Final-4-0-0}OBBoardAlightRecord"/&gt;
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
        "leftDoorBoardAlight"
    })
    public static class LeftDoorBoardAlights {

        @XmlElement(required = true)
        protected List<OBBoardAlightRecord> leftDoorBoardAlight;

        /**
         * Gets the value of the leftDoorBoardAlight property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the leftDoorBoardAlight property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLeftDoorBoardAlight().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OBBoardAlightRecord }
         * 
         * 
         */
        public List<OBBoardAlightRecord> getLeftDoorBoardAlight() {
            if (leftDoorBoardAlight == null) {
                leftDoorBoardAlight = new ArrayList<OBBoardAlightRecord>();
            }
            return this.leftDoorBoardAlight;
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
     *       &lt;sequence maxOccurs="75"&gt;
     *         &lt;element name="rightDoorBoardAlight" type="{http://www.TCIP-Final-4-0-0}OBBoardAlightRecord"/&gt;
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
        "rightDoorBoardAlight"
    })
    public static class RightDoorBoardAlights {

        @XmlElement(required = true)
        protected List<OBBoardAlightRecord> rightDoorBoardAlight;

        /**
         * Gets the value of the rightDoorBoardAlight property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rightDoorBoardAlight property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRightDoorBoardAlight().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OBBoardAlightRecord }
         * 
         * 
         */
        public List<OBBoardAlightRecord> getRightDoorBoardAlight() {
            if (rightDoorBoardAlight == null) {
                rightDoorBoardAlight = new ArrayList<OBBoardAlightRecord>();
            }
            return this.rightDoorBoardAlight;
        }

    }

}
