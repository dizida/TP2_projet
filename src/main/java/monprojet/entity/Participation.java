package monprojet.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Participation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String role;
    private double pourcentage;

    //relation plusieurs-à-un entre deux entités
    //une participation appartient à un seul employé
    @ManyToMany
    private List<Projet> projet;

    @ManyToMany
    private List<Employe> employe;

}
