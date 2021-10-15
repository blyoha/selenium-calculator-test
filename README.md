# Google calculator tests

Проект содержит тесты для калькулятора в Google Chrome.

В Google Chrome существляется переход на страницу калькулятора,
после чего вводится математическое выражение.

Работа с Google Chrome осуществляется через **chromedriver**.

---
## Используемые инструменты

- Java
- Selenium
- TestNG
- Allure
- Gradle

---
## Исполнение
Клонирование репозитория:<br/>
`git clone https://github.com/blyoha/selenium-calculator-test`

Запуск тестов:<br/>
`./gradlew clean test`

Просмотр отчетов Allure:<br/>
`mvn allure:serve`