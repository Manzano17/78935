using System.ServiceModel;

[ServiceContract]

public interface ICalculadoraServicio {
    [OperationContract]
    int Suma(int num1, int num2);
    [OperationContract]
    int Resta(int num1, int num2);
}