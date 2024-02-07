package monprojet.entity;


import jakarta.persistence.*;

@Entity
@DiscriminatorValue("administratif")

public class Administratif extends Employe{

    private String diplome;
}
