//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.15 at 11:58:51 AM WAT 
//


package com.example.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fahrenheit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "fahrenheit"
})
@XmlRootElement(name = "FahrenheitToCelsius")
public class FahrenheitToCelsius {

    @XmlElement(name = "Fahrenheit")
    protected String fahrenheit;

    /**
     * Gets the value of the fahrenheit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFahrenheit() {
        return fahrenheit;
    }

    /**
     * Sets the value of the fahrenheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFahrenheit(String value) {
        this.fahrenheit = value;
    }

}
