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


/**
 * <p>Java class for TSPTmsIntersectionParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSPTmsIntersectionParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="intersection" type="{http://www.TCIP-Final-4-0-0}CPTIntersectionIden"/&gt;
 *         &lt;element name="boundary" type="{http://www.TCIP-Final-4-0-0}TSP-BoundaryID" minOccurs="0"/&gt;
 *         &lt;element name="intersectionIP" type="{http://www.TCIP-Final-4-0-0}CPT-IPAddress" minOccurs="0"/&gt;
 *         &lt;element name="intersectionPort" type="{http://www.TCIP-Final-4-0-0}CPT-UDP-TCP-PortNumber" minOccurs="0"/&gt;
 *         &lt;element name="intersectionModem" type="{http://www.TCIP-Final-4-0-0}TSP-ModemPhoneNum" minOccurs="0"/&gt;
 *         &lt;element name="intersectionDropAddr" type="{http://www.TCIP-Final-4-0-0}TSP-DropAddr" minOccurs="0"/&gt;
 *         &lt;element name="approaches" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="25"&gt;
 *                   &lt;element name="approache" type="{http://www.TCIP-Final-4-0-0}TSPTmsIntersectionApproach"/&gt;
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
@XmlType(name = "TSPTmsIntersectionParam", propOrder = {
    "intersection",
    "boundary",
    "intersectionIP",
    "intersectionPort",
    "intersectionModem",
    "intersectionDropAddr",
    "approaches"
})
public class TSPTmsIntersectionParam {

    @XmlElement(required = true)
    protected CPTIntersectionIden intersection;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger boundary;
    protected String intersectionIP;
    @XmlSchemaType(name = "unsignedByte")
    protected Short intersectionPort;
    protected String intersectionModem;
    @XmlSchemaType(name = "unsignedByte")
    protected Short intersectionDropAddr;
    protected TSPTmsIntersectionParam.Approaches approaches;

    /**
     * Gets the value of the intersection property.
     * 
     * @return
     *     possible object is
     *     {@link CPTIntersectionIden }
     *     
     */
    public CPTIntersectionIden getIntersection() {
        return intersection;
    }

    /**
     * Sets the value of the intersection property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTIntersectionIden }
     *     
     */
    public void setIntersection(CPTIntersectionIden value) {
        this.intersection = value;
    }

    /**
     * Gets the value of the boundary property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBoundary() {
        return boundary;
    }

    /**
     * Sets the value of the boundary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBoundary(BigInteger value) {
        this.boundary = value;
    }

    /**
     * Gets the value of the intersectionIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntersectionIP() {
        return intersectionIP;
    }

    /**
     * Sets the value of the intersectionIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntersectionIP(String value) {
        this.intersectionIP = value;
    }

    /**
     * Gets the value of the intersectionPort property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIntersectionPort() {
        return intersectionPort;
    }

    /**
     * Sets the value of the intersectionPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIntersectionPort(Short value) {
        this.intersectionPort = value;
    }

    /**
     * Gets the value of the intersectionModem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntersectionModem() {
        return intersectionModem;
    }

    /**
     * Sets the value of the intersectionModem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntersectionModem(String value) {
        this.intersectionModem = value;
    }

    /**
     * Gets the value of the intersectionDropAddr property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIntersectionDropAddr() {
        return intersectionDropAddr;
    }

    /**
     * Sets the value of the intersectionDropAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIntersectionDropAddr(Short value) {
        this.intersectionDropAddr = value;
    }

    /**
     * Gets the value of the approaches property.
     * 
     * @return
     *     possible object is
     *     {@link TSPTmsIntersectionParam.Approaches }
     *     
     */
    public TSPTmsIntersectionParam.Approaches getApproaches() {
        return approaches;
    }

    /**
     * Sets the value of the approaches property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSPTmsIntersectionParam.Approaches }
     *     
     */
    public void setApproaches(TSPTmsIntersectionParam.Approaches value) {
        this.approaches = value;
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
     *       &lt;sequence maxOccurs="25"&gt;
     *         &lt;element name="approache" type="{http://www.TCIP-Final-4-0-0}TSPTmsIntersectionApproach"/&gt;
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
        "approache"
    })
    public static class Approaches {

        @XmlElement(required = true)
        protected List<TSPTmsIntersectionApproach> approache;

        /**
         * Gets the value of the approache property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the approache property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getApproache().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TSPTmsIntersectionApproach }
         * 
         * 
         */
        public List<TSPTmsIntersectionApproach> getApproache() {
            if (approache == null) {
                approache = new ArrayList<TSPTmsIntersectionApproach>();
            }
            return this.approache;
        }

    }

}
