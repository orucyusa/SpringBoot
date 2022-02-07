package model;

    import lombok.AllArgsConstructor;
    import lombok.Data;
    import lombok.NoArgsConstructor;

    import javax.persistence.Entity;
    import javax.persistence.Id;
    import javax.persistence.Table;

@Entity
@Table(name="user_login")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class User {
    @Id
    private String userId;
    private String password;
}
