#Данные пользователя задаются в test/java/config/config.java
Feature: Регистрация и аутентификация нового пользователя

  Scenario: Registration user
    Then Click "Зарегистрироваться" a value
    When Input new login id
      And Input new password id
      And Input new name id
      And Input new second-name id
      And Input new gender id
      And Input new age id
      And Input new series passport id
      And Input new number passport id
      And Input new telephone id
      And Input new about id
    Then Click "Зарегистрироваться" input value
    Then Home "home" visible



  Scenario: Login user
    Then Click "login" button id
    When Input login
      And Input password
    Then Click "submit" submit button
    Then Exit "Выйти" visible
    Then Home "home" visible
#    Then Click "Выйти" a value



  Scenario: Find user
    Given Exit "Выйти" visible
    Then Click "findButton" button id

    When Input findThisSeries id
      And Input findThisNumber id
    Then Click "Найти" input value
    Then Input "Открыть pdf-файл" visible
    Then Click "Очистить" input value
    Then Input "Открыть pdf-файл" not visible

    When Input findThisSeries id
      And Input findThisNumber id
    Then Click "Найти" input value
    Then Input "Открыть pdf-файл" visible
    Then Click "Открыть pdf-файл" input value

    When Click "Выйти" a value
      And Exit "Выйти" not visible
      And Home "home" visible



  Scenario: Try to click findUser without LoginIn
    Given Exit "Выйти" not visible
    When Click "findButton" button id
      And Div "logInForm" id visible
    When Input login
      And Input password
    Then Click "submit" submit button
    Then Exit "Выйти" visible
    When Input "Найти" value visible
      And Input "Очистить" value visible

    When Click "Выйти" a value
      And Exit "Выйти" not visible
      And Home "home" visible



  Scenario: Find Some Users
    Given Exit "Выйти" not visible
    Then Click "login" button id
    When Input login
      And Input password
    Then Click "submit" submit button
    Then Exit "Выйти" visible
    Then Home "home" visible

    When Click "findAllButton" button id
      And Id "selectParam" visible

    # When choose "name" parameter
    When Choose "name" parameter
      And Input findThisSomeValue id
      And Click "findThisSome" button id
      And tr name "trValue" visible

    # When choose "secondName" parameter
    When Choose "secondName" parameter
      And Input findThisSomeValue id
      And Click "findThisSome" button id
      And tr name "trValue" visible

    Then Click "ClearAllSome" button id
    Then tr name "trValue" not visible

    # When choose "age" parameter
    When Choose "age" parameter
      And Input findThisSomeValue id
      And Click "findThisSome" button id
      And tr name "trValue" visible

    Then Click "ClearAllSome" button id
    Then tr name "trValue" not visible

    # When choose "gender" parameter
    When Choose "gender" parameter
      And Input findThisSomeValue id
      And Click "findThisSome" button id
      And tr name "trValue" visible

    Then Click "ClearAllSome" button id
    Then tr name "trValue" not visible

    # When choose "telephone" parameter
    When Choose "telephone" parameter
      And Input findThisSomeValue id
      And Click "findThisSome" button id
      And tr name "trValue" visible

    Then Click "ClearAllSome" button id
    Then tr name "trValue" not visible

   # When choose "seriesPassport" parameter
    When Choose "seriesPassport" parameter
      And Input findThisSomeValue id
      And Click "findThisSome" button id
      And tr name "trValue" visible

    Then Click "ClearAllSome" button id
    Then tr name "trValue" not visible

   # When choose "numberPassport" parameter
    When Choose "numberPassport" parameter
      And Input findThisSomeValue id
      And Click "findThisSome" button id
      And tr name "trValue" visible

    Then Click "ClearAllSome" button id
    Then tr name "trValue" not visible

    # When choose "login" parameter
    When Choose "login" parameter
      And Input findThisSomeValue id
      And Click "findThisSome" button id
      And tr name "trValue" visible

    Then Click "ClearAllSome" button id
    Then tr name "trValue" not visible

    When Click "Выйти" a value
      And Exit "Выйти" not visible
      And Home "home" visible



  Scenario: Try to click findSomeUser without LoginIn
    Given Exit "Выйти" not visible
    When Click "findAllButton" button id
      And Div "logInForm" id visible
    When Input login
      And Input password
    Then Click "submit" submit button
    When Exit "Выйти" visible
      And Id "selectParam" visible
      And Input "Очистить" value visible

    When Click "Выйти" a value
      And Exit "Выйти" not visible
      And Home "home" visible



  Scenario: Find Some Users, but wrong pattern
    Given Exit "Выйти" not visible
    Then Click "login" button id
    When Input login
      And Input password
    Then Click "submit" submit button
    Then Exit "Выйти" visible
    Then Home "home" visible

    When Click "findAllButton" button id
      And Id "selectParam" visible

    # When choose "name" parameter
    When Choose "name" parameter
      And Input "wrongName" id
      And Click "findThisSome" button id
      And tr name "trValue" not visible

    Then Click "ClearAllSome" button id
    Then tr name "trValue" not visible

    When Choose "name" parameter
      And Input "wrongNameNumber" id
      And Click "findThisSome" button id
      And tr name "trValue" not visible

    Then Click "ClearAllSome" button id
    Then tr name "trValue" not visible

    # When choose "secondName" parameter
    When Choose "secondName" parameter
      And Input "wrongSecondName" id
      And Click "findThisSome" button id
      And tr name "trValue" not visible

    Then Click "ClearAllSome" button id
    Then tr name "trValue" not visible

    When Choose "secondName" parameter
      And Input "wrongSecondNameNum" id
      And Click "findThisSome" button id
      And tr name "trValue" not visible

    Then Click "ClearAllSome" button id
    Then tr name "trValue" not visible

    # When choose "age" parameter
    When Choose "age" parameter
      And Input "wrongAge" id
      And Click "findThisSome" button id
      And tr name "trValue" not visible

    Then Click "ClearAllSome" button id
    Then tr name "trValue" not visible

    When Choose "age" parameter
      And Input "wrongAgeNum" id
      And Click "findThisSome" button id
      And tr name "trValue" not visible

    Then Click "ClearAllSome" button id
    Then tr name "trValue" not visible

    # When choose "gender" parameter
    When Choose "gender" parameter
      And Input "wrongGender" id
      And Click "findThisSome" button id
      And tr name "trValue" not visible

    Then Click "ClearAllSome" button id
    Then tr name "trValue" not visible

    When Choose "gender" parameter
      And Input "maleGender" id
      And Click "findThisSome" button id
      And tr name "trValue" visible

    Then Click "ClearAllSome" button id
    Then tr name "trValue" not visible

    When Choose "gender" parameter
      And Input "femaleGender" id
      And Click "findThisSome" button id
      And tr name "trValue" visible

    Then Click "ClearAllSome" button id
    Then tr name "trValue" not visible

    # When choose "telephone" parameter
    When Choose "telephone" parameter
      And Input "wrongTelephone" id2
      And Click "findThisSome" button id
      And tr name "trValue" not visible

    Then Click "ClearAllSome" button id
    Then tr name "trValue" not visible

    When Choose "telephone" parameter
      And Input "wrongTelephoneNumLess" id2
      And Click "findThisSome" button id
      And tr name "trValue" not visible

    Then Click "ClearAllSome" button id
    Then tr name "trValue" not visible

    When Choose "telephone" parameter
      And Input "wrongTelephoneNumMore" id2
      And Click "findThisSome" button id
      And tr name "trValue" not visible

    Then Click "ClearAllSome" button id
    Then tr name "trValue" not visible

   # When choose "seriesPassport" parameter
    When Choose "seriesPassport" parameter
      And Input "wrongSeriesPassport" id2
      And Click "findThisSome" button id
      And tr name "trValue" not visible

    Then Click "ClearAllSome" button id
    Then tr name "trValue" not visible

    When Choose "seriesPassport" parameter
      And Input "wrongSeriesPassportLess" id2
      And Click "findThisSome" button id
      And tr name "trValue" not visible

    Then Click "ClearAllSome" button id
    Then tr name "trValue" not visible

    When Choose "seriesPassport" parameter
      And Input "wrongSeriesPassportMore" id2
      And Click "findThisSome" button id
      And tr name "trValue" not visible

    Then Click "ClearAllSome" button id
    Then tr name "trValue" not visible

   # When choose "numberPassport" parameter
    When Choose "numberPassport" parameter
      And Input "wrongNumberPassport" id2
      And Click "findThisSome" button id
      And tr name "trValue" not visible

    Then Click "ClearAllSome" button id
    Then tr name "trValue" not visible

    When Choose "numberPassport" parameter
      And Input "wrongNumberPassportLess" id2
      And Click "findThisSome" button id
      And tr name "trValue" not visible

    Then Click "ClearAllSome" button id
    Then tr name "trValue" not visible

    When Choose "numberPassport" parameter
      And Input "wrongNumberPassportMore" id2
      And Click "findThisSome" button id
      And tr name "trValue" not visible

    Then Click "ClearAllSome" button id
    Then tr name "trValue" not visible

    # When choose "login" parameter
    When Choose "login" parameter
      And Input "wrongLogin" id2
      And Click "findThisSome" button id
      And tr name "trValue" not visible

    Then Click "ClearAllSome" button id
    Then tr name "trValue" not visible

    When Click "Выйти" a value
      And Exit "Выйти" not visible
      And Home "home" visible



  Scenario: Click all button
    Given Exit "Выйти" not visible

    When Click "login" button id
      And Div "logInForm" id visible

    When Click "Зарегистрироваться" a value
      And Div "registrationForm" id visible
    When Click "Зарегистрироваться" input value
      And Div "registrationForm" id visible
    When Click "На главную" a value
      And Home "home" visible
      And Exit "Выйти" not visible

    When Click "findButton" button id
      And Div "logInForm" id visible
    When Click "На главную" a value
      And Home "home" visible
      And Exit "Выйти" not visible

    Then Click "login" button id
    When Input login
      And Input password
    Then Click "submit" submit button
    Then Exit "Выйти" visible

    When Click "Поиск клиентов" a value
      And Input "Найти" value visible
      And Id "findThisSeries" visible
      And Input "Очистить" value visible
      And Exit "Выйти" visible

    When Click "Главная" a value
      And Home "home" visible
      And Exit "Выйти" visible

    When Click "Поиск клиентов" a value
      And Id "findThisSeries" visible
    When Click "Поисковичек" a value
      And Home "home" visible
      And Exit "Выйти" visible

    When Click "Поиск нескольких клиентов" a value
      And Input "Найти" value visible
      And Id "selectParam" visible
      And Input "Очистить" value visible
      And Exit "Выйти" visible

    When Click "Поиск клиентов" a value
      And Id "findThisSeries" visible
      And Exit "Выйти" visible
    When Click "Поиск нескольких клиентов" a value
      And Id "selectParam" visible
      And Exit "Выйти" visible
    When Click "Поиск клиентов" a value
      And Id "findThisSeries" visible
      And Exit "Выйти" visible
    When Click "Поисковичек" a value
      And Home "home" visible
      And Exit "Выйти" visible

    When Click "Выйти" a value
      And Exit "Выйти" not visible
      And Home "home" visible


















