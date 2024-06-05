<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <!--jquery-->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

    <!--bootstrap-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

    <!--Js e Style-->
    <script src="assets/js/script.js"></script>
    <link rel="stylesheet" href="assets/css/style.css">

</head>

<body>

    <header class="p-5 bg-primary text-white text-center">
        <h1> minha pagina inicial</h1>

    </header>

    <div class="container-fluid">
        <div class="row">
            <nav class="p-3 col-md-3">
                <ul class="nav flex-column">
                    <li class="nav-item">
                        <a id="home" class="nav-link" href="?controller=site&action=home">home</a>
                    </li>
                    <li class="nav-item">
                        <a id="sobre" class="nav-link" href="?controller=site&action=sobre">sobre</a>
                    </li>
                    <li class="nav-item">
                        <a id="produtos" class="nav-link" href="?controller=site&action=produto">produtos e serviços</a>
                    </li>
                    <li class="nav-item">
                        <a id="contatos" class="nav-link" href="?controller=site&action=contato">contato</a>
                    </li>
                
                <h2>Clientes</h2>
                    <li id='' class="nav-item">
                        <a  class="nav-link" href="?controller=client&action=register">cadrastro</a>
                    </li>
                    <li class="nav-item">
                        <a id='' class="nav-link" href="?controller=client&action=listClients">Listar Clientes</a>
                    </li>
                </ul>
            </nav>
            <section class="col-md-9 p-5">