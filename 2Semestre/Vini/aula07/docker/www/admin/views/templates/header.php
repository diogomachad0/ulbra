<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <!--Jquery-->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

    <!--Bootstrap-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

    <!--JS e CSS-->
    <script src="assets/js/script.js"></script>
    <link rel="stylesheet" href="assets/css/style.css">

</head>

<body>

    <header class="p-3 text-center">
        <h1>Área Administrativa</h1>
        <a href="?controller=main&action=logout">Sair</a>
    </header>

    <div class="container-fluid">
        <div class="row">
            <nav class="p-3 col-md-3">
                <h1>Menu</h1>
                <ul class="nav flex-column">
                    <li class="nav-item">
                        <a class="nav-link" href="?controller=site&action=index">Home</a>
                    </li>
                </ul>


            </nav>
            <section class="p-3 col-md-9">