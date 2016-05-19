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
 * <p>Java class for SCHNoteInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCHNoteInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="note" type="{http://www.TCIP-Final-4-0-0}SCHNoteIden"/&gt;
 *         &lt;element name="metadata" type="{http://www.TCIP-Final-4-0-0}CPTRowMetaData" minOccurs="0"/&gt;
 *         &lt;element name="public" type="{http://www.TCIP-Final-4-0-0}CPT-Boolean"/&gt;
 *         &lt;element name="note-text" type="{http://www.TCIP-Final-4-0-0}SCH-NoteMsg"/&gt;
 *         &lt;element name="note-textLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="pointLatitude" type="{http://www.lrms-final-09-07}Latitude" minOccurs="0"/&gt;
 *         &lt;element name="pointLongitude" type="{http://www.lrms-final-09-07}Longitude" minOccurs="0"/&gt;
 *         &lt;element name="localSCHNoteInfo" type="{http://www.tcip-4-0-0-local}SCHNoteInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCHNoteInfo", propOrder = {
    "note",
    "metadata",
    "_public",
    "noteText",
    "noteTextLangs",
    "pointLatitude",
    "pointLongitude",
    "localSCHNoteInfo"
})
public class SCHNoteInfo {

    @XmlElement(required = true)
    protected SCHNoteIden note;
    protected CPTRowMetaData metadata;
    @XmlElement(name = "public")
    protected boolean _public;
    @XmlElement(name = "note-text", required = true)
    protected String noteText;
    @XmlElement(name = "note-textLangs")
    protected CPTAdditionalLanguageContents noteTextLangs;
    protected Integer pointLatitude;
    protected Integer pointLongitude;
    protected tcip_4_0_0_local.SCHNoteInfo localSCHNoteInfo;

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
     * Gets the value of the public property.
     * 
     */
    public boolean isPublic() {
        return _public;
    }

    /**
     * Sets the value of the public property.
     * 
     */
    public void setPublic(boolean value) {
        this._public = value;
    }

    /**
     * Gets the value of the noteText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteText() {
        return noteText;
    }

    /**
     * Sets the value of the noteText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteText(String value) {
        this.noteText = value;
    }

    /**
     * Gets the value of the noteTextLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getNoteTextLangs() {
        return noteTextLangs;
    }

    /**
     * Sets the value of the noteTextLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setNoteTextLangs(CPTAdditionalLanguageContents value) {
        this.noteTextLangs = value;
    }

    /**
     * Gets the value of the pointLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPointLatitude() {
        return pointLatitude;
    }

    /**
     * Sets the value of the pointLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPointLatitude(Integer value) {
        this.pointLatitude = value;
    }

    /**
     * Gets the value of the pointLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPointLongitude() {
        return pointLongitude;
    }

    /**
     * Sets the value of the pointLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPointLongitude(Integer value) {
        this.pointLongitude = value;
    }

    /**
     * Gets the value of the localSCHNoteInfo property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_4_0_0_local.SCHNoteInfo }
     *     
     */
    public tcip_4_0_0_local.SCHNoteInfo getLocalSCHNoteInfo() {
        return localSCHNoteInfo;
    }

    /**
     * Sets the value of the localSCHNoteInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_4_0_0_local.SCHNoteInfo }
     *     
     */
    public void setLocalSCHNoteInfo(tcip_4_0_0_local.SCHNoteInfo value) {
        this.localSCHNoteInfo = value;
    }

}
