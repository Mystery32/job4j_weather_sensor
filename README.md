<h2>Проект "Метео датчик"</h2>

REST API приложение для получения данных с метеорологического датчика и сохранения их в БД с последующей возможностью построения графика температур.

#### Стек технологий: 
Java 17, REST, Postgres, Hibernate, Spring Data JPA, Spring MVC, Spring Validator, Maven, Git

---

<h3>Работа с приложением</h3>

Для регистрации нового метео датчика необходимо выполнить POST запрос с отправкой JSON объекта на адрес: /sensors/registration

![1](https://user-images.githubusercontent.com/69649934/231513376-5219dbc2-3c20-42b9-a174-d3b59b1f20ef.png)

Для добавления нового измерения от метео датчика поступает POST запрос с отправкой JSON объекта с данными измерения на адрес: /measurements/add

![2](https://user-images.githubusercontent.com/69649934/231546574-9dd72d8d-c5fc-4457-ba4d-129509c0c00f.png)

Для получения всех измерений от метео датчика необходимо выполнить GET запрос на адрес: /measurements

Для получения количества дождливых дней необходимо выполнить GET запрос на адрес: /measurements/rainyDaysCount
