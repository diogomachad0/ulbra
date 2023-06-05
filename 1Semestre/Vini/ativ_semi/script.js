var num = prompt('Digite um numero: ')

if (num > 10) {
    alert('É maior que 10!')
} else if (num < 10) {
    alert('É menor que 10!')
} else {
    alert('É igual a 10!')
}


var n1 = parseFloat(prompt('Digite um valor: '))
var n2 = parseFloat(prompt('Digite um valor: '))
soma = n1 + n2
alert('A soma é: ' + soma)


var num1 = parseFloat(prompt('Digite um numero: '))
var operacao = prompt('Digite a operação que deseja (+, -, *, ou /)')
var num2 = parseFloat(prompt('Digite um numero: '))

var resultado
switch (operacao) {
    case '+':
        resultado = num1 + num2
        break;
    case '-':
        resultado = num1 - num2
        break;
    case '*':
        resultado = num1 * num2
        break;
    case '/':
        resultado = num1 / num2
        break;
}
alert('O resultado da operação é: ' + resultado)



    var nome = prompt('Digite seu nome: ')
    var valor = parseFloat(prompt('Digite o numero de vezes: '))
    for (var i = 0; i < valor; i++) {
        alert('Imprimindo ' + nome + ' ' + (i+1) + ' vezes')
    }




var dados = []
dados[0] = prompt('Digite o nome: ')
dados[1] = prompt('Digite o endereço: ')
dados[2] = prompt('Digite o email: ')

alert('Oi ' + dados[0] + ' seu endereço é' + dados[1] + ' , seu email é ' + dados[2])

