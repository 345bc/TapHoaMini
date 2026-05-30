package com.example.taphoamini.model;

import com.example.taphoamini.enums.DiscountStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "coupon")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "code", nullable = false, length = 50, unique = true)
    String code;

    @Column(name = "name", nullable = false, length = 255)
    String name;

    @Column(name = "discount_value", nullable = false, precision = 18, scale = 2)
    BigDecimal discountValue;

    @Column(name = "start_date", nullable = false)
    LocalDateTime startDate;

    @Column(name = "end_date", nullable = false)
    LocalDateTime endDate;

    @Column(name = "max_usage")
    Integer maxUsage;

    @Column(name = "used_count", nullable = false)
    int usedCount;

    @Column(name = "min_quantity")
    private Integer minQuantity;

    @Column(name = "min_total", precision = 18, scale = 2)
    private BigDecimal minTotal;

    @Column(name = "status", nullable = false, length = 20)
    DiscountStatus status;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false)
    LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    LocalDateTime updatedAt;
}
