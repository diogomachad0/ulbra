$(document).ready(function () {

    $('menu_home').click(function () {
        $('section').load('home.html')
    })

    $('#menu_calculadora').click(function () {
        $('section').load('calculadora.html')
    })

    $('#mostrar').click(function () {
        $('#conteudo').show()
    })

    $('#ocultar').click(function () {
        $('#conteudo').hide()
    })

    $('#calcular').click(function () {

        var num1 = parseFloat($('#num1').val())
        var num2 = parseFloat($('#num2').val())
        var operacao = $('#operacao').val()
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
        $('#resultado').html('O resultado é: ' + resultado)
    })
})


