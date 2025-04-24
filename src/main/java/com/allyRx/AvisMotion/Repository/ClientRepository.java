package com.allyRx.AvisMotion.Repository;

import com.allyRx.AvisMotion.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client , Long> {
}
