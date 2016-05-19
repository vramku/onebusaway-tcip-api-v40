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
import lrms_final_09_07.Distance;


/**
 * <p>Java class for CCRouteAdherenceEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCRouteAdherenceEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="off-route-distance" type="{http://www.lrms-final-09-07}Distance"/&gt;
 *         &lt;element name="report-frequency" type="{http://www.TCIP-Final-4-0-0}CC-ExceptionFrequencyReport" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCRouteAdherenceEntry", propOrder = {
    "offRouteDistance",
    "reportFrequency"
})
public class CCRouteAdherenceEntry {

    @XmlElement(name = "off-route-distance", required = true)
    protected Distance offRouteDistance;
    @XmlElement(name = "report-frequency")
    @XmlSchemaType(name = "unsignedByte")
    protected Short reportFrequency;

    /**
     * Gets the value of the offRouteDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getOffRouteDistance() {
        return offRouteDistance;
    }

    /**
     * Sets the value of the offRouteDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setOffRouteDistance(Distance value) {
        this.offRouteDistance = value;
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

}