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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCPTVAlarm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCPTVAlarm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vehicle" type="{http://www.TCIP-Final-4-0-0}CPTVehicleIden"/&gt;
 *         &lt;element name="alarm-info" type="{http://www.TCIP-Final-4-0-0}CCAlarm"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCPTVAlarm", propOrder = {
    "vehicle",
    "alarmInfo"
})
public class CCPTVAlarm {

    @XmlElement(required = true)
    protected CPTVehicleIden vehicle;
    @XmlElement(name = "alarm-info", required = true)
    protected CCAlarm alarmInfo;

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link CPTVehicleIden }
     *     
     */
    public CPTVehicleIden getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTVehicleIden }
     *     
     */
    public void setVehicle(CPTVehicleIden value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the alarmInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CCAlarm }
     *     
     */
    public CCAlarm getAlarmInfo() {
        return alarmInfo;
    }

    /**
     * Sets the value of the alarmInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAlarm }
     *     
     */
    public void setAlarmInfo(CCAlarm value) {
        this.alarmInfo = value;
    }

}
