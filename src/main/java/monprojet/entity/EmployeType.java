package monprojet.entity;
import java.time.LocalDate;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_employe")

public abstract class EmployeType extends Employe {
    // Cette classe est abstraite pour permettre l'héritage des différentes types d'employés.
    // Les classes Commercial, Administratif et Technique hériteront de celle-ci.
}
