package cl.test.serviceexample.database.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Client {

    @Id
    private Long id;
    @Column
    private String name;

}
