package gr.aueb.cf.teachersapp.model;

import gr.aueb.cf.teachersapp.model.static_data.Region;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "teachers")
public class Teacher  extends  AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String uuid;


    @Column(unique = true)
    private String vat;


    private String lastname;
    private String firstname;


    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;

    @PrePersist
    public void initializeUUID() {
        if (uuid == null) uuid = UUID.randomUUID().toString();
    }
}
