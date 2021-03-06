//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package tcip_final_4_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>Java class for TSPEventLogEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSPEventLogEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="event-type" type="{http://www.TCIP-Final-4-0-0}SCP-LoggedEventType"/&gt;
 *         &lt;element name="event-time" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime"/&gt;
 *         &lt;element name="intersection" type="{http://www.TCIP-Final-4-0-0}CPTIntersectionIden"/&gt;
 *         &lt;element name="requestID" type="{http://www.TCIP-Final-4-0-0}SCP-PriorityRequestID" minOccurs="0"/&gt;
 *         &lt;element name="request-time" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="disposition" type="{http://www.TCIP-Final-4-0-0}SCP-StatusCodeForPRG" minOccurs="0"/&gt;
 *         &lt;element name="disposition-time" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="granted" type="{http://www.TCIP-Final-4-0-0}CPT-Boolean" minOccurs="0"/&gt;
 *         &lt;element name="grant-duration" type="{http://www.TCIP-Final-4-0-0}SCP-TimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="grant-records" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="10"&gt;
 *                   &lt;element name="grant-record" type="{http://www.TCIP-Final-4-0-0}TSPGrantRecord"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="vin" type="{http://www.TCIP-Final-4-0-0}CPT-VIN" minOccurs="0"/&gt;
 *         &lt;element name="vehicleClassType" type="{http://www.TCIP-Final-4-0-0}SCP-VehicleClassType" minOccurs="0"/&gt;
 *         &lt;element name="serviceStrategyNumber" type="{http://www.TCIP-Final-4-0-0}SCP-PriorityStrategyNumber" minOccurs="0"/&gt;
 *         &lt;element name="timeOfServiceDesired" type="{http://www.TCIP-Final-4-0-0}SCP-TimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="timeOfEstimatedDeparture" type="{http://www.TCIP-Final-4-0-0}SCP-TimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="preemption-vehicle" type="{http://www.TCIP-Final-4-0-0}CPT-VIN" minOccurs="0"/&gt;
 *         &lt;element name="actual-wait-time" type="{http://www.TCIP-Final-4-0-0}SCP-TimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="strategyEmployed" type="{http://www.TCIP-Final-4-0-0}SCP-PriorityStrategyNumber" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSPEventLogEntry", propOrder = {
    "eventType",
    "eventTime",
    "intersection",
    "requestID",
    "requestTime",
    "disposition",
    "dispositionTime",
    "granted",
    "grantDuration",
    "grantRecords",
    "vin",
    "vehicleClassType",
    "serviceStrategyNumber",
    "timeOfServiceDesired",
    "timeOfEstimatedDeparture",
    "preemptionVehicle",
    "actualWaitTime",
    "strategyEmployed"
})
public class TSPEventLogEntry {

