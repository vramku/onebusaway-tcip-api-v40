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
import atis_partial_03_00_74.ManeuverInstruction;
import lrms_final_09_07.Distance;
import lrms_final_09_07.GeoLocation;


/**
 * <p>Java class for SCHPatternSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCHPatternSegment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="segment" type="{http://www.TCIP-Final-4-0-0}SCHPatternSegmentIden"/&gt;
 *         &lt;element name="metadata" type="{http://www.TCIP-Final-4-0-0}CPTRowMetaData" minOccurs="0"/&gt;
 *         &lt;element name="segment-notes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="20"&gt;
 *                   &lt;element name="segment-note" type="{http://www.TCIP-Final-4-0-0}SCHNoteIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="timeStoppoints"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="3000"&gt;
 *                   &lt;element name="timeStoppoint" type="{http://www.TCIP-Final-4-0-0}SCHTimeStoppoint"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="trace-points" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="3000"&gt;
 *                   &lt;element name="trace-point" type="{http://www.lrms-final-09-07}GeoLocation"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tracepointOffsets" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="3000"&gt;
 *                   &lt;element name="tracepointOffset" type="{http://www.lrms-final-09-07}Distance"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="trace-links" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="3000"&gt;
 *                   &lt;element name="trace-link" type="{http://www.TCIP-Final-4-0-0}SPLink"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tracelinkOffsets" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="1000"&gt;
 *                   &lt;element name="tracelinkOffset" type="{http://www.lrms-final-09-07}Distance"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="drive-directions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="100"&gt;
 *                   &lt;element name="drive-direction" type="{http://www.atis-partial-03-00-74}ManeuverInstruction"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="events" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="200"&gt;
 *                   &lt;element name="event" type="{http://www.TCIP-Final-4-0-0}SCHEvent"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="eventOffsets" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="200"&gt;
 *                   &lt;element name="eventOffset" type="{http://www.lrms-final-09-07}Distance"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="localSCHPatternSegment" type="{http://www.tcip-4-0-0-local}SCHPatternSegment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCHPatternSegment", propOrder = {
    "segment",
    "metadata",
    "segmentNotes",
    "timeStoppoints",
    "tracePoints",
    "tracepointOffsets",
    "traceLinks",
    "tracelinkOffsets",
    "driveDirections",
    "events",
    "eventOffsets",
    "localSCHPatternSegment"
})
public class SCHPatternSegment {

    @XmlElement(required = true)
    protected SCHPatternSegmentIden segment;
    protected CPTRowMetaData metadata;
    @XmlElement(name = "segment-notes")
    protected SCHPatternSegment.SegmentNotes segmentNotes;
    @XmlElement(required = true)
    protected SCHPatternSegment.TimeStoppoints timeStoppoints;
    @XmlElement(name = "trace-points")
    protected SCHPatternSegment.TracePoints tracePoints;
    protected SCHPatternSegment.TracepointOffsets tracepointOffsets;
    @XmlElement(name = "trace-links")
    protected SCHPatternSegment.TraceLinks traceLinks;
    protected SCHPatternSegment.TracelinkOffsets tracelinkOffsets;
    @XmlElement(name = "drive-directions")
    protected SCHPatternSegment.DriveDirections driveDirections;
    protected SCHPatternSegment.Events events;
    protected SCHPatternSegment.EventOffsets eventOffsets;
    protected tcip_4_0_0_local.SCHPatternSegment localSCHPatternSegment;

    /**
     * Gets the value of the segment property.
     * 
     * @return
     *     possible object is
     *     {@link SCHPatternSegmentIden }
     *     
     */
    public SCHPatternSegmentIden getSegment() {
        return segment;
    }

    /**
     * Sets the value of the segment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHPatternSegmentIden }
     *     
     */
    public void setSegment(SCHPatternSegmentIden value) {
        this.segment = value;
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
     * Gets the value of the segmentNotes property.
     * 
     * @return
     *     possible object is
     *     {@link SCHPatternSegment.SegmentNotes }
     *     
     */
    public SCHPatternSegment.SegmentNotes getSegmentNotes() {
        return segmentNotes;
    }

    /**
     * Sets the value of the segmentNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHPatternSegment.SegmentNotes }
     *     
     */
    public void setSegmentNotes(SCHPatternSegment.SegmentNotes value) {
        this.segmentNotes = value;
    }

    /**
     * Gets the value of the timeStoppoints property.
     * 
     * @return
     *     possible object is
     *     {@link SCHPatternSegment.TimeStoppoints }
     *     
     */
    public SCHPatternSegment.TimeStoppoints getTimeStoppoints() {
        return timeStoppoints;
    }

    /**
     * Sets the value of the timeStoppoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHPatternSegment.TimeStoppoints }
     *     
     */
    public void setTimeStoppoints(SCHPatternSegment.TimeStoppoints value) {
        this.timeStoppoints = value;
    }

    /**
     * Gets the value of the tracePoints property.
     * 
     * @return
     *     possible object is
     *     {@link SCHPatternSegment.TracePoints }
     *     
     */
    public SCHPatternSegment.TracePoints getTracePoints() {
        return tracePoints;
    }

    /**
     * Sets the value of the tracePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHPatternSegment.TracePoints }
     *     
     */
    public void setTracePoints(SCHPatternSegment.TracePoints value) {
        this.tracePoints = value;
    }

    /**
     * Gets the value of the tracepointOffsets property.
     * 
     * @return
     *     possible object is
     *     {@link SCHPatternSegment.TracepointOffsets }
     *     
     */
    public SCHPatternSegment.TracepointOffsets getTracepointOffsets() {
        return tracepointOffsets;
    }

    /**
     * Sets the value of the tracepointOffsets property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHPatternSegment.TracepointOffsets }
     *     
     */
    public void setTracepointOffsets(SCHPatternSegment.TracepointOffsets value) {
        this.tracepointOffsets = value;
    }

    /**
     * Gets the value of the traceLinks property.
     * 
     * @return
     *     possible object is
     *     {@link SCHPatternSegment.TraceLinks }
     *     
     */
    public SCHPatternSegment.TraceLinks getTraceLinks() {
        return traceLinks;
    }

    /**
     * Sets the value of the traceLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHPatternSegment.TraceLinks }
     *     
     */
    public void setTraceLinks(SCHPatternSegment.TraceLinks value) {
        this.traceLinks = value;
    }

    /**
     * Gets the value of the tracelinkOffsets property.
     * 
     * @return
     *     possible object is
     *     {@link SCHPatternSegment.TracelinkOffsets }
     *     
     */
    public SCHPatternSegment.TracelinkOffsets getTracelinkOffsets() {
        return tracelinkOffsets;
    }

    /**
     * Sets the value of the tracelinkOffsets property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHPatternSegment.TracelinkOffsets }
     *     
     */
    public void setTracelinkOffsets(SCHPatternSegment.TracelinkOffsets value) {
        this.tracelinkOffsets = value;
    }

    /**
     * Gets the value of the driveDirections property.
     * 
     * @return
     *     possible object is
     *     {@link SCHPatternSegment.DriveDirections }
     *     
     */
    public SCHPatternSegment.DriveDirections getDriveDirections() {
        return driveDirections;
    }

    /**
     * Sets the value of the driveDirections property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHPatternSegment.DriveDirections }
     *     
     */
    public void setDriveDirections(SCHPatternSegment.DriveDirections value) {
        this.driveDirections = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link SCHPatternSegment.Events }
     *     
     */
    public SCHPatternSegment.Events getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHPatternSegment.Events }
     *     
     */
    public void setEvents(SCHPatternSegment.Events value) {
        this.events = value;
    }

    /**
     * Gets the value of the eventOffsets property.
     * 
     * @return
     *     possible object is
     *     {@link SCHPatternSegment.EventOffsets }
     *     
     */
    public SCHPatternSegment.EventOffsets getEventOffsets() {
        return eventOffsets;
    }

    /**
     * Sets the value of the eventOffsets property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHPatternSegment.EventOffsets }
     *     
     */
    public void setEventOffsets(SCHPatternSegment.EventOffsets value) {
        this.eventOffsets = value;
    }

    /**
     * Gets the value of the localSCHPatternSegment property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_4_0_0_local.SCHPatternSegment }
     *     
     */
    public tcip_4_0_0_local.SCHPatternSegment getLocalSCHPatternSegment() {
        return localSCHPatternSegment;
    }

    /**
     * Sets the value of the localSCHPatternSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_4_0_0_local.SCHPatternSegment }
     *     
     */
    public void setLocalSCHPatternSegment(tcip_4_0_0_local.SCHPatternSegment value) {
        this.localSCHPatternSegment = value;
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
     *         &lt;element name="drive-direction" type="{http://www.atis-partial-03-00-74}ManeuverInstruction"/&gt;
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
        "driveDirection"
    })
    public static class DriveDirections {

        @XmlElement(name = "drive-direction", required = true)
        protected List<ManeuverInstruction> driveDirection;

        /**
         * Gets the value of the driveDirection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the driveDirection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDriveDirection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ManeuverInstruction }
         * 
         * 
         */
        public List<ManeuverInstruction> getDriveDirection() {
            if (driveDirection == null) {
                driveDirection = new ArrayList<ManeuverInstruction>();
            }
            return this.driveDirection;
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
     *       &lt;sequence maxOccurs="200"&gt;
     *         &lt;element name="eventOffset" type="{http://www.lrms-final-09-07}Distance"/&gt;
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
        "eventOffset"
    })
    public static class EventOffsets {

        @XmlElement(required = true)
        protected List<Distance> eventOffset;

        /**
         * Gets the value of the eventOffset property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eventOffset property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEventOffset().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Distance }
         * 
         * 
         */
        public List<Distance> getEventOffset() {
            if (eventOffset == null) {
                eventOffset = new ArrayList<Distance>();
            }
            return this.eventOffset;
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
     *       &lt;sequence maxOccurs="200"&gt;
     *         &lt;element name="event" type="{http://www.TCIP-Final-4-0-0}SCHEvent"/&gt;
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
        "event"
    })
    public static class Events {

        @XmlElement(required = true)
        protected List<SCHEvent> event;

        /**
         * Gets the value of the event property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the event property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEvent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHEvent }
         * 
         * 
         */
        public List<SCHEvent> getEvent() {
            if (event == null) {
                event = new ArrayList<SCHEvent>();
            }
            return this.event;
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
     *       &lt;sequence maxOccurs="20"&gt;
     *         &lt;element name="segment-note" type="{http://www.TCIP-Final-4-0-0}SCHNoteIden"/&gt;
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
        "segmentNote"
    })
    public static class SegmentNotes {

        @XmlElement(name = "segment-note", required = true)
        protected List<SCHNoteIden> segmentNote;

        /**
         * Gets the value of the segmentNote property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segmentNote property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegmentNote().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHNoteIden }
         * 
         * 
         */
        public List<SCHNoteIden> getSegmentNote() {
            if (segmentNote == null) {
                segmentNote = new ArrayList<SCHNoteIden>();
            }
            return this.segmentNote;
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
     *       &lt;sequence maxOccurs="3000"&gt;
     *         &lt;element name="timeStoppoint" type="{http://www.TCIP-Final-4-0-0}SCHTimeStoppoint"/&gt;
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
        "timeStoppoint"
    })
    public static class TimeStoppoints {

        @XmlElement(required = true)
        protected List<SCHTimeStoppoint> timeStoppoint;

        /**
         * Gets the value of the timeStoppoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the timeStoppoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTimeStoppoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHTimeStoppoint }
         * 
         * 
         */
        public List<SCHTimeStoppoint> getTimeStoppoint() {
            if (timeStoppoint == null) {
                timeStoppoint = new ArrayList<SCHTimeStoppoint>();
            }
            return this.timeStoppoint;
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
     *       &lt;sequence maxOccurs="3000"&gt;
     *         &lt;element name="trace-link" type="{http://www.TCIP-Final-4-0-0}SPLink"/&gt;
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
        "traceLink"
    })
    public static class TraceLinks {

        @XmlElement(name = "trace-link", required = true)
        protected List<SPLink> traceLink;

        /**
         * Gets the value of the traceLink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the traceLink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTraceLink().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SPLink }
         * 
         * 
         */
        public List<SPLink> getTraceLink() {
            if (traceLink == null) {
                traceLink = new ArrayList<SPLink>();
            }
            return this.traceLink;
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
     *       &lt;sequence maxOccurs="3000"&gt;
     *         &lt;element name="trace-point" type="{http://www.lrms-final-09-07}GeoLocation"/&gt;
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
        "tracePoint"
    })
    public static class TracePoints {

        @XmlElement(name = "trace-point", required = true)
        protected List<GeoLocation> tracePoint;

        /**
         * Gets the value of the tracePoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tracePoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTracePoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GeoLocation }
         * 
         * 
         */
        public List<GeoLocation> getTracePoint() {
            if (tracePoint == null) {
                tracePoint = new ArrayList<GeoLocation>();
            }
            return this.tracePoint;
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
     *         &lt;element name="tracelinkOffset" type="{http://www.lrms-final-09-07}Distance"/&gt;
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
        "tracelinkOffset"
    })
    public static class TracelinkOffsets {

        @XmlElement(required = true)
        protected List<Distance> tracelinkOffset;

        /**
         * Gets the value of the tracelinkOffset property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tracelinkOffset property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTracelinkOffset().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Distance }
         * 
         * 
         */
        public List<Distance> getTracelinkOffset() {
            if (tracelinkOffset == null) {
                tracelinkOffset = new ArrayList<Distance>();
            }
            return this.tracelinkOffset;
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
     *       &lt;sequence maxOccurs="3000"&gt;
     *         &lt;element name="tracepointOffset" type="{http://www.lrms-final-09-07}Distance"/&gt;
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
        "tracepointOffset"
    })
    public static class TracepointOffsets {

        @XmlElement(required = true)
        protected List<Distance> tracepointOffset;

        /**
         * Gets the value of the tracepointOffset property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tracepointOffset property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTracepointOffset().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Distance }
         * 
         * 
         */
        public List<Distance> getTracepointOffset() {
            if (tracepointOffset == null) {
                tracepointOffset = new ArrayList<Distance>();
            }
            return this.tracepointOffset;
        }

    }

}
