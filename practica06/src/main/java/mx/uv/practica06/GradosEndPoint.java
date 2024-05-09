package mx.uv.practica06;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import mx.uv.t4is.grados.CelsiusRequest;
import mx.uv.t4is.grados.CelsiusResponse;
import mx.uv.t4is.grados.FahrenheitRequest;
import mx.uv.t4is.grados.FahrenheitResponse;

@Endpoint
public class GradosEndPoint {
    @PayloadRoot(localPart = "CelsiusRequest", namespace = "t4is.uv.mx/grados")
    @ResponsePayload
    public CelsiusResponse CelsiusFahreheit(@RequestPayload CelsiusRequest celsius) {
        CelsiusResponse fahrenheit = new CelsiusResponse();
        fahrenheit.setFahrenheit((celsius.getCelsius() * 1.8) + 32);
        return fahrenheit;
    }

    @PayloadRoot(localPart = "FahrenheitRequest", namespace = "t4is.uv.mx/grados")
    @ResponsePayload
    public FahrenheitResponse FarenheitCelsius(@RequestPayload FahrenheitRequest fahrenheit) {
        FahrenheitResponse celsius = new FahrenheitResponse();
        celsius.setCelsius((fahrenheit.getFahrenheit() - 32) * 0.5555556);
        return celsius;
    }
}
