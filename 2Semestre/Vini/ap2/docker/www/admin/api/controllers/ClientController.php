<?php

class ClientController
{
    var $ClientModel;

    public function __construct()
    {
       require_once('models/ClientModel.php');
       $this -> ClientModel = new ClientModel();
    }

    public function listClients()
    {
        $result = this -> ClienModel -> listClients();
        $arrayClients = array();
        while ($line = $result -> fetch_assoc()){
            array_push($arrayClients, $line);
        }
        header('content-Type:application/json');
        echo json_encode($arrayClients);
    }

    public function consultClient($idClient)
    {
       $result = this ->ClientModel -> consultClient($idClient);
       if($arrayClient =$result -> fetch_assoc()){
        header('Content-Type: application/json');
        echo json_encode($arrayClient);
       } 
       else{
        header('Content-Type: application/json');
        echo('
        {
                "error": "1",
                "message" : "Cliente não encontrado!"
        }');
       }
    }

    public function insertClient()
    {
        $Client = json_decode(file_get_contents("php://input"));
        $arrayClient = (array)$Client;
        $this -> ClientModel -> insertClient($arrayClient);
        header('Content-Type: application/json');
        echo('
        {
                "sucess": "1",
                "message" : "Cliente inserido!"
        }');
       
    }

    public function updateClient($idClient)
    {
        $Client = json_decode(file_get_contents("php://input"));
        $arrayClient = (array)$Client;
        $this -> ClientModel -> insertClient($arrayClient);
        header('Content-Type: application/json');
        echo('
        {
                "sucess": "2",
                "message" : "Cliente alterado!"
        }');
    }

    public function deleteClient($idClient)
    {
        $Client = json_decode(file_get_contents("php://input"));
        $arrayClient = (array)$Client;
        $this -> ClientModel -> insertClient($arrayClient);
        header('Content-Type: application/json');
        echo('
        {
                "sucess": "3",
                "message" : "Cliente deletado!"
        }');
    }
}