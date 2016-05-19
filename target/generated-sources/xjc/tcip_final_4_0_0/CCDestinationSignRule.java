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
import lrms_final_09_07.GeoLocation;


/**
 * <p>Java class for CCDestinationSignRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCDestinationSignRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ruleID" type="{http://www.TCIP-Final-4-0-0}SCHActivationIden"/&gt;
 *         &lt;element name="metadata" type="{http://www.TCIP-Final-4-0-0}CPTRowMetaData"/&gt;
 *         &lt;element name="trips" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="1000"&gt;
 *                   &lt;element name="trip" type="{http://www.TCIP-Final-4-0-0}SCHTripIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="patterns" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="1000"&gt;
 *                   &lt;element name="pattern" type="{http://www.TCIP-Final-4-0-0}SCHPatternIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="from-timepoint" type="{http://www.TCIP-Final-4-0-0}SCHTimepointIden" minOccurs="0"/&gt;
 *         &lt;element name="from-location" type="{http://www.lrms-final-09-07}GeoLocation" minOccurs="0"/&gt;
 *         &lt;element name="fromEvent" type="{http://www.TCIP-Final-4-0-0}SCHActivationIden" minOccurs="0"/&gt;
 *         &lt;element name="to-timepoint" type="{http://www.TCIP-Final-4-0-0}SCHTimepointIden" minOccurs="0"/&gt;
 *         &lt;element name="to-location" type="{http://www.lrms-final-09-07}GeoLocation" minOccurs="0"/&gt;
 *         &lt;element name="toEvent" type="{http://www.TCIP-Final-4-0-0}SCHActivationIden" minOccurs="0"/&gt;
 *         &lt;element name="messages"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="10"&gt;
 *                   &lt;element name="message" type="{http://www.TCIP-Final-4-0-0}CCDestinationMessageIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ext-stop-audio" type="{http://www.TCIP-Final-4-0-0}PI-BinaryAudioData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCDestinationSignRule", propOrder = {
    "ruleID",
    "metadata",
    "trips",
    "patterns",
    "fromTimepoint",
    "fromLocation",
    "fromEvent",
    "toTimepoint",
    "toLocation",
    "toEvent",
    "messages",
    "extStopAudio"
})
public class CCDestinationSignRule {

    @XmlElement(required = true)
    protected SCHActivationIden ruleID;
    @XmlElement(required = true)
    protected CPTRowMetaData metadata;
    protected CCDestinationSignRule.Trips trips;
    protected CCDestinationSignRule.Patterns patterns;
    @XmlElement(name = "from-timepoint")
    protected SCHTimepointIden fromTimepoint;
    @XmlElement(name = "from-location")
    protected GeoLocation fromLocation;
    protected SCHActivationIden fromEvent;
    @XmlElement(name = "to-timepoint")
    protected SCHTimepointIden toTimepoint;
    @XmlElement(name = "to-location")
    protected GeoLocation toLocation;
    protected SCHActivationIden toEvent;
    @XmlElement(required = true)
    protected CCDestinationSignRule.Messages messages;
    @XmlElement(name = "ext-stop-audio")
    protected PIBinaryAudioData extStopAudio;

    /**
     * Gets the value of the ruleID property.
     * 
     * @return
     *     possible object is
     *     {@link SCHActivationIden }
     *     
     */
    public SCHActivationIden getRuleID() {
        return ruleID;
    }

    /**
     * Sets the value of the ruleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHActivationIden }
     *     
     */
    public void setRuleID(SCHActivationIden value) {
        this.ruleID = value;
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
     * Gets the value of the trips property.
     * 
     * @return
     *     possible object is
     *     {@link CCDestinationSignRule.Trips }
     *     
     */
    public CCDestinationSignRule.Trips getTrips() {
        return trips;
    }

    /**
     * Sets the value of the trips property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCDestinationSignRule.Trips }
     *     
     */
    public void setTrips(CCDestinationSignRule.Trips value) {
        this.trips = value;
    }

    /**
     * Gets the value of the patterns property.
     * 
     * @return
     *     possible object is
     *     {@link CCDestinationSignRule.Patterns }
     *     
     */
    public CCDestinationSignRule.Patterns getPatterns() {
        return patterns;
    }

    /**
     * Sets the value of the patterns property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCDestinationSignRule.Patterns }
     *     
     */
    public void setPatterns(CCDestinationSignRule.Patterns value) {
        this.patterns = value;
    }

    /**
     * Gets the value of the fromTimepoint property.
     * 
     * @return
     *     possible object is
     *     {@link SCHTimepointIden }
     *     
     */
    public SCHTimepointIden getFromTimepoint() {
        return fromTimepoint;
    }

    /**
     * Sets the value of the fromTimepoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHTimepointIden }
     *     
     */
    public void setFromTimepoint(SCHTimepointIden value) {
        this.fromTimepoint = value;
    }

    /**
     * Gets the value of the fromLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getFromLocation() {
        return fromLocation;
    }

    /**
     * Sets the value of the fromLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setFromLocation(GeoLocation value) {
        this.fromLocation = value;
    }

    /**
     * Gets the value of the fromEvent property.
     * 
     * @return
     *     possible object is
     *     {@link SCHActivationIden }
     *     
     */
    public SCHActivationIden getFromEvent() {
        return fromEvent;
    }

    /**
     * Sets the value of the fromEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHActivationIden }
     *     
     */
    public void setFromEvent(SCHActivationIden value) {
        this.fromEvent = value;
    }

    /**
     * Gets the value of the toTimepoint property.
     * 
     * @return
     *     possible object is
     *     {@link SCHTimepointIden }
     *     
     */
    public SCHTimepointIden getToTimepoint() {
        return toTimepoint;
    }

    /**
     * Sets the value of the toTimepoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHTimepointIden }
     *     
     */
    public void setToTimepoint(SCHTimepointIden value) {
        this.toTimepoint = value;
    }

    /**
     * Gets the value of the toLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getToLocation() {
        return toLocation;
    }

    /**
     * Sets the value of the toLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setToLocation(GeoLocation value) {
        this.toLocation = value;
    }

    /**
     * Gets the value of the toEvent property.
     * 
     * @return
     *     possible object is
     *     {@link SCHActivationIden }
     *     
     */
    public SCHActivationIden getToEvent() {
        return toEvent;
    }

    /**
     * Sets the value of the toEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHActivationIden }
     *     
     */
    public void setToEvent(SCHActivationIden value) {
        this.toEvent = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link CCDestinationSignRule.Messages }
     *     
     */
    public CCDestinationSignRule.Messages getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCDestinationSignRule.Messages }
     *     
     */
    public void setMessages(CCDestinationSignRule.Messages value) {
        this.messages = value;
    }

    /**
     * Gets the value of the extStopAudio property.
     * 
     * @return
     *     possible object is
     *     {@link PIBinaryAudioData }
     *     
     */
    public PIBinaryAudioData getExtStopAudio() {
        return extStopAudio;
    }

    /**
     * Sets the value of the extStopAudio property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIBinaryAudioData }
     *     
     */
    public void setExtStopAudio(PIBinaryAudioData value) {
        this.extStopAudio = value;
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
     *         &lt;element name="message" type="{http://www.TCIP-Final-4-0-0}CCDestinationMessageIden"/&gt;
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
        "message"
    })
    public static class Messages {

        @XmlElement(required = true)
        protected List<CCDestinationMessageIden> message;

        /**
         * Gets the value of the message property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the message property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CCDestinationMessageIden }
         * 
         * 
         */
        public List<CCDestinationMessageIden> getMessage() {
            if (message == null) {
                message = new ArrayList<CCDestinationMessageIden>();
            }
            return this.message;
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
     *       &lt;sequence maxOccurs="1000"&gt;
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
     *       &lt;sequence maxOccurs="1000"&gt;
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