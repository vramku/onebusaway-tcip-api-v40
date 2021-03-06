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
import lrms_final_09_07.GeoLocation;
import org.joda.time.DateTime;


/**
 * <p>Java class for CCOperatorAssignmentChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCOperatorAssignmentChange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="run" type="{http://www.TCIP-Final-4-0-0}SCHRunIden"/&gt;
 *         &lt;element name="specific-trips"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="50"&gt;
 *                   &lt;element name="specific-trip" type="{http://www.TCIP-Final-4-0-0}SCHTripIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="change-stoppoint" type="{http://www.TCIP-Final-4-0-0}CPTStoppointIden" minOccurs="0"/&gt;
 *         &lt;element name="change-location" type="{http://www.lrms-final-09-07}GeoLocation" minOccurs="0"/&gt;
 *         &lt;element name="original-operator" type="{http://www.TCIP-Final-4-0-0}CPTOperatorIden" minOccurs="0"/&gt;
 *         &lt;element name="new-operator" type="{http://www.TCIP-Final-4-0-0}CPTOperatorIden" minOccurs="0"/&gt;
 *         &lt;element name="begin" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="end" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCOperatorAssignmentChange", propOrder = {
    "run",
    "specificTrips",
    "changeStoppoint",
    "changeLocation",
    "originalOperator",
    "newOperator",
    "begin",
    "end"
})
public class CCOperatorAssignmentChange {

    @XmlElement(required = true)
    protected SCHRunIden run;
    @XmlElement(name = "specific-trips", required = true)
    protected CCOperatorAssignmentChange.SpecificTrips specificTrips;
    @XmlElement(name = "change-stoppoint")
    protected CPTStoppointIden changeStoppoint;
    @XmlElement(name = "change-location")
    protected GeoLocation changeLocation;
    @XmlElement(name = "original-operator")
    protected CPTOperatorIden originalOperator;
    @XmlElement(name = "new-operator")
    protected CPTOperatorIden newOperator;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime begin;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime end;

    /**
     * Gets the value of the run property.
     * 
     * @return
     *     possible object is
     *     {@link SCHRunIden }
     *     
     */
    public SCHRunIden getRun() {
        return run;
    }

    /**
     * Sets the value of the run property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHRunIden }
     *     
     */
    public void setRun(SCHRunIden value) {
        this.run = value;
    }

    /**
     * Gets the value of the specificTrips property.
     * 
     * @return
     *     possible object is
     *     {@link CCOperatorAssignmentChange.SpecificTrips }
     *     
     */
    public CCOperatorAssignmentChange.SpecificTrips getSpecificTrips() {
        return specificTrips;
    }

    /**
     * Sets the value of the specificTrips property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCOperatorAssignmentChange.SpecificTrips }
     *     
     */
    public void setSpecificTrips(CCOperatorAssignmentChange.SpecificTrips value) {
        this.specificTrips = value;
    }

    /**
     * Gets the value of the changeStoppoint property.
     * 
     * @return
     *     possible object is
     *     {@link CPTStoppointIden }
     *     
     */
    public CPTStoppointIden getChangeStoppoint() {
        return changeStoppoint;
    }

    /**
     * Sets the value of the changeStoppoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTStoppointIden }
     *     
     */
    public void setChangeStoppoint(CPTStoppointIden value) {
        this.changeStoppoint = value;
    }

    /**
     * Gets the value of the changeLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getChangeLocation() {
        return changeLocation;
    }

    /**
     * Sets the value of the changeLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setChangeLocation(GeoLocation value) {
        this.changeLocation = value;
    }

    /**
     * Gets the value of the originalOperator property.
     * 
     * @return
     *     possible object is
     *     {@link CPTOperatorIden }
     *     
     */
    public CPTOperatorIden getOriginalOperator() {
        return originalOperator;
    }

    /**
     * Sets the value of the originalOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTOperatorIden }
     *     
     */
    public void setOriginalOperator(CPTOperatorIden value) {
        this.originalOperator = value;
    }

    /**
     * Gets the value of the newOperator property.
     * 
     * @return
     *     possible object is
     *     {@link CPTOperatorIden }
     *     
     */
    public CPTOperatorIden getNewOperator() {
        return newOperator;
    }

    /**
     * Sets the value of the newOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTOperatorIden }
     *     
     */
    public void setNewOperator(CPTOperatorIden value) {
        this.newOperator = value;
    }

    /**
     * Gets the value of the begin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getBegin() {
        return begin;
    }

    /**
     * Sets the value of the begin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBegin(DateTime value) {
        this.begin = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(DateTime value) {
        this.end = value;
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
     *       &lt;sequence maxOccurs="50"&gt;
     *         &lt;element name="specific-trip" type="{http://www.TCIP-Final-4-0-0}SCHTripIden"/&gt;
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
        "specificTrip"
    })
    public static class SpecificTrips {

        @XmlElement(name = "specific-trip", required = true)
        protected List<SCHTripIden> specificTrip;

        /**
         * Gets the value of the specificTrip property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the specificTrip property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpecificTrip().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHTripIden }
         * 
         * 
         */
        public List<SCHTripIden> getSpecificTrip() {
            if (specificTrip == null) {
                specificTrip = new ArrayList<SCHTripIden>();
            }
            return this.specificTrip;
        }

    }

}
