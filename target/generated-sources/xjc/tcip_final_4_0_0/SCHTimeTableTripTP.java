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
 * <p>Java class for SCHTimeTableTripTP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCHTimeTableTripTP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timepoint-iden" type="{http://www.TCIP-Final-4-0-0}SCHTimepointIden"/&gt;
 *         &lt;element name="trip-timepoint-time" type="{http://www.TCIP-Final-4-0-0}SCH-Time"/&gt;
 *         &lt;element name="note" type="{http://www.TCIP-Final-4-0-0}SCHNoteIden" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCHTimeTableTripTP", propOrder = {
    "timepointIden",
    "tripTimepointTime",
    "note"
})
public class SCHTimeTableTripTP {

    @XmlElement(name = "timepoint-iden", required = true)
    protected SCHTimepointIden timepointIden;
    @XmlElement(name = "trip-timepoint-time")
    protected long tripTimepointTime;
    protected SCHNoteIden note;

    /**
     * Gets the value of the timepointIden property.
     * 
     * @return
     *     possible object is
     *     {@link SCHTimepointIden }
     *     
     */
    public SCHTimepointIden getTimepointIden() {
        return timepointIden;
    }

    /**
     * Sets the value of the timepointIden property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHTimepointIden }
     *     
     */
    public void setTimepointIden(SCHTimepointIden value) {
        this.timepointIden = value;
    }

    /**
     * Gets the value of the tripTimepointTime property.
     * 
     */
    public long getTripTimepointTime() {
        return tripTimepointTime;
    }

    /**
     * Sets the value of the tripTimepointTime property.
     * 
     */
    public void setTripTimepointTime(long value) {
        this.tripTimepointTime = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link SCHNoteIden }
     *     
     */
    public SCHNoteIden getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHNoteIden }
     *     
     */
    public void setNote(SCHNoteIden value) {
        this.note = value;
    }

}