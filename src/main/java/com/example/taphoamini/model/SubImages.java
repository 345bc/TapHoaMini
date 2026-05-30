package be.datamining.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sub_images", schema = "dbo")
public class SubImages {
    @Column(name = "sub_image", nullable = false, length = 50)
    String subImage;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tour_detail_id")
    TourDetails tourDetails;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
}
