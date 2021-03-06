//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package tcip_final_4_0_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for CcPTVAlarmLimits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CcPTVAlarmLimits"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fileHeader" type="{http://www.TCIP-Final-4-0-0}CPTLoadFileHeader"/&gt;
 *         &lt;element name="languages" type="{http://www.TCIP-Final-4-0-0}CPTLanguageList" minOccurs="0"/&gt;
 *         &lt;element name="thresholds" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="100"&gt;
 *                   &lt;element name="threshold" type="{http://www.TCIP-Final-4-0-0}CCParameterThreshold"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="parameterLogRates" type="{http://www.TCIP-Final-4-0-0}CCParameterRateConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="offRouteLogRates" type="{http://www.TCIP-Final-4-0-0}CCActivateRouteAdherence" minOccurs="0"/&gt;
 *         &lt;element name="offRouteReportRates" type="{http://www.TCIP-Final-4-0-0}CCActivateRouteAdherence" minOccurs="0"/&gt;
 *         &lt;element name="offScheduleReportRates" type="{http://www.TCIP-Final-4-0-0}CCActivateScheduleAdherence" minOccurs="0"/&gt;
 *         &lt;element name="manualAlarms" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="100"&gt;
 *                   &lt;element name="manualAlarm" type="{http://www.TCIP-Final-4-0-0}CCManualAlarmDefinition"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="enableCode" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="disableCode" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
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
@XmlType(name = "CcPTVAlarmLimits", propOrder = {
    "fileHeader",
    "languages",
    "thresholds",
    "parameterLogRates",
    "offRouteLogRates",
    "offRouteReportRates",
    "offScheduleReportRates",
    "manualAlarms",
    "enableCode",
    "disableCode"
})
public class CcPTVAlarmLimits {

    @XmlElement(required = true)
    protected CPTLoadFileHeader fileHeader;
    protected CPTLanguageList languages;
    protected CcPTVAlarmLimits.Thresholds thresholds;
    protected CCParameterRateConfiguration parameterLogRates;
    protected CCActivateRouteAdherence offRouteLogRates;
    protected CCActivateRouteAdherence offRouteReportRates;
    protected CCActivateScheduleAdherence offScheduleReportRates;
    protected CcPTVAlarmLimits.ManualAlarms manualAlarms;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger enableCode;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger disableCode;
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
     * Gets the value of the fileHeader property.
     * 
     * @return
     *     possible object is
     *     {@link CPTLoadFileHeader }
     *     
     */
    public CPTLoadFileHeader getFileHeader() {
        return fileHeader;
    }

    /**
     * Sets the value of the fileHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTLoadFileHeader }
     *     
     */
    public void setFileHeader(CPTLoadFileHeader value) {
        this.fileHeader = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link CPTLanguageList }
     *     
     */
    public CPTLanguageList getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTLanguageList }
     *     
     */
    public void setLanguages(CPTLanguageList value) {
        this.languages = value;
    }

    /**
     * Gets the value of the thresholds property.
     * 
     * @return
     *     possible object is
     *     {@link CcPTVAlarmLimits.Thresholds }
     *     
     */
    public CcPTVAlarmLimits.Thresholds getThresholds() {
        return thresholds;
    }

    /**
     * Sets the value of the thresholds property.
     * 
     * @param value
     *     allowed object is
     *     {@link CcPTVAlarmLimits.Thresholds }
     *     
     */
    public void setThresholds(CcPTVAlarmLimits.Thresholds value) {
        this.thresholds = value;
    }

    /**
     * Gets the value of the parameterLogRates property.
     * 
     * @return
     *     possible object is
     *     {@link CCParameterRateConfiguration }
     *     
     */
    public CCParameterRateConfiguration getParameterLogRates() {
        return parameterLogRates;
    }

    /**
     * Sets the value of the parameterLogRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCParameterRateConfiguration }
     *     
     */
    public void setParameterLogRates(CCParameterRateConfiguration value) {
        this.parameterLogRates = value;
    }

    /**
     * Gets the value of the offRouteLogRates property.
     * 
     * @return
     *     possible object is
     *     {@link CCActivateRouteAdherence }
     *     
     */
    public CCActivateRouteAdherence getOffRouteLogRates() {
        return offRouteLogRates;
    }

    /**
     * Sets the value of the offRouteLogRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCActivateRouteAdherence }
     *     
     */
    public void setOffRouteLogRates(CCActivateRouteAdherence value) {
        this.offRouteLogRates = value;
    }

    /**
     * Gets the value of the offRouteReportRates property.
     * 
     * @return
     *     possible object is
     *     {@link CCActivateRouteAdherence }
     *     
     */
    public CCActivateRouteAdherence getOffRouteReportRates() {
        return offRouteReportRates;
    }

    /**
     * Sets the value of the offRouteReportRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCActivateRouteAdherence }
     *     
     */
    public void setOffRouteReportRates(CCActivateRouteAdherence value) {
        this.offRouteReportRates = value;
    }

    /**
     * Gets the value of the offScheduleReportRates property.
     * 
     * @return
     *     possible object is
     *     {@link CCActivateScheduleAdherence }
     *     
     */
    public CCActivateScheduleAdherence getOffScheduleReportRates() {
        return offScheduleReportRates;
    }

    /**
     * Sets the value of the offScheduleReportRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCActivateScheduleAdherence }
     *     
     */
    public void setOffScheduleReportRates(CCActivateScheduleAdherence value) {
        this.offScheduleReportRates = value;
    }

    /**
     * Gets the value of the manualAlarms property.
     * 
     * @return
     *     possible object is
     *     {@link CcPTVAlarmLimits.ManualAlarms }
     *     
     */
    public CcPTVAlarmLimits.ManualAlarms getManualAlarms() {
        return manualAlarms;
    }

    /**
     * Sets the value of the manualAlarms property.
     * 
     * @param value
     *     allowed object is
     *     {@link CcPTVAlarmLimits.ManualAlarms }
     *     
     */
    public void setManualAlarms(CcPTVAlarmLimits.ManualAlarms value) {
        this.manualAlarms = value;
    }

    /**
     * Gets the value of the enableCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnableCode() {
        return enableCode;
    }

    /**
     * Sets the value of the enableCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnableCode(BigInteger value) {
        this.enableCode = value;
    }

    /**
     * Gets the value of the disableCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDisableCode() {
        return disableCode;
    }

    /**
     * Sets the value of the disableCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDisableCode(BigInteger value) {
        this.disableCode = value;
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
     *         &lt;element name="manualAlarm" type="{http://www.TCIP-Final-4-0-0}CCManualAlarmDefinition"/&gt;
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
        "manualAlarm"
    })
    public static class ManualAlarms {

        @XmlElement(required = true)
        protected List<CCManualAlarmDefinition> manualAlarm;

        /**
         * Gets the value of the manualAlarm property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the manualAlarm property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getManualAlarm().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CCManualAlarmDefinition }
         * 
         * 
         */
        public List<CCManualAlarmDefinition> getManualAlarm() {
            if (manualAlarm == null) {
                manualAlarm = new ArrayList<CCManualAlarmDefinition>();
            }
            return this.manualAlarm;
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
     *         &lt;element name="threshold" type="{http://www.TCIP-Final-4-0-0}CCParameterThreshold"/&gt;
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
        "threshold"
    })
    public static class Thresholds {

        @XmlElement(required = true)
        protected List<CCParameterThreshold> threshold;

        /**
         * Gets the value of the threshold property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the threshold property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getThreshold().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CCParameterThreshold }
         * 
         * 
         */
        public List<CCParameterThreshold> getThreshold() {
            if (threshold == null) {
                threshold = new ArrayList<CCParameterThreshold>();
            }
            return this.threshold;
        }

    }

}
