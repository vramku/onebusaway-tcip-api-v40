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
 * <p>Java class for SchTimepointList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchTimepointList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriptionInfo" type="{http://www.TCIP-Final-4-0-0}CPTSubscriptionHeader"/&gt;
 *         &lt;element name="languages" type="{http://www.TCIP-Final-4-0-0}CPTLanguageList" minOccurs="0"/&gt;
 *         &lt;element name="update-since" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="timepointVersion" type="{http://www.TCIP-Final-4-0-0}SCH-TimetableVersionID" minOccurs="0"/&gt;
 *         &lt;element name="effective" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime"/&gt;
 *         &lt;element name="expires" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="timepoints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="10000"&gt;
 *                   &lt;element name="timepoint" type="{http://www.TCIP-Final-4-0-0}SCHTimepointInfo"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="deleted-timepoints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="25000"&gt;
 *                   &lt;element name="deleted-timepoint" type="{http://www.TCIP-Final-4-0-0}SCHTimepointIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "SchTimepointList", propOrder = {
    "subscriptionInfo",
    "languages",
    "updateSince",
    "timepointVersion",
    "effective",
    "expires",
    "timepoints",
    "deletedTimepoints"
})
public class SchTimepointList {

    @XmlElement(required = true)
    protected CPTSubscriptionHeader subscriptionInfo;
    protected CPTLanguageList languages;
    @XmlElement(name = "update-since", type = String.class)
    @XmlJavaTypeAdapter(tcip_final_4_0_0.Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected org.joda.time.DateTime updateSince;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger timepointVersion;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(tcip_final_4_0_0.Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected org.joda.time.DateTime effective;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(tcip_final_4_0_0.Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected org.joda.time.DateTime expires;
    protected SchTimepointList.Timepoints timepoints;
    @XmlElement(name = "deleted-timepoints")
    protected SchTimepointList.DeletedTimepoints deletedTimepoints;
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
     * Gets the value of the subscriptionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CPTSubscriptionHeader }
     *     
     */
    public CPTSubscriptionHeader getSubscriptionInfo() {
        return subscriptionInfo;
    }

    /**
     * Sets the value of the subscriptionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTSubscriptionHeader }
     *     
     */
    public void setSubscriptionInfo(CPTSubscriptionHeader value) {
        this.subscriptionInfo = value;
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
     * Gets the value of the updateSince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.joda.time.DateTime getUpdateSince() {
        return updateSince;
    }

    /**
     * Sets the value of the updateSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateSince(org.joda.time.DateTime value) {
        this.updateSince = value;
    }

    /**
     * Gets the value of the timepointVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimepointVersion() {
        return timepointVersion;
    }

    /**
     * Sets the value of the timepointVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimepointVersion(BigInteger value) {
        this.timepointVersion = value;
    }

    /**
     * Gets the value of the effective property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.joda.time.DateTime getEffective() {
        return effective;
    }

    /**
     * Sets the value of the effective property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffective(org.joda.time.DateTime value) {
        this.effective = value;
    }

    /**
     * Gets the value of the expires property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.joda.time.DateTime getExpires() {
        return expires;
    }

    /**
     * Sets the value of the expires property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpires(org.joda.time.DateTime value) {
        this.expires = value;
    }

    /**
     * Gets the value of the timepoints property.
     * 
     * @return
     *     possible object is
     *     {@link SchTimepointList.Timepoints }
     *     
     */
    public SchTimepointList.Timepoints getTimepoints() {
        return timepoints;
    }

    /**
     * Sets the value of the timepoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchTimepointList.Timepoints }
     *     
     */
    public void setTimepoints(SchTimepointList.Timepoints value) {
        this.timepoints = value;
    }

    /**
     * Gets the value of the deletedTimepoints property.
     * 
     * @return
     *     possible object is
     *     {@link SchTimepointList.DeletedTimepoints }
     *     
     */
    public SchTimepointList.DeletedTimepoints getDeletedTimepoints() {
        return deletedTimepoints;
    }

    /**
     * Sets the value of the deletedTimepoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchTimepointList.DeletedTimepoints }
     *     
     */
    public void setDeletedTimepoints(SchTimepointList.DeletedTimepoints value) {
        this.deletedTimepoints = value;
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
     *       &lt;sequence maxOccurs="25000"&gt;
     *         &lt;element name="deleted-timepoint" type="{http://www.TCIP-Final-4-0-0}SCHTimepointIden"/&gt;
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
        "deletedTimepoint"
    })
    public static class DeletedTimepoints {

        @XmlElement(name = "deleted-timepoint", required = true)
        protected List<SCHTimepointIden> deletedTimepoint;

        /**
         * Gets the value of the deletedTimepoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deletedTimepoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDeletedTimepoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHTimepointIden }
         * 
         * 
         */
        public List<SCHTimepointIden> getDeletedTimepoint() {
            if (deletedTimepoint == null) {
                deletedTimepoint = new ArrayList<SCHTimepointIden>();
            }
            return this.deletedTimepoint;
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
     *       &lt;sequence maxOccurs="10000"&gt;
     *         &lt;element name="timepoint" type="{http://www.TCIP-Final-4-0-0}SCHTimepointInfo"/&gt;
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
        "timepoint"
    })
    public static class Timepoints {

        @XmlElement(required = true)
        protected List<SCHTimepointInfo> timepoint;

        /**
         * Gets the value of the timepoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the timepoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTimepoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHTimepointInfo }
         * 
         * 
         */
        public List<SCHTimepointInfo> getTimepoint() {
            if (timepoint == null) {
                timepoint = new ArrayList<SCHTimepointInfo>();
            }
            return this.timepoint;
        }

    }

}
