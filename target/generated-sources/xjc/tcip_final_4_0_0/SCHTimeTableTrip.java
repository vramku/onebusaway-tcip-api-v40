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


/**
 * <p>Java class for SCHTimeTableTrip complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCHTimeTableTrip"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="trip" type="{http://www.TCIP-Final-4-0-0}SCHTripIden"/&gt;
 *         &lt;element name="trip-note" type="{http://www.TCIP-Final-4-0-0}SCHNoteIden" minOccurs="0"/&gt;
 *         &lt;element name="mode" type="{http://www.TCIP-Final-4-0-0}CPT-Mode" minOccurs="0"/&gt;
 *         &lt;element name="amenities" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="32"&gt;
 *                   &lt;element name="amenitie" type="{http://www.atis-partial-03-00-74}AmenitiesList"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="trip-timepoints"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="100"&gt;
 *                   &lt;element name="trip-timepoint" type="{http://www.TCIP-Final-4-0-0}SCHTimeTableTripTP"/&gt;
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
@XmlType(name = "SCHTimeTableTrip", propOrder = {
    "trip",
    "tripNote",
    "mode",
    "amenities",
    "tripTimepoints"
})
public class SCHTimeTableTrip {

    @XmlElement(required = true)
    protected SCHTripIden trip;
    @XmlElement(name = "trip-note")
    protected SCHNoteIden tripNote;
    protected String mode;
    protected SCHTimeTableTrip.Amenities amenities;
    @XmlElement(name = "trip-timepoints", required = true)
    protected SCHTimeTableTrip.TripTimepoints tripTimepoints;

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
     * Gets the value of the tripNote property.
     * 
     * @return
     *     possible object is
     *     {@link SCHNoteIden }
     *     
     */
    public SCHNoteIden getTripNote() {
        return tripNote;
    }

    /**
     * Sets the value of the tripNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHNoteIden }
     *     
     */
    public void setTripNote(SCHNoteIden value) {
        this.tripNote = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the amenities property.
     * 
     * @return
     *     possible object is
     *     {@link SCHTimeTableTrip.Amenities }
     *     
     */
    public SCHTimeTableTrip.Amenities getAmenities() {
        return amenities;
    }

    /**
     * Sets the value of the amenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHTimeTableTrip.Amenities }
     *     
     */
    public void setAmenities(SCHTimeTableTrip.Amenities value) {
        this.amenities = value;
    }

    /**
     * Gets the value of the tripTimepoints property.
     * 
     * @return
     *     possible object is
     *     {@link SCHTimeTableTrip.TripTimepoints }
     *     
     */
    public SCHTimeTableTrip.TripTimepoints getTripTimepoints() {
        return tripTimepoints;
    }

    /**
     * Sets the value of the tripTimepoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHTimeTableTrip.TripTimepoints }
     *     
     */
    public void setTripTimepoints(SCHTimeTableTrip.TripTimepoints value) {
        this.tripTimepoints = value;
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
     *       &lt;sequence maxOccurs="32"&gt;
     *         &lt;element name="amenitie" type="{http://www.atis-partial-03-00-74}AmenitiesList"/&gt;
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
        "amenitie"
    })
    public static class Amenities {

        @XmlElement(required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected List<String> amenitie;

        /**
         * Gets the value of the amenitie property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the amenitie property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAmenitie().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAmenitie() {
            if (amenitie == null) {
                amenitie = new ArrayList<String>();
            }
            return this.amenitie;
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
     *         &lt;element name="trip-timepoint" type="{http://www.TCIP-Final-4-0-0}SCHTimeTableTripTP"/&gt;
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
        "tripTimepoint"
    })
    public static class TripTimepoints {

        @XmlElement(name = "trip-timepoint", required = true)
        protected List<SCHTimeTableTripTP> tripTimepoint;

        /**
         * Gets the value of the tripTimepoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tripTimepoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTripTimepoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHTimeTableTripTP }
         * 
         * 
         */
        public List<SCHTimeTableTripTP> getTripTimepoint() {
            if (tripTimepoint == null) {
                tripTimepoint = new ArrayList<SCHTimeTableTripTP>();
            }
            return this.tripTimepoint;
        }

    }

}