package monprojet.entity;


import jakarta.persistence.*;


@Entity
@DiscriminatorValue("technique")
public class Technique extends Employe {
    
    private double montantPrime;

}
