//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.05.03 a las 06:28:18 PM CST 
//


package mx.uv.t4is.saludos;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="saludo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "saludo"
})
@XmlRootElement(name = "SaludarResponse")
public class SaludarResponse {

    @XmlElement(required = true)
    protected String saludo;

    /**
     * Obtiene el valor de la propiedad saludo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaludo() {
        return saludo;
    }

    /**
     * Define el valor de la propiedad saludo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaludo(String value) {
        this.saludo = value;
    }

}
