package com.example.blockbuster.controllers;

import com.example.blockbuster.models.ClientModel;
import com.example.blockbuster.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/client")
@CrossOrigin
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping()
    public ArrayList<ClientModel> findAllClients(){
        return clientService.findAllClients();
    }

    @PostMapping()
    public ClientModel saveClient(@RequestBody ClientModel client){
        return clientService.saveClient(client);
    }

    @PutMapping()
    public ClientModel updateClient(@RequestBody ClientModel client){ return clientService.saveClient(client); }

    @GetMapping(path ="/find-by-code")//localhost:8080/client/find-by-code?
    public ArrayList<ClientModel> findByCode(@RequestParam("code")String code){return clientService.findByCode(code);}

    @DeleteMapping(path="{code}")
    public String deleteByCode(@PathVariable("code") String code){
        int respuesta = Integer.parseInt(this.clientService.deleteByCode(code));
        if(respuesta==1){return "Se elimino el cliente";}
        else{return "No se elimino el cliente";}
    }
}
