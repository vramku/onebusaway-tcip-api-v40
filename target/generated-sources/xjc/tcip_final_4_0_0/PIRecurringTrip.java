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
 * <p>Java class for PIRecurringTrip complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIRecurringTrip"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customer-assigned-name" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote"/&gt;
 *         &lt;element name="customer-assigned-nameLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="earliest-start-time" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime"/&gt;
 *         &lt;element name="latest-start-time" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime"/&gt;
 *         &lt;element name="day-types" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="10"&gt;
 *                   &lt;element name="day-type" type="{http://www.TCIP-Final-4-0-0}SCH-DayType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="trip-segments"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="15"&gt;
 *                   &lt;element name="trip-segment" type="{http://www.TCIP-Final-4-0-0}PIRecurringTripSegment"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="localPIRecurringTrip" type="{http://www.tcip-4-0-0-local}PIRecurringTrip" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIRecurringTrip", propOrder = {
    "customerAssignedName",
    "customerAssignedNameLangs",
    "earliestStartTime",
    "latestStartTime",
    "dayTypes",
    "tripSegments",
    "localPIRecurringTrip"
})
public class PIRecurringTrip {

    @XmlElement(name = "customer-assigned-name", required = true)
    protected String customerAssignedName;
    @XmlElement(name = "customer-assigned-nameLangs")
    protected CPTAdditionalLanguageContents customerAssignedNameLangs;
    @XmlElement(name = "earliest-start-time", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime earliestStartTime;
    @XmlElement(name = "latest-start-time", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime latestStartTime;
    @XmlElement(name = "day-types")
    protected PIRecurringTrip.DayTypes dayTypes;
    @XmlElement(name = "trip-segments", required = true)
    protected PIRecurringTrip.TripSegments tripSegments;
    protected tcip_4_0_0_local.PIRecurringTrip localPIRecurringTrip;

    /**
     * Gets the value of the customerAssignedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAssignedName() {
        return customerAssignedName;
    }

    /**
     * Sets the value of the customerAssignedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAssignedName(String value) {
        this.customerAssignedName = value;
    }

    /**
     * Gets the value of the customerAssignedNameLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getCustomerAssignedNameLangs() {
        return customerAssignedNameLangs;
    }

    /**
     * Sets the value of the customerAssignedNameLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setCustomerAssignedNameLangs(CPTAdditionalLanguageContents value) {
        this.customerAssignedNameLangs = value;
    }

    /**
     * Gets the value of the earliestStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getEarliestStartTime() {
        return earliestStartTime;
    }

    /**
     * Sets the value of the earliestStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarliestStartTime(DateTime value) {
        this.earliestStartTime = value;
    }

    /**
     * Gets the value of the latestStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getLatestStartTime() {
        return latestStartTime;
    }

    /**
     * Sets the value of the latestStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestStartTime(DateTime value) {
        this.latestStartTime = value;
    }

    /**
     * Gets the value of the dayTypes property.
     * 
     * @return
     *     possible object is
     *     {@link PIRecurringTrip.DayTypes }
     *     
     */
    public PIRecurringTrip.DayTypes getDayTypes() {
        return dayTypes;
    }

    /**
     * Sets the value of the dayTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIRecurringTrip.DayTypes }
     *     
     */
    public void setDayTypes(PIRecurringTrip.DayTypes value) {
        this.dayTypes = value;
    }

    /**
     * Gets the value of the tripSegments property.
     * 
     * @return
     *     possible object is
     *     {@link PIRecurringTrip.TripSegments }
     *     
     */
    public PIRecurringTrip.TripSegments getTripSegments() {
        return tripSegments;
    }

    /**
     * Sets the value of the tripSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIRecurringTrip.TripSegments }
     *     
     */
    public void setTripSegments(PIRecurringTrip.TripSegments value) {
        this.tripSegments = value;
    }

    /**
     * Gets the value of the localPIRecurringTrip property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_4_0_0_local.PIRecurringTrip }
     *     
     */
    public tcip_4_0_0_local.PIRecurringTrip getLocalPIRecurringTrip() {
        return localPIRecurringTrip;
    }

    /**
     * Sets the value of the localPIRecurringTrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_4_0_0_local.PIRecurringTrip }
     *     
     */
    public void setLocalPIRecurringTrip(tcip_4_0_0_local.PIRecurringTrip value) {
        this.localPIRecurringTrip = value;
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
     *         &lt;element name="day-type" type="{http://www.TCIP-Final-4-0-0}SCH-DayType"/&gt;
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
        "dayType"
    })
    public static class DayTypes {

        @XmlElement(name = "day-type", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected List<String> dayType;

        /**
         * Gets the value of the dayType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dayType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDayType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDayType() {
            if (dayType == null) {
                dayType = new ArrayList<String>();
            }
            return this.dayType;
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
     *       &lt;sequence maxOccurs="15"&gt;
     *         &lt;element name="trip-segment" type="{http://www.TCIP-Final-4-0-0}PIRecurringTripSegment"/&gt;
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
        "tripSegment"
    })
    public static class TripSegments {

        @XmlElement(name = "trip-segment", required = true)
        protected List<PIRecurringTripSegment> tripSegment;

        /**
         * Gets the value of the tripSegment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tripSegment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTripSegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PIRecurringTripSegment }
         * 
         * 
         */
        public List<PIRecurringTripSegment> getTripSegment() {
            if (tripSegment == null) {
                tripSegment = new ArrayList<PIRecurringTripSegment>();
            }
            return this.tripSegment;
        }

    }

}
