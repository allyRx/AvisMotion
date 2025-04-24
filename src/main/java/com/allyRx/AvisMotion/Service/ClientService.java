package com.allyRx.AvisMotion.Service;

import com.allyRx.AvisMotion.Entity.Client;
import com.allyRx.AvisMotion.Repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientService {

    //injection de dependence
    private ClientRepository clientRepository;

    public void creer(Client client) {
        Client Exist = clientRepository.findByEmail(client.getEmail());
          if (Exist == null) {
              clientRepository.save(client);
          }

    }

    public List<Client> getClient(){
        return  clientRepository.findAll();
    }

    public Optional<Client> getClientById(Long id) {
        return clientRepository.findById(id);
    }

    public void deleteClientById(Long id) {
        clientRepository.deleteById(id);
    }
}
