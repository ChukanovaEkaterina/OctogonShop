# Демо-проект по автоматизации тестирования для интернет магазина [Octagon shop](https://octagon-shop.com/)

<p align="center">  
<a href="https://octagon-shop.com//"><img src="media/logo/logotip.png" alt="Jenkins" width="500"/></a>  
</p>

## **Содержание:**

* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Примеры автоматизированных тест-кейсов</a>

* <a href="#jenkins">Сборка в Jenkins</a>

* <a href="#console">Запуск из терминала</a>

* <a href="#allure">Пример Allure отчета</a>

* <a href="#allure-testops">Интеграция с Allure TestOps</a>

* <a href="#telegram">Уведомление в Telegram при помощи бота</a>

* <a href="#video">Примеры видео выполнения тестов на Selenoid</a>
____

<a id="tools"></a>
## <a name="Технологии и инструменты">Технологии и инструменты:</a>

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="media/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="media/logo/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="media/logo/Github.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="media/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="media/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="media/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="media/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>  
<a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="media/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> 
<a href="https://qameta.io/"><img src="media/logo/Allure2.svg" width="50" height="50"  alt="Allure TestOps"/></a>   
<a href="https://www.jenkins.io/"><img src="media/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>  
<a href="https://www.atlassian.com/ru/software/jira/"><img src="media/logo/Jira.svg" width="50" height="50"  alt="Jira"/></a>  
</p>

- Тесты: IntelliJ IDEA + JUnit5 + Selenide, язык Java
- Сборка: Gradle
- Среда: Selenoid
- Удаленный запуск: Jenkins
- Отчеты: Allure-отчет и отправка результата в Telegram
---

<a id="cases"></a>
## <a name="Примеры автоматизированных тест-кейсов">Примеры автоматизированных тест-кейсов:</a>

- ✓ *Регистрастрация клиента со всеми заполненными полями*
- ✓ *Отправка пустой формы регистрации*
- ✓ *Отправка формы регистрации c пустым Checkbox*
- ✓ *Отправка формы регистрации с коротким паролем*
- ✓ *Отправка формы регистрации с невалидеым Mail*


____
<a id="jenkins"></a>
## <img alt="Jenkins" height="25" src="media/logo/Jenkins.svg" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.qa.guru/job/42_Chukanova_OctagonShop/)</a>

<p align="center">  
<a href="https://jenkins.qa.guru/job/42_Chukanova_OctagonShop/"><img src="media/screens/Jenkins.png" alt="Jenkins" width="950"/></a>  
</p>


### **Параметры сборки в Jenkins:**

- *browser (браузер, по умолчанию chrome)*
- *browserVersion*
- *browserSize (размер окна браузера, по умолчанию 1920x1080)*
- *baseUrl (адрес тестируемого веб-сайта)*
- *remoteUrl (логин, пароль и адрес удаленного сервера Selenoid)*

<a id="console"></a>
## Команды для запуска из терминала

***Локальный запуск:***
```bash  
gradle clean
```

***Удалённый запуск через Jenkins:***
```bash  
clean
test
--continue
-Dbrowser=$BROWSER
-DremoteUrl=$REMOTEURL
-DbaseUrl=$BASEURL
-DbrowserVersion=$BROWSER_VERSION
-Dheadless=$HEADLESS
-DbrowserSize=$BROWSER_SIZE
```
___
<a id="allure"></a>
## <img alt="Allure" height="25" src="media/logo/Allure.svg" width="25"/></a> <a name="Allure"></a>Allure [отчет](https://jenkins.qa.guru/job/42_Chukanova_OctagonShop/allure/)</a>


### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="media/screens/AllureReport.png" width="850">  
</p>  

### *Тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="media/screens/TestCase.png" width="850">  
</p>

### *Графики*

<p align="center">  
<img title="Allure Graphics" src="media/screens/Graphs.png" width="850">  
</p>

## <img src="media/logo/Allure2.svg" title="Allure TestOps" width="4%"/> Интеграция с Allure TestOps

Выполнена интеграция сборки <code>Jenkins</code> с <code>Allure TestOps</code>.
Результат выполнения автотестов отображается в <code>Allure TestOps</code>

<p align="center">
<img title="Allure TestOps запуски" src="media/screens/TestOps.png">
</p>


## <img width="4%" style="vertical-align:middle" title="Telegram" src="media/logo/Telegram.svg"> Уведомления в Telegram с использованием бота

После завершения сборки, бот созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с результатом.

<p align="center">
<img width="70%" title="Telegram Notifications" src="media/screens/Telegram.png">
</p>

## Видео примера запуска тестов в Selenoid

К каждому тесту в отчете прилагается видео прогона.
<p align="center">
<img title="Selenoid Video" src="media/video/video.mp4" width="550" height="350"  alt="video">   
</p>
