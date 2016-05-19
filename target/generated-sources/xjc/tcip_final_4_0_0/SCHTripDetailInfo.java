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
import org.joda.time.LocalDate;


/**
 * <p>Java class for SCHTripDetailInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCHTripDetailInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="route" type="{http://www.TCIP-Final-4-0-0}SCHRouteIden"/&gt;
 *         &lt;element name="route-direction-name" type="{http://www.TCIP-Final-4-0-0}SCH-RouteDirectionName" minOccurs="0"/&gt;
 *         &lt;element name="route-direction-nameLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="route-version" type="{http://www.TCIP-Final-4-0-0}SCH-TimetableVersionID" minOccurs="0"/&gt;
 *         &lt;element name="effective" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime"/&gt;
 *         &lt;element name="tripInfo" type="{http://www.TCIP-Final-4-0-0}SCHTripInfo"/&gt;
 *         &lt;element name="operator" type="{http://www.TCIP-Final-4-0-0}CPTOperatorIden" minOccurs="0"/&gt;
 *         &lt;element name="other-employees" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="10"&gt;
 *                   &lt;element name="other-employee" type="{http://www.TCIP-Final-4-0-0}CPTEmployeeIden"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="vehicle" type="{http://www.TCIP-Final-4-0-0}CPTVehicleIden" minOccurs="0"/&gt;
 *         &lt;element name="activation-date" type="{http://www.TCIP-Final-4-0-0}CPT-Date" minOccurs="0"/&gt;
 *         &lt;element name="deactivation-date" type="{http://www.TCIP-Final-4-0-0}CPT-Date" minOccurs="0"/&gt;
 *         &lt;element name="relief-operator" type="{http://www.TCIP-Final-4-0-0}CPTOperatorIden" minOccurs="0"/&gt;
 *         &lt;element name="relief-vehicle" type="{http://www.TCIP-Final-4-0-0}CPTVehicleIden" minOccurs="0"/&gt;
 *         &lt;element name="localSCHTripDetailInfo" type="{http://www.tcip-4-0-0-local}SCHTripDetailInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCHTripDetailInfo", propOrder = {
    "route",
    "routeDirectionName",
    "routeDirectionNameLangs",
    "routeVersion",
    "effective",
    "tripInfo",
    "operator",
    "otherEmployees",
    "vehicle",
    "activationDate",
    "deactivationDate",
    "reliefOperator",
    "reliefVehicle",
    "localSCHTripDetailInfo"
})
public class SCHTripDetailInfo {

    @XmlElement(required = true)
    protected SCHRouteIden route;
    @XmlElement(name = "route-direction-name")
    protected String routeDirectionName;
    @XmlElement(name = "route-direction-nameLangs")
    protected CPTAdditionalLanguageContents routeDirectionNameLangs;
    @XmlElement(name = "route-version")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger routeVersion;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime effective;
    @XmlElement(required = true)
    protected SCHTripInfo tripInfo;
    protected CPTOperatorIden operator;
    @XmlElement(name = "other-employees")
    protected SCHTripDetailInfo.OtherEmployees otherEmployees;
    protected CPTVehicleIden vehicle;
    @XmlElement(name = "activation-date", type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected LocalDate activationDate;
    @XmlElement(name = "deactivation-date", type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected LocalDate deactivationDate;
    @XmlElement(name = "relief-operator")
    protected CPTOperatorIden reliefOperator;
    @XmlElement(name = "relief-vehicle")
    protected CPTVehicleIden reliefVehicle;
    protected tcip_4_0_0_local.SCHTripDetailInfo localSCHTripDetailInfo;

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link SCHRouteIden }
     *     
     */
    public SCHRouteIden getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHRouteIden }
     *     
     */
    public void setRoute(SCHRouteIden value) {
        this.route = value;
    }

    /**
     * Gets the value of the routeDirectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteDirectionName() {
        return routeDirectionName;
    }

    /**
     * Sets the value of the routeDirectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteDirectionName(String value) {
        this.routeDirectionName = value;
    }

    /**
     * Gets the value of the routeDirectionNameLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getRouteDirectionNameLangs() {
        return routeDirectionNameLangs;
    }

    /**
     * Sets the value of the routeDirectionNameLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setRouteDirectionNameLangs(CPTAdditionalLanguageContents value) {
        this.routeDirectionNameLangs = value;
    }

    /**
     * Gets the value of the routeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRouteVersion() {
        return routeVersion;
    }

    /**
     * Sets the value of the routeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRouteVersion(BigInteger value) {
        this.routeVersion = value;
    }

    /**
     * Gets the value of the effective property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getEffective() {
        return effective;
    }

    /**
     * Sets the value of the effective property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffective(DateTime value) {
        this.effective = value;
    }

    /**
     * Gets the value of the tripInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SCHTripInfo }
     *     
     */
    public SCHTripInfo getTripInfo() {
        return tripInfo;
    }

    /**
     * Sets the value of the tripInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHTripInfo }
     *     
     */
    public void setTripInfo(SCHTripInfo value) {
        this.tripInfo = value;
    }

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
     * Gets the value of the otherEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link SCHTripDetailInfo.OtherEmployees }
     *     
     */
    public SCHTripDetailInfo.OtherEmployees getOtherEmployees() {
        return otherEmployees;
    }

    /**
     * Sets the value of the otherEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHTripDetailInfo.OtherEmployees }
     *     
     */
    public void setOtherEmployees(SCHTripDetailInfo.OtherEmployees value) {
        this.otherEmployees = value;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link CPTVehicleIden }
     *     
     */
    public CPTVehicleIden getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTVehicleIden }
     *     
     */
    public void setVehicle(CPTVehicleIden value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the activationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getActivationDate() {
        return activationDate;
    }

    /**
     * Sets the value of the activationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationDate(LocalDate value) {
        this.activationDate = value;
    }

    /**
     * Gets the value of the deactivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDeactivationDate() {
        return deactivationDate;
    }

    /**
     * Sets the value of the deactivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeactivationDate(LocalDate value) {
        this.deactivationDate = value;
    }

    /**
     * Gets the value of the reliefOperator property.
     * 
     * @return
     *     possible object is
     *     {@link CPTOperatorIden }
     *     
     */
    public CPTOperatorIden getReliefOperator() {
        return reliefOperator;
    }

    /**
     * Sets the value of the reliefOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTOperatorIden }
     *     
     */
    public void setReliefOperator(CPTOperatorIden value) {
        this.reliefOperator = value;
    }

    /**
     * Gets the value of the reliefVehicle property.
     * 
     * @return
     *     possible object is
     *     {@link CPTVehicleIden }
     *     
     */
    public CPTVehicleIden getReliefVehicle() {
        return reliefVehicle;
    }

    /**
     * Sets the value of the reliefVehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTVehicleIden }
     *     
     */
    public void setReliefVehicle(CPTVehicleIden value) {
        this.reliefVehicle = value;
    }

    /**
     * Gets the value of the localSCHTripDetailInfo property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_4_0_0_local.SCHTripDetailInfo }
     *     
     */
    public tcip_4_0_0_local.SCHTripDetailInfo getLocalSCHTripDetailInfo() {
        return localSCHTripDetailInfo;
    }

    /**
     * Sets the value of the localSCHTripDetailInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_4_0_0_local.SCHTripDetailInfo }
     *     
     */
    public void setLocalSCHTripDetailInfo(tcip_4_0_0_local.SCHTripDetailInfo value) {
        this.localSCHTripDetailInfo = value;
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
     *       &lt;sequence maxOccurs="10"&gt;
     *         &lt;element name="other-employee" type="{http://www.TCIP-Final-4-0-0}CPTEmployeeIden"/&gt;
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
        "otherEmployee"
    })
    public static class OtherEmployees {

        @XmlElement(name = "other-employee", required = true)
        protected List<CPTEmployeeIden> otherEmployee;

        /**
         * Gets the value of the otherEmployee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherEmployee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherEmployee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CPTEmployeeIden }
         * 
         * 
         */
        public List<CPTEmployeeIden> getOtherEmployee() {
            if (otherEmployee == null) {
                otherEmployee = new ArrayList<CPTEmployeeIden>();
            }
            return this.otherEmployee;
        }

    }

}
