package com.example.examplespringbootjpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "client")
public class Client {
    @Id
    @SequenceGenerator(
            name = "client_sequence",
            sequenceName = "client_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "client_sequence"
    )
    private Long id;
    private String name;
    private Boolean online;
    private Timestamp createAt;
    private String password;
    @Column(name = "email", length = 50, nullable = false)
    private String email;
    @Column(name = "address_2")
    private String addressSecondFamily;

    public Client(Long id, String name, Boolean online, Timestamp createAt, String password, String email) {
        this.id = id;
        this.name = name;
        this.online = online;
        this.createAt = createAt;
        this.password = password;
        this.email = email;
    }
}

/*
    @Entity: Esta etiqueta es usada para especificar que esta clase es una entidad que sera mapeada
        en nuestra base de datos

    @Data, @AllArgsConstructor, @NoArgsConstructor: Son etiquetas usadas por la libreria de lombok
    @Table(name = ""): Esta etiqueta se usa para asignar un nombre a nuestro modelo o entidad, si este
        no es definio de forma explicita entonces toma el nombre de la clase por defecto
    @Id: Esta etiqueta es para definir que esta propiedad sera el ID de nuestra entidad
    @SequenceGenerator(), @GeneratedValue: Con estas etiquetas definimos que sera un ID autoincrementable
    @Column(): Esta etiqueta nos permite establecer detalles explicitos para esa columna, tales como el
        nombre, el tamaño, si se permiten nullos o no, etc
* */
