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
import lrms_final_09_07.AddressPoint;
import org.joda.time.LocalDate;


/**
 * <p>Java class for PICustomerProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PICustomerProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customer-username" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="customer-password" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="customer-reminder" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="customer-new-password" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="customer" type="{http://www.TCIP-Final-4-0-0}PITravelerIden"/&gt;
 *         &lt;element name="customer-address" type="{http://www.lrms-final-09-07}AddressPoint" minOccurs="0"/&gt;
 *         &lt;element name="customer-cellphone" type="{http://www.TCIP-Final-4-0-0}IM-HomePhone" minOccurs="0"/&gt;
 *         &lt;element name="customer-homephone" type="{http://www.TCIP-Final-4-0-0}IM-HomePhone" minOccurs="0"/&gt;
 *         &lt;element name="customer-workphone" type="{http://www.TCIP-Final-4-0-0}IM-WorkPhone" minOccurs="0"/&gt;
 *         &lt;element name="customer-email" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="customer-pager" type="{http://www.TCIP-Final-4-0-0}IM-HomePhone" minOccurs="0"/&gt;
 *         &lt;element name="customer-fax" type="{http://www.TCIP-Final-4-0-0}IM-WorkPhone" minOccurs="0"/&gt;
 *         &lt;element name="customer-birthdate" type="{http://www.TCIP-Final-4-0-0}CPT-Date" minOccurs="0"/&gt;
 *         &lt;element name="customer-ssn" type="{http://www.TCIP-Final-4-0-0}CPT-SSN" minOccurs="0"/&gt;
 *         &lt;element name="recurring-trips" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="20"&gt;
 *                   &lt;element name="recurring-trip" type="{http://www.TCIP-Final-4-0-0}PIRecurringTrip"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="subscriptions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="20"&gt;
 *                   &lt;element name="subscription" type="{http://www.TCIP-Final-4-0-0}PICustSubscription"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="localPICustomerProfile" type="{http://www.tcip-4-0-0-local}PICustomerProfile" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PICustomerProfile", propOrder = {
    "customerUsername",
    "customerPassword",
    "customerReminder",
    "customerNewPassword",
    "customer",
    "customerAddress",
    "customerCellphone",
    "customerHomephone",
    "customerWorkphone",
    "customerEmail",
    "customerPager",
    "customerFax",
    "customerBirthdate",
    "customerSsn",
    "recurringTrips",
    "subscriptions",
    "localPICustomerProfile"
})
public class PICustomerProfile {

    @XmlElement(name = "customer-username")
    protected String customerUsername;
    @XmlElement(name = "customer-password")
    protected String customerPassword;
    @XmlElement(name = "customer-reminder")
    protected String customerReminder;
    @XmlElement(name = "customer-new-password")
    protected String customerNewPassword;
    @XmlElement(required = true)
    protected PITravelerIden customer;
    @XmlElement(name = "customer-address")
    protected AddressPoint customerAddress;
    @XmlElement(name = "customer-cellphone")
    protected String customerCellphone;
    @XmlElement(name = "customer-homephone")
    protected String customerHomephone;
    @XmlElement(name = "customer-workphone")
    protected String customerWorkphone;
    @XmlElement(name = "customer-email")
    protected String customerEmail;
    @XmlElement(name = "customer-pager")
    protected String customerPager;
    @XmlElement(name = "customer-fax")
    protected String customerFax;
    @XmlElement(name = "customer-birthdate", type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected LocalDate customerBirthdate;
    @XmlElement(name = "customer-ssn")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger customerSsn;
    @XmlElement(name = "recurring-trips")
    protected PICustomerProfile.RecurringTrips recurringTrips;
    protected PICustomerProfile.Subscriptions subscriptions;
    protected tcip_4_0_0_local.PICustomerProfile localPICustomerProfile;

    /**
     * Gets the value of the customerUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerUsername() {
        return customerUsername;
    }

    /**
     * Sets the value of the customerUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerUsername(String value) {
        this.customerUsername = value;
    }

    /**
     * Gets the value of the customerPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPassword() {
        return customerPassword;
    }

    /**
     * Sets the value of the customerPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPassword(String value) {
        this.customerPassword = value;
    }

    /**
     * Gets the value of the customerReminder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReminder() {
        return customerReminder;
    }

    /**
     * Sets the value of the customerReminder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReminder(String value) {
        this.customerReminder = value;
    }

    /**
     * Gets the value of the customerNewPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNewPassword() {
        return customerNewPassword;
    }

    /**
     * Sets the value of the customerNewPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNewPassword(String value) {
        this.customerNewPassword = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link PITravelerIden }
     *     
     */
    public PITravelerIden getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PITravelerIden }
     *     
     */
    public void setCustomer(PITravelerIden value) {
        this.customer = value;
    }

    /**
     * Gets the value of the customerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPoint }
     *     
     */
    public AddressPoint getCustomerAddress() {
        return customerAddress;
    }

    /**
     * Sets the value of the customerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPoint }
     *     
     */
    public void setCustomerAddress(AddressPoint value) {
        this.customerAddress = value;
    }

    /**
     * Gets the value of the customerCellphone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCellphone() {
        return customerCellphone;
    }

    /**
     * Sets the value of the customerCellphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCellphone(String value) {
        this.customerCellphone = value;
    }

    /**
     * Gets the value of the customerHomephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerHomephone() {
        return customerHomephone;
    }

    /**
     * Sets the value of the customerHomephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerHomephone(String value) {
        this.customerHomephone = value;
    }

    /**
     * Gets the value of the customerWorkphone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerWorkphone() {
        return customerWorkphone;
    }

    /**
     * Sets the value of the customerWorkphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerWorkphone(String value) {
        this.customerWorkphone = value;
    }

    /**
     * Gets the value of the customerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * Sets the value of the customerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerEmail(String value) {
        this.customerEmail = value;
    }

    /**
     * Gets the value of the customerPager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPager() {
        return customerPager;
    }

    /**
     * Sets the value of the customerPager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPager(String value) {
        this.customerPager = value;
    }

    /**
     * Gets the value of the customerFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFax() {
        return customerFax;
    }

    /**
     * Sets the value of the customerFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFax(String value) {
        this.customerFax = value;
    }

    /**
     * Gets the value of the customerBirthdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getCustomerBirthdate() {
        return customerBirthdate;
    }

    /**
     * Sets the value of the customerBirthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerBirthdate(LocalDate value) {
        this.customerBirthdate = value;
    }

    /**
     * Gets the value of the customerSsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomerSsn() {
        return customerSsn;
    }

    /**
     * Sets the value of the customerSsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomerSsn(BigInteger value) {
        this.customerSsn = value;
    }

    /**
     * Gets the value of the recurringTrips property.
     * 
     * @return
     *     possible object is
     *     {@link PICustomerProfile.RecurringTrips }
     *     
     */
    public PICustomerProfile.RecurringTrips getRecurringTrips() {
        return recurringTrips;
    }

    /**
     * Sets the value of the recurringTrips property.
     * 
     * @param value
     *     allowed object is
     *     {@link PICustomerProfile.RecurringTrips }
     *     
     */
    public void setRecurringTrips(PICustomerProfile.RecurringTrips value) {
        this.recurringTrips = value;
    }

    /**
     * Gets the value of the subscriptions property.
     * 
     * @return
     *     possible object is
     *     {@link PICustomerProfile.Subscriptions }
     *     
     */
    public PICustomerProfile.Subscriptions getSubscriptions() {
        return subscriptions;
    }

    /**
     * Sets the value of the subscriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PICustomerProfile.Subscriptions }
     *     
     */
    public void setSubscriptions(PICustomerProfile.Subscriptions value) {
        this.subscriptions = value;
    }

    /**
     * Gets the value of the localPICustomerProfile property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_4_0_0_local.PICustomerProfile }
     *     
     */
    public tcip_4_0_0_local.PICustomerProfile getLocalPICustomerProfile() {
        return localPICustomerProfile;
    }

    /**
     * Sets the value of the localPICustomerProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_4_0_0_local.PICustomerProfile }
     *     
     */
    public void setLocalPICustomerProfile(tcip_4_0_0_local.PICustomerProfile value) {
        this.localPICustomerProfile = value;
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
     *         &lt;element name="recurring-trip" type="{http://www.TCIP-Final-4-0-0}PIRecurringTrip"/&gt;
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
        "recurringTrip"
    })
    public static class RecurringTrips {

        @XmlElement(name = "recurring-trip", required = true)
        protected List<PIRecurringTrip> recurringTrip;

        /**
         * Gets the value of the recurringTrip property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recurringTrip property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecurringTrip().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PIRecurringTrip }
         * 
         * 
         */
        public List<PIRecurringTrip> getRecurringTrip() {
            if (recurringTrip == null) {
                recurringTrip = new ArrayList<PIRecurringTrip>();
            }
            return this.recurringTrip;
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
     *         &lt;element name="subscription" type="{http://www.TCIP-Final-4-0-0}PICustSubscription"/&gt;
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
        "subscription"
    })
    public static class Subscriptions {

        @XmlElement(required = true)
        protected List<PICustSubscription> subscription;

        /**
         * Gets the value of the subscription property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subscription property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubscription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PICustSubscription }
         * 
         * 
         */
        public List<PICustSubscription> getSubscription() {
            if (subscription == null) {
                subscription = new ArrayList<PICustSubscription>();
            }
            return this.subscription;
        }

    }

}
