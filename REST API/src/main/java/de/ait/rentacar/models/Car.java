package de.ait.rentacar.models;


import lombok.*;


@ToString
@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private long ID;
    private String model;
    private String color;

}
