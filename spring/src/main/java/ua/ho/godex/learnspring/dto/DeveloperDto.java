package ua.ho.godex.learnspring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Transient;
import javax.persistence.Version;
import java.io.Serializable;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class DeveloperDto implements Serializable {
    private Long id;
    private String login;
    private String email;
    @Transient
    private String password;
    private BigDecimal salary;
}
