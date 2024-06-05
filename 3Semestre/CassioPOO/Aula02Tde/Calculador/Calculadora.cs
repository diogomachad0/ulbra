public class Calculadora
{
    public double result { get; set; }

    public double Calcular(double num1, double num2, string oper)
    {
        switch (oper)
        {
            case "somar":
                this.result = num1 + num2;
                break;
            default:
                break;
        }
        return this.result;
    }

}
