//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.05.08 a las 04:29:27 PM CST 
//


package mx.uv.t4is.grados;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.uv.t4is.grados package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.uv.t4is.grados
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CelsiusRequest }
     * 
     */
    public CelsiusRequest createCelsiusRequest() {
        return new CelsiusRequest();
    }

    /**
     * Create an instance of {@link CelsiusResponse }
     * 
     */
    public CelsiusResponse createCelsiusResponse() {
        return new CelsiusResponse();
    }

    /**
     * Create an instance of {@link FahrenheitRequest }
     * 
     */
    public FahrenheitRequest createFahrenheitRequest() {
        return new FahrenheitRequest();
    }

    /**
     * Create an instance of {@link FahrenheitResponse }
     * 
     */
    public FahrenheitResponse createFahrenheitResponse() {
        return new FahrenheitResponse();
    }

}
