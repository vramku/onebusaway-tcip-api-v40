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
 * <p>Java class for CCSignOnOff complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCSignOnOff"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operator" type="{http://www.TCIP-Final-4-0-0}CPTOperatorIden"/&gt;
 *         &lt;element name="sign-on" type="{http://www.TCIP-Final-4-0-0}CPT-Boolean"/&gt;
 *         &lt;element name="time" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime"/&gt;
 *         &lt;element name="run" type="{http://www.TCIP-Final-4-0-0}SCHRunIden" minOccurs="0"/&gt;
 *         &lt;element name="localCCSignOnOff" type="{http://www.tcip-4-0-0-local}CCSignOnOff" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCSignOnOff", propOrder = {
    "operator",
    "signOn",
    "time",
    "run",
    "localCCSignOnOff"
})
public class CCSignOnOff {

    @XmlElement(required = true)
    protected CPTOperatorIden operator;
    @XmlElement(name = "sign-on")
    protected boolean signOn;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime time;
    protected SCHRunIden run;
    protected tcip_4_0_0_local.CCSignOnOff localCCSignOnOff;

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
     * Gets the value of the signOn property.
     * 
     */
    public boolean isSignOn() {
        return signOn;
    }

    /**
     * Sets the value of the signOn property.
     * 
     */
    public void setSignOn(boolean value) {
        this.signOn = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(DateTime value) {
        this.time = value;
    }

    /**
     * Gets the value of the run property.
     * 
     * @return
     *     possible object is
     *     {@link SCHRunIden }
     *     
     */
    public SCHRunIden getRun() {
        return run;
    }

    /**
     * Sets the value of the run property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHRunIden }
     *     
     */
    public void setRun(SCHRunIden value) {
        this.run = value;
    }

    /**
     * Gets the value of the localCCSignOnOff property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_4_0_0_local.CCSignOnOff }
     *     
     */
    public tcip_4_0_0_local.CCSignOnOff getLocalCCSignOnOff() {
        return localCCSignOnOff;
    }

    /**
     * Sets the value of the localCCSignOnOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_4_0_0_local.CCSignOnOff }
     *     
     */
    public void setLocalCCSignOnOff(tcip_4_0_0_local.CCSignOnOff value) {
        this.localCCSignOnOff = value;
    }

}