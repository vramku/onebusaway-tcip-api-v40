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
import lrms_final_09_07.GeoLocation;


/**
 * <p>Java class for SCHBlockScheduleEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCHBlockScheduleEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="block" type="{http://www.TCIP-Final-4-0-0}SCHBlockIden"/&gt;
 *         &lt;element name="metadata" type="{http://www.TCIP-Final-4-0-0}CPTRowMetaData"/&gt;
 *         &lt;element name="pullOutTime" type="{http://www.TCIP-Final-4-0-0}SCH-Time"/&gt;
 *         &lt;element name="pullInTime" type="{http://www.TCIP-Final-4-0-0}SCH-Time"/&gt;
 *         &lt;element name="pullOutLocation" type="{http://www.lrms-final-09-07}GeoLocation"/&gt;
 *         &lt;element name="pullInLocation" type="{http://www.lrms-final-09-07}GeoLocation"/&gt;
 *         &lt;element name="day-types"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="20"&gt;
 *                   &lt;element name="day-type" type="{http://www.TCIP-Final-4-0-0}SCH-DayType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="trip-details"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="100"&gt;
 *                   &lt;element name="trip-detail" type="{http://www.TCIP-Final-4-0-0}SCHTripInfo"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="begin-timepoint" type="{http://www.TCIP-Final-4-0-0}SCHTimepointIden" minOccurs="0"/&gt;
 *         &lt;element name="end-timepoint" type="{http://www.TCIP-Final-4-0-0}SCHTimepointIden" minOccurs="0"/&gt;
 *         &lt;element name="block-notes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="100"&gt;
 *                   &lt;element name="block-note" type="{http://www.TCIP-Final-4-0-0}SCHNoteIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="localSCHBlockScheduleEntry" type="{http://www.tcip-4-0-0-local}SCHBlockScheduleEntry" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCHBlockScheduleEntry", propOrder = {
    "block",
    "metadata",
    "pullOutTime",
    "pullInTime",
    "pullOutLocation",
    "pullInLocation",
    "dayTypes",
    "tripDetails",
    "beginTimepoint",
    "endTimepoint",
    "blockNotes",
    "localSCHBlockScheduleEntry"
})
public class SCHBlockScheduleEntry {

    @XmlElement(required = true)
    protected SCHBlockIden block;
    @XmlElement(required = true)
    protected CPTRowMetaData metadata;
    protected long pullOutTime;
    protected long pullInTime;
    @XmlElement(required = true)
    protected GeoLocation pullOutLocation;
    @XmlElement(required = true)
    protected GeoLocation pullInLocation;
    @XmlElement(name = "day-types", required = true)
    protected SCHBlockScheduleEntry.DayTypes dayTypes;
    @XmlElement(name = "trip-details", required = true)
    protected SCHBlockScheduleEntry.TripDetails tripDetails;
    @XmlElement(name = "begin-timepoint")
    protected SCHTimepointIden beginTimepoint;
    @XmlElement(name = "end-timepoint")
    protected SCHTimepointIden endTimepoint;
    @XmlElement(name = "block-notes")
    protected SCHBlockScheduleEntry.BlockNotes blockNotes;
    protected tcip_4_0_0_local.SCHBlockScheduleEntry localSCHBlockScheduleEntry;

    /**
     * Gets the value of the block property.
     * 
     * @return
     *     possible object is
     *     {@link SCHBlockIden }
     *     
     */
    public SCHBlockIden getBlock() {
        return block;
    }

    /**
     * Sets the value of the block property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHBlockIden }
     *     
     */
    public void setBlock(SCHBlockIden value) {
        this.block = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link CPTRowMetaData }
     *     
     */
    public CPTRowMetaData getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTRowMetaData }
     *     
     */
    public void setMetadata(CPTRowMetaData value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the pullOutTime property.
     * 
     */
    public long getPullOutTime() {
        return pullOutTime;
    }

    /**
     * Sets the value of the pullOutTime property.
     * 
     */
    public void setPullOutTime(long value) {
        this.pullOutTime = value;
    }

    /**
     * Gets the value of the pullInTime property.
     * 
     */
    public long getPullInTime() {
        return pullInTime;
    }

    /**
     * Sets the value of the pullInTime property.
     * 
     */
    public void setPullInTime(long value) {
        this.pullInTime = value;
    }

    /**
     * Gets the value of the pullOutLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getPullOutLocation() {
        return pullOutLocation;
    }

    /**
     * Sets the value of the pullOutLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setPullOutLocation(GeoLocation value) {
        this.pullOutLocation = value;
    }

    /**
     * Gets the value of the pullInLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getPullInLocation() {
        return pullInLocation;
    }

    /**
     * Sets the value of the pullInLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setPullInLocation(GeoLocation value) {
        this.pullInLocation = value;
    }

    /**
     * Gets the value of the dayTypes property.
     * 
     * @return
     *     possible object is
     *     {@link SCHBlockScheduleEntry.DayTypes }
     *     
     */
    public SCHBlockScheduleEntry.DayTypes getDayTypes() {
        return dayTypes;
    }

    /**
     * Sets the value of the dayTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHBlockScheduleEntry.DayTypes }
     *     
     */
    public void setDayTypes(SCHBlockScheduleEntry.DayTypes value) {
        this.dayTypes = value;
    }

    /**
     * Gets the value of the tripDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SCHBlockScheduleEntry.TripDetails }
     *     
     */
    public SCHBlockScheduleEntry.TripDetails getTripDetails() {
        return tripDetails;
    }

    /**
     * Sets the value of the tripDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHBlockScheduleEntry.TripDetails }
     *     
     */
    public void setTripDetails(SCHBlockScheduleEntry.TripDetails value) {
        this.tripDetails = value;
    }

    /**
     * Gets the value of the beginTimepoint property.
     * 
     * @return
     *     possible object is
     *     {@link SCHTimepointIden }
     *     
     */
    public SCHTimepointIden getBeginTimepoint() {
        return beginTimepoint;
    }

    /**
     * Sets the value of the beginTimepoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHTimepointIden }
     *     
     */
    public void setBeginTimepoint(SCHTimepointIden value) {
        this.beginTimepoint = value;
    }

    /**
     * Gets the value of the endTimepoint property.
     * 
     * @return
     *     possible object is
     *     {@link SCHTimepointIden }
     *     
     */
    public SCHTimepointIden getEndTimepoint() {
        return endTimepoint;
    }

    /**
     * Sets the value of the endTimepoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHTimepointIden }
     *     
     */
    public void setEndTimepoint(SCHTimepointIden value) {
        this.endTimepoint = value;
    }

    /**
     * Gets the value of the blockNotes property.
     * 
     * @return
     *     possible object is
     *     {@link SCHBlockScheduleEntry.BlockNotes }
     *     
     */
    public SCHBlockScheduleEntry.BlockNotes getBlockNotes() {
        return blockNotes;
    }

    /**
     * Sets the value of the blockNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHBlockScheduleEntry.BlockNotes }
     *     
     */
    public void setBlockNotes(SCHBlockScheduleEntry.BlockNotes value) {
        this.blockNotes = value;
    }

    /**
     * Gets the value of the localSCHBlockScheduleEntry property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_4_0_0_local.SCHBlockScheduleEntry }
     *     
     */
    public tcip_4_0_0_local.SCHBlockScheduleEntry getLocalSCHBlockScheduleEntry() {
        return localSCHBlockScheduleEntry;
    }

    /**
     * Sets the value of the localSCHBlockScheduleEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_4_0_0_local.SCHBlockScheduleEntry }
     *     
     */
    public void setLocalSCHBlockScheduleEntry(tcip_4_0_0_local.SCHBlockScheduleEntry value) {
        this.localSCHBlockScheduleEntry = value;
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
     *         &lt;element name="block-note" type="{http://www.TCIP-Final-4-0-0}SCHNoteIden"/&gt;
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
        "blockNote"
    })
    public static class BlockNotes {

        @XmlElement(name = "block-note", required = true)
        protected List<SCHNoteIden> blockNote;

        /**
         * Gets the value of the blockNote property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the blockNote property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBlockNote().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHNoteIden }
         * 
         * 
         */
        public List<SCHNoteIden> getBlockNote() {
            if (blockNote == null) {
                blockNote = new ArrayList<SCHNoteIden>();
            }
            return this.blockNote;
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
     *       &lt;sequence maxOccurs="20"&gt;
     *         &lt;element name="day-type" type="{http://www.TCIP-Final-4-0-0}SCH-DayType"/&gt;
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
        "dayType"
    })
    public static class DayTypes {

        @XmlElement(name = "day-type", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected List<String> dayType;

        /**
         * Gets the value of the dayType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dayType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDayType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDayType() {
            if (dayType == null) {
                dayType = new ArrayList<String>();
            }
            return this.dayType;
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
     *         &lt;element name="trip-detail" type="{http://www.TCIP-Final-4-0-0}SCHTripInfo"/&gt;
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
        "tripDetail"
    })
    public static class TripDetails {

        @XmlElement(name = "trip-detail", required = true)
        protected List<SCHTripInfo> tripDetail;

        /**
         * Gets the value of the tripDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tripDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTripDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHTripInfo }
         * 
         * 
         */
        public List<SCHTripInfo> getTripDetail() {
            if (tripDetail == null) {
                tripDetail = new ArrayList<SCHTripInfo>();
            }
            return this.tripDetail;
        }

    }

}
