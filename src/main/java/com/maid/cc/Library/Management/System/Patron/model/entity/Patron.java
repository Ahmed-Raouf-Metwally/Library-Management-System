package com.maid.cc.Library.Management.System.Patron.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "patron")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Patron {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patron_id")
    private Integer id;

    @Column(name = "patron_first_name")
    private String firstName;

    @Column(name = "patron_last_name")
    private String lastName;

    @Column(name = "patron_nationality_id")
    private String nationalityId;

    @Column(name = "patron_phone")
    private String phone;

    @Column(name = "patron_mail")
    private String mail;

    @Column(name = "patron_addres")
    private String address;

}
