package nvc.it.phooms.usedcar.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fristName, lastName;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
    private List<Car>cars;

    public Owner(String fristName, String lastName) {
        this.fristName = fristName;
        this.lastName = lastName;
    }

    

}
