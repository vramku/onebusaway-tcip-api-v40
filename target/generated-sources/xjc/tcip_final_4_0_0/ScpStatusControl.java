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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for ScpStatusControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScpStatusControl"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requestID" type="{http://www.TCIP-Final-4-0-0}SCP-PriorityRequestID"/&gt;
 *         &lt;element name="vin" type="{http://www.TCIP-Final-4-0-0}CPT-VIN"/&gt;
 *         &lt;element name="vehicleClassType" type="{http://www.TCIP-Final-4-0-0}SCP-VehicleClassType"/&gt;
 *         &lt;element name="vehicleClassLevel" type="{http://www.TCIP-Final-4-0-0}SCP-VehicleClassLevel"/&gt;
 *         &lt;element name="serviceStrategyNumber" type="{http://www.TCIP-Final-4-0-0}SCP-PriorityStrategyNumber"/&gt;
 *         &lt;element name="intersectionAddress" type="{http://www.TCIP-Final-4-0-0}CPT-IPAddress" minOccurs="0"/&gt;
 *         &lt;element name="intersectionID" type="{http://www.TCIP-Final-4-0-0}TSP-TMS-IntersectionID" minOccurs="0"/&gt;
 *         &lt;element name="intersectionModem" type="{http://www.TCIP-Final-4-0-0}TSP-ModemPhoneNum" minOccurs="0"/&gt;
 *         &lt;element name="intersectionDropAddr" type="{http://www.TCIP-Final-4-0-0}TSP-DropAddr" minOccurs="0"/&gt;
 *         &lt;element name="intersectionIP" type="{http://www.TCIP-Final-4-0-0}CPT-IPAddress" minOccurs="0"/&gt;
 *         &lt;element name="intersectionPort" type="{http://www.TCIP-Final-4-0-0}CPT-UDP-TCP-PortNumber" minOccurs="0"/&gt;
 *         &lt;element name="intersectionIdentifier" type="{http://www.tmdd-partial-00-00-00}Intersection-identifier" minOccurs="0"/&gt;
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
@XmlType(name = "ScpStatusControl", propOrder = {
    "requestID",
    "vin",
    "vehicleClassType",
    "vehicleClassLevel",
    "serviceStrategyNumber",
    "intersectionAddress",
    "intersectionID",
    "intersectionModem",
    "intersectionDropAddr",
    "intersectionIP",
    "intersectionPort",
    "intersectionIdentifier"
})
public class ScpStatusControl {

    @XmlSchemaType(name = "unsignedByte")
    protected short requestID;
    @XmlElement(required = true)
    protected String vin;
    @XmlSchemaType(name = "unsignedByte")
    protected short vehicleClassType;
    @XmlSchemaType(name = "unsignedByte")
    protected short vehicleClassLevel;
    @XmlSchemaType(name = "unsignedByte")
    protected short serviceStrategyNumber;
    protected String intersectionAddress;
    protected String intersectionID;
    protected String intersectionModem;
    @XmlSchemaType(name = "unsignedByte")
    protected Short intersectionDropAddr;
    protected String intersectionIP;
    @XmlSchemaType(name = "unsignedByte")
    protected Short intersectionPort;
    protected String intersectionIdentifier;
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
     * Gets the value of the requestID property.
     * 
     */
    public short getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     */
    public void setRequestID(short value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the vin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVin() {
        return vin;
    }

    /**
     * Sets the value of the vin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVin(String value) {
        this.vin = value;
    }

    /**
     * Gets the value of the vehicleClassType property.
     * 
     */
    public short getVehicleClassType() {
        return vehicleClassType;
    }

    /**
     * Sets the value of the vehicleClassType property.
     * 
     */
    public void setVehicleClassType(short value) {
        this.vehicleClassType = value;
    }

    /**
     * Gets the value of the vehicleClassLevel property.
     * 
     */
    public short getVehicleClassLevel() {
        return vehicleClassLevel;
    }

    /**
     * Sets the value of the vehicleClassLevel property.
     * 
     */
    public void setVehicleClassLevel(short value) {
        this.vehicleClassLevel = value;
    }

    /**
     * Gets the value of the serviceStrategyNumber property.
     * 
     */
    public short getServiceStrategyNumber() {
        return serviceStrategyNumber;
    }

    /**
     * Sets the value of the serviceStrategyNumber property.
     * 
     */
    public void setServiceStrategyNumber(short value) {
        this.serviceStrategyNumber = value;
    }

    /**
     * Gets the value of the intersectionAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntersectionAddress() {
        return intersectionAddress;
    }

    /**
     * Sets the value of the intersectionAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntersectionAddress(String value) {
        this.intersectionAddress = value;
    }

    /**
     * Gets the value of the intersectionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntersectionID() {
        return intersectionID;
    }

    /**
     * Sets the value of the intersectionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntersectionID(String value) {
        this.intersectionID = value;
    }

    /**
     * Gets the value of the intersectionModem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntersectionModem() {
        return intersectionModem;
    }

    /**
     * Sets the value of the intersectionModem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntersectionModem(String value) {
        this.intersectionModem = value;
    }

    /**
     * Gets the value of the intersectionDropAddr property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIntersectionDropAddr() {
        return intersectionDropAddr;
    }

    /**
     * Sets the value of the intersectionDropAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIntersectionDropAddr(Short value) {
        this.intersectionDropAddr = value;
    }

    /**
     * Gets the value of the intersectionIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntersectionIP() {
        return intersectionIP;
    }

    /**
     * Sets the value of the intersectionIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntersectionIP(String value) {
        this.intersectionIP = value;
    }

    /**
     * Gets the value of the intersectionPort property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIntersectionPort() {
        return intersectionPort;
    }

    /**
     * Sets the value of the intersectionPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIntersectionPort(Short value) {
        this.intersectionPort = value;
    }

    /**
     * Gets the value of the intersectionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntersectionIdentifier() {
        return intersectionIdentifier;
    }

    /**
     * Sets the value of the intersectionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntersectionIdentifier(String value) {
        this.intersectionIdentifier = value;
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

}
