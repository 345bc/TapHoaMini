package be.datamining.model;

import be.datamining.enums.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Nationalized;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Users", schema = "dbo")
//@EntityListeners(AuditingEntityListener.class)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserID")
    private Integer id;

    @Size(max = 100)
    @Nationalized
    @Column(name = "Name", length = 100)
    private String name;

    @Size(max = 100)
    @Column(name = "Email", length = 100, nullable = false, unique = true)
    private String email;

    @ManyToMany
    @JoinTable(
            name = "UserRoles",
            joinColumns = @JoinColumn(name = "UserID"),
            inverseJoinColumns = @JoinColumn(name = "RoleId")
    )
    private Set<Roles> roles = new HashSet<>();

    @Size(max = 255)
    @NotNull
    @Column(name = "PasswordHash", nullable = false)
    private String passwordHash;

    @CreationTimestamp
    @Column(name = "CreatedAt", nullable = false, updatable = false)
    @NotNull
    private LocalDateTime createdAt;


    public boolean hasRole(Role roleEnum) {
        return roles.stream()
                .anyMatch(role -> role.getName().equals(roleEnum.name()));
    }


}