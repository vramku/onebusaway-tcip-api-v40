//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package atis_partial_03_00_74;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for TimeSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSchedule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="departTime" type="{http://www.atis-partial-03-00-74}Time"/&gt;
 *         &lt;element name="arriveTime" type="{http://www.atis-partial-03-00-74}Time"/&gt;
 *         &lt;element name="nextArrivalCountdown" type="{http://www.atis-partial-03-00-74}PI-NextArrivalCountdown" minOccurs="0"/&gt;
 *         &lt;element name="offSchedule" type="{http://www.atis-partial-03-00-74}PI-OffSchedule" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSchedule", propOrder = {
    "departTime",
    "arriveTime",
    "nextArrivalCountdown",
    "offSchedule"
})
public class TimeSchedule {

    @XmlElement(required = true)
    protected String departTime;
    @XmlElement(required = true)
    protected String arriveTime;
    protected Duration nextArrivalCountdown;
    protected Duration offSchedule;

    /**
     * Gets the value of the departTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartTime() {
        return departTime;
    }

    /**
     * Sets the value of the departTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartTime(String value) {
        this.departTime = value;
    }

    /**
     * Gets the value of the arriveTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArriveTime() {
        return arriveTime;
    }

    /**
     * Sets the value of the arriveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArriveTime(String value) {
        this.arriveTime = value;
    }

    /**
     * Gets the value of the nextArrivalCountdown property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getNextArrivalCountdown() {
        return nextArrivalCountdown;
    }

    /**
     * Sets the value of the nextArrivalCountdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setNextArrivalCountdown(Duration value) {
        this.nextArrivalCountdown = value;
    }

    /**
     * Gets the value of the offSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOffSchedule() {
        return offSchedule;
    }

    /**
     * Sets the value of the offSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setOffSchedule(Duration value) {
        this.offSchedule = value;
    }

}
