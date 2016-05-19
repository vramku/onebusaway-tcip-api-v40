//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package tcip_final_4_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>Java class for CCLogOffOperator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCLogOffOperator"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operator" type="{http://www.TCIP-Final-4-0-0}CPTOperatorIden"/&gt;
 *         &lt;element name="job-category" type="{http://www.TCIP-Final-4-0-0}CPT-EmplJobCat" minOccurs="0"/&gt;
 *         &lt;element name="logOffDateTime" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime"/&gt;
 *         &lt;element name="localCCLogOffOperator" type="{http://www.tcip-4-0-0-local}CCLogOffOperator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCLogOffOperator", propOrder = {
    "operator",
    "jobCategory",
    "logOffDateTime",
    "localCCLogOffOperator"
})
public class CCLogOffOperator {

    @XmlElement(required = true)
    protected CPTOperatorIden operator;
    @XmlElement(name = "job-category")
    @XmlSchemaType(name = "anySimpleType")
    protected String jobCategory;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime logOffDateTime;
    protected tcip_4_0_0_local.CCLogOffOperator localCCLogOffOperator;

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link CPTOperatorIden }
     *     
     */
    public CPTOperatorIden getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTOperatorIden }
     *     
     */
    public void setOperator(CPTOperatorIden value) {
        this.operator = value;
    }

    /**
     * Gets the value of the jobCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobCategory() {
        return jobCategory;
    }

    /**
     * Sets the value of the jobCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobCategory(String value) {
        this.jobCategory = value;
    }

    /**
     * Gets the value of the logOffDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getLogOffDateTime() {
        return logOffDateTime;
    }

    /**
     * Sets the value of the logOffDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogOffDateTime(DateTime value) {
        this.logOffDateTime = value;
    }

    /**
     * Gets the value of the localCCLogOffOperator property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_4_0_0_local.CCLogOffOperator }
     *     
     */
    public tcip_4_0_0_local.CCLogOffOperator getLocalCCLogOffOperator() {
        return localCCLogOffOperator;
    }

    /**
     * Sets the value of the localCCLogOffOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_4_0_0_local.CCLogOffOperator }
     *     
     */
    public void setLocalCCLogOffOperator(tcip_4_0_0_local.CCLogOffOperator value) {
        this.localCCLogOffOperator = value;
    }

}