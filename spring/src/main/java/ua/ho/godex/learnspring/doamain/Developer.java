package ua.ho.godex.learnspring.doamain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;

@Entity(name = "developers")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Developer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Version
    @Column
    private Integer version;
    @Column(nullable = false, unique = true)
    private String login;
    @Column(unique = true, nullable = false, length = 60)
    private String email;
    @Column(nullable = false, length = 60)
    private String password;
    @Column(nullable = false)
    private BigDecimal salary;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Calendar startWork;

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", version=" + version +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", salary=" + salary +
                ", startWork=" + startWork +
                '}';
    }
}
