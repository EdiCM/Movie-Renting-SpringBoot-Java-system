package com.example.blockbuster.services;

import com.example.blockbuster.models.ClientModel;
import com.example.blockbuster.repositories.ClientRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Transactional
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public ArrayList<ClientModel> findAllClients(){
        return (ArrayList<ClientModel>) clientRepository.findAll();
    }

    public ClientModel saveClient(ClientModel client){
        return clientRepository.save(client);
    }

    public ArrayList<ClientModel> findByCode(String code){return clientRepository.findByCode(code);}

    public String deleteByCode(String code){return clientRepository.deleteByCode(code);}
}
