//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package tcip_final_4_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CcDGPSPush complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CcDGPSPush"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header" type="{http://www.TCIP-Final-4-0-0}CPTPushHeader"/&gt;
 *         &lt;element name="corrections"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="32"&gt;
 *                   &lt;element name="correction" type="{http://www.TCIP-Final-4-0-0}OBBusDGPSDifferentialCorrection"/&gt;
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
@XmlType(name = "CcDGPSPush", propOrder = {
    "header",
    "corrections"
})
public class CcDGPSPush {

    @XmlElement(required = true)
    protected CPTPushHeader header;
    @XmlElement(required = true)
    protected CcDGPSPush.Corrections corrections;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link CPTPushHeader }
     *     
     */
    public CPTPushHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTPushHeader }
     *     
     */
    public void setHeader(CPTPushHeader value) {
        this.header = value;
    }

    /**
     * Gets the value of the corrections property.
     * 
     * @return
     *     possible object is
     *     {@link CcDGPSPush.Corrections }
     *     
     */
    public CcDGPSPush.Corrections getCorrections() {
        return corrections;
    }

    /**
     * Sets the value of the corrections property.
     * 
     * @param value
     *     allowed object is
     *     {@link CcDGPSPush.Corrections }
     *     
     */
    public void setCorrections(CcDGPSPush.Corrections value) {
        this.corrections = value;
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
     *       &lt;sequence maxOccurs="32"&gt;
     *         &lt;element name="correction" type="{http://www.TCIP-Final-4-0-0}OBBusDGPSDifferentialCorrection"/&gt;
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
        "correction"
    })
    public static class Corrections {

        @XmlElement(required = true)
        protected List<OBBusDGPSDifferentialCorrection> correction;

        /**
         * Gets the value of the correction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the correction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCorrection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OBBusDGPSDifferentialCorrection }
         * 
         * 
         */
        public List<OBBusDGPSDifferentialCorrection> getCorrection() {
            if (correction == null) {
                correction = new ArrayList<OBBusDGPSDifferentialCorrection>();
            }
            return this.correction;
        }

    }

}
