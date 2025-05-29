package gr.aueb.cf.teachersapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TeacherReadOnlyDTO {
    private Long id;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private String uuid;
    private String Firstname;
    private String lastname;
    private String vat;
    private String region;
}
