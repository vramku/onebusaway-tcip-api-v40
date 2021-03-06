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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lrms_final_09_07.Angle;
import org.joda.time.DateTime;


/**
 * <p>Java class for TSPStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSPStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="scheduleDeviation" type="{http://www.TCIP-Final-4-0-0}OB-ScheduleAdherenceOffset"/&gt;
 *         &lt;element name="loc-lat" type="{http://www.lrms-final-09-07}Latitude"/&gt;
 *         &lt;element name="loc-lon" type="{http://www.lrms-final-09-07}Longitude"/&gt;
 *         &lt;element name="loc-dir" type="{http://www.lrms-final-09-07}Angle"/&gt;
 *         &lt;element name="loc-spd" type="{http://www.TCIP-Final-4-0-0}OB-J1587-VelocityVectorSpeed"/&gt;
 *         &lt;element name="loc-quality" type="{http://www.TCIP-Final-4-0-0}SPDataQuality" minOccurs="0"/&gt;
 *         &lt;element name="currentTime" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime"/&gt;
 *         &lt;element name="doorStatusOpen" type="{http://www.TCIP-Final-4-0-0}CPT-Boolean"/&gt;
 *         &lt;element name="requestCancel" type="{http://www.TCIP-Final-4-0-0}CPT-Boolean"/&gt;
 *         &lt;element name="currentRoute" type="{http://www.TCIP-Final-4-0-0}SCHRouteIden" minOccurs="0"/&gt;
 *         &lt;element name="currentRun" type="{http://www.TCIP-Final-4-0-0}SCHRunIden" minOccurs="0"/&gt;
 *         &lt;element name="currentTrip" type="{http://www.TCIP-Final-4-0-0}SCHTripIden" minOccurs="0"/&gt;
 *         &lt;element name="currentOperator" type="{http://www.TCIP-Final-4-0-0}CPTOperatorIden" minOccurs="0"/&gt;
 *         &lt;element name="passengersOnboard" type="{http://www.TCIP-Final-4-0-0}OB-J1587-PassengerCounterPatronCount" minOccurs="0"/&gt;
 *         &lt;element name="express" type="{http://www.TCIP-Final-4-0-0}CPT-Boolean" minOccurs="0"/&gt;
 *         &lt;element name="scheduleId" type="{http://www.TCIP-Final-4-0-0}SCH-TimetableVersionID" minOccurs="0"/&gt;
 *         &lt;element name="override" type="{http://www.TCIP-Final-4-0-0}CPT-Boolean" minOccurs="0"/&gt;
 *         &lt;element name="alert" type="{http://www.TCIP-Final-4-0-0}CPT-Boolean" minOccurs="0"/&gt;
 *         &lt;element name="stopRequested" type="{http://www.TCIP-Final-4-0-0}CPT-Boolean" minOccurs="0"/&gt;
 *         &lt;element name="localTSPStatus" type="{http://www.tcip-4-0-0-local}TSPStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSPStatus", propOrder = {
    "scheduleDeviation",
    "locLat",
    "locLon",
    "locDir",
    "locSpd",
    "locQuality",
    "currentTime",
    "doorStatusOpen",
    "requestCancel",
    "currentRoute",
    "currentRun",
    "currentTrip",
    "currentOperator",
    "passengersOnboard",
    "express",
    "scheduleId",
    "override",
    "alert",
    "stopRequested",
    "localTSPStatus"
})
public class TSPStatus {

    protected long scheduleDeviation;
    @XmlElement(name = "loc-lat")
    protected int locLat;
    @XmlElement(name = "loc-lon")
    protected int locLon;
    @XmlElement(name = "loc-dir", required = true)
    protected Angle locDir;
    @XmlElement(name = "loc-spd")
    @XmlSchemaType(name = "unsignedByte")
    protected short locSpd;
    @XmlElement(name = "loc-quality")
    protected SPDataQuality locQuality;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime currentTime;
    protected boolean doorStatusOpen;
    protected boolean requestCancel;
    protected SCHRouteIden currentRoute;
    protected SCHRunIden currentRun;
    protected SCHTripIden currentTrip;
    protected CPTOperatorIden currentOperator;
    @XmlSchemaType(name = "unsignedByte")
    protected Short passengersOnboard;
    protected Boolean express;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger scheduleId;
    protected Boolean override;
    protected Boolean alert;
    protected Boolean stopRequested;
    protected tcip_4_0_0_local.TSPStatus localTSPStatus;

    /**
     * Gets the value of the scheduleDeviation property.
     * 
     */
    public long getScheduleDeviation() {
        return scheduleDeviation;
    }

    /**
     * Sets the value of the scheduleDeviation property.
     * 
     */
    public void setScheduleDeviation(long value) {
        this.scheduleDeviation = value;
    }

    /**
     * Gets the value of the locLat property.
     * 
     */
    public int getLocLat() {
        return locLat;
    }

    /**
     * Sets the value of the locLat property.
     * 
     */
    public void setLocLat(int value) {
        this.locLat = value;
    }

    /**
     * Gets the value of the locLon property.
     * 
     */
    public int getLocLon() {
        return locLon;
    }

    /**
     * Sets the value of the locLon property.
     * 
     */
    public void setLocLon(int value) {
        this.locLon = value;
    }

    /**
     * Gets the value of the locDir property.
     * 
     * @return
     *     possible object is
     *     {@link Angle }
     *     
     */
    public Angle getLocDir() {
        return locDir;
    }

    /**
     * Sets the value of the locDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Angle }
     *     
     */
    public void setLocDir(Angle value) {
        this.locDir = value;
    }

    /**
     * Gets the value of the locSpd property.
     * 
     */
    public short getLocSpd() {
        return locSpd;
    }

    /**
     * Sets the value of the locSpd property.
     * 
     */
    public void setLocSpd(short value) {
        this.locSpd = value;
    }

    /**
     * Gets the value of the locQuality property.
     * 
     * @return
     *     possible object is
     *     {@link SPDataQuality }
     *     
     */
    public SPDataQuality getLocQuality() {
        return locQuality;
    }

    /**
     * Sets the value of the locQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPDataQuality }
     *     
     */
    public void setLocQuality(SPDataQuality value) {
        this.locQuality = value;
    }

    /**
     * Gets the value of the currentTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getCurrentTime() {
        return currentTime;
    }

    /**
     * Sets the value of the currentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentTime(DateTime value) {
        this.currentTime = value;
    }

    /**
     * Gets the value of the doorStatusOpen property.
     * 
     */
    public boolean isDoorStatusOpen() {
        return doorStatusOpen;
    }

    /**
     * Sets the value of the doorStatusOpen property.
     * 
     */
    public void setDoorStatusOpen(boolean value) {
        this.doorStatusOpen = value;
    }

    /**
     * Gets the value of the requestCancel property.
     * 
     */
    public boolean isRequestCancel() {
        return requestCancel;
    }

    /**
     * Sets the value of the requestCancel property.
     * 
     */
    public void setRequestCancel(boolean value) {
        this.requestCancel = value;
    }

    /**
     * Gets the value of the currentRoute property.
     * 
     * @return
     *     possible object is
     *     {@link SCHRouteIden }
     *     
     */
    public SCHRouteIden getCurrentRoute() {
        return currentRoute;
    }

    /**
     * Sets the value of the currentRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHRouteIden }
     *     
     */
    public void setCurrentRoute(SCHRouteIden value) {
        this.currentRoute = value;
    }

    /**
     * Gets the value of the currentRun property.
     * 
     * @return
     *     possible object is
     *     {@link SCHRunIden }
     *     
     */
    public SCHRunIden getCurrentRun() {
        return currentRun;
    }

    /**
     * Sets the value of the currentRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHRunIden }
     *     
     */
    public void setCurrentRun(SCHRunIden value) {
        this.currentRun = value;
    }

    /**
     * Gets the value of the currentTrip property.
     * 
     * @return
     *     possible object is
     *     {@link SCHTripIden }
     *     
     */
    public SCHTripIden getCurrentTrip() {
        return currentTrip;
    }

    /**
     * Sets the value of the currentTrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHTripIden }
     *     
     */
    public void setCurrentTrip(SCHTripIden value) {
        this.currentTrip = value;
    }

    /**
     * Gets the value of the currentOperator property.
     * 
     * @return
     *     possible object is
     *     {@link CPTOperatorIden }
     *     
     */
    public CPTOperatorIden getCurrentOperator() {
        return currentOperator;
    }

    /**
     * Sets the value of the currentOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTOperatorIden }
     *     
     */
    public void setCurrentOperator(CPTOperatorIden value) {
        this.currentOperator = value;
    }

    /**
     * Gets the value of the passengersOnboard property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPassengersOnboard() {
        return passengersOnboard;
    }

    /**
     * Sets the value of the passengersOnboard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPassengersOnboard(Short value) {
        this.passengersOnboard = value;
    }

    /**
     * Gets the value of the express property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpress() {
        return express;
    }

    /**
     * Sets the value of the express property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpress(Boolean value) {
        this.express = value;
    }

    /**
     * Gets the value of the scheduleId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScheduleId() {
        return scheduleId;
    }

    /**
     * Sets the value of the scheduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScheduleId(BigInteger value) {
        this.scheduleId = value;
    }

    /**
     * Gets the value of the override property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverride() {
        return override;
    }

    /**
     * Sets the value of the override property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverride(Boolean value) {
        this.override = value;
    }

    /**
     * Gets the value of the alert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlert() {
        return alert;
    }

    /**
     * Sets the value of the alert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlert(Boolean value) {
        this.alert = value;
    }

    /**
     * Gets the value of the stopRequested property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopRequested() {
        return stopRequested;
    }

    /**
     * Sets the value of the stopRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopRequested(Boolean value) {
        this.stopRequested = value;
    }

    /**
     * Gets the value of the localTSPStatus property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_4_0_0_local.TSPStatus }
     *     
     */
    public tcip_4_0_0_local.TSPStatus getLocalTSPStatus() {
        return localTSPStatus;
    }

    /**
     * Sets the value of the localTSPStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_4_0_0_local.TSPStatus }
     *     
     */
    public void setLocalTSPStatus(tcip_4_0_0_local.TSPStatus value) {
        this.localTSPStatus = value;
    }

}
