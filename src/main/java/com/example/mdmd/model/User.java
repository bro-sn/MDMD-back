import jakarta.persistence.Column;

@Entity(name = "Table_User")
public class User {
    @Id
    private Long id;

    @Column(nullable = false)
    String userid;

    @Column(nullable = false)
    String password;

    @Column(nullable = false)
    String nickname;


    @Column(nullable = true)
    String job;

    @Column(nullable = true)
    int achievementRate;

    @Column(nullable = true)
    String homeAddress;

    @Column(nullable = true)
    Time wakeUpTime;

    @Column(nullable = true)
    Time plannedSleepTime;

    @Column(nullable = true)
    int year;

    @Column(nullable = true)
    int month;

    @Column(nullable = true)
    int day;
}