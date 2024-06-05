<?php

class ClientController
{

    public function __construct()
    {
        if (!isset($_SESSION['user'])) {
            header('Location:?controller=main&action=login');
        }
    }

    public function listClients()
    {
        require_once('models/ClientModel.php');
        $ClientModel = new ClientModel();
        $result = $ClientModel->listClients();

        $arrayClients = array();

        while ($client = $result->fetch_assoc()) {
            array_push($arrayClients, $client);
        }

        require_once('views/templates/header.php');
        require_once('views/client/listClients.php');
        require_once('views/templates/footer.php');
    }

    public function detailsClient($idClient)
    {
        require_once('models/ClientModel.php');
        $ClientModel = new ClientModel();
        $result = $ClientModel->consultClient($idClient);

        if ($arrayClient = $result->fetch_assoc()) {
            require_once('views/templates/header.php');
            require_once('views/client/detailsClient.php');
            require_once('views/templates/footer.php');
        }
    }

    public function insertClient()
    {
        require_once('views/templates/header.php');
        require_once('views/client/insertClient.php');
        require_once('views/templates/footer.php');
    }

    public function insertClientAction()
    {
        $arrayClient = array(
            'name' => $_POST['name'],
            'email' => $_POST['email'],
            'phone' => $_POST['phone'],
            'address' => $_POST['address'],
        );

        require_once('models/ClientModel.php');
        $ClientModel = new ClientModel();
        $ClientModel->insertClient($arrayClient);

        header('Location:?controller=client&action=listClients');
    }

    public function updateClient($idClient)
    {
        require_once('models/ClientModel.php');
        $ClientModel = new ClientModel();
        $result = $ClientModel->consultClient($idClient);

        if ($arrayClient = $result->fetch_assoc()) {
            require_once('views/templates/header.php');
            require_once('views/client/updateClient.php');
            require_once('views/templates/footer.php');
        }
    }

    public function updateClientAction($idClient){
        $arrayClient = array(
            'idClient' => $idClient,
            'name' => $_POST['name'],
            'email' => $_POST['email'],
            'phone' => $_POST['phone'],
            'address' => $_POST['address'],
        );

        require_once('models/ClientModel.php');
        $ClientModel = new ClientModel();
        $ClientModel -> updateClient($arrayClient);

        header('Location:?controller=client&action=listClients');
    }
    
    public function deleteClient($idClient){
        require_once('models/ClientModel.php');
        $ClientModel = new ClientModel();
        $ClientModel -> deleteClient($idClient);

        header('Location:?controller=client&action=listClients');
    }
}
