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


/**
 * <p>Java class for TSPStrategyEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSPStrategyEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultantStrategyID" type="{http://www.TCIP-Final-4-0-0}SCP-PriorityStrategyNumber"/&gt;
 *         &lt;element name="resultantClassType" type="{http://www.TCIP-Final-4-0-0}SCP-VehicleClassType"/&gt;
 *         &lt;element name="resultantClassLevel" type="{http://www.TCIP-Final-4-0-0}SCP-VehicleClassLevel"/&gt;
 *         &lt;element name="strategyTimeBegin" type="{http://www.TCIP-Final-4-0-0}SCH-Time" minOccurs="0"/&gt;
 *         &lt;element name="strategyTimeEnd" type="{http://www.TCIP-Final-4-0-0}SCH-Time" minOccurs="0"/&gt;
 *         &lt;element name="schLateMinimum" type="{http://www.TCIP-Final-4-0-0}OB-ScheduleAdherenceOffset" minOccurs="0"/&gt;
 *         &lt;element name="schLateMaximum" type="{http://www.TCIP-Final-4-0-0}OB-ScheduleAdherenceOffset" minOccurs="0"/&gt;
 *         &lt;element name="schRecoveryMinimum" type="{http://www.TCIP-Final-4-0-0}OB-ScheduleAdherenceOffset" minOccurs="0"/&gt;
 *         &lt;element name="prgLoadMinimum" type="{http://www.TCIP-Final-4-0-0}OB-J1587-PassengerCounterPatronCount" minOccurs="0"/&gt;
 *         &lt;element name="travelPath" type="{http://www.TCIP-Final-4-0-0}TSP-IntersectionPath" minOccurs="0"/&gt;
 *         &lt;element name="allowed-boundaries"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="10000"&gt;
 *                   &lt;element name="allowed-boundarie" type="{http://www.TCIP-Final-4-0-0}TSP-BoundaryID"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="allowed-intersections" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="10000"&gt;
 *                   &lt;element name="allowed-intersection" type="{http://www.TCIP-Final-4-0-0}TSPAllowedIntersection"/&gt;
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
@XmlType(name = "TSPStrategyEntry", propOrder = {
    "resultantStrategyID",
    "resultantClassType",
    "resultantClassLevel",
    "strategyTimeBegin",
    "strategyTimeEnd",
    "schLateMinimum",
    "schLateMaximum",
    "schRecoveryMinimum",
    "prgLoadMinimum",
    "travelPath",
    "allowedBoundaries",
    "allowedIntersections"
})
public class TSPStrategyEntry {

    @XmlSchemaType(name = "unsignedByte")
    protected short resultantStrategyID;
    @XmlSchemaType(name = "unsignedByte")
    protected short resultantClassType;
    @XmlSchemaType(name = "unsignedByte")
    protected short resultantClassLevel;
    protected Long strategyTimeBegin;
    protected Long strategyTimeEnd;
    protected Long schLateMinimum;
    protected Long schLateMaximum;
    protected Long schRecoveryMinimum;
    @XmlSchemaType(name = "unsignedByte")
    protected Short prgLoadMinimum;
    @XmlSchemaType(name = "anySimpleType")
    protected String travelPath;
    @XmlElement(name = "allowed-boundaries", required = true)
    protected TSPStrategyEntry.AllowedBoundaries allowedBoundaries;
    @XmlElement(name = "allowed-intersections")
    protected TSPStrategyEntry.AllowedIntersections allowedIntersections;

    /**
     * Gets the value of the resultantStrategyID property.
     * 
     */
    public short getResultantStrategyID() {
        return resultantStrategyID;
    }

    /**
     * Sets the value of the resultantStrategyID property.
     * 
     */
    public void setResultantStrategyID(short value) {
        this.resultantStrategyID = value;
    }

    /**
     * Gets the value of the resultantClassType property.
     * 
     */
    public short getResultantClassType() {
        return resultantClassType;
    }

    /**
     * Sets the value of the resultantClassType property.
     * 
     */
    public void setResultantClassType(short value) {
        this.resultantClassType = value;
    }

    /**
     * Gets the value of the resultantClassLevel property.
     * 
     */
    public short getResultantClassLevel() {
        return resultantClassLevel;
    }

    /**
     * Sets the value of the resultantClassLevel property.
     * 
     */
    public void setResultantClassLevel(short value) {
        this.resultantClassLevel = value;
    }

    /**
     * Gets the value of the strategyTimeBegin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStrategyTimeBegin() {
        return strategyTimeBegin;
    }

    /**
     * Sets the value of the strategyTimeBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStrategyTimeBegin(Long value) {
        this.strategyTimeBegin = value;
    }

    /**
     * Gets the value of the strategyTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStrategyTimeEnd() {
        return strategyTimeEnd;
    }

    /**
     * Sets the value of the strategyTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStrategyTimeEnd(Long value) {
        this.strategyTimeEnd = value;
    }

    /**
     * Gets the value of the schLateMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSchLateMinimum() {
        return schLateMinimum;
    }

    /**
     * Sets the value of the schLateMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSchLateMinimum(Long value) {
        this.schLateMinimum = value;
    }

    /**
     * Gets the value of the schLateMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSchLateMaximum() {
        return schLateMaximum;
    }

    /**
     * Sets the value of the schLateMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSchLateMaximum(Long value) {
        this.schLateMaximum = value;
    }

    /**
     * Gets the value of the schRecoveryMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSchRecoveryMinimum() {
        return schRecoveryMinimum;
    }

    /**
     * Sets the value of the schRecoveryMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSchRecoveryMinimum(Long value) {
        this.schRecoveryMinimum = value;
    }

    /**
     * Gets the value of the prgLoadMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPrgLoadMinimum() {
        return prgLoadMinimum;
    }

    /**
     * Sets the value of the prgLoadMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPrgLoadMinimum(Short value) {
        this.prgLoadMinimum = value;
    }

    /**
     * Gets the value of the travelPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelPath() {
        return travelPath;
    }

    /**
     * Sets the value of the travelPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelPath(String value) {
        this.travelPath = value;
    }

    /**
     * Gets the value of the allowedBoundaries property.
     * 
     * @return
     *     possible object is
     *     {@link TSPStrategyEntry.AllowedBoundaries }
     *     
     */
    public TSPStrategyEntry.AllowedBoundaries getAllowedBoundaries() {
        return allowedBoundaries;
    }

    /**
     * Sets the value of the allowedBoundaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSPStrategyEntry.AllowedBoundaries }
     *     
     */
    public void setAllowedBoundaries(TSPStrategyEntry.AllowedBoundaries value) {
        this.allowedBoundaries = value;
    }

    /**
     * Gets the value of the allowedIntersections property.
     * 
     * @return
     *     possible object is
     *     {@link TSPStrategyEntry.AllowedIntersections }
     *     
     */
    public TSPStrategyEntry.AllowedIntersections getAllowedIntersections() {
        return allowedIntersections;
    }

    /**
     * Sets the value of the allowedIntersections property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSPStrategyEntry.AllowedIntersections }
     *     
     */
    public void setAllowedIntersections(TSPStrategyEntry.AllowedIntersections value) {
        this.allowedIntersections = value;
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
     *       &lt;sequence maxOccurs="10000"&gt;
     *         &lt;element name="allowed-boundarie" type="{http://www.TCIP-Final-4-0-0}TSP-BoundaryID"/&gt;
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
        "allowedBoundarie"
    })
    public static class AllowedBoundaries {

        @XmlElement(name = "allowed-boundarie", required = true)
        @XmlSchemaType(name = "unsignedLong")
        protected List<BigInteger> allowedBoundarie;

        /**
         * Gets the value of the allowedBoundarie property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the allowedBoundarie property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAllowedBoundarie().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getAllowedBoundarie() {
            if (allowedBoundarie == null) {
                allowedBoundarie = new ArrayList<BigInteger>();
            }
            return this.allowedBoundarie;
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
     *       &lt;sequence maxOccurs="10000"&gt;
     *         &lt;element name="allowed-intersection" type="{http://www.TCIP-Final-4-0-0}TSPAllowedIntersection"/&gt;
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
        "allowedIntersection"
    })
    public static class AllowedIntersections {

        @XmlElement(name = "allowed-intersection", required = true)
        protected List<TSPAllowedIntersection> allowedIntersection;

        /**
         * Gets the value of the allowedIntersection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the allowedIntersection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAllowedIntersection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TSPAllowedIntersection }
         * 
         * 
         */
        public List<TSPAllowedIntersection> getAllowedIntersection() {
            if (allowedIntersection == null) {
                allowedIntersection = new ArrayList<TSPAllowedIntersection>();
            }
            return this.allowedIntersection;
        }

    }

}