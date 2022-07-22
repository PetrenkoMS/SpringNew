package config;

import java.util.Map;

public class config {
    static String[] main_config= {"cucumber03", "1393", "138883"};
    public static String[] param = {main_config[0], "qwe","ogyrchik", "zeleniq", "female", "23", main_config[1],main_config[2], "88005553500", "Cucumber run registration"};

    public static String[] paramFind = {"1387","138877"};

    public static Map<String,String> paramSelectedFind = Map.of("name","ogyrchik",
                                                                "secondName","Great",
                                                                "age", "23",
                                                                "gender","male",
                                                                "telephone","88005553535",
                                                                "seriesPassport","1111",
                                                                "numberPassport","111111",
                                                                "login","qqq"
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
