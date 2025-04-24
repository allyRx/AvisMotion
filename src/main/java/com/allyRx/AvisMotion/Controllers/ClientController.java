package com.allyRx.AvisMotion.Controllers;

import com.allyRx.AvisMotion.Entity.Client;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("Client")
public class ClientController {

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void createClient(@RequestBody Client client) {}

}
