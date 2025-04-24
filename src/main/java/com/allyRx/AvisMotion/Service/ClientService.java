package com.allyRx.AvisMotion.Service;

import com.allyRx.AvisMotion.Entity.Client;
import com.allyRx.AvisMotion.Repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService {

    //injection de dependence
    private ClientRepository clientRepository;
    public void creer(Client client) {
        clientRepository.save(client);
    }

    public List<Client> getClient(){
       return  clientRepository.findAll();
    }

}
