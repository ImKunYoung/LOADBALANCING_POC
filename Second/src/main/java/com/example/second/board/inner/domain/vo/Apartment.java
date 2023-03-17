package com.example.second.board.inner.domain.vo;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class Apartment implements Serializable {

    @Column(name = "apartment_id")
    private Long id;

    @Column(name = "apartment_name")
    private String name;

}
