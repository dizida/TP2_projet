package monprojet.entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("commercial")
public class Commercial extends Employe {
    
    private double pourcentage; 
}
