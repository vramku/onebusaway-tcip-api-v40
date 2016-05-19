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
import lrms_final_09_07.Distance;


/**
 * <p>Java class for CCStopAnnunciationRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCStopAnnunciationRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stoppoint" type="{http://www.TCIP-Final-4-0-0}CPTStoppointIden"/&gt;
 *         &lt;element name="metadata" type="{http://www.TCIP-Final-4-0-0}CPTRowMetaData"/&gt;
 *         &lt;element name="stop-name-audio" type="{http://www.TCIP-Final-4-0-0}PI-BinaryAudioData" minOccurs="0"/&gt;
 *         &lt;element name="stop-name-text" type="{http://www.TCIP-Final-4-0-0}PI-PIDTakeText" minOccurs="0"/&gt;
 *         &lt;element name="stop-name-textLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="thisstop-audio-filename" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="nextstop-audio-filename" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="thisstop-sign-filename" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="nextstop-sign-filename" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="stop-name-filename" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="stop-distance" type="{http://www.lrms-final-09-07}Distance"/&gt;
 *         &lt;element name="stop-time" type="{http://www.TCIP-Final-4-0-0}CPT-Duration"/&gt;
 *         &lt;element name="disable-before-stop-audio" type="{http://www.TCIP-Final-4-0-0}CPT-Boolean" minOccurs="0"/&gt;
 *         &lt;element name="disable-after-stop-audio" type="{http://www.TCIP-Final-4-0-0}CPT-Boolean" minOccurs="0"/&gt;
 *         &lt;element name="disable-before-stop-text" type="{http://www.TCIP-Final-4-0-0}CPT-Boolean" minOccurs="0"/&gt;
 *         &lt;element name="disable-after-stop-text" type="{http://www.TCIP-Final-4-0-0}CPT-Boolean" minOccurs="0"/&gt;
 *         &lt;element name="tts-stop-name" type="{http://www.TCIP-Final-4-0-0}PI-PIDTakeText" minOccurs="0"/&gt;
 *         &lt;element name="tts-stop-nameLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCStopAnnunciationRecord", propOrder = {
    "stoppoint",
    "metadata",
    "stopNameAudio",
    "stopNameText",
    "stopNameTextLangs",
    "thisstopAudioFilename",
    "nextstopAudioFilename",
    "thisstopSignFilename",
    "nextstopSignFilename",
    "stopNameFilename",
    "stopDistance",
    "stopTime",
    "disableBeforeStopAudio",
    "disableAfterStopAudio",
    "disableBeforeStopText",
    "disableAfterStopText",
    "ttsStopName",
    "ttsStopNameLangs"
})
public class CCStopAnnunciationRecord {

    @XmlElement(required = true)
    protected CPTStoppointIden stoppoint;
    @XmlElement(required = true)
    protected CPTRowMetaData metadata;
    @XmlElement(name = "stop-name-audio")
    protected PIBinaryAudioData stopNameAudio;
    @XmlElement(name = "stop-name-text")
    protected String stopNameText;
    @XmlElement(name = "stop-name-textLangs")
    protected CPTAdditionalLanguageContents stopNameTextLangs;
    @XmlElement(name = "thisstop-audio-filename")
    protected String thisstopAudioFilename;
    @XmlElement(name = "nextstop-audio-filename")
    protected String nextstopAudioFilename;
    @XmlElement(name = "thisstop-sign-filename")
    protected String thisstopSignFilename;
    @XmlElement(name = "nextstop-sign-filename")
    protected String nextstopSignFilename;
    @XmlElement(name = "stop-name-filename")
    protected String stopNameFilename;
    @XmlElement(name = "stop-distance", required = true)
    protected Distance stopDistance;
    @XmlElement(name = "stop-time", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String stopTime;
    @XmlElement(name = "disable-before-stop-audio")
    protected Boolean disableBeforeStopAudio;
    @XmlElement(name = "disable-after-stop-audio")
    protected Boolean disableAfterStopAudio;
    @XmlElement(name = "disable-before-stop-text")
    protected Boolean disableBeforeStopText;
    @XmlElement(name = "disable-after-stop-text")
    protected Boolean disableAfterStopText;
    @XmlElement(name = "tts-stop-name")
    protected String ttsStopName;
    @XmlElement(name = "tts-stop-nameLangs")
    protected CPTAdditionalLanguageContents ttsStopNameLangs;

    /**
     * Gets the value of the stoppoint property.
     * 
     * @return
     *     possible object is
     *     {@link CPTStoppointIden }
     *     
     */
    public CPTStoppointIden getStoppoint() {
        return stoppoint;
    }

    /**
     * Sets the value of the stoppoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTStoppointIden }
     *     
     */
    public void setStoppoint(CPTStoppointIden value) {
        this.stoppoint = value;
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
     * Gets the value of the stopNameAudio property.
     * 
     * @return
     *     possible object is
     *     {@link PIBinaryAudioData }
     *     
     */
    public PIBinaryAudioData getStopNameAudio() {
        return stopNameAudio;
    }

    /**
     * Sets the value of the stopNameAudio property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIBinaryAudioData }
     *     
     */
    public void setStopNameAudio(PIBinaryAudioData value) {
        this.stopNameAudio = value;
    }

    /**
     * Gets the value of the stopNameText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopNameText() {
        return stopNameText;
    }

    /**
     * Sets the value of the stopNameText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopNameText(String value) {
        this.stopNameText = value;
    }

    /**
     * Gets the value of the stopNameTextLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getStopNameTextLangs() {
        return stopNameTextLangs;
    }

    /**
     * Sets the value of the stopNameTextLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setStopNameTextLangs(CPTAdditionalLanguageContents value) {
        this.stopNameTextLangs = value;
    }

    /**
     * Gets the value of the thisstopAudioFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThisstopAudioFilename() {
        return thisstopAudioFilename;
    }

    /**
     * Sets the value of the thisstopAudioFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThisstopAudioFilename(String value) {
        this.thisstopAudioFilename = value;
    }

    /**
     * Gets the value of the nextstopAudioFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextstopAudioFilename() {
        return nextstopAudioFilename;
    }

    /**
     * Sets the value of the nextstopAudioFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextstopAudioFilename(String value) {
        this.nextstopAudioFilename = value;
    }

    /**
     * Gets the value of the thisstopSignFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThisstopSignFilename() {
        return thisstopSignFilename;
    }

    /**
     * Sets the value of the thisstopSignFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThisstopSignFilename(String value) {
        this.thisstopSignFilename = value;
    }

    /**
     * Gets the value of the nextstopSignFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextstopSignFilename() {
        return nextstopSignFilename;
    }

    /**
     * Sets the value of the nextstopSignFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextstopSignFilename(String value) {
        this.nextstopSignFilename = value;
    }

    /**
     * Gets the value of the stopNameFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopNameFilename() {
        return stopNameFilename;
    }

    /**
     * Sets the value of the stopNameFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopNameFilename(String value) {
        this.stopNameFilename = value;
    }

    /**
     * Gets the value of the stopDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getStopDistance() {
        return stopDistance;
    }

    /**
     * Sets the value of the stopDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setStopDistance(Distance value) {
        this.stopDistance = value;
    }

    /**
     * Gets the value of the stopTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopTime() {
        return stopTime;
    }

    /**
     * Sets the value of the stopTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopTime(String value) {
        this.stopTime = value;
    }

    /**
     * Gets the value of the disableBeforeStopAudio property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableBeforeStopAudio() {
        return disableBeforeStopAudio;
    }

    /**
     * Sets the value of the disableBeforeStopAudio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableBeforeStopAudio(Boolean value) {
        this.disableBeforeStopAudio = value;
    }

    /**
     * Gets the value of the disableAfterStopAudio property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableAfterStopAudio() {
        return disableAfterStopAudio;
    }

    /**
     * Sets the value of the disableAfterStopAudio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableAfterStopAudio(Boolean value) {
        this.disableAfterStopAudio = value;
    }

    /**
     * Gets the value of the disableBeforeStopText property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableBeforeStopText() {
        return disableBeforeStopText;
    }

    /**
     * Sets the value of the disableBeforeStopText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableBeforeStopText(Boolean value) {
        this.disableBeforeStopText = value;
    }

    /**
     * Gets the value of the disableAfterStopText property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableAfterStopText() {
        return disableAfterStopText;
    }

    /**
     * Sets the value of the disableAfterStopText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableAfterStopText(Boolean value) {
        this.disableAfterStopText = value;
    }

    /**
     * Gets the value of the ttsStopName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtsStopName() {
        return ttsStopName;
    }

    /**
     * Sets the value of the ttsStopName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtsStopName(String value) {
        this.ttsStopName = value;
    }

    /**
     * Gets the value of the ttsStopNameLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getTtsStopNameLangs() {
        return ttsStopNameLangs;
    }

    /**
     * Sets the value of the ttsStopNameLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setTtsStopNameLangs(CPTAdditionalLanguageContents value) {
        this.ttsStopNameLangs = value;
    }

}