package SpringBoot.SpringBoot.entity;


import lombok.Data;

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
        @Index(name = "people_model_about_index", columnList = "about")

})
public class PeopleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String login;
    private String password;

    private String name;
    private String secondName;
    private String gender;
    private String age;
    private String seriesPassport;
    private String numberPassport;
    private String telephone;
    private String about;

    private String er;


    public PeopleModel() {
    }

    public PeopleModel(int id, String login, String password, String name, String secondName, String gender, String age, String seriesPassport, String numberPassport, String telephone, String about, String er) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.secondName = secondName;
        this.gender = gender;
        this.age = age;
        this.seriesPassport = seriesPassport;
        this.numberPassport = numberPassport;
        this.telephone = telephone;
        this.about = about;
        this.er = er;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSeriesPassport() {
        return seriesPassport;
    }

    public void setSeriesPassport(String seriesPassport) {
        this.seriesPassport = seriesPassport;
    }

    public String getNumberPassport() {
        return numberPassport;
    }

    public void setNumberPassport(String numberPassport) {
        this.numberPassport = numberPassport;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getEr() {
        return er;
    }

    public void setEr(String er) {
        this.er = er;
    }
}
