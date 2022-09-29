package config;

import java.util.Map;

public class config {
    //login, series, number
    static String[] main_config= {"cucumber5", "1385", "138885"}; //138* 13888* (4)
    public static String[] param = {main_config[0], "qwe","ogurchik", "zelenenkiq", "female", "18", main_config[1],main_config[2], "88005553535", "Cucumber test run"};

    public static String[] paramFind = {main_config[1],main_config[2]};

    public static Map<String,String> paramSelectedFind = Map.of("name",param[2],
                                                                "secondName",param[3],
                                                                "age", param[5],
                                                                "gender",param[4],
                                                                "telephone",param[8],
                                                                "seriesPassport",param[6],
                                                                "numberPassport",param[7],
                                                                "login",param[0]
                                                                );

    public static Map<String,String> paramSelectedFindWrong1 = Map.of("wrongName", "k",
                                                                    "wrongNameNumber", "123qq",
                                                                    "wrongSecondName", "q",
                                                                    "wrongSecondNameNum","kk322",
                                                                    "wrongAge","qwe",
                                                                    "wrongAgeNum", "8",
                                                                    "wrongGender", "Apachi",
                                                                    "maleGender", "male",
                                                                    "femaleGender", "female"
                                                                    );

    public static Map<String,String> paramSelectedFindWrong2 = Map.of("wrongTelephone", "qwsdwdqwe23",
                                                                    "wrongTelephoneLess", "8800555",
                                                                    "wrongTelephoneMore", "8800555353535353535",
                                                                    "wrongSeriesPassport", "qw82",
                                                                    "wrongSeriesPassportLess", "123",
                                                                    "wrongSeriesPassportMore", "123456",
                                                                    "wrongNumberPassport", "q1w2e3",
                                                                    "wrongNumberPassportLess", "1234",
                                                                    "wrongNumberPassportMore", "123456789",
                                                                    "wrongLogin", "q"
                                                                    );
}
