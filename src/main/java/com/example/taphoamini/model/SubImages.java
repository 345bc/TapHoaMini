package com.example.taphoamini.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Entity
@Table(name = "sub_images", schema = "dbo")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SubImages {
    @Column(name = "sub_image", nullable = false, length = 50)
    String subImage;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    Products products;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
}
