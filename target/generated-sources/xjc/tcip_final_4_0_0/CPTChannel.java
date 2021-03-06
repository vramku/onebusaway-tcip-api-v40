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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CPTChannel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CPTChannel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="channelID" type="{http://www.TCIP-Final-4-0-0}CPT-ChannelID"/&gt;
 *         &lt;element name="channelName" type="{http://www.TCIP-Final-4-0-0}CPT-ChannelName" minOccurs="0"/&gt;
 *         &lt;element name="channelNameLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="inboundFreq" type="{http://www.TCIP-Final-4-0-0}CPT-Frequency" minOccurs="0"/&gt;
 *         &lt;element name="outboundFreq" type="{http://www.TCIP-Final-4-0-0}CPT-Frequency" minOccurs="0"/&gt;
 *         &lt;element name="channelBand" type="{http://www.TCIP-Final-4-0-0}CPT-ChannelBand" minOccurs="0"/&gt;
 *         &lt;element name="attributes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="10"&gt;
 *                   &lt;element name="attribute" type="{http://www.TCIP-Final-4-0-0}CPT-ChannelAttribute"/&gt;
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
@XmlType(name = "CPTChannel", propOrder = {
    "channelID",
    "channelName",
    "channelNameLangs",
    "inboundFreq",
    "outboundFreq",
    "channelBand",
    "attributes"
})
public class CPTChannel {

    @XmlSchemaType(name = "unsignedByte")
    protected short channelID;
    protected String channelName;
    protected CPTAdditionalLanguageContents channelNameLangs;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger inboundFreq;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger outboundFreq;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger channelBand;
    protected CPTChannel.Attributes attributes;

    /**
     * Gets the value of the channelID property.
     * 
     */
    public short getChannelID() {
        return channelID;
    }

    /**
     * Sets the value of the channelID property.
     * 
     */
    public void setChannelID(short value) {
        this.channelID = value;
    }

    /**
     * Gets the value of the channelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * Sets the value of the channelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelName(String value) {
        this.channelName = value;
    }

    /**
     * Gets the value of the channelNameLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getChannelNameLangs() {
        return channelNameLangs;
    }

    /**
     * Sets the value of the channelNameLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setChannelNameLangs(CPTAdditionalLanguageContents value) {
        this.channelNameLangs = value;
    }

    /**
     * Gets the value of the inboundFreq property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInboundFreq() {
        return inboundFreq;
    }

    /**
     * Sets the value of the inboundFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInboundFreq(BigInteger value) {
        this.inboundFreq = value;
    }

    /**
     * Gets the value of the outboundFreq property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutboundFreq() {
        return outboundFreq;
    }

    /**
     * Sets the value of the outboundFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutboundFreq(BigInteger value) {
        this.outboundFreq = value;
    }

    /**
     * Gets the value of the channelBand property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChannelBand() {
        return channelBand;
    }

    /**
     * Sets the value of the channelBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChannelBand(BigInteger value) {
        this.channelBand = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link CPTChannel.Attributes }
     *     
     */
    public CPTChannel.Attributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTChannel.Attributes }
     *     
     */
    public void setAttributes(CPTChannel.Attributes value) {
        this.attributes = value;
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
     *         &lt;element name="attribute" type="{http://www.TCIP-Final-4-0-0}CPT-ChannelAttribute"/&gt;
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
        "attribute"
    })
    public static class Attributes {

        @XmlElement(required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected List<String> attribute;

        /**
         * Gets the value of the attribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttribute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAttribute() {
            if (attribute == null) {
                attribute = new ArrayList<String>();
            }
            return this.attribute;
        }

    }

}
