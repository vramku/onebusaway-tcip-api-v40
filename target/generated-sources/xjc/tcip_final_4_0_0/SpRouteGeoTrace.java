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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for SpRouteGeoTrace complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpRouteGeoTrace"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriptionInfo" type="{http://www.TCIP-Final-4-0-0}CPTSubscriptionHeader"/&gt;
 *         &lt;element name="languages" type="{http://www.TCIP-Final-4-0-0}CPTLanguageList" minOccurs="0"/&gt;
 *         &lt;element name="pattern-version" type="{http://www.TCIP-Final-4-0-0}SCH-TimetableVersionID" minOccurs="0"/&gt;
 *         &lt;element name="route-schedule-version" type="{http://www.TCIP-Final-4-0-0}SCH-TimetableVersionID" minOccurs="0"/&gt;
 *         &lt;element name="timepoint-version" type="{http://www.TCIP-Final-4-0-0}SCH-TimetableVersionID" minOccurs="0"/&gt;
 *         &lt;element name="stoppoint-version" type="{http://www.TCIP-Final-4-0-0}CPT-StoppointVersion" minOccurs="0"/&gt;
 *         &lt;element name="pattern" type="{http://www.TCIP-Final-4-0-0}SCHPatternIden" minOccurs="0"/&gt;
 *         &lt;element name="segments" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="100"&gt;
 *                   &lt;element name="segment" type="{http://www.TCIP-Final-4-0-0}SCHPatternSegmentIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="trip" type="{http://www.TCIP-Final-4-0-0}SCHTripIden" minOccurs="0"/&gt;
 *         &lt;element name="timestop-points" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="1000"&gt;
 *                   &lt;element name="timestop-point" type="{http://www.TCIP-Final-4-0-0}SCHTimeStoppoint"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="block" type="{http://www.TCIP-Final-4-0-0}SCHBlockIden" minOccurs="0"/&gt;
 *         &lt;element name="run" type="{http://www.TCIP-Final-4-0-0}SCHRunIden" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.TCIP-Final-4-0-0}tcipMsgAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpRouteGeoTrace", propOrder = {
    "subscriptionInfo",
    "languages",
    "patternVersion",
    "routeScheduleVersion",
    "timepointVersion",
    "stoppointVersion",
    "pattern",
    "segments",
    "trip",
    "timestopPoints",
    "block",
    "run"
})
public class SpRouteGeoTrace {

    @XmlElement(required = true)
    protected CPTSubscriptionHeader subscriptionInfo;
    protected CPTLanguageList languages;
    @XmlElement(name = "pattern-version")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger patternVersion;
    @XmlElement(name = "route-schedule-version")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger routeScheduleVersion;
    @XmlElement(name = "timepoint-version")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger timepointVersion;
    @XmlElement(name = "stoppoint-version")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger stoppointVersion;
    protected SCHPatternIden pattern;
    protected SpRouteGeoTrace.Segments segments;
    protected SCHTripIden trip;
    @XmlElement(name = "timestop-points")
    protected SpRouteGeoTrace.TimestopPoints timestopPoints;
    protected SCHBlockIden block;
    protected SCHRunIden run;
    @XmlAttribute(name = "created", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime created;
    @XmlAttribute(name = "schVersion")
    protected String schVersion;
    @XmlAttribute(name = "sourceapp", required = true)
    protected String sourceapp;
    @XmlAttribute(name = "sourceip")
    protected String sourceip;
    @XmlAttribute(name = "sourceport")
    protected BigInteger sourceport;
    @XmlAttribute(name = "noNameSpaceSchemaLocation")
    @XmlSchemaType(name = "anyURI")
    protected String noNameSpaceSchemaLocation;
    @XmlAttribute(name = "activation")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime activation;
    @XmlAttribute(name = "deactivation")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime deactivation;

    /**
     * Gets the value of the subscriptionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CPTSubscriptionHeader }
     *     
     */
    public CPTSubscriptionHeader getSubscriptionInfo() {
        return subscriptionInfo;
    }

    /**
     * Sets the value of the subscriptionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTSubscriptionHeader }
     *     
     */
    public void setSubscriptionInfo(CPTSubscriptionHeader value) {
        this.subscriptionInfo = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link CPTLanguageList }
     *     
     */
    public CPTLanguageList getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTLanguageList }
     *     
     */
    public void setLanguages(CPTLanguageList value) {
        this.languages = value;
    }

