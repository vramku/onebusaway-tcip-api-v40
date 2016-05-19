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


/**
 * <p>Java class for CCActivateScheduleAdherence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCActivateScheduleAdherence"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tolerance-early" type="{http://www.TCIP-Final-4-0-0}CC-ScheduleToleranceEarly"/&gt;
 *         &lt;element name="return-tolerance-early" type="{http://www.TCIP-Final-4-0-0}CC-ReturnToleranceEarly" minOccurs="0"/&gt;
 *         &lt;element name="tolerance-late" type="{http://www.TCIP-Final-4-0-0}CC-ScheduleToleranceLate"/&gt;
 *         &lt;element name="return-tolerance-late" type="{http://www.TCIP-Final-4-0-0}CC-ReturnToleranceLate" minOccurs="0"/&gt;
 *         &lt;element name="report-frequency" type="{http://www.TCIP-Final-4-0-0}CC-ExceptionFrequencyReport" minOccurs="0"/&gt;
 *         &lt;element name="response" type="{http://www.TCIP-Final-4-0-0}CC-MsgResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCActivateScheduleAdherence", propOrder = {
    "toleranceEarly",
    "returnToleranceEarly",
    "toleranceLate",
    "returnToleranceLate",
    "reportFrequency",
    "response"
})
public class CCActivateScheduleAdherence {

    @XmlElement(name = "tolerance-early")
    @XmlSchemaType(name = "unsignedShort")
    protected int toleranceEarly;
    @XmlElement(name = "return-tolerance-early")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer returnToleranceEarly;
    @XmlElement(name = "tolerance-late")
    @XmlSchemaType(name = "unsignedShort")
    protected int toleranceLate;
    @XmlElement(name = "return-tolerance-late")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer returnToleranceLate;
    @XmlElement(name = "report-frequency")
    @XmlSchemaType(name = "unsignedByte")
    protected Short reportFrequency;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String response;

    /**
     * Gets the value of the toleranceEarly property.
     * 
     */
    public int getToleranceEarly() {
        return toleranceEarly;
    }

    /**
     * Sets the value of the toleranceEarly property.
     * 
     */
    public void setToleranceEarly(int value) {
        this.toleranceEarly = value;
    }

    /**
     * Gets the value of the returnToleranceEarly property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturnToleranceEarly() {
        return returnToleranceEarly;
    }

    /**
     * Sets the value of the returnToleranceEarly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturnToleranceEarly(Integer value) {
        this.returnToleranceEarly = value;
    }

    /**
     * Gets the value of the toleranceLate property.
     * 
     */
    public int getToleranceLate() {
        return toleranceLate;
    }

    /**
     * Sets the value of the toleranceLate property.
     * 
     */
    public void setToleranceLate(int value) {
        this.toleranceLate = value;
    }

    /**
     * Gets the value of the returnToleranceLate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturnToleranceLate() {
        return returnToleranceLate;
    }

    /**
     * Sets the value of the returnToleranceLate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturnToleranceLate(Integer value) {
        this.returnToleranceLate = value;
    }

    /**
     * Gets the value of the reportFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getReportFrequency() {
        return reportFrequency;
    }

    /**
     * Sets the value of the reportFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setReportFrequency(Short value) {
        this.reportFrequency = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponse(String value) {
        this.response = value;
    }

}