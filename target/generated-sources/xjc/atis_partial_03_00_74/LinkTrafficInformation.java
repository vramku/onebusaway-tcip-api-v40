//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package atis_partial_03_00_74;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import lrms_final_09_07_for_atis_im.LocationReference;


/**
 *        
 *             A large number of weather related data elements may also
 *             be linked to this message as well
 *          
 * 
 * <p>Java class for LinkTrafficInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkTrafficInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="head" type="{http://www.atis-partial-03-00-74}Head" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://www.lrms-final-09-07-for-atis-im}LocationReference"/&gt;
 *         &lt;element name="isForecast" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="coverageTime" type="{http://www.atis-partial-03-00-74}ComplexTime" minOccurs="0"/&gt;
 *         &lt;element name="forecastExpires" type="{http://www.atis-partial-03-00-74}DateTimePair" minOccurs="0"/&gt;
 *         &lt;element name="affectedLanes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="16"&gt;
 *                   &lt;element name="affectedLane" type="{http://www.atis-partial-03-00-74}LaneDescription"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="capacity" type="{http://www.atis-partial-03-00-74}Link-capacity" minOccurs="0"/&gt;
 *         &lt;element name="delay" type="{http://www.atis-partial-03-00-74}Link-delay" minOccurs="0"/&gt;
 *         &lt;element name="density" type="{http://www.atis-partial-03-00-74}Link-density" minOccurs="0"/&gt;
 *         &lt;element name="lanesMinimumNumber" type="{http://www.atis-partial-03-00-74}Link-lanes-number-open" minOccurs="0"/&gt;
 *         &lt;element name="lanesNumberOpen" type="{http://www.atis-partial-03-00-74}Link-lanes-number-open" minOccurs="0"/&gt;
 *         &lt;element name="length" type="{http://www.atis-partial-03-00-74}Link-length" minOccurs="0"/&gt;
 *         &lt;element name="levelOfService" type="{http://www.atis-partial-03-00-74}Link-level-of-service" minOccurs="0"/&gt;
 *         &lt;element name="medianType" type="{http://www.atis-partial-03-00-74}Link-median-type" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.atis-partial-03-00-74}Link-name" minOccurs="0"/&gt;
 *         &lt;element name="occupancy" type="{http://www.atis-partial-03-00-74}Link-occupancy" minOccurs="0"/&gt;
 *         &lt;element name="pavementType" type="{http://www.atis-partial-03-00-74}Link-pavement-type" minOccurs="0"/&gt;
 *         &lt;element name="restrictionAxleCount" type="{http://www.atis-partial-03-00-74}Link-restriction-axle-count" minOccurs="0"/&gt;
 *         &lt;element name="restrictionAxleWeight" type="{http://www.atis-partial-03-00-74}Link-restriction-weight-axle" minOccurs="0"/&gt;
 *         &lt;element name="restrictionClass" type="{http://www.itis-final-3-0-0-for-atis}RestrictionClass" minOccurs="0"/&gt;
 *         &lt;element name="restrictionHeight" type="{http://www.atis-partial-03-00-74}Link-restriction-height" minOccurs="0"/&gt;
 *         &lt;element name="restrictionLength" type="{http://www.atis-partial-03-00-74}Link-restriction-length" minOccurs="0"/&gt;
 *         &lt;element name="restrictionWeight" type="{http://www.atis-partial-03-00-74}Link-restriction-weight-vehicle" minOccurs="0"/&gt;
 *         &lt;element name="restrictionWidth" type="{http://www.atis-partial-03-00-74}Link-restriction-width" minOccurs="0"/&gt;
 *         &lt;element name="roadNumber" type="{http://www.atis-partial-03-00-74}Link-route-designator" minOccurs="0"/&gt;
 *         &lt;element name="shoulderWidthLeft" type="{http://www.atis-partial-03-00-74}Link-shoulder-width-left" minOccurs="0"/&gt;
 *         &lt;element name="shoulderWidthRight" type="{http://www.atis-partial-03-00-74}Link-shoulder-width-right" minOccurs="0"/&gt;
 *         &lt;element name="speed" type="{http://www.atis-partial-03-00-74}Link-speed-average" minOccurs="0"/&gt;
 *         &lt;element name="speedLimit" type="{http://www.atis-partial-03-00-74}Link-speed-limit" minOccurs="0"/&gt;
 *         &lt;element name="linkStatus" type="{http://www.itis-final-3-0-0-for-atis}Closures" minOccurs="0"/&gt;
 *         &lt;element name="surfaceConditions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="16"&gt;
 *                   &lt;element name="surfaceCondition" type="{http://www.itis-final-3-0-0-for-atis}PavementConditions"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="travelTime" type="{http://www.atis-partial-03-00-74}Link-travel-time" minOccurs="0"/&gt;
 *         &lt;element name="truckSpeedLimit" type="{http://www.atis-partial-03-00-74}Link-speed-limit-truck" minOccurs="0"/&gt;
 *         &lt;element name="nodeDelay" type="{http://www.atis-partial-03-00-74}Node-delay" minOccurs="0"/&gt;
 *         &lt;element name="nodeLinksNum" type="{http://www.atis-partial-03-00-74}Node-links-number" minOccurs="0"/&gt;
 *         &lt;element name="nodeName" type="{http://www.atis-partial-03-00-74}Node-name" minOccurs="0"/&gt;
 *         &lt;element name="nodeStatus" type="{http://www.itis-final-3-0-0-for-atis}Closures" minOccurs="0"/&gt;
 *         &lt;element name="owner" type="{http://www.atis-partial-03-00-74}Link-ownership" minOccurs="0"/&gt;
 *         &lt;element name="jurisdiction" type="{http://www.atis-partial-03-00-74}Link-jurisdiction" minOccurs="0"/&gt;
 *         &lt;element name="tmddOther" type="{http://www.atis-partial-03-00-74}Link-other" minOccurs="0"/&gt;
 *         &lt;element name="furtherData" type="{http://www.atis-partial-03-00-74}URL-Link" minOccurs="0"/&gt;
 *         &lt;element name="tail" type="{http://www.atis-partial-03-00-74}Tail" minOccurs="0"/&gt;
 *         &lt;element name="localLinkTrafficInformation" type="{http://www.atis-03-00-74-local}LinkTrafficInformation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkTrafficInformation", propOrder = {
    "head",
    "location",
    "isForecast",
    "coverageTime",
    "forecastExpires",
    "affectedLanes",
    "capacity",
    "delay",
    "density",
    "lanesMinimumNumber",
    "lanesNumberOpen",
    "length",
    "levelOfService",
    "medianType",
    "name",
    "occupancy",
    "pavementType",
    "restrictionAxleCount",
    "restrictionAxleWeight",
    "restrictionClass",
    "restrictionHeight",
    "restrictionLength",
    "restrictionWeight",
    "restrictionWidth",
    "roadNumber",
    "shoulderWidthLeft",
    "shoulderWidthRight",
    "speed",
    "speedLimit",
    "linkStatus",
    "surfaceConditions",
    "travelTime",
    "truckSpeedLimit",
    "nodeDelay",
    "nodeLinksNum",
    "nodeName",
    "nodeStatus",
    "owner",
    "jurisdiction",
    "tmddOther",
    "furtherData",
    "tail",
    "localLinkTrafficInformation"
})
public class LinkTrafficInformation {

    protected Head head;
    @XmlElement(required = true)
    protected LocationReference location;
    protected Boolean isForecast;
    protected ComplexTime coverageTime;
    protected DateTimePair forecastExpires;
    protected LinkTrafficInformation.AffectedLanes affectedLanes;
    @XmlSchemaType(name = "unsignedInt")
    protected Long capacity;
    @XmlSchemaType(name = "unsignedInt")
    protected Long delay;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer density;
    @XmlSchemaType(name = "unsignedByte")
    protected Short lanesMinimumNumber;
    @XmlSchemaType(name = "unsignedByte")
    protected Short lanesNumberOpen;
    @XmlSchemaType(name = "unsignedInt")
    protected Long length;
    @XmlSchemaType(name = "anySimpleType")
    protected String levelOfService;
    @XmlSchemaType(name = "anySimpleType")
    protected String medianType;
    protected String name;
    @XmlSchemaType(name = "unsignedByte")
    protected Short occupancy;
    @XmlSchemaType(name = "anySimpleType")
    protected String pavementType;
    @XmlSchemaType(name = "unsignedByte")
    protected Short restrictionAxleCount;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer restrictionAxleWeight;
    @XmlSchemaType(name = "anySimpleType")
    protected String restrictionClass;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer restrictionHeight;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer restrictionLength;
    @XmlSchemaType(name = "unsignedInt")
    protected Long restrictionWeight;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer restrictionWidth;
    protected String roadNumber;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer shoulderWidthLeft;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer shoulderWidthRight;
    @XmlSchemaType(name = "unsignedByte")
    protected Short speed;
    @XmlSchemaType(name = "unsignedByte")
    protected Short speedLimit;
    @XmlSchemaType(name = "anySimpleType")
    protected String linkStatus;
    protected LinkTrafficInformation.SurfaceConditions surfaceConditions;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer travelTime;
    @XmlSchemaType(name = "unsignedByte")
    protected Short truckSpeedLimit;
    @XmlSchemaType(name = "unsignedInt")
    protected Long nodeDelay;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer nodeLinksNum;
    protected String nodeName;
    @XmlSchemaType(name = "anySimpleType")
    protected String nodeStatus;
    protected String owner;
    protected String jurisdiction;
    protected String tmddOther;
    @XmlSchemaType(name = "anyURI")
    protected String furtherData;
    protected Tail tail;
    protected atis_03_00_74_local.LinkTrafficInformation localLinkTrafficInformation;

    /**
     * Gets the value of the head property.
     * 
     * @return
     *     possible object is
     *     {@link Head }
     *     
     */
    public Head getHead() {
        return head;
    }

    /**
     * Sets the value of the head property.
     * 
     * @param value
     *     allowed object is
     *     {@link Head }
     *     
     */
    public void setHead(Head value) {
        this.head = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationReference }
     *     
     */
    public LocationReference getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationReference }
     *     
     */
    public void setLocation(LocationReference value) {
        this.location = value;
    }

    /**
     * Gets the value of the isForecast property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsForecast() {
        return isForecast;
    }

    /**
     * Sets the value of the isForecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsForecast(Boolean value) {
        this.isForecast = value;
    }

    /**
     * Gets the value of the coverageTime property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexTime }
     *     
     */
    public ComplexTime getCoverageTime() {
        return coverageTime;
    }

    /**
     * Sets the value of the coverageTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexTime }
     *     
     */
    public void setCoverageTime(ComplexTime value) {
        this.coverageTime = value;
    }

    /**
     * Gets the value of the forecastExpires property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePair }
     *     
     */
    public DateTimePair getForecastExpires() {
        return forecastExpires;
    }

    /**
     * Sets the value of the forecastExpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePair }
     *     
     */
    public void setForecastExpires(DateTimePair value) {
        this.forecastExpires = value;
    }

    /**
     * Gets the value of the affectedLanes property.
     * 
     * @return
     *     possible object is
     *     {@link LinkTrafficInformation.AffectedLanes }
     *     
     */
    public LinkTrafficInformation.AffectedLanes getAffectedLanes() {
        return affectedLanes;
    }

    /**
     * Sets the value of the affectedLanes property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkTrafficInformation.AffectedLanes }
     *     
     */
    public void setAffectedLanes(LinkTrafficInformation.AffectedLanes value) {
        this.affectedLanes = value;
    }

    /**
     * Gets the value of the capacity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCapacity(Long value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the delay property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDelay() {
        return delay;
    }

    /**
     * Sets the value of the delay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDelay(Long value) {
        this.delay = value;
    }

    /**
     * Gets the value of the density property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDensity() {
        return density;
    }

    /**
     * Sets the value of the density property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDensity(Integer value) {
        this.density = value;
    }

    /**
     * Gets the value of the lanesMinimumNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLanesMinimumNumber() {
        return lanesMinimumNumber;
    }

    /**
     * Sets the value of the lanesMinimumNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLanesMinimumNumber(Short value) {
        this.lanesMinimumNumber = value;
    }

    /**
     * Gets the value of the lanesNumberOpen property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLanesNumberOpen() {
        return lanesNumberOpen;
    }

    /**
     * Sets the value of the lanesNumberOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLanesNumberOpen(Short value) {
        this.lanesNumberOpen = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLength(Long value) {
        this.length = value;
    }

    /**
     * Gets the value of the levelOfService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelOfService() {
        return levelOfService;
    }

    /**
     * Sets the value of the levelOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelOfService(String value) {
        this.levelOfService = value;
    }

    /**
     * Gets the value of the medianType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedianType() {
        return medianType;
    }

    /**
     * Sets the value of the medianType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedianType(String value) {
        this.medianType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the occupancy property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOccupancy() {
        return occupancy;
    }

    /**
     * Sets the value of the occupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOccupancy(Short value) {
        this.occupancy = value;
    }

    /**
     * Gets the value of the pavementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPavementType() {
        return pavementType;
    }

    /**
     * Sets the value of the pavementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPavementType(String value) {
        this.pavementType = value;
    }

    /**
     * Gets the value of the restrictionAxleCount property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRestrictionAxleCount() {
        return restrictionAxleCount;
    }

    /**
     * Sets the value of the restrictionAxleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRestrictionAxleCount(Short value) {
        this.restrictionAxleCount = value;
    }

    /**
     * Gets the value of the restrictionAxleWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRestrictionAxleWeight() {
        return restrictionAxleWeight;
    }

    /**
     * Sets the value of the restrictionAxleWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRestrictionAxleWeight(Integer value) {
        this.restrictionAxleWeight = value;
    }

    /**
     * Gets the value of the restrictionClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictionClass() {
        return restrictionClass;
    }

    /**
     * Sets the value of the restrictionClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictionClass(String value) {
        this.restrictionClass = value;
    }

    /**
     * Gets the value of the restrictionHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRestrictionHeight() {
        return restrictionHeight;
    }

    /**
     * Sets the value of the restrictionHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRestrictionHeight(Integer value) {
        this.restrictionHeight = value;
    }

    /**
     * Gets the value of the restrictionLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRestrictionLength() {
        return restrictionLength;
    }

    /**
     * Sets the value of the restrictionLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRestrictionLength(Integer value) {
        this.restrictionLength = value;
    }

    /**
     * Gets the value of the restrictionWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRestrictionWeight() {
        return restrictionWeight;
    }

    /**
     * Sets the value of the restrictionWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRestrictionWeight(Long value) {
        this.restrictionWeight = value;
    }

    /**
     * Gets the value of the restrictionWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRestrictionWidth() {
        return restrictionWidth;
    }

    /**
     * Sets the value of the restrictionWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRestrictionWidth(Integer value) {
        this.restrictionWidth = value;
    }

    /**
     * Gets the value of the roadNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadNumber() {
        return roadNumber;
    }

    /**
     * Sets the value of the roadNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadNumber(String value) {
        this.roadNumber = value;
    }

    /**
     * Gets the value of the shoulderWidthLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShoulderWidthLeft() {
        return shoulderWidthLeft;
    }

    /**
     * Sets the value of the shoulderWidthLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShoulderWidthLeft(Integer value) {
        this.shoulderWidthLeft = value;
    }

    /**
     * Gets the value of the shoulderWidthRight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShoulderWidthRight() {
        return shoulderWidthRight;
    }

    /**
     * Sets the value of the shoulderWidthRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShoulderWidthRight(Integer value) {
        this.shoulderWidthRight = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSpeed(Short value) {
        this.speed = value;
    }

    /**
     * Gets the value of the speedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSpeedLimit() {
        return speedLimit;
    }

    /**
     * Sets the value of the speedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSpeedLimit(Short value) {
        this.speedLimit = value;
    }

    /**
     * Gets the value of the linkStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkStatus() {
        return linkStatus;
    }

    /**
     * Sets the value of the linkStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkStatus(String value) {
        this.linkStatus = value;
    }

    /**
     * Gets the value of the surfaceConditions property.
     * 
     * @return
     *     possible object is
     *     {@link LinkTrafficInformation.SurfaceConditions }
     *     
     */
    public LinkTrafficInformation.SurfaceConditions getSurfaceConditions() {
        return surfaceConditions;
    }

    /**
     * Sets the value of the surfaceConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkTrafficInformation.SurfaceConditions }
     *     
     */
    public void setSurfaceConditions(LinkTrafficInformation.SurfaceConditions value) {
        this.surfaceConditions = value;
    }

    /**
     * Gets the value of the travelTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTravelTime() {
        return travelTime;
    }

    /**
     * Sets the value of the travelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTravelTime(Integer value) {
        this.travelTime = value;
    }

    /**
     * Gets the value of the truckSpeedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTruckSpeedLimit() {
        return truckSpeedLimit;
    }

    /**
     * Sets the value of the truckSpeedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTruckSpeedLimit(Short value) {
        this.truckSpeedLimit = value;
    }

    /**
     * Gets the value of the nodeDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNodeDelay() {
        return nodeDelay;
    }

    /**
     * Sets the value of the nodeDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNodeDelay(Long value) {
        this.nodeDelay = value;
    }

    /**
     * Gets the value of the nodeLinksNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNodeLinksNum() {
        return nodeLinksNum;
    }

    /**
     * Sets the value of the nodeLinksNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNodeLinksNum(Integer value) {
        this.nodeLinksNum = value;
    }

    /**
     * Gets the value of the nodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets the value of the nodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeName(String value) {
        this.nodeName = value;
    }

    /**
     * Gets the value of the nodeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeStatus() {
        return nodeStatus;
    }

    /**
     * Sets the value of the nodeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeStatus(String value) {
        this.nodeStatus = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the jurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisdiction() {
        return jurisdiction;
    }

    /**
     * Sets the value of the jurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisdiction(String value) {
        this.jurisdiction = value;
    }

    /**
     * Gets the value of the tmddOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmddOther() {
        return tmddOther;
    }

    /**
     * Sets the value of the tmddOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmddOther(String value) {
        this.tmddOther = value;
    }

    /**
     * Gets the value of the furtherData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFurtherData() {
        return furtherData;
    }

    /**
     * Sets the value of the furtherData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFurtherData(String value) {
        this.furtherData = value;
    }

    /**
     * Gets the value of the tail property.
     * 
     * @return
     *     possible object is
     *     {@link Tail }
     *     
     */
    public Tail getTail() {
        return tail;
    }

    /**
     * Sets the value of the tail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tail }
     *     
     */
    public void setTail(Tail value) {
        this.tail = value;
    }

    /**
     * Gets the value of the localLinkTrafficInformation property.
     * 
     * @return
     *     possible object is
     *     {@link atis_03_00_74_local.LinkTrafficInformation }
     *     
     */
    public atis_03_00_74_local.LinkTrafficInformation getLocalLinkTrafficInformation() {
        return localLinkTrafficInformation;
    }

    /**
     * Sets the value of the localLinkTrafficInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link atis_03_00_74_local.LinkTrafficInformation }
     *     
     */
    public void setLocalLinkTrafficInformation(atis_03_00_74_local.LinkTrafficInformation value) {
        this.localLinkTrafficInformation = value;
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
     *       &lt;sequence maxOccurs="16"&gt;
     *         &lt;element name="affectedLane" type="{http://www.atis-partial-03-00-74}LaneDescription"/&gt;
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
        "affectedLane"
    })
    public static class AffectedLanes {

        @XmlElement(required = true)
        protected List<LaneDescription> affectedLane;

        /**
         * Gets the value of the affectedLane property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedLane property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedLane().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LaneDescription }
         * 
         * 
         */
        public List<LaneDescription> getAffectedLane() {
            if (affectedLane == null) {
                affectedLane = new ArrayList<LaneDescription>();
            }
            return this.affectedLane;
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
     *       &lt;sequence maxOccurs="16"&gt;
     *         &lt;element name="surfaceCondition" type="{http://www.itis-final-3-0-0-for-atis}PavementConditions"/&gt;
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
        "surfaceCondition"
    })
    public static class SurfaceConditions {

        @XmlElement(required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected List<String> surfaceCondition;

        /**
         * Gets the value of the surfaceCondition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the surfaceCondition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSurfaceCondition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSurfaceCondition() {
            if (surfaceCondition == null) {
                surfaceCondition = new ArrayList<String>();
            }
            return this.surfaceCondition;
        }

    }

}
