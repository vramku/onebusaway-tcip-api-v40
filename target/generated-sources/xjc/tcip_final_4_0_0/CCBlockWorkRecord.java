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
import org.joda.time.DateTime;


/**
 * <p>Java class for CCBlockWorkRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCBlockWorkRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="block" type="{http://www.TCIP-Final-4-0-0}SCHBlockIden"/&gt;
 *         &lt;element name="begin-time" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="end-time" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="timepoints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="15000"&gt;
 *                   &lt;element name="timepoint" type="{http://www.TCIP-Final-4-0-0}CCTimepointHistory"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="stoppoints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="15000"&gt;
 *                   &lt;element name="stoppoint" type="{http://www.TCIP-Final-4-0-0}OBStoppointRecord"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="deviations" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="1000"&gt;
 *                   &lt;element name="deviation" type="{http://www.TCIP-Final-4-0-0}CCRouteDeviationRecord"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="passenger-miles" type="{http://www.TCIP-Final-4-0-0}CC-PassengerMiles" minOccurs="0"/&gt;
 *         &lt;element name="localCCBlockWorkRecord" type="{http://www.tcip-4-0-0-local}CCBlockWorkRecord" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCBlockWorkRecord", propOrder = {
    "block",
    "beginTime",
    "endTime",
    "timepoints",
    "stoppoints",
    "deviations",
    "passengerMiles",
    "localCCBlockWorkRecord"
})
public class CCBlockWorkRecord {

    @XmlElement(required = true)
    protected SCHBlockIden block;
    @XmlElement(name = "begin-time", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime beginTime;
    @XmlElement(name = "end-time", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime endTime;
    protected CCBlockWorkRecord.Timepoints timepoints;
    protected CCBlockWorkRecord.Stoppoints stoppoints;
    protected CCBlockWorkRecord.Deviations deviations;
    @XmlElement(name = "passenger-miles")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger passengerMiles;
    protected tcip_4_0_0_local.CCBlockWorkRecord localCCBlockWorkRecord;

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
     * Gets the value of the beginTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getBeginTime() {
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
    public void setBeginTime(DateTime value) {
        this.beginTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getEndTime() {
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
    public void setEndTime(DateTime value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the timepoints property.
     * 
     * @return
     *     possible object is
     *     {@link CCBlockWorkRecord.Timepoints }
     *     
     */
    public CCBlockWorkRecord.Timepoints getTimepoints() {
        return timepoints;
    }

    /**
     * Sets the value of the timepoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCBlockWorkRecord.Timepoints }
     *     
     */
    public void setTimepoints(CCBlockWorkRecord.Timepoints value) {
        this.timepoints = value;
    }

    /**
     * Gets the value of the stoppoints property.
     * 
     * @return
     *     possible object is
     *     {@link CCBlockWorkRecord.Stoppoints }
     *     
     */
    public CCBlockWorkRecord.Stoppoints getStoppoints() {
        return stoppoints;
    }

    /**
     * Sets the value of the stoppoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCBlockWorkRecord.Stoppoints }
     *     
     */
    public void setStoppoints(CCBlockWorkRecord.Stoppoints value) {
        this.stoppoints = value;
    }

    /**
     * Gets the value of the deviations property.
     * 
     * @return
     *     possible object is
     *     {@link CCBlockWorkRecord.Deviations }
     *     
     */
    public CCBlockWorkRecord.Deviations getDeviations() {
        return deviations;
    }

    /**
     * Sets the value of the deviations property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCBlockWorkRecord.Deviations }
     *     
     */
    public void setDeviations(CCBlockWorkRecord.Deviations value) {
        this.deviations = value;
    }

    /**
     * Gets the value of the passengerMiles property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPassengerMiles() {
        return passengerMiles;
    }

    /**
     * Sets the value of the passengerMiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPassengerMiles(BigInteger value) {
        this.passengerMiles = value;
    }

    /**
     * Gets the value of the localCCBlockWorkRecord property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_4_0_0_local.CCBlockWorkRecord }
     *     
     */
    public tcip_4_0_0_local.CCBlockWorkRecord getLocalCCBlockWorkRecord() {
        return localCCBlockWorkRecord;
    }

    /**
     * Sets the value of the localCCBlockWorkRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_4_0_0_local.CCBlockWorkRecord }
     *     
     */
    public void setLocalCCBlockWorkRecord(tcip_4_0_0_local.CCBlockWorkRecord value) {
        this.localCCBlockWorkRecord = value;
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
     *       &lt;sequence maxOccurs="1000"&gt;
     *         &lt;element name="deviation" type="{http://www.TCIP-Final-4-0-0}CCRouteDeviationRecord"/&gt;
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
        "deviation"
    })
    public static class Deviations {

        @XmlElement(required = true)
        protected List<CCRouteDeviationRecord> deviation;

        /**
         * Gets the value of the deviation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deviation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDeviation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CCRouteDeviationRecord }
         * 
         * 
         */
        public List<CCRouteDeviationRecord> getDeviation() {
            if (deviation == null) {
                deviation = new ArrayList<CCRouteDeviationRecord>();
            }
            return this.deviation;
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
     *       &lt;sequence maxOccurs="15000"&gt;
     *         &lt;element name="stoppoint" type="{http://www.TCIP-Final-4-0-0}OBStoppointRecord"/&gt;
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
        protected List<OBStoppointRecord> stoppoint;

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
         * {@link OBStoppointRecord }
         * 
         * 
         */
        public List<OBStoppointRecord> getStoppoint() {
            if (stoppoint == null) {
                stoppoint = new ArrayList<OBStoppointRecord>();
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
     *       &lt;sequence maxOccurs="15000"&gt;
     *         &lt;element name="timepoint" type="{http://www.TCIP-Final-4-0-0}CCTimepointHistory"/&gt;
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
        protected List<CCTimepointHistory> timepoint;

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
         * {@link CCTimepointHistory }
         * 
         * 
         */
        public List<CCTimepointHistory> getTimepoint() {
            if (timepoint == null) {
                timepoint = new ArrayList<CCTimepointHistory>();
            }
            return this.timepoint;
        }

    }

}