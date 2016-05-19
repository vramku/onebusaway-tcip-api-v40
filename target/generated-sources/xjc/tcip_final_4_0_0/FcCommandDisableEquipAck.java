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
 * <p>Java class for FcCommandDisableEquipAck complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FcCommandDisableEquipAck"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="commandID" type="{http://www.TCIP-Final-4-0-0}CPT-CommandID"/&gt;
 *         &lt;element name="command-time" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime"/&gt;
 *         &lt;element name="free-mode-requested" type="{http://www.TCIP-Final-4-0-0}CPT-Boolean"/&gt;
 *         &lt;element name="command-accepted" type="{http://www.TCIP-Final-4-0-0}CPT-Boolean"/&gt;
 *         &lt;element name="time-implemented" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="free-mode-ids" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="1000"&gt;
 *                   &lt;element name="free-mode-id" type="{http://www.TCIP-Final-4-0-0}CPT-SerialNumber"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cease-ops-ids" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="1000"&gt;
 *                   &lt;element name="cease-ops-id" type="{http://www.TCIP-Final-4-0-0}CPT-SerialNumber"/&gt;
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
@XmlType(name = "FcCommandDisableEquipAck", propOrder = {
    "commandID",
    "commandTime",
    "freeModeRequested",
    "commandAccepted",
    "timeImplemented",
    "freeModeIds",
    "ceaseOpsIds"
})
public class FcCommandDisableEquipAck {

    @XmlElement(required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger commandID;
    @XmlElement(name = "command-time", required = true, type = String.class)
    @XmlJavaTypeAdapter(tcip_final_4_0_0.Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected org.joda.time.DateTime commandTime;
    @XmlElement(name = "free-mode-requested")
    protected boolean freeModeRequested;
    @XmlElement(name = "command-accepted")
    protected boolean commandAccepted;
    @XmlElement(name = "time-implemented", type = String.class)
    @XmlJavaTypeAdapter(tcip_final_4_0_0.Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected org.joda.time.DateTime timeImplemented;
    @XmlElement(name = "free-mode-ids")
    protected FcCommandDisableEquipAck.FreeModeIds freeModeIds;
    @XmlElement(name = "cease-ops-ids")
    protected FcCommandDisableEquipAck.CeaseOpsIds ceaseOpsIds;
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
     * Gets the value of the commandID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCommandID() {
        return commandID;
    }

    /**
     * Sets the value of the commandID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCommandID(BigInteger value) {
        this.commandID = value;
    }

    /**
     * Gets the value of the commandTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.joda.time.DateTime getCommandTime() {
        return commandTime;
    }

    /**
     * Sets the value of the commandTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandTime(org.joda.time.DateTime value) {
        this.commandTime = value;
    }

    /**
     * Gets the value of the freeModeRequested property.
     * 
     */
    public boolean isFreeModeRequested() {
        return freeModeRequested;
    }

    /**
     * Sets the value of the freeModeRequested property.
     * 
     */
    public void setFreeModeRequested(boolean value) {
        this.freeModeRequested = value;
    }

    /**
     * Gets the value of the commandAccepted property.
     * 
     */
    public boolean isCommandAccepted() {
        return commandAccepted;
    }

    /**
     * Sets the value of the commandAccepted property.
     * 
     */
    public void setCommandAccepted(boolean value) {
        this.commandAccepted = value;
    }

    /**
     * Gets the value of the timeImplemented property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.joda.time.DateTime getTimeImplemented() {
        return timeImplemented;
    }

    /**
     * Sets the value of the timeImplemented property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeImplemented(org.joda.time.DateTime value) {
        this.timeImplemented = value;
    }

    /**
     * Gets the value of the freeModeIds property.
     * 
     * @return
     *     possible object is
     *     {@link FcCommandDisableEquipAck.FreeModeIds }
     *     
     */
    public FcCommandDisableEquipAck.FreeModeIds getFreeModeIds() {
        return freeModeIds;
    }

    /**
     * Sets the value of the freeModeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link FcCommandDisableEquipAck.FreeModeIds }
     *     
     */
    public void setFreeModeIds(FcCommandDisableEquipAck.FreeModeIds value) {
        this.freeModeIds = value;
    }

    /**
     * Gets the value of the ceaseOpsIds property.
     * 
     * @return
     *     possible object is
     *     {@link FcCommandDisableEquipAck.CeaseOpsIds }
     *     
     */
    public FcCommandDisableEquipAck.CeaseOpsIds getCeaseOpsIds() {
        return ceaseOpsIds;
    }

    /**
     * Sets the value of the ceaseOpsIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link FcCommandDisableEquipAck.CeaseOpsIds }
     *     
     */
    public void setCeaseOpsIds(FcCommandDisableEquipAck.CeaseOpsIds value) {
        this.ceaseOpsIds = value;
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
     *       &lt;sequence maxOccurs="1000"&gt;
     *         &lt;element name="cease-ops-id" type="{http://www.TCIP-Final-4-0-0}CPT-SerialNumber"/&gt;
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
        "ceaseOpsId"
    })
    public static class CeaseOpsIds {

        @XmlElement(name = "cease-ops-id", required = true)
        protected List<String> ceaseOpsId;

        /**
         * Gets the value of the ceaseOpsId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ceaseOpsId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCeaseOpsId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCeaseOpsId() {
            if (ceaseOpsId == null) {
                ceaseOpsId = new ArrayList<String>();
            }
            return this.ceaseOpsId;
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
     *       &lt;sequence maxOccurs="1000"&gt;
     *         &lt;element name="free-mode-id" type="{http://www.TCIP-Final-4-0-0}CPT-SerialNumber"/&gt;
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
        "freeModeId"
    })
    public static class FreeModeIds {

        @XmlElement(name = "free-mode-id", required = true)
        protected List<String> freeModeId;

        /**
         * Gets the value of the freeModeId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the freeModeId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFreeModeId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFreeModeId() {
            if (freeModeId == null) {
                freeModeId = new ArrayList<String>();
            }
            return this.freeModeId;
        }

    }

}
