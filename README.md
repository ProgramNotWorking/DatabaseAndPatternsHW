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

## Задача 3: Реализовать `Interceptor`, который будет логировать код ответа сервера

## Задача 4: Реализовать паттерн `Builder` для класса `Car`. Так же написать реализацию `Abstract Factory` для данного класса
