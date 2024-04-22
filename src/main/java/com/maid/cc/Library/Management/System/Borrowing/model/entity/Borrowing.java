package com.maid.cc.Library.Management.System.Borrowing.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "borrowing")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Borrowing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "borrowing_id")
    private Integer id;

    @Column(name = "patron_id")
    private Integer patron_id;

    @Column(name = "book_id")
    private Integer book_id;
}
