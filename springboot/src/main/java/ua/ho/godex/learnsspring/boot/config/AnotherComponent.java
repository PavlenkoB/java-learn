package ua.ho.godex.learnsspring.boot.config;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

@Validated
public class AnotherComponent {
    @NotNull
    public String name;

    public AnotherComponent() {
    }

    public AnotherComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
