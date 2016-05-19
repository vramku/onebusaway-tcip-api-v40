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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>Java class for FCComponentEventInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FCComponentEventInstance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.TCIP-Final-4-0-0}FC-ComponentEventID"/&gt;
 *         &lt;element name="type" type="{http://www.TCIP-Final-4-0-0}FC-ComponentEventType"/&gt;
 *         &lt;element name="status-begin" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime"/&gt;
 *         &lt;element name="status-end" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="list-of-status-types"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="20"&gt;
 *                   &lt;element name="list-of-status-type" type="{http://www.TCIP-Final-4-0-0}FC-ComponentStatusType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="list-of-error-types" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="20"&gt;
 *                   &lt;element name="list-of-error-type" type="{http://www.TCIP-Final-4-0-0}FC-ComponentErrorType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="severity-level" type="{http://www.TCIP-Final-4-0-0}CPT-SeverityLevel"/&gt;
 *         &lt;element name="component-id" type="{http://www.TCIP-Final-4-0-0}FC-ComponentID"/&gt;
 *         &lt;element name="subassembly-id" type="{http://www.TCIP-Final-4-0-0}FC-SubassemblyID" minOccurs="0"/&gt;
 *         &lt;element name="serial-number" type="{http://www.TCIP-Final-4-0-0}CPT-SerialNumber" minOccurs="0"/&gt;
 *         &lt;element name="footnote" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="footnoteLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FCComponentEventInstance", propOrder = {
    "id",
    "type",
    "statusBegin",
    "statusEnd",
    "listOfStatusTypes",
    "listOfErrorTypes",
    "severityLevel",
    "componentId",
    "subassemblyId",
    "serialNumber",
    "footnote",
    "footnoteLangs"
})
public class FCComponentEventInstance {

    @XmlElement(required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String type;
    @XmlElement(name = "status-begin", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime statusBegin;
    @XmlElement(name = "status-end", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime statusEnd;
    @XmlElement(name = "list-of-status-types", required = true)
    protected FCComponentEventInstance.ListOfStatusTypes listOfStatusTypes;
    @XmlElement(name = "list-of-error-types")
    protected FCComponentEventInstance.ListOfErrorTypes listOfErrorTypes;
    @XmlElement(name = "severity-level")
    @XmlSchemaType(name = "unsignedByte")
    protected short severityLevel;
    @XmlElement(name = "component-id", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger componentId;
    @XmlElement(name = "subassembly-id")
    protected String subassemblyId;
    @XmlElement(name = "serial-number")
    protected String serialNumber;
    protected String footnote;
    protected CPTAdditionalLanguageContents footnoteLangs;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the statusBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getStatusBegin() {
        return statusBegin;
    }

    /**
     * Sets the value of the statusBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusBegin(DateTime value) {
        this.statusBegin = value;
    }

    /**
     * Gets the value of the statusEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getStatusEnd() {
        return statusEnd;
    }

    /**
     * Sets the value of the statusEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusEnd(DateTime value) {
        this.statusEnd = value;
    }

    /**
     * Gets the value of the listOfStatusTypes property.
     * 
     * @return
     *     possible object is
     *     {@link FCComponentEventInstance.ListOfStatusTypes }
     *     
     */
    public FCComponentEventInstance.ListOfStatusTypes getListOfStatusTypes() {
        return listOfStatusTypes;
    }

    /**
     * Sets the value of the listOfStatusTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link FCComponentEventInstance.ListOfStatusTypes }
     *     
     */
    public void setListOfStatusTypes(FCComponentEventInstance.ListOfStatusTypes value) {
        this.listOfStatusTypes = value;
    }

    /**
     * Gets the value of the listOfErrorTypes property.
     * 
     * @return
     *     possible object is
     *     {@link FCComponentEventInstance.ListOfErrorTypes }
     *     
     */
    public FCComponentEventInstance.ListOfErrorTypes getListOfErrorTypes() {
        return listOfErrorTypes;
    }

    /**
     * Sets the value of the listOfErrorTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link FCComponentEventInstance.ListOfErrorTypes }
     *     
     */
    public void setListOfErrorTypes(FCComponentEventInstance.ListOfErrorTypes value) {
        this.listOfErrorTypes = value;
    }

    /**
     * Gets the value of the severityLevel property.
     * 
     */
    public short getSeverityLevel() {
        return severityLevel;
    }

    /**
     * Sets the value of the severityLevel property.
     * 
     */
    public void setSeverityLevel(short value) {
        this.severityLevel = value;
    }

    /**
     * Gets the value of the componentId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getComponentId() {
        return componentId;
    }

    /**
     * Sets the value of the componentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setComponentId(BigInteger value) {
        this.componentId = value;
    }

    /**
     * Gets the value of the subassemblyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubassemblyId() {
        return subassemblyId;
    }

    /**
     * Sets the value of the subassemblyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubassemblyId(String value) {
        this.subassemblyId = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the footnote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFootnote() {
        return footnote;
    }

    /**
     * Sets the value of the footnote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFootnote(String value) {
        this.footnote = value;
    }

    /**
     * Gets the value of the footnoteLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getFootnoteLangs() {
        return footnoteLangs;
    }

    /**
     * Sets the value of the footnoteLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setFootnoteLangs(CPTAdditionalLanguageContents value) {
        this.footnoteLangs = value;
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
     *       &lt;sequence maxOccurs="20"&gt;
     *         &lt;element name="list-of-error-type" type="{http://www.TCIP-Final-4-0-0}FC-ComponentErrorType"/&gt;
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
        "listOfErrorType"
    })
    public static class ListOfErrorTypes {

        @XmlElement(name = "list-of-error-type", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected List<String> listOfErrorType;

        /**
         * Gets the value of the listOfErrorType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listOfErrorType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getListOfErrorType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getListOfErrorType() {
            if (listOfErrorType == null) {
                listOfErrorType = new ArrayList<String>();
            }
            return this.listOfErrorType;
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
     *       &lt;sequence maxOccurs="20"&gt;
     *         &lt;element name="list-of-status-type" type="{http://www.TCIP-Final-4-0-0}FC-ComponentStatusType"/&gt;
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
        "listOfStatusType"
    })
    public static class ListOfStatusTypes {

        @XmlElement(name = "list-of-status-type", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected List<String> listOfStatusType;

        /**
         * Gets the value of the listOfStatusType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listOfStatusType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getListOfStatusType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getListOfStatusType() {
            if (listOfStatusType == null) {
                listOfStatusType = new ArrayList<String>();
            }
            return this.listOfStatusType;
        }

    }

}
