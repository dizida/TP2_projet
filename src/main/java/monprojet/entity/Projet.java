package monprojet.entity;


import java.sql.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity

public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String nom;
    private Date debut;
    private Date fin;

}
