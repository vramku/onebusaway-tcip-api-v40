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


/**
 * <p>Java class for FCVaultContents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FCVaultContents"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="last-empty-time" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime"/&gt;
 *         &lt;element name="time-recorded" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime"/&gt;
 *         &lt;element name="vaultID" type="{http://www.TCIP-Final-4-0-0}CPT-SerialNumber"/&gt;
 *         &lt;element name="cashboxIDs"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="30000"&gt;
 *                   &lt;element name="cashboxID" type="{http://www.TCIP-Final-4-0-0}CPT-SerialNumber"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="total-cash" type="{http://www.TCIP-Final-4-0-0}FC-MonetaryValue" minOccurs="0"/&gt;
 *         &lt;element name="currency-type" type="{http://www.TCIP-Final-4-0-0}FC-MonetaryInstrAuth" minOccurs="0"/&gt;
 *         &lt;element name="pennies" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="nickels" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="dimes" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="quarters" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="fifty-cent-pieces" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="dollar-coins" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="dollar-bills" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="two-dollar-bills" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="five-dollar-bills" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="ten-dollar-bills" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="twenty-dollar-bills" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="fifty-dollar-bills" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="hundred-dollar-bills" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="token-typeA" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="token-typeB" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="token-typeC" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="token-typeD" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="token-typeE" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="transfer-typeA" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="transfer-typeB" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="transfer-typeC" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="transfer-typeD" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="transfer-typeE" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="transfer-typeF" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="transfer-typeG" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="ticket-typeA" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="ticket-typeB" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="ticket-typeC" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="ticket-typeD" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="ticket-typeE" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="tear-off-typeA" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="tear-off-typeB" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="tear-off-typeC" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="tear-off-typeD" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="tear-off-typeE" type="{http://www.TCIP-Final-4-0-0}CPT-GenericCounter" minOccurs="0"/&gt;
 *         &lt;element name="localFCVaultContents" type="{http://www.tcip-4-0-0-local}FCVaultContents" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FCVaultContents", propOrder = {
    "lastEmptyTime",
    "timeRecorded",
    "vaultID",
    "cashboxIDs",
    "totalCash",
    "currencyType",
    "pennies",
    "nickels",
    "dimes",
    "quarters",
    "fiftyCentPieces",
    "dollarCoins",
    "dollarBills",
    "twoDollarBills",
    "fiveDollarBills",
    "tenDollarBills",
    "twentyDollarBills",
    "fiftyDollarBills",
    "hundredDollarBills",
    "tokenTypeA",
    "tokenTypeB",
    "tokenTypeC",
    "tokenTypeD",
    "tokenTypeE",
    "transferTypeA",
    "transferTypeB",
    "transferTypeC",
    "transferTypeD",
    "transferTypeE",
    "transferTypeF",
    "transferTypeG",
    "ticketTypeA",
    "ticketTypeB",
    "ticketTypeC",
    "ticketTypeD",
    "ticketTypeE",
    "tearOffTypeA",
    "tearOffTypeB",
    "tearOffTypeC",
    "tearOffTypeD",
    "tearOffTypeE",
    "localFCVaultContents"
})
public class FCVaultContents {

    @XmlElement(name = "last-empty-time", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime lastEmptyTime;
    @XmlElement(name = "time-recorded", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime timeRecorded;
    @XmlElement(required = true)
    protected String vaultID;
    @XmlElement(required = true)
    protected FCVaultContents.CashboxIDs cashboxIDs;
    @XmlElement(name = "total-cash")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger totalCash;
    @XmlElement(name = "currency-type")
    protected String currencyType;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger pennies;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger nickels;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger dimes;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger quarters;
    @XmlElement(name = "fifty-cent-pieces")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger fiftyCentPieces;
    @XmlElement(name = "dollar-coins")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger dollarCoins;
    @XmlElement(name = "dollar-bills")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger dollarBills;
    @XmlElement(name = "two-dollar-bills")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger twoDollarBills;
    @XmlElement(name = "five-dollar-bills")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger fiveDollarBills;
    @XmlElement(name = "ten-dollar-bills")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger tenDollarBills;
    @XmlElement(name = "twenty-dollar-bills")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger twentyDollarBills;
    @XmlElement(name = "fifty-dollar-bills")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger fiftyDollarBills;
    @XmlElement(name = "hundred-dollar-bills")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger hundredDollarBills;
    @XmlElement(name = "token-typeA")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger tokenTypeA;
    @XmlElement(name = "token-typeB")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger tokenTypeB;
    @XmlElement(name = "token-typeC")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger tokenTypeC;
    @XmlElement(name = "token-typeD")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger tokenTypeD;
    @XmlElement(name = "token-typeE")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger tokenTypeE;
    @XmlElement(name = "transfer-typeA")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger transferTypeA;
    @XmlElement(name = "transfer-typeB")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger transferTypeB;
    @XmlElement(name = "transfer-typeC")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger transferTypeC;
    @XmlElement(name = "transfer-typeD")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger transferTypeD;
    @XmlElement(name = "transfer-typeE")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger transferTypeE;
    @XmlElement(name = "transfer-typeF")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger transferTypeF;
    @XmlElement(name = "transfer-typeG")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger transferTypeG;
    @XmlElement(name = "ticket-typeA")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger ticketTypeA;
    @XmlElement(name = "ticket-typeB")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger ticketTypeB;
    @XmlElement(name = "ticket-typeC")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger ticketTypeC;
    @XmlElement(name = "ticket-typeD")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger ticketTypeD;
    @XmlElement(name = "ticket-typeE")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger ticketTypeE;
    @XmlElement(name = "tear-off-typeA")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger tearOffTypeA;
    @XmlElement(name = "tear-off-typeB")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger tearOffTypeB;
    @XmlElement(name = "tear-off-typeC")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger tearOffTypeC;
    @XmlElement(name = "tear-off-typeD")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger tearOffTypeD;
    @XmlElement(name = "tear-off-typeE")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger tearOffTypeE;
    protected tcip_4_0_0_local.FCVaultContents localFCVaultContents;

    /**
     * Gets the value of the lastEmptyTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getLastEmptyTime() {
        return lastEmptyTime;
    }

    /**
     * Sets the value of the lastEmptyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastEmptyTime(DateTime value) {
        this.lastEmptyTime = value;
    }

    /**
     * Gets the value of the timeRecorded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getTimeRecorded() {
        return timeRecorded;
    }

    /**
     * Sets the value of the timeRecorded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeRecorded(DateTime value) {
        this.timeRecorded = value;
    }

    /**
     * Gets the value of the vaultID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVaultID() {
        return vaultID;
    }

    /**
     * Sets the value of the vaultID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVaultID(String value) {
        this.vaultID = value;
    }

    /**
     * Gets the value of the cashboxIDs property.
     * 
     * @return
     *     possible object is
     *     {@link FCVaultContents.CashboxIDs }
     *     
     */
    public FCVaultContents.CashboxIDs getCashboxIDs() {
        return cashboxIDs;
    }

    /**
     * Sets the value of the cashboxIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FCVaultContents.CashboxIDs }
     *     
     */
    public void setCashboxIDs(FCVaultContents.CashboxIDs value) {
        this.cashboxIDs = value;
    }

    /**
     * Gets the value of the totalCash property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCash() {
        return totalCash;
    }

    /**
     * Sets the value of the totalCash property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCash(BigInteger value) {
        this.totalCash = value;
    }

    /**
     * Gets the value of the currencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyType() {
        return currencyType;
    }

    /**
     * Sets the value of the currencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyType(String value) {
        this.currencyType = value;
    }

    /**
     * Gets the value of the pennies property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPennies() {
        return pennies;
    }

    /**
     * Sets the value of the pennies property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPennies(BigInteger value) {
        this.pennies = value;
    }

    /**
     * Gets the value of the nickels property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNickels() {
        return nickels;
    }

    /**
     * Sets the value of the nickels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNickels(BigInteger value) {
        this.nickels = value;
    }

    /**
     * Gets the value of the dimes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDimes() {
        return dimes;
    }

    /**
     * Sets the value of the dimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDimes(BigInteger value) {
        this.dimes = value;
    }

    /**
     * Gets the value of the quarters property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuarters() {
        return quarters;
    }

    /**
     * Sets the value of the quarters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuarters(BigInteger value) {
        this.quarters = value;
    }

    /**
     * Gets the value of the fiftyCentPieces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFiftyCentPieces() {
        return fiftyCentPieces;
    }

    /**
     * Sets the value of the fiftyCentPieces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFiftyCentPieces(BigInteger value) {
        this.fiftyCentPieces = value;
    }

    /**
     * Gets the value of the dollarCoins property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDollarCoins() {
        return dollarCoins;
    }

    /**
     * Sets the value of the dollarCoins property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDollarCoins(BigInteger value) {
        this.dollarCoins = value;
    }

    /**
     * Gets the value of the dollarBills property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDollarBills() {
        return dollarBills;
    }

    /**
     * Sets the value of the dollarBills property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDollarBills(BigInteger value) {
        this.dollarBills = value;
    }

    /**
     * Gets the value of the twoDollarBills property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTwoDollarBills() {
        return twoDollarBills;
    }

    /**
     * Sets the value of the twoDollarBills property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTwoDollarBills(BigInteger value) {
        this.twoDollarBills = value;
    }

    /**
     * Gets the value of the fiveDollarBills property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFiveDollarBills() {
        return fiveDollarBills;
    }

    /**
     * Sets the value of the fiveDollarBills property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFiveDollarBills(BigInteger value) {
        this.fiveDollarBills = value;
    }

    /**
     * Gets the value of the tenDollarBills property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTenDollarBills() {
        return tenDollarBills;
    }

    /**
     * Sets the value of the tenDollarBills property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTenDollarBills(BigInteger value) {
        this.tenDollarBills = value;
    }

    /**
     * Gets the value of the twentyDollarBills property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTwentyDollarBills() {
        return twentyDollarBills;
    }

    /**
     * Sets the value of the twentyDollarBills property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTwentyDollarBills(BigInteger value) {
        this.twentyDollarBills = value;
    }

    /**
     * Gets the value of the fiftyDollarBills property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFiftyDollarBills() {
        return fiftyDollarBills;
    }

    /**
     * Sets the value of the fiftyDollarBills property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFiftyDollarBills(BigInteger value) {
        this.fiftyDollarBills = value;
    }

    /**
     * Gets the value of the hundredDollarBills property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHundredDollarBills() {
        return hundredDollarBills;
    }

    /**
     * Sets the value of the hundredDollarBills property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHundredDollarBills(BigInteger value) {
        this.hundredDollarBills = value;
    }

    /**
     * Gets the value of the tokenTypeA property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTokenTypeA() {
        return tokenTypeA;
    }

    /**
     * Sets the value of the tokenTypeA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTokenTypeA(BigInteger value) {
        this.tokenTypeA = value;
    }

    /**
     * Gets the value of the tokenTypeB property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTokenTypeB() {
        return tokenTypeB;
    }

    /**
     * Sets the value of the tokenTypeB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTokenTypeB(BigInteger value) {
        this.tokenTypeB = value;
    }

    /**
     * Gets the value of the tokenTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTokenTypeC() {
        return tokenTypeC;
    }

    /**
     * Sets the value of the tokenTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTokenTypeC(BigInteger value) {
        this.tokenTypeC = value;
    }

    /**
     * Gets the value of the tokenTypeD property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTokenTypeD() {
        return tokenTypeD;
    }

    /**
     * Sets the value of the tokenTypeD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTokenTypeD(BigInteger value) {
        this.tokenTypeD = value;
    }

    /**
     * Gets the value of the tokenTypeE property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTokenTypeE() {
        return tokenTypeE;
    }

    /**
     * Sets the value of the tokenTypeE property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTokenTypeE(BigInteger value) {
        this.tokenTypeE = value;
    }

    /**
     * Gets the value of the transferTypeA property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransferTypeA() {
        return transferTypeA;
    }

    /**
     * Sets the value of the transferTypeA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransferTypeA(BigInteger value) {
        this.transferTypeA = value;
    }

    /**
     * Gets the value of the transferTypeB property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransferTypeB() {
        return transferTypeB;
    }

    /**
     * Sets the value of the transferTypeB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransferTypeB(BigInteger value) {
        this.transferTypeB = value;
    }

    /**
     * Gets the value of the transferTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransferTypeC() {
        return transferTypeC;
    }

    /**
     * Sets the value of the transferTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransferTypeC(BigInteger value) {
        this.transferTypeC = value;
    }

    /**
     * Gets the value of the transferTypeD property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransferTypeD() {
        return transferTypeD;
    }

    /**
     * Sets the value of the transferTypeD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransferTypeD(BigInteger value) {
        this.transferTypeD = value;
    }

    /**
     * Gets the value of the transferTypeE property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransferTypeE() {
        return transferTypeE;
    }

    /**
     * Sets the value of the transferTypeE property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransferTypeE(BigInteger value) {
        this.transferTypeE = value;
    }

    /**
     * Gets the value of the transferTypeF property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransferTypeF() {
        return transferTypeF;
    }

    /**
     * Sets the value of the transferTypeF property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransferTypeF(BigInteger value) {
        this.transferTypeF = value;
    }

    /**
     * Gets the value of the transferTypeG property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransferTypeG() {
        return transferTypeG;
    }

    /**
     * Sets the value of the transferTypeG property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransferTypeG(BigInteger value) {
        this.transferTypeG = value;
    }

    /**
     * Gets the value of the ticketTypeA property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTicketTypeA() {
        return ticketTypeA;
    }

    /**
     * Sets the value of the ticketTypeA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTicketTypeA(BigInteger value) {
        this.ticketTypeA = value;
    }

    /**
     * Gets the value of the ticketTypeB property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTicketTypeB() {
        return ticketTypeB;
    }

    /**
     * Sets the value of the ticketTypeB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTicketTypeB(BigInteger value) {
        this.ticketTypeB = value;
    }

    /**
     * Gets the value of the ticketTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTicketTypeC() {
        return ticketTypeC;
    }

    /**
     * Sets the value of the ticketTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTicketTypeC(BigInteger value) {
        this.ticketTypeC = value;
    }

    /**
     * Gets the value of the ticketTypeD property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTicketTypeD() {
        return ticketTypeD;
    }

    /**
     * Sets the value of the ticketTypeD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTicketTypeD(BigInteger value) {
        this.ticketTypeD = value;
    }

    /**
     * Gets the value of the ticketTypeE property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTicketTypeE() {
        return ticketTypeE;
    }

    /**
     * Sets the value of the ticketTypeE property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTicketTypeE(BigInteger value) {
        this.ticketTypeE = value;
    }

    /**
     * Gets the value of the tearOffTypeA property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTearOffTypeA() {
        return tearOffTypeA;
    }

    /**
     * Sets the value of the tearOffTypeA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTearOffTypeA(BigInteger value) {
        this.tearOffTypeA = value;
    }

    /**
     * Gets the value of the tearOffTypeB property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTearOffTypeB() {
        return tearOffTypeB;
    }

    /**
     * Sets the value of the tearOffTypeB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTearOffTypeB(BigInteger value) {
        this.tearOffTypeB = value;
    }

    /**
     * Gets the value of the tearOffTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTearOffTypeC() {
        return tearOffTypeC;
    }

    /**
     * Sets the value of the tearOffTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTearOffTypeC(BigInteger value) {
        this.tearOffTypeC = value;
    }

    /**
     * Gets the value of the tearOffTypeD property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTearOffTypeD() {
        return tearOffTypeD;
    }

    /**
     * Sets the value of the tearOffTypeD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTearOffTypeD(BigInteger value) {
        this.tearOffTypeD = value;
    }

    /**
     * Gets the value of the tearOffTypeE property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTearOffTypeE() {
        return tearOffTypeE;
    }

    /**
     * Sets the value of the tearOffTypeE property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTearOffTypeE(BigInteger value) {
        this.tearOffTypeE = value;
    }

    /**
     * Gets the value of the localFCVaultContents property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_4_0_0_local.FCVaultContents }
     *     
     */
    public tcip_4_0_0_local.FCVaultContents getLocalFCVaultContents() {
        return localFCVaultContents;
    }

    /**
     * Sets the value of the localFCVaultContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_4_0_0_local.FCVaultContents }
     *     
     */
    public void setLocalFCVaultContents(tcip_4_0_0_local.FCVaultContents value) {
        this.localFCVaultContents = value;
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
     *       &lt;sequence maxOccurs="30000"&gt;
     *         &lt;element name="cashboxID" type="{http://www.TCIP-Final-4-0-0}CPT-SerialNumber"/&gt;
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
        "cashboxID"
    })
    public static class CashboxIDs {

        @XmlElement(required = true)
        protected List<String> cashboxID;

        /**
         * Gets the value of the cashboxID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cashboxID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCashboxID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCashboxID() {
            if (cashboxID == null) {
                cashboxID = new ArrayList<String>();
            }
            return this.cashboxID;
        }

    }

}