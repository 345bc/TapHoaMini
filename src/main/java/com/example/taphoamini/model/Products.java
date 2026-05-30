package com.example.taphoamini.model;

import com.example.taphoamini.enums.ProductStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Nationalized
    @Column(name = "name", nullable = false, unique = true)
    String name;

    @Column(name = "price",precision = 18,scale = 2)
    BigDecimal  price;

    @Column(name = "image", nullable = false,length = 50)
    String image;

    @Nationalized
    @Lob
    @Column(name = "description", nullable = false)
    String description;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    Categories categories;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", length = 20, nullable = false)
    ProductStatus status;

    @CreationTimestamp
    @Column(name = "created_at")
    LocalDate created_at;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "brand_id", nullable = false)
    Brand brand;

}
