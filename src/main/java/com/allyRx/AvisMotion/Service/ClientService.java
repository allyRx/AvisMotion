package com.allyRx.AvisMotion.Service;

import com.allyRx.AvisMotion.Entity.Client;
import com.allyRx.AvisMotion.Repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientService {

    //injection de dependence
    private ClientRepository clientRepository;
    public void creer(Client client) {
        clientRepository.save(client);
    }
}
