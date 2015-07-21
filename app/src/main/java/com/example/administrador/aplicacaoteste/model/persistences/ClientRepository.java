package com.example.administrador.aplicacaoteste.model.persistences;

import com.example.administrador.aplicacaoteste.model.entities.Client;

import java.util.List;

/**
 * Created by Administrador on 21/07/2015.
 */
public interface ClientRepository {
    public abstract void save(Client client);

    public abstract List<Client> getAll();

    public abstract void delete(Client client);


}