    @XmlElement(name = "event-type", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String eventType;
    @XmlElement(name = "event-time", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime eventTime;
    @XmlElement(required = true)
    protected CPTIntersectionIden intersection;
    @XmlSchemaType(name = "unsignedByte")
    protected Short requestID;
    @XmlElement(name = "request-time", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime requestTime;
    @XmlSchemaType(name = "unsignedByte")
    protected Short disposition;
    @XmlElement(name = "disposition-time", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime dispositionTime;
    protected Boolean granted;
    @XmlElement(name = "grant-duration")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer grantDuration;
    @XmlElement(name = "grant-records")
    protected TSPEventLogEntry.GrantRecords grantRecords;
    protected String vin;
    @XmlSchemaType(name = "unsignedByte")
    protected Short vehicleClassType;
    @XmlSchemaType(name = "unsignedByte")
    protected Short serviceStrategyNumber;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer timeOfServiceDesired;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer timeOfEstimatedDeparture;
    @XmlElement(name = "preemption-vehicle")
    protected String preemptionVehicle;
    @XmlElement(name = "actual-wait-time")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer actualWaitTime;
    @XmlSchemaType(name = "unsignedByte")
    protected Short strategyEmployed;

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventTime(DateTime value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the intersection property.
     * 
     * @return
     *     possible object is
     *     {@link CPTIntersectionIden }
     *     
     */
    public CPTIntersectionIden getIntersection() {
        return intersection;
    }

    /**
     * Sets the value of the intersection property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTIntersectionIden }
     *     
     */
    public void setIntersection(CPTIntersectionIden value) {
        this.intersection = value;
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRequestID(Short value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the requestTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getRequestTime() {
        return requestTime;
    }

    /**
     * Sets the value of the requestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestTime(DateTime value) {
        this.requestTime = value;
    }

    /**
     * Gets the value of the disposition property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDisposition() {
        return disposition;
    }

    /**
     * Sets the value of the disposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDisposition(Short value) {
        this.disposition = value;
    }

    /**
     * Gets the value of the dispositionTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getDispositionTime() {
        return dispositionTime;
    }

    /**
     * Sets the value of the dispositionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispositionTime(DateTime value) {
        this.dispositionTime = value;
    }

    /**
     * Gets the value of the granted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGranted() {
        return granted;
    }

    /**
     * Sets the value of the granted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGranted(Boolean value) {
        this.granted = value;
    }

    /**
     * Gets the value of the grantDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGrantDuration() {
        return grantDuration;
    }

    /**
     * Sets the value of the grantDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGrantDuration(Integer value) {
        this.grantDuration = value;
    }

    /**
     * Gets the value of the grantRecords property.
     * 
     * @return
     *     possible object is
     *     {@link TSPEventLogEntry.GrantRecords }
     *     
     */
    public TSPEventLogEntry.GrantRecords getGrantRecords() {
        return grantRecords;
    }

    /**
     * Sets the value of the grantRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSPEventLogEntry.GrantRecords }
     *     
     */
    public void setGrantRecords(TSPEventLogEntry.GrantRecords value) {
        this.grantRecords = value;
    }

    /**
     * Gets the value of the vin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVin() {
        return vin;
    }

    /**
     * Sets the value of the vin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVin(String value) {
        this.vin = value;
    }

    /**
     * Gets the value of the vehicleClassType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getVehicleClassType() {
        return vehicleClassType;
    }

    /**
     * Sets the value of the vehicleClassType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setVehicleClassType(Short value) {
        this.vehicleClassType = value;
    }

    /**
     * Gets the value of the serviceStrategyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getServiceStrategyNumber() {
        return serviceStrategyNumber;
    }

    /**
     * Sets the value of the serviceStrategyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setServiceStrategyNumber(Short value) {
        this.serviceStrategyNumber = value;
    }

    /**
     * Gets the value of the timeOfServiceDesired property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeOfServiceDesired() {
        return timeOfServiceDesired;
    }

    /**
     * Sets the value of the timeOfServiceDesired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeOfServiceDesired(Integer value) {
        this.timeOfServiceDesired = value;
    }

    /**
     * Gets the value of the timeOfEstimatedDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeOfEstimatedDeparture() {
        return timeOfEstimatedDeparture;
    }

    /**
     * Sets the value of the timeOfEstimatedDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeOfEstimatedDeparture(Integer value) {
        this.timeOfEstimatedDeparture = value;
    }

    /**
     * Gets the value of the preemptionVehicle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreemptionVehicle() {
        return preemptionVehicle;
    }

    /**
     * Sets the value of the preemptionVehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreemptionVehicle(String value) {
        this.preemptionVehicle = value;
    }

    /**
     * Gets the value of the actualWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActualWaitTime() {
        return actualWaitTime;
    }

    /**
     * Sets the value of the actualWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActualWaitTime(Integer value) {
        this.actualWaitTime = value;
    }

    /**
     * Gets the value of the strategyEmployed property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStrategyEmployed() {
        return strategyEmployed;
    }

    /**
     * Sets the value of the strategyEmployed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStrategyEmployed(Short value) {
        this.strategyEmployed = value;
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
     *         &lt;element name="grant-record" type="{http://www.TCIP-Final-4-0-0}TSPGrantRecord"/&gt;
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
        "grantRecord"
    })
    public static class GrantRecords {

        @XmlElement(name = "grant-record", required = true)
        protected List<TSPGrantRecord> grantRecord;

        /**
         * Gets the value of the grantRecord property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the grantRecord property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGrantRecord().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TSPGrantRecord }
         * 
         * 
         */
        public List<TSPGrantRecord> getGrantRecord() {
            if (grantRecord == null) {
                grantRecord = new ArrayList<TSPGrantRecord>();
            }
            return this.grantRecord;
        }

    }

}
