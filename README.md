## Задача 1: Спроектировать базу данных для хранения цветов и букетов. При запуске приложения получать число цветов. При удалении из базы данных букета, удалять соответствующие цветы.
`app` модуль:
* [MainActivity](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/master/app/src/main/java/com/example/databaseandpatternshw/MainActivity.kt) - активность, в которой инициализируется база данных и осуществляется получение доступных цветов
* [DatabaseCallback](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/master/app/src/main/java/com/example/databaseandpatternshw/util/DatabaseCallback.kt) - callback, в котором создаются несколько букетов и цветов

`data` модуль:
* [BouquetEntity](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/master/data/src/main/java/com/example/data/entities/BouquetEntity.kt) - сущность букета
* [FlowerEntity](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/master/data/src/main/java/com/example/data/entities/FlowerEntity.kt) - сущность цветка
* [BouquetOfFlowersEntity](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/master/data/src/main/java/com/example/data/entities/BouquetOfFlowersEntity.kt) - связующая сущность
* [BouquetRepository](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/master/data/src/main/java/com/example/data/repository/BouquetRepository.kt) - репозиторий с функционалом 'покупки' букета
* [BouquetDao](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/master/data/src/main/java/com/example/data/storage/dao/BouquetDao.kt) - `DAO` букета
* [FlowerDao](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/master/data/src/main/java/com/example/data/storage/dao/FlowerDao.kt) - `DAO` цветка
* [BouquetFlowerDao](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/master/data/src/main/java/com/example/data/storage/dao/BouquetFlowerDao.kt) - связующее `DAO`
* [AppDatabase](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/master/data/src/main/java/com/example/data/storage/database/AppDatabase.kt) - база данных

## Задача 2: Провести миграцию базы данных из 1-й задачи используя класс `Migration`, добавить к букету поле оформление, к цветам поле страны производителя
* [BouquetEntity](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/migration/data/src/main/java/com/example/data/entities/BouquetEntity.kt) - измененная сущность букета
* [FlowerEntity](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/migration/data/src/main/java/com/example/data/entities/FlowerEntity.kt) - измененная сущность цветка
* [AppDatabase](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/migration/data/src/main/java/com/example/data/storage/database/AppDatabase.kt) - база данных с новой версией
* [MainActivity](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/migration/app/src/main/java/com/example/databaseandpatternshw/MainActivity.kt) - активность, в которой создается объект Migration

## Задача 3: Реализовать `Interceptor`, который будет логировать код ответа сервера (код лежит в `domain` модуле)
* [ApiService](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/master/domain/src/main/java/com/example/domain/task3/ApiService.kt) - интерфейс под запрос
* [Post](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/master/domain/src/main/java/com/example/domain/task3/Post.kt) - data класс под данные приходящие с сервера
* [StatusCodeLoggingInterceptor](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/master/domain/src/main/java/com/example/domain/task3/StatusCodeLoggingInterceptor.kt) - `Interceptor` для логирования кода ответа сервера
* [LaunchTask](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/master/domain/src/main/java/com/example/domain/task3/LaunchTask.kt) - файл с `main()` функцией

## Задача 4: Реализовать паттерн `Builder` для класса `Car`. Так же написать реализацию `Abstract Factory` для данного класса (код лежит в `domain` модуле)
* [Car](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/master/domain/src/main/java/com/example/domain/task4/model/Car.kt) - data класс который мы 'собираем'
* [CarBuilder](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/master/domain/src/main/java/com/example/domain/task4/builder/CarBuilder.kt) - `Builder` класс для Car
* [ICar](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/master/domain/src/main/java/com/example/domain/task4/factory/ICar.kt) - основной интерфейс под фабрику
* [SportCar](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/master/domain/src/main/java/com/example/domain/task4/factory/SportCar.kt) - первая реализация основного интерфейса
* [FamilyCar](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/master/domain/src/main/java/com/example/domain/task4/factory/FamilyCar.kt) - вторая реализация основного интерфейса
* [CarFactory](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/master/domain/src/main/java/com/example/domain/task4/factory/CarFactory.kt) - интерфейс для классов фабрики
* [SportCarFactory](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/master/domain/src/main/java/com/example/domain/task4/factory/SportCarFactory.kt) - первый вариант фабрики
* [FamilyCarFactory](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/master/domain/src/main/java/com/example/domain/task4/factory/FamilyCarFactory.kt) - второй вариант фабрики
* [LaunchTask](https://github.com/ProgramNotWorking/DatabaseAndPatternsHW/blob/master/domain/src/main/java/com/example/domain/task4/LaunchTask.kt) - файл с `main()` функцией

