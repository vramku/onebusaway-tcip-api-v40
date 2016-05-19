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
 * <p>Java class for CcOnboardConfigurationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CcOnboardConfigurationData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="file-header" type="{http://www.TCIP-Final-4-0-0}CPTLoadFileHeader"/&gt;
 *         &lt;element name="languages" type="{http://www.TCIP-Final-4-0-0}CPTLanguageList" minOccurs="0"/&gt;
 *         &lt;element name="software-description" type="{http://www.TCIP-Final-4-0-0}OBSWComponent"/&gt;
 *         &lt;element name="configurationDataSets"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="10"&gt;
 *                   &lt;element name="configurationDataSet" type="{http://www.TCIP-Final-4-0-0}CC-ConfigurationData"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="localCcOnboardConfigurationData" type="{http://www.tcip-4-0-0-local}CcOnboardConfigurationData" minOccurs="0"/&gt;
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
@XmlType(name = "CcOnboardConfigurationData", propOrder = {
    "fileHeader",
    "languages",
    "softwareDescription",
    "configurationDataSets",
    "localCcOnboardConfigurationData"
})
public class CcOnboardConfigurationData {

    @XmlElement(name = "file-header", required = true)
    protected CPTLoadFileHeader fileHeader;
    protected CPTLanguageList languages;
    @XmlElement(name = "software-description", required = true)
    protected OBSWComponent softwareDescription;
    @XmlElement(required = true)
    protected CcOnboardConfigurationData.ConfigurationDataSets configurationDataSets;
    protected tcip_4_0_0_local.CcOnboardConfigurationData localCcOnboardConfigurationData;
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
     * Gets the value of the softwareDescription property.
     * 
     * @return
     *     possible object is
     *     {@link OBSWComponent }
     *     
     */
    public OBSWComponent getSoftwareDescription() {
        return softwareDescription;
    }

    /**
     * Sets the value of the softwareDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBSWComponent }
     *     
     */
    public void setSoftwareDescription(OBSWComponent value) {
        this.softwareDescription = value;
    }

    /**
     * Gets the value of the configurationDataSets property.
     * 
     * @return
     *     possible object is
     *     {@link CcOnboardConfigurationData.ConfigurationDataSets }
     *     
     */
    public CcOnboardConfigurationData.ConfigurationDataSets getConfigurationDataSets() {
        return configurationDataSets;
    }

    /**
     * Sets the value of the configurationDataSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link CcOnboardConfigurationData.ConfigurationDataSets }
     *     
     */
    public void setConfigurationDataSets(CcOnboardConfigurationData.ConfigurationDataSets value) {
        this.configurationDataSets = value;
    }

    /**
     * Gets the value of the localCcOnboardConfigurationData property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_4_0_0_local.CcOnboardConfigurationData }
     *     
     */
    public tcip_4_0_0_local.CcOnboardConfigurationData getLocalCcOnboardConfigurationData() {
        return localCcOnboardConfigurationData;
    }

    /**
     * Sets the value of the localCcOnboardConfigurationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_4_0_0_local.CcOnboardConfigurationData }
     *     
     */
    public void setLocalCcOnboardConfigurationData(tcip_4_0_0_local.CcOnboardConfigurationData value) {
        this.localCcOnboardConfigurationData = value;
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
     *       &lt;sequence maxOccurs="10"&gt;
     *         &lt;element name="configurationDataSet" type="{http://www.TCIP-Final-4-0-0}CC-ConfigurationData"/&gt;
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
        "configurationDataSet"
    })
    public static class ConfigurationDataSets {

        @XmlElement(required = true)
        protected List<CCConfigurationData> configurationDataSet;

        /**
         * Gets the value of the configurationDataSet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the configurationDataSet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConfigurationDataSet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CCConfigurationData }
         * 
         * 
         */
        public List<CCConfigurationData> getConfigurationDataSet() {
            if (configurationDataSet == null) {
                configurationDataSet = new ArrayList<CCConfigurationData>();
            }
            return this.configurationDataSet;
        }

    }

}
