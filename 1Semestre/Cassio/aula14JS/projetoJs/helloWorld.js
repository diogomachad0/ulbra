//* Declarar uma variável, atribuir um valor numérico a ela. Mostrar o valor e o tipo. Teste todos os tipos vistos em sala de aula.
var testeNumerico = 10;
console.log("Esta é a variável que eu atribui um valor numérico:", testeNumerico);
console.log("É do tipo: " + typeof(testeNumerico));

//*Quando um valor de uma variável será undefined?
var nome;
console.log("É do tipo: " + typeof(nome));

//*Imprima a média aritmética de 3 números.
var nota1 = 9;
console.log("Nota 1: " + nota1);
var nota2 = 6;
console.log("Nota 2: " + nota2);
var nota3 = 6;
console.log("Nota 3: " + nota3);
var total = nota1 + nota2 + nota3;
var media = total/3;
console.log("A média é: " + media);

//*Simule as notas de um aluno da Ulbra. AP1, AP2, AS e média final.
var AvaliacaoParcial1 = 8;
console.log("Avaliacao parcial 1: " + AvaliacaoParcial1);
var AvaliacaoParcial2 = 7;
console.log("Avaliacao parcial 2: " + AvaliacaoParcial2);
var ativSemestral = 6;
console.log("Avaliacao semestral: " + ativSemestral);
var total = AvaliacaoParcial1 + AvaliacaoParcial2 + ativSemestral;
var media = total/3;
console.log("Sua média é: " + media);

//*Informe o nome e a idade de uma pessoa e imprima se esta pessoa é maior ou menor de idade.
var nome = "Diogo";
console.log("O nome da pessoa é: " + nome);
var idade = 20;
console.log("Sua idade é: " + idade);
console.log("Diogo é maior de idade!");

//*Informe 3 números e mostre qual é o maior.
var n1 = parseFloat(prompt("Digite um número:"));
var n2 = parseFloat(prompt("Digite um número:"));
var n3 = parseFloat(prompt("Digite um número:"));

function maiorDosTres() {
    var a = Array.prototype.sort.call(arguments);
    alert("O maior número é: " + a[a.length - 1]);
}

maiorDosTres (n1, n2, n3);


