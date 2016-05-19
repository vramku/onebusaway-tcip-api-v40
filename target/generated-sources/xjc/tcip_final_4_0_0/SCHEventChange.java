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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SCHEventChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCHEventChange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="events" type="{http://www.TCIP-Final-4-0-0}SCHEvent"/&gt;
 *         &lt;element name="patterns" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="2000"&gt;
 *                   &lt;element name="pattern" type="{http://www.TCIP-Final-4-0-0}SCHPatternIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="segments" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="2000"&gt;
 *                   &lt;element name="segment" type="{http://www.TCIP-Final-4-0-0}SCHPatternSegmentIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="trips" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="25000"&gt;
 *                   &lt;element name="trip" type="{http://www.TCIP-Final-4-0-0}SCHTripIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCHEventChange", propOrder = {
    "events",
    "patterns",
    "segments",
    "trips"
})
public class SCHEventChange {

    @XmlElement(required = true)
    protected SCHEvent events;
    protected SCHEventChange.Patterns patterns;
    protected SCHEventChange.Segments segments;
    protected SCHEventChange.Trips trips;

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link SCHEvent }
     *     
     */
    public SCHEvent getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHEvent }
     *     
     */
    public void setEvents(SCHEvent value) {
        this.events = value;
    }

    /**
     * Gets the value of the patterns property.
     * 
     * @return
     *     possible object is
     *     {@link SCHEventChange.Patterns }
     *     
     */
    public SCHEventChange.Patterns getPatterns() {
        return patterns;
    }

    /**
     * Sets the value of the patterns property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHEventChange.Patterns }
     *     
     */
    public void setPatterns(SCHEventChange.Patterns value) {
        this.patterns = value;
    }

    /**
     * Gets the value of the segments property.
     * 
     * @return
     *     possible object is
     *     {@link SCHEventChange.Segments }
     *     
     */
    public SCHEventChange.Segments getSegments() {
        return segments;
    }

    /**
     * Sets the value of the segments property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHEventChange.Segments }
     *     
     */
    public void setSegments(SCHEventChange.Segments value) {
        this.segments = value;
    }

    /**
     * Gets the value of the trips property.
     * 
     * @return
     *     possible object is
     *     {@link SCHEventChange.Trips }
     *     
     */
    public SCHEventChange.Trips getTrips() {
        return trips;
    }

    /**
     * Sets the value of the trips property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHEventChange.Trips }
     *     
     */
    public void setTrips(SCHEventChange.Trips value) {
        this.trips = value;
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
     *       &lt;sequence maxOccurs="2000"&gt;
     *         &lt;element name="pattern" type="{http://www.TCIP-Final-4-0-0}SCHPatternIden"/&gt;
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
        "pattern"
    })
    public static class Patterns {

        @XmlElement(required = true)
        protected List<SCHPatternIden> pattern;

        /**
         * Gets the value of the pattern property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pattern property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPattern().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHPatternIden }
         * 
         * 
         */
        public List<SCHPatternIden> getPattern() {
            if (pattern == null) {
                pattern = new ArrayList<SCHPatternIden>();
            }
            return this.pattern;
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
     *       &lt;sequence maxOccurs="2000"&gt;
     *         &lt;element name="segment" type="{http://www.TCIP-Final-4-0-0}SCHPatternSegmentIden"/&gt;
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
        "segment"
    })
    public static class Segments {

        @XmlElement(required = true)
        protected List<SCHPatternSegmentIden> segment;

        /**
         * Gets the value of the segment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHPatternSegmentIden }
         * 
         * 
         */
        public List<SCHPatternSegmentIden> getSegment() {
            if (segment == null) {
                segment = new ArrayList<SCHPatternSegmentIden>();
            }
            return this.segment;
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