    /**
     * Gets the value of the patternVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPatternVersion() {
        return patternVersion;
    }

    /**
     * Sets the value of the patternVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPatternVersion(BigInteger value) {
        this.patternVersion = value;
    }

    /**
     * Gets the value of the routeScheduleVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRouteScheduleVersion() {
        return routeScheduleVersion;
    }

    /**
     * Sets the value of the routeScheduleVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRouteScheduleVersion(BigInteger value) {
        this.routeScheduleVersion = value;
    }

    /**
     * Gets the value of the timepointVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimepointVersion() {
        return timepointVersion;
    }

    /**
     * Sets the value of the timepointVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimepointVersion(BigInteger value) {
        this.timepointVersion = value;
    }

    /**
     * Gets the value of the stoppointVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStoppointVersion() {
        return stoppointVersion;
    }

    /**
     * Sets the value of the stoppointVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStoppointVersion(BigInteger value) {
        this.stoppointVersion = value;
    }

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link SCHPatternIden }
     *     
     */
    public SCHPatternIden getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHPatternIden }
     *     
     */
    public void setPattern(SCHPatternIden value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the segments property.
     * 
     * @return
     *     possible object is
     *     {@link SpRouteGeoTrace.Segments }
     *     
     */
    public SpRouteGeoTrace.Segments getSegments() {
        return segments;
    }

    /**
     * Sets the value of the segments property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpRouteGeoTrace.Segments }
     *     
     */
    public void setSegments(SpRouteGeoTrace.Segments value) {
        this.segments = value;
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
     * Gets the value of the timestopPoints property.
     * 
     * @return
     *     possible object is
     *     {@link SpRouteGeoTrace.TimestopPoints }
     *     
     */
    public SpRouteGeoTrace.TimestopPoints getTimestopPoints() {
        return timestopPoints;
    }

    /**
     * Sets the value of the timestopPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpRouteGeoTrace.TimestopPoints }
     *     
     */
    public void setTimestopPoints(SpRouteGeoTrace.TimestopPoints value) {
        this.timestopPoints = value;
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
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(DateTime value) {
        this.created = value;
    }

    /**
     * Gets the value of the schVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchVersion() {
        return schVersion;
    }

    /**
     * Sets the value of the schVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchVersion(String value) {
        this.schVersion = value;
    }

    /**
     * Gets the value of the sourceapp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceapp() {
        return sourceapp;
    }

    /**
     * Sets the value of the sourceapp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceapp(String value) {
        this.sourceapp = value;
    }

    /**
     * Gets the value of the sourceip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceip() {
        return sourceip;
    }

    /**
     * Sets the value of the sourceip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceip(String value) {
        this.sourceip = value;
    }

    /**
     * Gets the value of the sourceport property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSourceport() {
        return sourceport;
    }

    /**
     * Sets the value of the sourceport property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSourceport(BigInteger value) {
        this.sourceport = value;
    }

    /**
     * Gets the value of the noNameSpaceSchemaLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoNameSpaceSchemaLocation() {
        return noNameSpaceSchemaLocation;
    }

    /**
     * Sets the value of the noNameSpaceSchemaLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoNameSpaceSchemaLocation(String value) {
        this.noNameSpaceSchemaLocation = value;
    }

    /**
     * Gets the value of the activation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getActivation() {
        return activation;
    }

    /**
     * Sets the value of the activation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivation(DateTime value) {
        this.activation = value;
    }

    /**
     * Gets the value of the deactivation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getDeactivation() {
        return deactivation;
    }

    /**
     * Sets the value of the deactivation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeactivation(DateTime value) {
        this.deactivation = value;
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
     *       &lt;sequence maxOccurs="100"&gt;
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
     *       &lt;sequence maxOccurs="1000"&gt;
     *         &lt;element name="timestop-point" type="{http://www.TCIP-Final-4-0-0}SCHTimeStoppoint"/&gt;
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
        "timestopPoint"
    })
    public static class TimestopPoints {

        @XmlElement(name = "timestop-point", required = true)
        protected List<SCHTimeStoppoint> timestopPoint;

        /**
         * Gets the value of the timestopPoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the timestopPoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTimestopPoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHTimeStoppoint }
         * 
         * 
         */
        public List<SCHTimeStoppoint> getTimestopPoint() {
            if (timestopPoint == null) {
                timestopPoint = new ArrayList<SCHTimeStoppoint>();
            }
            return this.timestopPoint;
        }

    }

}