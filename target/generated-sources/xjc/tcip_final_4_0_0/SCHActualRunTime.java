//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package tcip_final_4_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import atis_partial_03_00_74.WeatherInformation;
import org.joda.time.DateTime;


/**
 * <p>Java class for SCHActualRunTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCHActualRunTime"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="weather" type="{http://www.atis-partial-03-00-74}WeatherInformation" minOccurs="0"/&gt;
 *         &lt;element name="start-time" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime"/&gt;
 *         &lt;element name="trip" type="{http://www.TCIP-Final-4-0-0}SCHTripIden"/&gt;
 *         &lt;element name="actual-time" type="{http://www.TCIP-Final-4-0-0}CPT-Duration"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCHActualRunTime", propOrder = {
    "weather",
    "startTime",
    "trip",
    "actualTime"
})
public class SCHActualRunTime {

    protected WeatherInformation weather;
    @XmlElement(name = "start-time", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime startTime;
    @XmlElement(required = true)
    protected SCHTripIden trip;
    @XmlElement(name = "actual-time", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String actualTime;

    /**
     * Gets the value of the weather property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherInformation }
     *     
     */
    public WeatherInformation getWeather() {
        return weather;
    }

    /**
     * Sets the value of the weather property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherInformation }
     *     
     */
    public void setWeather(WeatherInformation value) {
        this.weather = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(DateTime value) {
        this.startTime = value;
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
     * Gets the value of the actualTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualTime() {
        return actualTime;
    }

    /**
     * Sets the value of the actualTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualTime(String value) {
        this.actualTime = value;
    }

}