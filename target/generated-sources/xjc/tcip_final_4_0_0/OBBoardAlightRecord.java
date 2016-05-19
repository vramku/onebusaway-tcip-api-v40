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
import org.joda.time.DateTime;


/**
 * <p>Java class for OBBoardAlightRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBBoardAlightRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="door-opened" type="{http://www.TCIP-Final-4-0-0}CPT-Boolean"/&gt;
 *         &lt;element name="open-time" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="close-time" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="boarding-count" type="{http://www.TCIP-Final-4-0-0}OB-PassengerBoarding"/&gt;
 *         &lt;element name="alighting-count" type="{http://www.TCIP-Final-4-0-0}OB-PassengerAlighting"/&gt;
 *         &lt;element name="localOBBoardAlightRecord" type="{http://www.tcip-4-0-0-local}OBBoardAlightRecord" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBBoardAlightRecord", propOrder = {
    "doorOpened",
    "openTime",
    "closeTime",
    "boardingCount",
    "alightingCount",
    "localOBBoardAlightRecord"
})
public class OBBoardAlightRecord {

    @XmlElement(name = "door-opened")
    protected boolean doorOpened;
    @XmlElement(name = "open-time", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime openTime;
    @XmlElement(name = "close-time", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime closeTime;
    @XmlElement(name = "boarding-count")
    @XmlSchemaType(name = "unsignedShort")
    protected int boardingCount;
    @XmlElement(name = "alighting-count")
    @XmlSchemaType(name = "unsignedShort")
    protected int alightingCount;
    protected tcip_4_0_0_local.OBBoardAlightRecord localOBBoardAlightRecord;

    /**
     * Gets the value of the doorOpened property.
     * 
     */
    public boolean isDoorOpened() {
        return doorOpened;
    }

    /**
     * Sets the value of the doorOpened property.
     * 
     */
    public void setDoorOpened(boolean value) {
        this.doorOpened = value;
    }

    /**
     * Gets the value of the openTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getOpenTime() {
        return openTime;
    }

    /**
     * Sets the value of the openTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenTime(DateTime value) {
        this.openTime = value;
    }

    /**
     * Gets the value of the closeTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getCloseTime() {
        return closeTime;
    }

    /**
     * Sets the value of the closeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloseTime(DateTime value) {
        this.closeTime = value;
    }

    /**
     * Gets the value of the boardingCount property.
     * 
     */
    public int getBoardingCount() {
        return boardingCount;
    }

    /**
     * Sets the value of the boardingCount property.
     * 
     */
    public void setBoardingCount(int value) {
        this.boardingCount = value;
    }

    /**
     * Gets the value of the alightingCount property.
     * 
     */
    public int getAlightingCount() {
        return alightingCount;
    }

    /**
     * Sets the value of the alightingCount property.
     * 
     */
    public void setAlightingCount(int value) {
        this.alightingCount = value;
    }

    /**
     * Gets the value of the localOBBoardAlightRecord property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_4_0_0_local.OBBoardAlightRecord }
     *     
     */
    public tcip_4_0_0_local.OBBoardAlightRecord getLocalOBBoardAlightRecord() {
        return localOBBoardAlightRecord;
    }

    /**
     * Sets the value of the localOBBoardAlightRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_4_0_0_local.OBBoardAlightRecord }
     *     
     */
    public void setLocalOBBoardAlightRecord(tcip_4_0_0_local.OBBoardAlightRecord value) {
        this.localOBBoardAlightRecord = value;
    }

}
