$(document).ready(function(){

    $('section').load('pages/home.html')

    $('#btn-home').click(function(){
        $('section').load('pages/home.html')
    })

    $('#btn-sobre').click(function(){
        $('section').load('pages/sobre.html')
    })


});