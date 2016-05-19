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
 * <p>Java class for FCFareboxAccessPermission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FCFareboxAccessPermission"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operator" type="{http://www.TCIP-Final-4-0-0}CPTOperatorIden"/&gt;
 *         &lt;element name="metadata" type="{http://www.TCIP-Final-4-0-0}CPTRowMetaData" minOccurs="0"/&gt;
 *         &lt;element name="earliest-access" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="latest-access" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="localFCFareboxAccessPermission" type="{http://www.tcip-4-0-0-local}FCFareboxAccessPermission" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FCFareboxAccessPermission", propOrder = {
    "operator",
    "metadata",
    "earliestAccess",
    "latestAccess",
    "localFCFareboxAccessPermission"
})
public class FCFareboxAccessPermission {

    @XmlElement(required = true)
    protected CPTOperatorIden operator;
    protected CPTRowMetaData metadata;
    @XmlElement(name = "earliest-access", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime earliestAccess;
    @XmlElement(name = "latest-access", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime latestAccess;
    protected tcip_4_0_0_local.FCFareboxAccessPermission localFCFareboxAccessPermission;

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
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link CPTRowMetaData }
     *     
     */
    public CPTRowMetaData getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTRowMetaData }
     *     
     */
    public void setMetadata(CPTRowMetaData value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the earliestAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getEarliestAccess() {
        return earliestAccess;
    }

    /**
     * Sets the value of the earliestAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarliestAccess(DateTime value) {
        this.earliestAccess = value;
    }

    /**
     * Gets the value of the latestAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getLatestAccess() {
        return latestAccess;
    }

    /**
     * Sets the value of the latestAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestAccess(DateTime value) {
        this.latestAccess = value;
    }

    /**
     * Gets the value of the localFCFareboxAccessPermission property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_4_0_0_local.FCFareboxAccessPermission }
     *     
     */
    public tcip_4_0_0_local.FCFareboxAccessPermission getLocalFCFareboxAccessPermission() {
        return localFCFareboxAccessPermission;
    }

    /**
     * Sets the value of the localFCFareboxAccessPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_4_0_0_local.FCFareboxAccessPermission }
     *     
     */
    public void setLocalFCFareboxAccessPermission(tcip_4_0_0_local.FCFareboxAccessPermission value) {
        this.localFCFareboxAccessPermission = value;
    }

}
