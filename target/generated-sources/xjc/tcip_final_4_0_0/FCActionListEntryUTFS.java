//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package tcip_final_4_0_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FCActionListEntryUTFS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FCActionListEntryUTFS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="action-type" type="{http://www.TCIP-Final-4-0-0}FC-ActionTypeUTFS"/&gt;
 *         &lt;element name="localFCActionListEntryUTFS" type="{http://www.tcip-4-0-0-local}FCActionListEntryUTFS" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FCActionListEntryUTFS", propOrder = {
    "actionType",
    "localFCActionListEntryUTFS"
})
public class FCActionListEntryUTFS {

    @XmlElement(name = "action-type", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger actionType;
    protected tcip_4_0_0_local.FCActionListEntryUTFS localFCActionListEntryUTFS;

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setActionType(BigInteger value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the localFCActionListEntryUTFS property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_4_0_0_local.FCActionListEntryUTFS }
     *     
     */
    public tcip_4_0_0_local.FCActionListEntryUTFS getLocalFCActionListEntryUTFS() {
        return localFCActionListEntryUTFS;
    }

    /**
     * Sets the value of the localFCActionListEntryUTFS property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_4_0_0_local.FCActionListEntryUTFS }
     *     
     */
    public void setLocalFCActionListEntryUTFS(tcip_4_0_0_local.FCActionListEntryUTFS value) {
        this.localFCActionListEntryUTFS = value;
    }

}
