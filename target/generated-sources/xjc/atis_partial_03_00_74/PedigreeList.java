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
import itis_final_3_0_0_for_atis.ITISEventType;


/**
 * <p>Java class for PedigreeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PedigreeList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="32"&gt;
 *         &lt;element name="pedigree"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="organizationId" type="{http://www.atis-partial-03-00-74}Organization-contact-center-identifier"/&gt;
 *                   &lt;element name="eventID" type="{http://www.atis-partial-03-00-74}ReferenceID"/&gt;
 *                   &lt;element name="typeEvent" type="{http://www.itis-final-3-0-0-for-atis}ITISEventType"/&gt;
 *                   &lt;element name="reasonCode" type="{http://www.atis-partial-03-00-74}SplitReason" minOccurs="0"/&gt;
 *                   &lt;element name="comment" type="{http://www.atis-partial-03-00-74}FreeText" minOccurs="0"/&gt;
 *                   &lt;element name="localPedigreeList" type="{http://www.atis-03-00-74-local}PedigreeList" minOccurs="0"/&gt;
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
@XmlType(name = "PedigreeList", propOrder = {
    "pedigree"
})
public class PedigreeList {

    @XmlElement(required = true)
    protected List<PedigreeList.Pedigree> pedigree;

    /**
     * Gets the value of the pedigree property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pedigree property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPedigree().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PedigreeList.Pedigree }
     * 
     * 
     */
    public List<PedigreeList.Pedigree> getPedigree() {
        if (pedigree == null) {
            pedigree = new ArrayList<PedigreeList.Pedigree>();
        }
        return this.pedigree;
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
     *       &lt;sequence&gt;
     *         &lt;element name="organizationId" type="{http://www.atis-partial-03-00-74}Organization-contact-center-identifier"/&gt;
     *         &lt;element name="eventID" type="{http://www.atis-partial-03-00-74}ReferenceID"/&gt;
     *         &lt;element name="typeEvent" type="{http://www.itis-final-3-0-0-for-atis}ITISEventType"/&gt;
     *         &lt;element name="reasonCode" type="{http://www.atis-partial-03-00-74}SplitReason" minOccurs="0"/&gt;
     *         &lt;element name="comment" type="{http://www.atis-partial-03-00-74}FreeText" minOccurs="0"/&gt;
     *         &lt;element name="localPedigreeList" type="{http://www.atis-03-00-74-local}PedigreeList" minOccurs="0"/&gt;
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
        "organizationId",
        "eventID",
        "typeEvent",
        "reasonCode",
        "comment",
        "localPedigreeList"
    })
    public static class Pedigree {

        @XmlElement(required = true)
        protected String organizationId;
        @XmlElement(required = true)
        protected String eventID;
        @XmlElement(required = true)
        protected ITISEventType typeEvent;
        @XmlSchemaType(name = "anySimpleType")
        protected String reasonCode;
        protected String comment;
        protected atis_03_00_74_local.PedigreeList localPedigreeList;

        /**
         * Gets the value of the organizationId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrganizationId() {
            return organizationId;
        }

        /**
         * Sets the value of the organizationId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrganizationId(String value) {
            this.organizationId = value;
        }

        /**
         * Gets the value of the eventID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEventID() {
            return eventID;
        }

        /**
         * Sets the value of the eventID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEventID(String value) {
            this.eventID = value;
        }

        /**
         * Gets the value of the typeEvent property.
         * 
         * @return
         *     possible object is
         *     {@link ITISEventType }
         *     
         */
        public ITISEventType getTypeEvent() {
            return typeEvent;
        }

        /**
         * Sets the value of the typeEvent property.
         * 
         * @param value
         *     allowed object is
         *     {@link ITISEventType }
         *     
         */
        public void setTypeEvent(ITISEventType value) {
            this.typeEvent = value;
        }

        /**
         * Gets the value of the reasonCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReasonCode() {
            return reasonCode;
        }

        /**
         * Sets the value of the reasonCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReasonCode(String value) {
            this.reasonCode = value;
        }

        /**
         * Gets the value of the comment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComment() {
            return comment;
        }

        /**
         * Sets the value of the comment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComment(String value) {
            this.comment = value;
        }

        /**
         * Gets the value of the localPedigreeList property.
         * 
         * @return
         *     possible object is
         *     {@link atis_03_00_74_local.PedigreeList }
         *     
         */
        public atis_03_00_74_local.PedigreeList getLocalPedigreeList() {
            return localPedigreeList;
        }

        /**
         * Sets the value of the localPedigreeList property.
         * 
         * @param value
         *     allowed object is
         *     {@link atis_03_00_74_local.PedigreeList }
         *     
         */
        public void setLocalPedigreeList(atis_03_00_74_local.PedigreeList value) {
            this.localPedigreeList = value;
        }

    }

}
