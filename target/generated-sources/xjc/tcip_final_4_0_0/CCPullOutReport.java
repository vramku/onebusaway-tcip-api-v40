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
 * <p>Java class for CCPullOutReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCPullOutReport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vehicleID" type="{http://www.TCIP-Final-4-0-0}CPTVehicleIden"/&gt;
 *         &lt;element name="pullout-time" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="pullout-trip" type="{http://www.TCIP-Final-4-0-0}SCHTripIden" minOccurs="0"/&gt;
 *         &lt;element name="pullout-location" type="{http://www.lrms-final-09-07}GeoLocation" minOccurs="0"/&gt;
 *         &lt;element name="schedPullOutTime" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="parked-spot" type="{http://www.TCIP-Final-4-0-0}CPTParkingSpace" minOccurs="0"/&gt;
 *         &lt;element name="trainID" type="{http://www.TCIP-Final-4-0-0}CPTTrainIden" minOccurs="0"/&gt;
 *         &lt;element name="localCCPullOutReport" type="{http://www.tcip-4-0-0-local}CCPullOutReport" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCPullOutReport", propOrder = {
    "vehicleID",
    "pulloutTime",
    "pulloutTrip",
    "pulloutLocation",
    "schedPullOutTime",
    "parkedSpot",
    "trainID",
    "localCCPullOutReport"
})
public class CCPullOutReport {

    @XmlElement(required = true)
    protected CPTVehicleIden vehicleID;
    @XmlElement(name = "pullout-time", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime pulloutTime;
    @XmlElement(name = "pullout-trip")
    protected SCHTripIden pulloutTrip;
    @XmlElement(name = "pullout-location")
    protected GeoLocation pulloutLocation;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime schedPullOutTime;
    @XmlElement(name = "parked-spot")
    protected CPTParkingSpace parkedSpot;
    protected CPTTrainIden trainID;
    protected tcip_4_0_0_local.CCPullOutReport localCCPullOutReport;

    /**
     * Gets the value of the vehicleID property.
     * 
     * @return
     *     possible object is
     *     {@link CPTVehicleIden }
     *     
     */
    public CPTVehicleIden getVehicleID() {
        return vehicleID;
    }

    /**
     * Sets the value of the vehicleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTVehicleIden }
     *     
     */
    public void setVehicleID(CPTVehicleIden value) {
        this.vehicleID = value;
    }

    /**
     * Gets the value of the pulloutTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getPulloutTime() {
        return pulloutTime;
    }

    /**
     * Sets the value of the pulloutTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPulloutTime(DateTime value) {
        this.pulloutTime = value;
    }

    /**
     * Gets the value of the pulloutTrip property.
     * 
     * @return
     *     possible object is
     *     {@link SCHTripIden }
     *     
     */
    public SCHTripIden getPulloutTrip() {
        return pulloutTrip;
    }

    /**
     * Sets the value of the pulloutTrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHTripIden }
     *     
     */
    public void setPulloutTrip(SCHTripIden value) {
        this.pulloutTrip = value;
    }

    /**
     * Gets the value of the pulloutLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getPulloutLocation() {
        return pulloutLocation;
    }

    /**
     * Sets the value of the pulloutLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setPulloutLocation(GeoLocation value) {
        this.pulloutLocation = value;
    }

    /**
     * Gets the value of the schedPullOutTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getSchedPullOutTime() {
        return schedPullOutTime;
    }

    /**
     * Sets the value of the schedPullOutTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedPullOutTime(DateTime value) {
        this.schedPullOutTime = value;
    }

    /**
     * Gets the value of the parkedSpot property.
     * 
     * @return
     *     possible object is
     *     {@link CPTParkingSpace }
     *     
     */
    public CPTParkingSpace getParkedSpot() {
        return parkedSpot;
    }

    /**
     * Sets the value of the parkedSpot property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTParkingSpace }
     *     
     */
    public void setParkedSpot(CPTParkingSpace value) {
        this.parkedSpot = value;
    }

    /**
     * Gets the value of the trainID property.
     * 
     * @return
     *     possible object is
     *     {@link CPTTrainIden }
     *     
     */
    public CPTTrainIden getTrainID() {
        return trainID;
    }

    /**
     * Sets the value of the trainID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTTrainIden }
     *     
     */
    public void setTrainID(CPTTrainIden value) {
        this.trainID = value;
    }

    /**
     * Gets the value of the localCCPullOutReport property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_4_0_0_local.CCPullOutReport }
     *     
     */
    public tcip_4_0_0_local.CCPullOutReport getLocalCCPullOutReport() {
        return localCCPullOutReport;
    }

    /**
     * Sets the value of the localCCPullOutReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_4_0_0_local.CCPullOutReport }
     *     
     */
    public void setLocalCCPullOutReport(tcip_4_0_0_local.CCPullOutReport value) {
        this.localCCPullOutReport = value;
    }

}
