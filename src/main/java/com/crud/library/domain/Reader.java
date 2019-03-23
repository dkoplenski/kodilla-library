package com.crud.library.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity(name = "Readers")
public class Reader {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "Reader_id")
    private Long id;

    @Column(name = "Firstname")
    private String firstname;

    @Column(name = "Lastname")
    private String lastname;

    @Column(name = "Register_date")
    private LocalDate registerDate;

    public Reader(String firstname, String lastname, LocalDate registerDate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.registerDate = registerDate;
    }
}
