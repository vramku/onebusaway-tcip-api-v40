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
import lrms_final_09_07.GeoLocation;


/**
 * <p>Java class for CCDetourRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCDetourRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="route" type="{http://www.TCIP-Final-4-0-0}SCHRouteIden"/&gt;
 *         &lt;element name="direction" type="{http://www.TCIP-Final-4-0-0}SCH-RouteDirectionName"/&gt;
 *         &lt;element name="directionLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="departurePoint" type="{http://www.lrms-final-09-07}GeoLocation"/&gt;
 *         &lt;element name="returnPoint" type="{http://www.lrms-final-09-07}GeoLocation" minOccurs="0"/&gt;
 *         &lt;element name="waypoints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="100"&gt;
 *                   &lt;element name="waypoint" type="{http://www.lrms-final-09-07}GeoLocation"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="approachTimepoint" type="{http://www.TCIP-Final-4-0-0}SCHTimepointIden" minOccurs="0"/&gt;
 *         &lt;element name="approachDestSignText" type="{http://www.TCIP-Final-4-0-0}PI-DMSMessage" minOccurs="0"/&gt;
 *         &lt;element name="approachDestSignTextLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="approachDestSignIcon" type="{http://www.TCIP-Final-4-0-0}PI-BinaryImageData" minOccurs="0"/&gt;
 *         &lt;element name="detourDestSignText" type="{http://www.TCIP-Final-4-0-0}PI-DMSMessage" minOccurs="0"/&gt;
 *         &lt;element name="detourDestSignTextLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="detourDestSignIcon" type="{http://www.TCIP-Final-4-0-0}PI-BinaryImageData" minOccurs="0"/&gt;
 *         &lt;element name="iconFormat" type="{http://www.TCIP-Final-4-0-0}PI-GraphicFormat" minOccurs="0"/&gt;
 *         &lt;element name="detourDirections" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="detourDirectionsLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="skippedTimeStopPoints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="100"&gt;
 *                   &lt;element name="skippedTimeStopPoint" type="{http://www.TCIP-Final-4-0-0}SCHTimeStoppoint"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addScheduleTime" type="{http://www.TCIP-Final-4-0-0}CPT-Duration" minOccurs="0"/&gt;
 *         &lt;element name="added-stops" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="100"&gt;
 *                   &lt;element name="added-stop" type="{http://www.TCIP-Final-4-0-0}CPTStoppointIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="new-stop-locs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="100"&gt;
 *                   &lt;element name="new-stop-loc" type="{http://www.lrms-final-09-07}GeoLocation"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="localCCDetourRecord" type="{http://www.tcip-4-0-0-local}CCDetourRecord" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCDetourRecord", propOrder = {
    "route",
    "direction",
    "directionLangs",
    "departurePoint",
    "returnPoint",
    "waypoints",
    "approachTimepoint",
    "approachDestSignText",
    "approachDestSignTextLangs",
    "approachDestSignIcon",
    "detourDestSignText",
    "detourDestSignTextLangs",
    "detourDestSignIcon",
    "iconFormat",
    "detourDirections",
    "detourDirectionsLangs",
    "skippedTimeStopPoints",
    "addScheduleTime",
    "addedStops",
    "newStopLocs",
    "localCCDetourRecord"
})
public class CCDetourRecord {

    @XmlElement(required = true)
    protected SCHRouteIden route;
    @XmlElement(required = true)
    protected String direction;
    protected CPTAdditionalLanguageContents directionLangs;
    @XmlElement(required = true)
    protected GeoLocation departurePoint;
    protected GeoLocation returnPoint;
    protected CCDetourRecord.Waypoints waypoints;
    protected SCHTimepointIden approachTimepoint;
    protected String approachDestSignText;
    protected CPTAdditionalLanguageContents approachDestSignTextLangs;
    protected PIBinaryImageData approachDestSignIcon;
    protected String detourDestSignText;
    protected CPTAdditionalLanguageContents detourDestSignTextLangs;
    protected PIBinaryImageData detourDestSignIcon;
    @XmlSchemaType(name = "anySimpleType")
    protected String iconFormat;
    protected String detourDirections;
    protected CPTAdditionalLanguageContents detourDirectionsLangs;
    protected CCDetourRecord.SkippedTimeStopPoints skippedTimeStopPoints;
    @XmlSchemaType(name = "anySimpleType")
    protected String addScheduleTime;
    @XmlElement(name = "added-stops")
    protected CCDetourRecord.AddedStops addedStops;
    @XmlElement(name = "new-stop-locs")
    protected CCDetourRecord.NewStopLocs newStopLocs;
    protected tcip_4_0_0_local.CCDetourRecord localCCDetourRecord;

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link SCHRouteIden }
     *     
     */
    public SCHRouteIden getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHRouteIden }
     *     
     */
    public void setRoute(SCHRouteIden value) {
        this.route = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the directionLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getDirectionLangs() {
        return directionLangs;
    }

    /**
     * Sets the value of the directionLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setDirectionLangs(CPTAdditionalLanguageContents value) {
        this.directionLangs = value;
    }

    /**
     * Gets the value of the departurePoint property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getDeparturePoint() {
        return departurePoint;
    }

    /**
     * Sets the value of the departurePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setDeparturePoint(GeoLocation value) {
        this.departurePoint = value;
    }

    /**
     * Gets the value of the returnPoint property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getReturnPoint() {
        return returnPoint;
    }

    /**
     * Sets the value of the returnPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setReturnPoint(GeoLocation value) {
        this.returnPoint = value;
    }

    /**
     * Gets the value of the waypoints property.
     * 
     * @return
     *     possible object is
     *     {@link CCDetourRecord.Waypoints }
     *     
     */
    public CCDetourRecord.Waypoints getWaypoints() {
        return waypoints;
    }

    /**
     * Sets the value of the waypoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCDetourRecord.Waypoints }
     *     
     */
    public void setWaypoints(CCDetourRecord.Waypoints value) {
        this.waypoints = value;
    }

    /**
     * Gets the value of the approachTimepoint property.
     * 
     * @return
     *     possible object is
     *     {@link SCHTimepointIden }
     *     
     */
    public SCHTimepointIden getApproachTimepoint() {
        return approachTimepoint;
    }

    /**
     * Sets the value of the approachTimepoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHTimepointIden }
     *     
     */
    public void setApproachTimepoint(SCHTimepointIden value) {
        this.approachTimepoint = value;
    }

    /**
     * Gets the value of the approachDestSignText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproachDestSignText() {
        return approachDestSignText;
    }

    /**
     * Sets the value of the approachDestSignText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproachDestSignText(String value) {
        this.approachDestSignText = value;
    }

    /**
     * Gets the value of the approachDestSignTextLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getApproachDestSignTextLangs() {
        return approachDestSignTextLangs;
    }

    /**
     * Sets the value of the approachDestSignTextLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setApproachDestSignTextLangs(CPTAdditionalLanguageContents value) {
        this.approachDestSignTextLangs = value;
    }

    /**
     * Gets the value of the approachDestSignIcon property.
     * 
     * @return
     *     possible object is
     *     {@link PIBinaryImageData }
     *     
     */
    public PIBinaryImageData getApproachDestSignIcon() {
        return approachDestSignIcon;
    }

    /**
     * Sets the value of the approachDestSignIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIBinaryImageData }
     *     
     */
    public void setApproachDestSignIcon(PIBinaryImageData value) {
        this.approachDestSignIcon = value;
    }

    /**
     * Gets the value of the detourDestSignText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetourDestSignText() {
        return detourDestSignText;
    }

    /**
     * Sets the value of the detourDestSignText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetourDestSignText(String value) {
        this.detourDestSignText = value;
    }

    /**
     * Gets the value of the detourDestSignTextLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getDetourDestSignTextLangs() {
        return detourDestSignTextLangs;
    }

    /**
     * Sets the value of the detourDestSignTextLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setDetourDestSignTextLangs(CPTAdditionalLanguageContents value) {
        this.detourDestSignTextLangs = value;
    }

    /**
     * Gets the value of the detourDestSignIcon property.
     * 
     * @return
     *     possible object is
     *     {@link PIBinaryImageData }
     *     
     */
    public PIBinaryImageData getDetourDestSignIcon() {
        return detourDestSignIcon;
    }

    /**
     * Sets the value of the detourDestSignIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIBinaryImageData }
     *     
     */
    public void setDetourDestSignIcon(PIBinaryImageData value) {
        this.detourDestSignIcon = value;
    }

    /**
     * Gets the value of the iconFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconFormat() {
        return iconFormat;
    }

    /**
     * Sets the value of the iconFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconFormat(String value) {
        this.iconFormat = value;
    }

    /**
     * Gets the value of the detourDirections property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetourDirections() {
        return detourDirections;
    }

    /**
     * Sets the value of the detourDirections property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetourDirections(String value) {
        this.detourDirections = value;
    }

    /**
     * Gets the value of the detourDirectionsLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getDetourDirectionsLangs() {
        return detourDirectionsLangs;
    }

    /**
     * Sets the value of the detourDirectionsLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setDetourDirectionsLangs(CPTAdditionalLanguageContents value) {
        this.detourDirectionsLangs = value;
    }

    /**
     * Gets the value of the skippedTimeStopPoints property.
     * 
     * @return
     *     possible object is
     *     {@link CCDetourRecord.SkippedTimeStopPoints }
     *     
     */
    public CCDetourRecord.SkippedTimeStopPoints getSkippedTimeStopPoints() {
        return skippedTimeStopPoints;
    }

    /**
     * Sets the value of the skippedTimeStopPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCDetourRecord.SkippedTimeStopPoints }
     *     
     */
    public void setSkippedTimeStopPoints(CCDetourRecord.SkippedTimeStopPoints value) {
        this.skippedTimeStopPoints = value;
    }

    /**
     * Gets the value of the addScheduleTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddScheduleTime() {
        return addScheduleTime;
    }

    /**
     * Sets the value of the addScheduleTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddScheduleTime(String value) {
        this.addScheduleTime = value;
    }

    /**
     * Gets the value of the addedStops property.
     * 
     * @return
     *     possible object is
     *     {@link CCDetourRecord.AddedStops }
     *     
     */
    public CCDetourRecord.AddedStops getAddedStops() {
        return addedStops;
    }

    /**
     * Sets the value of the addedStops property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCDetourRecord.AddedStops }
     *     
     */
    public void setAddedStops(CCDetourRecord.AddedStops value) {
        this.addedStops = value;
    }

    /**
     * Gets the value of the newStopLocs property.
     * 
     * @return
     *     possible object is
     *     {@link CCDetourRecord.NewStopLocs }
     *     
     */
    public CCDetourRecord.NewStopLocs getNewStopLocs() {
        return newStopLocs;
    }

    /**
     * Sets the value of the newStopLocs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCDetourRecord.NewStopLocs }
     *     
     */
    public void setNewStopLocs(CCDetourRecord.NewStopLocs value) {
        this.newStopLocs = value;
    }

    /**
     * Gets the value of the localCCDetourRecord property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_4_0_0_local.CCDetourRecord }
     *     
     */
    public tcip_4_0_0_local.CCDetourRecord getLocalCCDetourRecord() {
        return localCCDetourRecord;
    }

    /**
     * Sets the value of the localCCDetourRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_4_0_0_local.CCDetourRecord }
     *     
     */
    public void setLocalCCDetourRecord(tcip_4_0_0_local.CCDetourRecord value) {
        this.localCCDetourRecord = value;
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
     *         &lt;element name="added-stop" type="{http://www.TCIP-Final-4-0-0}CPTStoppointIden"/&gt;
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
        "addedStop"
    })
    public static class AddedStops {

        @XmlElement(name = "added-stop", required = true)
        protected List<CPTStoppointIden> addedStop;

        /**
         * Gets the value of the addedStop property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addedStop property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddedStop().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CPTStoppointIden }
         * 
         * 
         */
        public List<CPTStoppointIden> getAddedStop() {
            if (addedStop == null) {
                addedStop = new ArrayList<CPTStoppointIden>();
            }
            return this.addedStop;
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
     *       &lt;sequence maxOccurs="100"&gt;
     *         &lt;element name="new-stop-loc" type="{http://www.lrms-final-09-07}GeoLocation"/&gt;
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
        "newStopLoc"
    })
    public static class NewStopLocs {

        @XmlElement(name = "new-stop-loc", required = true)
        protected List<GeoLocation> newStopLoc;

        /**
         * Gets the value of the newStopLoc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the newStopLoc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNewStopLoc().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GeoLocation }
         * 
         * 
         */
        public List<GeoLocation> getNewStopLoc() {
            if (newStopLoc == null) {
                newStopLoc = new ArrayList<GeoLocation>();
            }
            return this.newStopLoc;
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
     *       &lt;sequence maxOccurs="100"&gt;
     *         &lt;element name="skippedTimeStopPoint" type="{http://www.TCIP-Final-4-0-0}SCHTimeStoppoint"/&gt;
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
        "skippedTimeStopPoint"
    })
    public static class SkippedTimeStopPoints {

        @XmlElement(required = true)
        protected List<SCHTimeStoppoint> skippedTimeStopPoint;

        /**
         * Gets the value of the skippedTimeStopPoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the skippedTimeStopPoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSkippedTimeStopPoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHTimeStoppoint }
         * 
         * 
         */
        public List<SCHTimeStoppoint> getSkippedTimeStopPoint() {
            if (skippedTimeStopPoint == null) {
                skippedTimeStopPoint = new ArrayList<SCHTimeStoppoint>();
            }
            return this.skippedTimeStopPoint;
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
     *       &lt;sequence maxOccurs="100"&gt;
     *         &lt;element name="waypoint" type="{http://www.lrms-final-09-07}GeoLocation"/&gt;
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
        "waypoint"
    })
    public static class Waypoints {

        @XmlElement(required = true)
        protected List<GeoLocation> waypoint;

        /**
         * Gets the value of the waypoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the waypoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWaypoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GeoLocation }
         * 
         * 
         */
        public List<GeoLocation> getWaypoint() {
            if (waypoint == null) {
                waypoint = new ArrayList<GeoLocation>();
            }
            return this.waypoint;
        }

    }

}
