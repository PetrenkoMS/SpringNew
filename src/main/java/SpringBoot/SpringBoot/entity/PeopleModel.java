package SpringBoot.SpringBoot.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name  = "people_model", indexes = {
        @Index(name = "people_model_id_index", columnList = "id", unique = true),
        @Index(name = "people_model_login_index", columnList = "login"),
        @Index(name = "people_model_password_index", columnList = "password"),
        @Index(name = "people_model_name_index", columnList = "name"),
        @Index(name = "people_model_secondName_index", columnList = "secondName"),
        @Index(name = "people_model_age_index", columnList = "age"),
        @Index(name = "people_model_gender_index", columnList = "gender"),
        @Index(name = "people_model_series_index", columnList = "seriesPassport"),
        @Index(name = "people_model_number_index", columnList = "numberPassport"),
        @Index(name = "people_model_telephone_index", columnList = "telephone"),
        @Index(name = "people_model_about_index", columnList = "about"),
        @Index(name = "people_model_selectParam_index", columnList = "selectParam"),
        @Index(name = "people_model_pattern_index", columnList = "pattern"),
        @Index(name = "people_model_titlePattern_index", columnList = "titlePattern")

})

/**
 * Сущность для таблицы people_model
 */
@NoArgsConstructor
@AllArgsConstructor
public class PeopleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String login, password;

    @Getter
    @Setter
    private String name, secondName, gender, age, seriesPassport, numberPassport, telephone, about, er, selectParam, pattern, titlePattern;
}
