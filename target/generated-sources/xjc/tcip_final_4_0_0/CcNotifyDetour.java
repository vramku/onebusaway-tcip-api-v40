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


/**
 * <p>Java class for CcNotifyDetour complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CcNotifyDetour"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="languages" type="{http://www.TCIP-Final-4-0-0}CPTLanguageList" minOccurs="0"/&gt;
 *         &lt;element name="start-time" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime"/&gt;
 *         &lt;element name="end-time" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="detourID" type="{http://www.TCIP-Final-4-0-0}CC-DetourID"/&gt;
 *         &lt;element name="detour-name" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote"/&gt;
 *         &lt;element name="detour-nameLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="impacts"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="100"&gt;
 *                   &lt;element name="impact" type="{http://www.TCIP-Final-4-0-0}CCDetourRecord"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="detourType" type="{http://www.TCIP-Final-4-0-0}IM-DetourType" minOccurs="0"/&gt;
 *         &lt;element name="localCcNotifyDetour" type="{http://www.tcip-4-0-0-local}CcNotifyDetour" minOccurs="0"/&gt;
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
@XmlType(name = "CcNotifyDetour", propOrder = {
    "languages",
    "startTime",
    "endTime",
    "detourID",
    "detourName",
    "detourNameLangs",
    "impacts",
    "detourType",
    "localCcNotifyDetour"
})
public class CcNotifyDetour {

    protected CPTLanguageList languages;
    @XmlElement(name = "start-time", required = true, type = String.class)
    @XmlJavaTypeAdapter(tcip_final_4_0_0.Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected org.joda.time.DateTime startTime;
    @XmlElement(name = "end-time", type = String.class)
    @XmlJavaTypeAdapter(tcip_final_4_0_0.Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected org.joda.time.DateTime endTime;
    @XmlSchemaType(name = "unsignedByte")
    protected short detourID;
    @XmlElement(name = "detour-name", required = true)
    protected String detourName;
    @XmlElement(name = "detour-nameLangs")
    protected CPTAdditionalLanguageContents detourNameLangs;
    @XmlElement(required = true)
    protected CcNotifyDetour.Impacts impacts;
    @XmlSchemaType(name = "anySimpleType")
    protected String detourType;
    protected tcip_4_0_0_local.CcNotifyDetour localCcNotifyDetour;
    @XmlAttribute(name = "created", required = true)
    @XmlJavaTypeAdapter(org.w3._2001.xmlschema.Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected org.joda.time.DateTime created;
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
    @XmlJavaTypeAdapter(org.w3._2001.xmlschema.Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected org.joda.time.DateTime activation;
    @XmlAttribute(name = "deactivation")
    @XmlJavaTypeAdapter(org.w3._2001.xmlschema.Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected org.joda.time.DateTime deactivation;

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
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.joda.time.DateTime getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(org.joda.time.DateTime value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.joda.time.DateTime getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(org.joda.time.DateTime value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the detourID property.
     * 
     */
    public short getDetourID() {
        return detourID;
    }

    /**
     * Sets the value of the detourID property.
     * 
     */
    public void setDetourID(short value) {
        this.detourID = value;
    }

    /**
     * Gets the value of the detourName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetourName() {
        return detourName;
    }

    /**
     * Sets the value of the detourName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetourName(String value) {
        this.detourName = value;
    }

    /**
     * Gets the value of the detourNameLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getDetourNameLangs() {
        return detourNameLangs;
    }

    /**
     * Sets the value of the detourNameLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setDetourNameLangs(CPTAdditionalLanguageContents value) {
        this.detourNameLangs = value;
    }

    /**
     * Gets the value of the impacts property.
     * 
     * @return
     *     possible object is
     *     {@link CcNotifyDetour.Impacts }
     *     
     */
    public CcNotifyDetour.Impacts getImpacts() {
        return impacts;
    }

    /**
     * Sets the value of the impacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CcNotifyDetour.Impacts }
     *     
     */
    public void setImpacts(CcNotifyDetour.Impacts value) {
        this.impacts = value;
    }

    /**
     * Gets the value of the detourType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetourType() {
        return detourType;
    }

    /**
     * Sets the value of the detourType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetourType(String value) {
        this.detourType = value;
    }

    /**
     * Gets the value of the localCcNotifyDetour property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_4_0_0_local.CcNotifyDetour }
     *     
     */
    public tcip_4_0_0_local.CcNotifyDetour getLocalCcNotifyDetour() {
        return localCcNotifyDetour;
    }

    /**
     * Sets the value of the localCcNotifyDetour property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_4_0_0_local.CcNotifyDetour }
     *     
     */
    public void setLocalCcNotifyDetour(tcip_4_0_0_local.CcNotifyDetour value) {
        this.localCcNotifyDetour = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.joda.time.DateTime getCreated() {
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
    public void setCreated(org.joda.time.DateTime value) {
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
    public org.joda.time.DateTime getActivation() {
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
    public void setActivation(org.joda.time.DateTime value) {
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
    public org.joda.time.DateTime getDeactivation() {
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
    public void setDeactivation(org.joda.time.DateTime value) {
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
     *         &lt;element name="impact" type="{http://www.TCIP-Final-4-0-0}CCDetourRecord"/&gt;
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
        "impact"
    })
    public static class Impacts {

        @XmlElement(required = true)
        protected List<CCDetourRecord> impact;

        /**
         * Gets the value of the impact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the impact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getImpact().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CCDetourRecord }
         * 
         * 
         */
        public List<CCDetourRecord> getImpact() {
            if (impact == null) {
                impact = new ArrayList<CCDetourRecord>();
            }
            return this.impact;
        }

    }

}