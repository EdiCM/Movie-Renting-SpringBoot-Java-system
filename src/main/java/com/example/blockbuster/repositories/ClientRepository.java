package com.example.blockbuster.repositories;

import com.example.blockbuster.models.ClientModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ClientRepository  extends CrudRepository<ClientModel, Long> {

    public abstract ArrayList<ClientModel> findByCode(String code);

    public abstract String deleteByCode(String code);
}
