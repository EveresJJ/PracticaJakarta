package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="teachers")
@Getter
@Setter
@ToString

public class Teacher {
    @Id
    private int id;
    private String name;
    private String area;


}
