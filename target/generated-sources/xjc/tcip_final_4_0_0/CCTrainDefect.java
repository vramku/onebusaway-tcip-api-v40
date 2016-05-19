//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package tcip_final_4_0_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>Java class for CCTrainDefect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCTrainDefect"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="time" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime"/&gt;
 *         &lt;element name="detectorID" type="{http://www.TCIP-Final-4-0-0}CCTrainDetectorIden"/&gt;
 *         &lt;element name="defectType" type="{http://www.TCIP-Final-4-0-0}CC-TrainDefectType"/&gt;
 *         &lt;element name="axleSequence" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="carSequence" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="trainID" type="{http://www.TCIP-Final-4-0-0}CPTTrainIden" minOccurs="0"/&gt;
 *         &lt;element name="carID" type="{http://www.TCIP-Final-4-0-0}CPTVehicleIden" minOccurs="0"/&gt;
 *         &lt;element name="tempF" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCTrainDefect", propOrder = {
    "time",
    "detectorID",
    "defectType",
    "axleSequence",
    "carSequence",
    "trainID",
    "carID",
    "tempF"
})
public class CCTrainDefect {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime time;
    @XmlElement(required = true)
    protected CCTrainDetectorIden detectorID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String defectType;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger axleSequence;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger carSequence;
    protected CPTTrainIden trainID;
    protected CPTVehicleIden carID;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger tempF;

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(DateTime value) {
        this.time = value;
    }

    /**
     * Gets the value of the detectorID property.
     * 
     * @return
     *     possible object is
     *     {@link CCTrainDetectorIden }
     *     
     */
    public CCTrainDetectorIden getDetectorID() {
        return detectorID;
    }

    /**
     * Sets the value of the detectorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCTrainDetectorIden }
     *     
     */
    public void setDetectorID(CCTrainDetectorIden value) {
        this.detectorID = value;
    }

    /**
     * Gets the value of the defectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefectType() {
        return defectType;
    }

    /**
     * Sets the value of the defectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefectType(String value) {
        this.defectType = value;
    }

    /**
     * Gets the value of the axleSequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAxleSequence() {
        return axleSequence;
    }

    /**
     * Sets the value of the axleSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAxleSequence(BigInteger value) {
        this.axleSequence = value;
    }

    /**
     * Gets the value of the carSequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCarSequence() {
        return carSequence;
    }

    /**
     * Sets the value of the carSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCarSequence(BigInteger value) {
        this.carSequence = value;
    }

    /**
     * Gets the value of the trainID property.
     * 
     * @return
     *     possible object is
     *     {@link CPTTrainIden }
     *     
     */
    public CPTTrainIden getTrainID() {
        return trainID;
    }

    /**
     * Sets the value of the trainID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTTrainIden }
     *     
     */
    public void setTrainID(CPTTrainIden value) {
        this.trainID = value;
    }

    /**
     * Gets the value of the carID property.
     * 
     * @return
     *     possible object is
     *     {@link CPTVehicleIden }
     *     
     */
    public CPTVehicleIden getCarID() {
        return carID;
    }

    /**
     * Sets the value of the carID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTVehicleIden }
     *     
     */
    public void setCarID(CPTVehicleIden value) {
        this.carID = value;
    }

    /**
     * Gets the value of the tempF property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTempF() {
        return tempF;
    }

    /**
     * Sets the value of the tempF property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTempF(BigInteger value) {
        this.tempF = value;
    }

}