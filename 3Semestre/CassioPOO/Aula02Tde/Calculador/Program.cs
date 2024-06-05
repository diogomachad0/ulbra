namespace Calculadora
{

    class Progam
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Digite um número:");
            double num1 = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Digite mais um número:");
            double num2 = Convert.ToDouble(Console.ReadLine());

            Calculadora obj = new Calculadora();
            var result = obj.Calcular(num1, num2, "somar");

            Console.WriteLine("a soma é " + result);
        }
    }
}