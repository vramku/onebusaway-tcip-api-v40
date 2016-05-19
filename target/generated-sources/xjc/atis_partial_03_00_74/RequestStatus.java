//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package atis_partial_03_00_74;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.atis-partial-03-00-74}ReferenceID" minOccurs="0"/&gt;
 *         &lt;element name="supportedAgencies" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="100"&gt;
 *                   &lt;element name="supportedAgency" type="{http://www.atis-partial-03-00-74}Organization-contact-center-identifier"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="filterTypesInfo" type="{http://www.atis-partial-03-00-74}URL-Link" minOccurs="0"/&gt;
 *         &lt;element name="lrmsTypeInfo" type="{http://www.atis-partial-03-00-74}URL-Link" minOccurs="0"/&gt;
 *         &lt;element name="extensionTypeInfo" type="{http://www.atis-partial-03-00-74}URL-Link" minOccurs="0"/&gt;
 *         &lt;element name="maxDuration" type="{http://www.atis-partial-03-00-74}TimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="minInterval" type="{http://www.atis-partial-03-00-74}TimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="localRequestStatus" type="{http://www.atis-03-00-74-local}RequestStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestStatus", propOrder = {
    "id",
    "supportedAgencies",
    "filterTypesInfo",
    "lrmsTypeInfo",
    "extensionTypeInfo",
    "maxDuration",
    "minInterval",
    "localRequestStatus"
})
public class RequestStatus {

    protected String id;
    protected RequestStatus.SupportedAgencies supportedAgencies;
    @XmlSchemaType(name = "anyURI")
    protected String filterTypesInfo;
    @XmlSchemaType(name = "anyURI")
    protected String lrmsTypeInfo;
    @XmlSchemaType(name = "anyURI")
    protected String extensionTypeInfo;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer maxDuration;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer minInterval;
    protected atis_03_00_74_local.RequestStatus localRequestStatus;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the supportedAgencies property.
     * 
     * @return
     *     possible object is
     *     {@link RequestStatus.SupportedAgencies }
     *     
     */
    public RequestStatus.SupportedAgencies getSupportedAgencies() {
        return supportedAgencies;
    }

    /**
     * Sets the value of the supportedAgencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestStatus.SupportedAgencies }
     *     
     */
    public void setSupportedAgencies(RequestStatus.SupportedAgencies value) {
        this.supportedAgencies = value;
    }

    /**
     * Gets the value of the filterTypesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterTypesInfo() {
        return filterTypesInfo;
    }

    /**
     * Sets the value of the filterTypesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterTypesInfo(String value) {
        this.filterTypesInfo = value;
    }

    /**
     * Gets the value of the lrmsTypeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLrmsTypeInfo() {
        return lrmsTypeInfo;
    }

    /**
     * Sets the value of the lrmsTypeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLrmsTypeInfo(String value) {
        this.lrmsTypeInfo = value;
    }

    /**
     * Gets the value of the extensionTypeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionTypeInfo() {
        return extensionTypeInfo;
    }

    /**
     * Sets the value of the extensionTypeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionTypeInfo(String value) {
        this.extensionTypeInfo = value;
    }

    /**
     * Gets the value of the maxDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxDuration() {
        return maxDuration;
    }

    /**
     * Sets the value of the maxDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxDuration(Integer value) {
        this.maxDuration = value;
    }

    /**
     * Gets the value of the minInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinInterval() {
        return minInterval;
    }

    /**
     * Sets the value of the minInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinInterval(Integer value) {
        this.minInterval = value;
    }

    /**
     * Gets the value of the localRequestStatus property.
     * 
     * @return
     *     possible object is
     *     {@link atis_03_00_74_local.RequestStatus }
     *     
     */
    public atis_03_00_74_local.RequestStatus getLocalRequestStatus() {
        return localRequestStatus;
    }

    /**
     * Sets the value of the localRequestStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link atis_03_00_74_local.RequestStatus }
     *     
     */
    public void setLocalRequestStatus(atis_03_00_74_local.RequestStatus value) {
        this.localRequestStatus = value;
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
     *         &lt;element name="supportedAgency" type="{http://www.atis-partial-03-00-74}Organization-contact-center-identifier"/&gt;
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
        "supportedAgency"
    })
    public static class SupportedAgencies {

        @XmlElement(required = true)
        protected List<String> supportedAgency;

        /**
         * Gets the value of the supportedAgency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the supportedAgency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSupportedAgency().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSupportedAgency() {
            if (supportedAgency == null) {
                supportedAgency = new ArrayList<String>();
            }
            return this.supportedAgency;
        }

    }

}