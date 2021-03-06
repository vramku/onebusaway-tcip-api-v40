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
 * <p>Java class for SchRunScheduleList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchRunScheduleList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriptionInfo" type="{http://www.TCIP-Final-4-0-0}CPTSubscriptionHeader"/&gt;
 *         &lt;element name="languages" type="{http://www.TCIP-Final-4-0-0}CPTLanguageList" minOccurs="0"/&gt;
 *         &lt;element name="effective" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime"/&gt;
 *         &lt;element name="specific-garages" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="10"&gt;
 *                   &lt;element name="specific-garage" type="{http://www.TCIP-Final-4-0-0}CPTOperatorBaseIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="specific-runs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="10000"&gt;
 *                   &lt;element name="specific-run" type="{http://www.TCIP-Final-4-0-0}SCHRunIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="update-since" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="sched-runs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="10000"&gt;
 *                   &lt;element name="sched-run" type="{http://www.TCIP-Final-4-0-0}SCHRunScheduleEntry"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="deleted-runs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="10000"&gt;
 *                   &lt;element name="deleted-run" type="{http://www.TCIP-Final-4-0-0}SCHRunIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="notes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="2000"&gt;
 *                   &lt;element name="note" type="{http://www.TCIP-Final-4-0-0}SCHNoteInfo"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="consistChanges" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="20000"&gt;
 *                   &lt;element name="consistChange" type="{http://www.TCIP-Final-4-0-0}SCHConsistChangeEvent"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="localSchRunScheduleList" type="{http://www.tcip-4-0-0-local}SchRunScheduleList" minOccurs="0"/&gt;
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
@XmlType(name = "SchRunScheduleList", propOrder = {
    "subscriptionInfo",
    "languages",
    "effective",
    "specificGarages",
    "specificRuns",
    "updateSince",
    "schedRuns",
    "deletedRuns",
    "notes",
    "consistChanges",
    "localSchRunScheduleList"
})
public class SchRunScheduleList {

    @XmlElement(required = true)
    protected CPTSubscriptionHeader subscriptionInfo;
    protected CPTLanguageList languages;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(tcip_final_4_0_0.Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected org.joda.time.DateTime effective;
    @XmlElement(name = "specific-garages")
    protected SchRunScheduleList.SpecificGarages specificGarages;
    @XmlElement(name = "specific-runs")
    protected SchRunScheduleList.SpecificRuns specificRuns;
    @XmlElement(name = "update-since", type = String.class)
    @XmlJavaTypeAdapter(tcip_final_4_0_0.Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected org.joda.time.DateTime updateSince;
    @XmlElement(name = "sched-runs")
    protected SchRunScheduleList.SchedRuns schedRuns;
    @XmlElement(name = "deleted-runs")
    protected SchRunScheduleList.DeletedRuns deletedRuns;
    protected SchRunScheduleList.Notes notes;
    protected SchRunScheduleList.ConsistChanges consistChanges;
    protected tcip_4_0_0_local.SchRunScheduleList localSchRunScheduleList;
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
     * Gets the value of the specificGarages property.
     * 
     * @return
     *     possible object is
     *     {@link SchRunScheduleList.SpecificGarages }
     *     
     */
    public SchRunScheduleList.SpecificGarages getSpecificGarages() {
        return specificGarages;
    }

    /**
     * Sets the value of the specificGarages property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchRunScheduleList.SpecificGarages }
     *     
     */
    public void setSpecificGarages(SchRunScheduleList.SpecificGarages value) {
        this.specificGarages = value;
    }

    /**
     * Gets the value of the specificRuns property.
     * 
     * @return
     *     possible object is
     *     {@link SchRunScheduleList.SpecificRuns }
     *     
     */
    public SchRunScheduleList.SpecificRuns getSpecificRuns() {
        return specificRuns;
    }

    /**
     * Sets the value of the specificRuns property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchRunScheduleList.SpecificRuns }
     *     
     */
    public void setSpecificRuns(SchRunScheduleList.SpecificRuns value) {
        this.specificRuns = value;
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
     * Gets the value of the schedRuns property.
     * 
     * @return
     *     possible object is
     *     {@link SchRunScheduleList.SchedRuns }
     *     
     */
    public SchRunScheduleList.SchedRuns getSchedRuns() {
        return schedRuns;
    }

    /**
     * Sets the value of the schedRuns property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchRunScheduleList.SchedRuns }
     *     
     */
    public void setSchedRuns(SchRunScheduleList.SchedRuns value) {
        this.schedRuns = value;
    }

    /**
     * Gets the value of the deletedRuns property.
     * 
     * @return
     *     possible object is
     *     {@link SchRunScheduleList.DeletedRuns }
     *     
     */
    public SchRunScheduleList.DeletedRuns getDeletedRuns() {
        return deletedRuns;
    }

    /**
     * Sets the value of the deletedRuns property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchRunScheduleList.DeletedRuns }
     *     
     */
    public void setDeletedRuns(SchRunScheduleList.DeletedRuns value) {
        this.deletedRuns = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link SchRunScheduleList.Notes }
     *     
     */
    public SchRunScheduleList.Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchRunScheduleList.Notes }
     *     
     */
    public void setNotes(SchRunScheduleList.Notes value) {
        this.notes = value;
    }

    /**
     * Gets the value of the consistChanges property.
     * 
     * @return
     *     possible object is
     *     {@link SchRunScheduleList.ConsistChanges }
     *     
     */
    public SchRunScheduleList.ConsistChanges getConsistChanges() {
        return consistChanges;
    }

    /**
     * Sets the value of the consistChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchRunScheduleList.ConsistChanges }
     *     
     */
    public void setConsistChanges(SchRunScheduleList.ConsistChanges value) {
        this.consistChanges = value;
    }

    /**
     * Gets the value of the localSchRunScheduleList property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_4_0_0_local.SchRunScheduleList }
     *     
     */
    public tcip_4_0_0_local.SchRunScheduleList getLocalSchRunScheduleList() {
        return localSchRunScheduleList;
    }

    /**
     * Sets the value of the localSchRunScheduleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_4_0_0_local.SchRunScheduleList }
     *     
     */
    public void setLocalSchRunScheduleList(tcip_4_0_0_local.SchRunScheduleList value) {
        this.localSchRunScheduleList = value;
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
     *       &lt;sequence maxOccurs="20000"&gt;
     *         &lt;element name="consistChange" type="{http://www.TCIP-Final-4-0-0}SCHConsistChangeEvent"/&gt;
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
        "consistChange"
    })
    public static class ConsistChanges {

        @XmlElement(required = true)
        protected List<SCHConsistChangeEvent> consistChange;

        /**
         * Gets the value of the consistChange property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the consistChange property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConsistChange().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHConsistChangeEvent }
         * 
         * 
         */
        public List<SCHConsistChangeEvent> getConsistChange() {
            if (consistChange == null) {
                consistChange = new ArrayList<SCHConsistChangeEvent>();
            }
            return this.consistChange;
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
     *         &lt;element name="deleted-run" type="{http://www.TCIP-Final-4-0-0}SCHRunIden"/&gt;
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
        "deletedRun"
    })
    public static class DeletedRuns {

        @XmlElement(name = "deleted-run", required = true)
        protected List<SCHRunIden> deletedRun;

        /**
         * Gets the value of the deletedRun property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deletedRun property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDeletedRun().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHRunIden }
         * 
         * 
         */
        public List<SCHRunIden> getDeletedRun() {
            if (deletedRun == null) {
                deletedRun = new ArrayList<SCHRunIden>();
            }
            return this.deletedRun;
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
     *       &lt;sequence maxOccurs="2000"&gt;
     *         &lt;element name="note" type="{http://www.TCIP-Final-4-0-0}SCHNoteInfo"/&gt;
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
        "note"
    })
    public static class Notes {

        @XmlElement(required = true)
        protected List<SCHNoteInfo> note;

        /**
         * Gets the value of the note property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the note property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNote().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHNoteInfo }
         * 
         * 
         */
        public List<SCHNoteInfo> getNote() {
            if (note == null) {
                note = new ArrayList<SCHNoteInfo>();
            }
            return this.note;
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
     *         &lt;element name="sched-run" type="{http://www.TCIP-Final-4-0-0}SCHRunScheduleEntry"/&gt;
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
        "schedRun"
    })
    public static class SchedRuns {

        @XmlElement(name = "sched-run", required = true)
        protected List<SCHRunScheduleEntry> schedRun;

        /**
         * Gets the value of the schedRun property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the schedRun property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSchedRun().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHRunScheduleEntry }
         * 
         * 
         */
        public List<SCHRunScheduleEntry> getSchedRun() {
            if (schedRun == null) {
                schedRun = new ArrayList<SCHRunScheduleEntry>();
            }
            return this.schedRun;
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
     *       &lt;sequence maxOccurs="10"&gt;
     *         &lt;element name="specific-garage" type="{http://www.TCIP-Final-4-0-0}CPTOperatorBaseIden"/&gt;
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
        "specificGarage"
    })
    public static class SpecificGarages {

        @XmlElement(name = "specific-garage", required = true)
        protected List<CPTOperatorBaseIden> specificGarage;

        /**
         * Gets the value of the specificGarage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the specificGarage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpecificGarage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CPTOperatorBaseIden }
         * 
         * 
         */
        public List<CPTOperatorBaseIden> getSpecificGarage() {
            if (specificGarage == null) {
                specificGarage = new ArrayList<CPTOperatorBaseIden>();
            }
            return this.specificGarage;
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
     *         &lt;element name="specific-run" type="{http://www.TCIP-Final-4-0-0}SCHRunIden"/&gt;
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
        "specificRun"
    })
    public static class SpecificRuns {

        @XmlElement(name = "specific-run", required = true)
        protected List<SCHRunIden> specificRun;

        /**
         * Gets the value of the specificRun property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the specificRun property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpecificRun().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHRunIden }
         * 
         * 
         */
        public List<SCHRunIden> getSpecificRun() {
            if (specificRun == null) {
                specificRun = new ArrayList<SCHRunIden>();
            }
            return this.specificRun;
        }

    }

}
