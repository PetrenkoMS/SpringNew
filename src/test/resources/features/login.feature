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
      And Input "Очистить" value visible
      And Exit "Выйти" visible

    When Click "Главная" a value
      And Home "home" visible
      And Exit "Выйти" visible

    Then Click "Поиск клиентов" a value
    When Click "Поисковичек" a value
      And Home "home" visible
      And Exit "Выйти" visible

    When Click "Выйти" a value
      And Exit "Выйти" not visible
      And Home "home" visible


















