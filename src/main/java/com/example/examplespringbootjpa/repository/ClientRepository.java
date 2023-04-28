package com.example.examplespringbootjpa.repository;

import com.example.examplespringbootjpa.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client,Long> {
    Client findByIdAndActive(Long id, Boolean active);
}

/*
*   @Repository: Esta etiqueta nos permite establecer que esta interface se trata de un repository,
*       la interface debe extender de la interface CrudRepository, la cual nos da accedo a todos los
*       metodos que nos permiten interacturar con nuestra base de datos, esta recibe como parametros
*       la entidad y el tipo de dato de su ID
*   -Mediante la linea 9 es como nosotros podemos definir nuestros propios metodos ademas de lo que
*       ya nos ofrece la interface, por ejemplo eset va a ser un metodo que busque un registro por su
*       ID pero tambien por si es que esta activo
*
* */
