
function somaPares() {

    var numeros = [];
    numeros[0] = '73167176531330624919225119674426574742355349194934'
    numeros[1] = '96983520312774506326239578318016984801869478851843'
    numeros[2] = '85861560789112949495459501737958331952853208805511'
    numeros[3] = '12540698747158523863050715693290963295227443043557'
    numeros[4] = '66896648950445244523161731856403098711121722383113'
    numeros[5] = '62229893423380308135336276614282806444486645238749'
    numeros[6] = '30358907296290491560440772390713810515859307960866'
    numeros[7] = '70172427121883998797908792274921901699720888093776'
    numeros[8] = '65727333001053367881220235421809751254540594752243'
    numeros[9] = '52584907711670556013604839586446706324415722155397'
    numeros[10] = '53697817977846174064955149290862569321978468622482'
    numeros[11] = '83972241375657056057490261407972968652414535100474'
    numeros[12] = '82166370484403199890008895243450658541227588666881'
    numeros[13] = '16427171479924442928230863465674813919123162824586'
    numeros[14] = '17866458359124566529476545682848912883142607690042'
    numeros[15] = '24219022671055626321111109370544217506941658960408'
    numeros[16] = '07198403850962455444362981230987879927244284909188'
    numeros[17] = '84580156166097919133875499200524063689912560717606'
    numeros[18] = '05886116467109405077541002256983155200055935729725'
    numeros[19] = '71636269561882670428252483600823257530420752963450'
    for (i = 0; i < numeros.length; i++) {
        var arrLinha = numeros[i].split('');
        var total = 0;
        for (x = 0; x < arrLinha.length; x++) {
            arrLinha[x] % 2 == 0 ? total = total + parseInt(arrLinha[x]) : false;
        }
        console.log(' : Soma: ' + total);
    }
}