//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package tcip_final_4_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lrms_final_09_07.GeoLocation;
import org.joda.time.DateTime;


/**
 * <p>Java class for FCCashBoxEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FCCashBoxEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vehicle" type="{http://www.TCIP-Final-4-0-0}CPTVehicleIden"/&gt;
 *         &lt;element name="removedCashboxID" type="{http://www.TCIP-Final-4-0-0}CPT-SerialNumber" minOccurs="0"/&gt;
 *         &lt;element name="insertedCashboxID" type="{http://www.TCIP-Final-4-0-0}CPT-SerialNumber" minOccurs="0"/&gt;
 *         &lt;element name="timeCashboxRemoved" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="timeCashboxInserted" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="removedCashboxContents" type="{http://www.TCIP-Final-4-0-0}FCCashBoxContents" minOccurs="0"/&gt;
 *         &lt;element name="fareboxDoorOpenTime" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="fareboxDoorCloseTime" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://www.lrms-final-09-07}GeoLocation" minOccurs="0"/&gt;
 *         &lt;element name="time-recorded" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FCCashBoxEvent", propOrder = {
    "vehicle",
    "removedCashboxID",
    "insertedCashboxID",
    "timeCashboxRemoved",
    "timeCashboxInserted",
    "removedCashboxContents",
    "fareboxDoorOpenTime",
    "fareboxDoorCloseTime",
    "location",
    "timeRecorded"
})
public class FCCashBoxEvent {

    @XmlElement(required = true)
    protected CPTVehicleIden vehicle;
    protected String removedCashboxID;
    protected String insertedCashboxID;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime timeCashboxRemoved;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime timeCashboxInserted;
    protected FCCashBoxContents removedCashboxContents;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime fareboxDoorOpenTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime fareboxDoorCloseTime;
    protected GeoLocation location;
    @XmlElement(name = "time-recorded", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime timeRecorded;

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
     * Gets the value of the removedCashboxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemovedCashboxID() {
        return removedCashboxID;
    }

    /**
     * Sets the value of the removedCashboxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemovedCashboxID(String value) {
        this.removedCashboxID = value;
    }

    /**
     * Gets the value of the insertedCashboxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertedCashboxID() {
        return insertedCashboxID;
    }

    /**
     * Sets the value of the insertedCashboxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertedCashboxID(String value) {
        this.insertedCashboxID = value;
    }

    /**
     * Gets the value of the timeCashboxRemoved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getTimeCashboxRemoved() {
        return timeCashboxRemoved;
    }

    /**
     * Sets the value of the timeCashboxRemoved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeCashboxRemoved(DateTime value) {
        this.timeCashboxRemoved = value;
    }

    /**
     * Gets the value of the timeCashboxInserted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getTimeCashboxInserted() {
        return timeCashboxInserted;
    }

    /**
     * Sets the value of the timeCashboxInserted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeCashboxInserted(DateTime value) {
        this.timeCashboxInserted = value;
    }

    /**
     * Gets the value of the removedCashboxContents property.
     * 
     * @return
     *     possible object is
     *     {@link FCCashBoxContents }
     *     
     */
    public FCCashBoxContents getRemovedCashboxContents() {
        return removedCashboxContents;
    }

    /**
     * Sets the value of the removedCashboxContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link FCCashBoxContents }
     *     
     */
    public void setRemovedCashboxContents(FCCashBoxContents value) {
        this.removedCashboxContents = value;
    }

    /**
     * Gets the value of the fareboxDoorOpenTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getFareboxDoorOpenTime() {
        return fareboxDoorOpenTime;
    }

    /**
     * Sets the value of the fareboxDoorOpenTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareboxDoorOpenTime(DateTime value) {
        this.fareboxDoorOpenTime = value;
    }

    /**
     * Gets the value of the fareboxDoorCloseTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getFareboxDoorCloseTime() {
        return fareboxDoorCloseTime;
    }

    /**
     * Sets the value of the fareboxDoorCloseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareboxDoorCloseTime(DateTime value) {
        this.fareboxDoorCloseTime = value;
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
     * Gets the value of the timeRecorded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getTimeRecorded() {
        return timeRecorded;
    }

    /**
     * Sets the value of the timeRecorded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeRecorded(DateTime value) {
        this.timeRecorded = value;
    }

}
