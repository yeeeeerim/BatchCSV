package com.example.csvdbinsert;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Builder
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "area_tb")
public class Area {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String district;
//    private Integer managerCount;


    public Area(String city, String district) {
        this.city=city;
        this.district=district;
    }
}
