package _summary;

import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Vad on 03.05.2016.
 * <p>
 * Java 8. API на русском:
 * http://spec-zone.ru/RU/Java/Docs/8/api/overview-summary.html
 * <p>
 * Java 8. API оригинал:
 * http://docs.oracle.com/javase/8/docs/api/index.html
 * <p>
 * Дохера всего:
 * https://vk.com/videos-80984752?section=playlists
 * <p>
 * Книги по Java и других технологиях:
 * http://ru.stackoverflow.com/questions/454683/%D0%9A%D0%BD%D0%B8%D0%B3%D0%B8-%D0%B8-%D0%B4%D1%80%D1%83%D0%B3%D0%B8%D0%B5-%D0%BC%D0%B0%D1%82%D0%B5%D1%80%D0%B8%D0%B0%D0%BB%D1%8B-%D0%B4%D0%BB%D1%8F-%D0%BE%D0%B1%D1%83%D1%87%D0%B5%D0%BD%D0%B8%D1%8F/454684#454684
 * http://ru.stackoverflow.com/questions/416634/%D0%9A%D0%BD%D0%B8%D0%B3%D0%B8-%D0%BF%D0%BE-java-%D0%B8-%D0%B4%D1%80%D1%83%D0%B3%D0%B0%D1%8F-%D0%BB%D0%B8%D1%82%D0%B5%D1%80%D0%B0%D1%82%D1%83%D1%80%D0%B0
 * http://vk.com/my_java?w=page-54530371_44620320
 * http://vk.com/my_java?w=page-54530371_47390955
 * http://books-redhats.rhcloud.com/
 * http://ru.stackoverflow.com/questions/297672/%D0%9A%D0%BD%D0%B8%D0%B3%D0%B8-%D0%BF%D0%BE-%D0%BF%D0%B0%D1%82%D1%82%D0%B5%D1%80%D0%BD%D0%B0%D0%BC
 * + e:\Рабочая папка\1_ Вадим\Java\Books and Tips\
 * <p>
 * Книги по Java:
 * http://vk.com/page-54530371_48776757
 * http://books.ifmo.ru/search_form/search.htm
 * <p>
 * Сборник ссылок по Java:
 * https://github.com/Vedenin/useful-java-links/tree/master/link-rus
 * https://habrahabr.ru/company/luxoft/blog/280784/ --- просмотреть остальные страницы
 * https://github.com/akullpp/awesome-java
 * https://tproger.ru/digest/java-learning-links/
 * http://www.cyberforum.ru/java-j2ee/
 * http://java-source.net/open-source/content-managment-systems --- CMS и еще много чего
 * <p>
 * sohabr.net/post/220757 ---- Топ сайтов на JavaEE + Анализатор сайтов
 * <p>
 * Web-frameworks
 * Смотри шпаргалка Java-программиста
 * https://tproger.ru/digest/java-web-frameworks/
 * https://toster.ru/q/8578
 * https://www.playframework.com/
 * http://www.grails.org/
 * <p>
 * <p>
 * Потоки ввода/вывода
 * http://developer.alexanderklimov.ru/android/java/io.php
 * <p>
 * NIO 2.0
 * http://www.quizful.net/post/java-nio-tutorial
 * <p>
 * <p>
 * Виды приведений
 * http://oop-java.blogspot.ru/2006/02/blog-post_21.html
 * http://info.javarush.ru/Sant9Iga/2014/01/16/%D0%9F%D1%80%D0%B5%D0%BE%D0%B1%D1%80%D0%B0%D0%B7%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5-%D1%81%D1%81%D1%8B%D0%BB%D0%BE%D1%87%D0%BD%D1%8B%D1%85-%D1%82%D0%B8%D0%BF%D0%BE%D0%B2-%D0%B8%D0%BB%D0%B8-%D1%81%D0%BF%D1%8F%D1%89%D0%B8%D0%B9-%D0%B2%D0%BE%D0%BB%D0%BA-%D0%BD%D0%B0-%D0%BA%D0%BB%D0%B0%D0%B2%D0%B8%D0%B0%D1%82%D1%83%D1%80%D0%B5.html
 * <p>
 * Создаём исполняемые файлы (В т.ч. *.exe)
 * http://info.javarush.ru/iruslan/2014/03/20/%D0%9A%D0%B0%D0%BA-%D1%81%D0%BE%D0%B7%D0%B4%D0%B0%D1%82%D1%8C-%D1%84%D0%B0%D0%B9%D0%BB-exe-%D0%B2-intellij.html
 * <p>
 * Лицензия
 * https://megamozg.ru/post/9044/
 * https://habrahabr.ru/post/275995/
 * https://habrahabr.ru/search/?q=%D0%BB%D0%B8%D1%86%D0%B5%D0%BD%D0%B7%D0%B8%D0%B8
 * https://habrahabr.ru/post/243091/
 * https://habrahabr.ru/company/intel/blog/265683/
 * http://licenseit.ru/wiki/index.php/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0
 * http://www.gnu.org/licenses/license-list.html
 * http://www.codeproject.com/info/Licenses.aspx
 * https://megamozg.ru/post/9046/
 * http://www.gnu.org/licenses/gpl-faq.html#AllCompatibility
 * https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D0%BE%D0%BF%D1%80%D0%B8%D0%B5%D1%82%D0%B0%D1%80%D0%BD%D0%BE%D0%B5_%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%BD%D0%BE%D0%B5_%D0%BE%D0%B1%D0%B5%D1%81%D0%BF%D0%B5%D1%87%D0%B5%D0%BD%D0%B8%D0%B5
 * http://ru.stackoverflow.com/questions/94014/%D0%9B%D0%B8%D1%86%D0%B5%D0%BD%D0%B7%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5-%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%BD%D0%BE%D0%B3%D0%BE-%D0%BE%D0%B1%D0%B5%D1%81%D0%BF%D0%B5%D1%87%D0%B5%D0%BD%D0%B8%D1%8F-%D0%BF%D0%BE%D0%B4-android
 * http://olegryabkov.ru/obzor-vozmozhnosti-ispolzovaniya-nekotoryx-licenzij-i-programmnyx-produktov/
 * <p>
 * Лицензия JavaFX
 * https://community.oracle.com/thread/2295236?start=0&tstart=0
 * http://stackoverflow.com/questions/8372217/may-javafx-2-0-be-redistributed
 * <p>
 * <p>
 * JavaFX
 * http://www.oracle.com/technetwork/ru/topics/java/default-424988-ru.html
 * http://code.makery.ch/library/javafx-8-tutorial/ru/part2/
 * https://docs.oracle.com/javafx/2/ui_controls/table-view.htm
 * <p>
 * Советы
 * https://habrahabr.ru/post/262501/
 * <p>
 * Maven
 * https://habrahabr.ru/post/77382/ -- полезное
 * http://devcolibri.com/1043 -- полезное
 * http://www.apache-maven.ru/lifecycle.html -- полезное
 * https://jsehelper.blogspot.ru/2016/05/maven-2.html
 * <p>
 * http://repo1.maven.org/maven2/ -- репозиторий библиотек
 * http://repo.maven.apache.org/maven2/ -- тоже самое вроде
 * http://mvnrepository.com/ -- путеводитель по библиотекам, с инструкцией по использованию.. круто..
 * <p>
 * Maven + Bootstrap -- разбор примера от Oracle
 * http://www.oracle.com/webfolder/technetwork/tutorials/obe/java/basic_app_embedded_tomcat/basic_app-tomcat-embedded.html
 * <p>
 * JavaEE, Servlet для чайников
 * http://kek.ksu.ru/EOS/JAVA/gl5.html
 * http://javaway.info/primer-raboty-s-tomcat-i-servletami/
 * http://alfalavista.ru/index.php/2013-06-18-22-25-47/306-java-server-pages-jsp-tomcat
 * http://ru.stackoverflow.com/questions/474694/%D0%98%D0%BD%D1%82%D0%B5%D1%80%D0%BD%D0%B5%D1%82-%D0%BC%D0%B0%D0%B3%D0%B0%D0%B7%D0%B8%D0%BD-%D0%BD%D0%B0-java-%D0%92%D1%8B%D0%B1%D0%BE%D1%80%D0%BA%D0%B0-%D1%82%D0%BE%D0%B2%D0%B0%D1%80%D0%BE%D0%B2-%D0%BF%D0%BE-%D1%84%D0%B8%D0%BB%D1%8C%D1%82%D1%80%D1%83
 * https://www.youtube.com/user/pro100fox2/videos
 * http://java-course.ru/student/book1/
 * http://www.cyberforum.ru/java-j2ee/
 * http://ru.stackoverflow.com/questions/3839/%D0%A4%D0%B8%D0%BB%D1%8C%D1%82%D1%80%D1%8B-%D0%B2-%D1%81%D0%B5%D1%80%D0%B2%D0%BB%D0%B5%D1%82%D0%B0%D1%85
 * http://ru.stackoverflow.com/questions/462966/%D0%91%D0%94-%D1%81%D0%B5%D1%80%D0%B2%D0%B5%D1%80-%D1%81%D0%B5%D1%80%D0%B2%D0%B5%D1%80%D0%BD%D0%BE%D0%B5-%D0%BF%D1%80%D0%B8%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D0%B5-%D0%9A%D0%B0%D0%BA-%D1%8D%D1%82%D0%BE-%D1%81%D0%B2%D1%8F%D0%B7%D0%B0%D1%82%D1%8C
 * <p>
 * JSP & JSTL
 * http://www.tutorialspoint.com/jsp/jsp_standard_tag_library.htm
 * <p>
 * http://javastudy.ru/jsf-2/description-settings-web-xml-with-spring/ -- web.xml
 * http://ru-java.livejournal.com/997938.html -- web.xml
 * http://stackoverflow.com/a/26744/525978 -- web.xml
 * <p>
 * GWT - Google Web Toolkit -- что за зверь?
 * http://catine.ru/kuchniy/translation/gwt-dlya-nachinayushhix-podgotovka-k-rabote/
 * <p>
 * java.util.concurrent.*
 * https://habrahabr.ru/company/luxoft/blog/157273/
 * http://prologistic.com.ua/java-callable-kratkoe-opisanie-i-primer-ispol-zovaniya.html
 * http://pro-java.ru/java-dlya-opytnyx/interfejsy-callable-i-future-v-java/
 * https://habrahabr.ru/post/116363/
 * <p>
 * <p>
 * Асинхронность и синхронность
 * http://www.cyberforum.ru/java/thread1241142.html
 * <p>
 * BlockingQueue
 * http://jdevnotes.blogspot.ru/2014/03/blockingqueue-java.html
 * <p>
 * ThreadGroup
 * http://src-code.net/upravlenie-potokami-bezopasnost-i-threadgroup-java/
 * <p>
 * Символические и Жесткие ссылки:
 * https://habrahabr.ru/post/99746/
 * http://jakubstas.com/links-nio-2/#.V5SM0vmLSUk
 * ------------
 * Грубо говоря, символическая ссылка — это ссылка на имя файла.
 * Вне зависимости от того, что именно лежит на диске под этим именем.
 * А жёсткая ссылка — это ссылка на саму область диска, содержащую файл (информацию).
 * Жёсткая ссылка — это как ещё одно (полностью равноправное) имя файла.
 * ------------
 * самое простое объяснение — если стереть файл
 * то симфолическая ссылка перестанет работать, место на диске освободится,
 * а жесткая ссылка продолжит работать, файл останется на месте, место на диске не изменится.
 * ------------
 * А что там понимать?
 * Жесткая ссылка — это просто дополнительное имя файла, работает она в пределах одной физической файловой системы,
 * при этом имя оригинала может меняться как угодно, его можно даже удалить,
 * а жесткая ссылка останется, а символическая ссылка это просто ссылка на файл в пределах virtual file system и её аналогов,
 * соответственно она не чувствительна к фс, на которой файл лежит, но чувствительна к его полному названию
 * <p>
 * Thread:
 * ----------
 * volatile переменные:
 * ----------
 * Чтобы понять, где лучше использовать volatile-переменную - нужно найти переменные,
 * которые будут использоваться нитями (потоками выполнения).
 * Начинать поиск лучше с классов, которые реализуют интерфейсы потоков выполнения
 * ----------
 * Все immutable объекты являются thread-safe.
 * ----------
 * StringBuffer – это аналог StringBuilder, но у него все методы синхронизированы. Он тоже является thread-safe?
 * Да. Если тебе нужно обращаться к объекту StringBuilder из разных нитей,
 * то нужно заменить его на StringBuffer, иначе рано или поздно нити будут менять его одновременно и «поломают».
 * ----------
 * Synchronized методы блокируют весь объект
 * <p>
 * Concurrency Lock
 * ---------
 * http://prologistic.com.ua/java-lock-teoriya-i-primer-ispol-zovaniya-concurrency-lock.html
 * http://metanit.com/java/tutorial/8.9.php
 * http://www.javaspecialist.ru/2011/11/synchronized-vs-reentrantlock.html
 * <p>
 * Инициализация
 * ---------
 * https://github.com/Javer-com-ua/WIKI/wiki/%D0%9F%D0%BE%D1%80%D1%8F%D0%B4%D0%BE%D0%BA-%D0%B8%D0%BD%D0%B8%D1%86%D0%B8%D0%B0%D0%BB%D0%B8%D0%B7%D0%B0%D1%86%D0%B8%D0%B8-%D0%BE%D0%B1%D1%8A%D0%B5%D0%BA%D1%82%D0%B0-%D0%B2-Java
 * <p>
 * BlockingQueue
 * -----------------
 * http://jdevnotes.blogspot.ru/2014/03/blockingqueue-java.html
 * <p>
 * String Pool
 * ------------------
 * http://www.javaspecialist.ru/2011/05/javalangstring.html
 * + PDF Jpoint
 * jpoint-April2015-string-catechism.pdf
 * <p>
 * ConcurrentHashMap
 * ------------------------
 * https://habrahabr.ru/post/132884/
 * <p>
 * Collections
 * -----------------
 * https://habrahabr.ru/company/luxoft/blog/256877/
 * -----------------
 * checkedCollection
 * -----------------
 * http://ru.stackoverflow.com/questions/430582/checked-collections-in-java
 * <p>
 * <p>
 * HashMap
 * -----------------
 * https://habrahabr.ru/post/128017/
 * <p>
 * <p>
 * Интересные задачки
 * http://codeforces.com/problemset
 * <p>
 * GIT
 * https://githowto.com/ru -- уроки
 *
 * CountDownLatch
 * http://movejava.blogspot.ru/2013/06/javautilconcurrentcountdownlatch.html
 *
 * Observer pattern (Шаблон наблюдатель)
 * https://ru.wikipedia.org/wiki/%D0%9D%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B0%D1%82%D0%B5%D0%BB%D1%8C_(%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F)
 *
 * Справочник по Синхронизаторам
 * https://habrahabr.ru/post/277669/
 *
 * Phaser
 * https://habrahabr.ru/post/117185/
 *
 * apache maven tutorial по-русски
 * http://www.apache-maven.ru/
 *
 * Много чего о Java
 * http://www.javable.com/docs/
 *
 * Автоматический перевод Java API 8
 * http://spec-zone.ru/RU/Java/Docs/8/api/
 *
 * database in java
 * book
 * Practical Database Programming with Java
 * Ying Bai (Author)
 *
 * Swing
 * https://habrahabr.ru/post/137347/
 *
 * * components
 * http://docs.oracle.com/javase/tutorial/uiswing/examples/components/index.html
 * менеджеры компоновки
 * http://comprice.ru/articles/detail.php?ID=42563&print=true
 * https://javaswing.wordpress.com/category/layout%D1%8B-%D0%B8-%D0%BA%D0%BE%D0%BC%D0%BF%D0%BE%D0%BD%D0%BE%D0%B2%D0%BA%D0%B0/
 * http://spec-zone.ru/RU/Java/Tutorials/uiswing/layout/box.html#alignment
 *
 * GUI java
 * http://eax.me/java-swing/
 *
 * JDBC Java
 * http://www.quizful.net/post/using-jdbc
 *
 * JavaFX 3D
 * https://www.youtube.com/user/ThinMatrix/videos
 *
 * Docs
 * Стажировка Кислицина
 *
 * Java Docs
 * http://www.oracle.com/technetwork/articles/java/index-137868.html
 *
 * Local Date and Time API 8
 * http://www.mscharhag.com/java/java-8-date-time-api
 *
 * Predicate
 * http://howtodoinjava.com/java-8/how-to-use-predicate-in-java-8/
 *
 * Function
 * http://www.deadcoderising.com/2015-09-07-java-8-functional-composition-using-compose-and-andthen/
 *
 * Stream
 * https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html
 *
 * ForkJoinTask
 * RecursiveTask
 * https://habrahabr.ru/post/128985/
 *
 * NIO
 * http://www.quizful.net/post/java-nio-tutorial
 *
 * Spring
 * https://www.youtube.com/playlist?list=PL6jg6AGdCNaWF-sUH2QDudBRXo54zuN1t
 *
 * SQL
 * https://habrahabr.ru/post/181033/
 * http://www.sql-tutorial.ru/
 * http://www.sql-ex.ru/
 *
 * MySQL or MariaDB
 * execute *.sql script:
 * mysql -u root -p < initDB.sql
 *
 * Spring:
 * https://habrahabr.ru/post/232381/
 *
 * 1000+ часов
 * https://habrahabr.ru/company/golovachcourses/blog/215275/
 *
 * JEE servlet api
 * http://javastudy.ru/interview/jee-servlet-api-questions/
 * http://javastudy.ru/interview/jee-servlet-api-questions-2/
 * http://www.java2ee.ru/servlets/lifecycle.html
 *
 * Java EE (and most other)
 * http://javastudy.ru/interview/list-of-questions-javaee-interview/
 *
 * JSP
 * http://www.javaportal.ru/java/articles/Java_Server_Pages.html
 *
 * HTTP
 * example source GET POST
 * https://www.ntu.edu.sg/home/ehchua/programming/webprogramming/HTTP_Basics.html
 *
 * Password vaildate
 * https://www.mkyong.com/regular-expressions/how-to-validate-password-with-regular-expression/
 *
 * HashMap
 * http://info.javarush.ru/translation/2013/10/22/%D0%9A%D0%B0%D0%BA-%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D0%B0%D0%B5%D1%82-HashMap-%D0%B2-Java.html
 * https://habrahabr.ru/post/128017/
 *
 * SQL
 * DateTime
 * Timestamp
 * https://habrahabr.ru/post/61391/
 *
 * SQL
 * Statement, PreparedStatement, CallableStatement
 * https://habrahabr.ru/sandbox/41444/
 *
 * Spring IoC example
 * http://nikcode.blogspot.ru/2011/09/spring-inversion-of-control.html
 *
 * JavaScript async defer загрузка страниц
 * https://learn.javascript.ru/external-script
 *
 * Собеседования
 * https://docs.google.com/presentation/d/18o__IGRqYadi4jx2wX2rX6AChHh-KrxktD8xI7bS33k/edit#slide=id.g1b6e0d7e8e_0_12
 * https://github.com/JavaOPs/topjava/blob/master/cv.md#%D0%98%D0%BD%D1%82%D0%B5%D1%80%D0%B2%D1%8C%D1%8E
 * http://javawebinar.ru/books.html
 * http://javaops.ru/vacation/test.html
 * https://habrahabr.ru/users/Bedrosova/topics/
 * https://www.youtube.com/watch?v=M4ODqY1hgUY
 * https://tproger.ru/digest/enterprise-junior/
 * http://www.javadeathmatch.com
 * http://javastudy.ru/interview/jee-spring-questions-answers/
 *
 * agile
 * https://habrahabr.ru/company/edison/blog/313410/
 * https://www.youtube.com/watch?v=loVd5MTCBWI
 *
 * JPA Transaction
 * http://www.sql.ru/forum/1183994/spring-transaction-propagation
 * http://www.ibm.com/developerworks/ru/library/j-ts1/
 * http://www.ibm.com/developerworks/ru/library/j-ts2/
 * http://stackoverflow.com/questions/15784679/why-do-my-entities-remain-detached-after-persisting-them-in-jpa
 * https://openjpa.apache.org/builds/1.2.3/apache-openjpa/docs/jpa_overview_em_lifecycle.html
 *
 * Red-black tree
 * http://tommikaikkonen.github.io/rbtree/
 * !!! http://www.cs.usfca.edu/~galles/visualization/RedBlack.html
 *
 * Regex test
 * https://regex101.com
 *
 * SSH
 * f:\home_dir\vadim\java\books_and_tips\debian\
 * https://www.opennet.ru/base/sec/ssh_intro.txt.html
 * https://toster.ru/q/349216
 * https://ru.wikipedia.org/wiki/%D0%9E%D0%B4%D0%BD%D0%BE%D1%81%D1%82%D0%BE%D1%80%D0%BE%D0%BD%D0%BD%D1%8F%D1%8F_%D1%84%D1%83%D0%BD%D0%BA%D1%86%D0%B8%D1%8F
 * https://ru.wikipedia.org/wiki/%D0%9A%D1%80%D0%B8%D0%BF%D1%82%D0%BE%D1%81%D0%B8%D1%81%D1%82%D0%B5%D0%BC%D0%B0_%D1%81_%D0%BE%D1%82%D0%BA%D1%80%D1%8B%D1%82%D1%8B%D0%BC_%D0%BA%D0%BB%D1%8E%D1%87%D0%BE%D0%BC
 * http://bog.pp.ru/work/ssh.html
 * https://rfc2.ru/4251.rfc
 *
 * SSL
 * https://tls.dxdt.ru/tls.html
 *
 * Protocol, technical specification, standards
 * Протоколы, технические спецификации, стандарты
 * https://rfc2.ru/
 *
 * Hibernate
 * @ Embeddable
 * http://www.ibm.com/developerworks/ru/library/os-hibernatejpa/
 * http://www.sql.ru/forum/1106782/obyasnite-embeddable
 * https://en.wikibooks.org/wiki/Java_Persistence/Embeddables
 * == Lazy
 * http://www.thoughts-on-java.org/5-ways-to-initialize-lazy-relations-and-when-to-use-them/
 * == Cache
 * https://habrahabr.ru/post/268747/
 * == Cache first level
 * http://howtodoinjava.com/hibernate/understanding-hibernate-first-level-cache-with-example/
 * == Cache second level
 * http://javac-dmx.blogspot.ru/2015/01/13-hibernate.html
 * http://dr-magic.blogspot.ru/2010/01/hibernate-4.html
 * http://dr-magic.blogspot.ru/2010/01/hibernate-5.html
 * https://easyjava.ru/data/hibernate/keshirovanie-v-hibernate/
 *
 * == @Cache vs @Cacheable
 * == !!! these annotations exist in JPA, Spring, Hibernate. Be careful in choice and read articles !!!
 * http://www.rapidprogramming.com/questions-answers/difference-between-cache-and-cacheable-in-jpacache-vs-cacheable-1657
 *
 *
 * EntityManager lifecycle
 * https://openjpa.apache.org/builds/1.2.3/apache-openjpa/docs/jpa_overview_em_lifecycle.html
 *
 * == EntityManager @ Transactional, EntityManager proxy, Transaction Aspect, Transaction Manager
 * == @PersistenceContext(type = PersistenceContextType.TRANSACTIONAL)
 * == @PersistenceContext(type = PersistenceContextType.EXTENDED)
 * http://akorsa.ru/2016/08/kak-na-samom-dele-rabotaet-transactional-spring/
 * http://blog.jhades.org/how-does-spring-transactional-really-work/
 * http://stackoverflow.com/questions/2547817/what-is-the-difference-between-transaction-scoped-persistence-context-and-extend
 * http://akorsa.ru/2016/10/strategii-zagruzki-grafa-obektov-v-jpa-chast-1/
 * http://www.k-press.ru/cs/2010/1/tsymbal/tsymbal.asp
 * == Open session in vew
 * https://developer.jboss.org/wiki/OpenSessionInView
 * http://initialize.ru/lazy-init-ili-open-session-in-view/
 * http://javatalks.ru/topics/29927?page=1#150420
 *
 * Session Beans, Stateless, Stateful
 * http://devcolibri.com/2044
 * http://www.intuit.ru/studies/courses/571/427/lecture/9707
 *
 * Java Best Practices
 * https://www.javacodegeeks.com/2010/07/java-best-practices-dateformat-in.html
 *
 * Methods overrides
 * http://www.quizful.net/interview/java/redefine-(override)-method
 * http://www.quizful.net/post/java-exceptions
 *
 * Spring MVC
 * http://www.ibm.com/developerworks/ru/library/wa-restful/
 * http://javastudy.ru/spring-mvc/spring-mvc-basic/
 * http://javastudy.ru/spring-mvc/spring-mvc-viewresolver/
 * http://javastudy.ru/spring-mvc/spring-mvc-webapplicationcontext/
 * http://javastudy.ru/spring-mvc/spring-mvc-handler-mapping/
 *
 * SessionAttribute vs HttpSession
 * http://stackoverflow.com/questions/27191798/spring-sessionattributes-vs-httpsession
 *
 * REST
 * http://www.restapitutorial.ru/lessons/httpmethods.html
 * https://habrahabr.ru/post/38730/
 * https://habrahabr.ru/company/dataart/blog/277419/
 * https://jazzteam.org/ru/profitable/restful-services-manual/
 * https://spark.ru/startup/getmylinks/blog/5814/tak-li-nuzhen-rest-dlya-veb-prilozhenij
 * https://habrahabr.ru/post/115718/
 * -----------
 * https://habrahabr.ru/post/144011/
 * https://habrahabr.ru/post/144259/
 * https://www.youtube.com/playlist?list=PLtDz82bWepMPLi_e9YbatLRpm0z4uOs_U
 *
 * HTTP
 * http://www.4stud.info/web-programming/protocol-http.html
 *
 *
 * JAX-RS (Java Api XML Rest Service)
 * https://habrahabr.ru/post/140181/
 *
 * JPA Criteria multi where
 * http://stackoverflow.com/questions/9321916/jpa-criteriabuilder-how-to-use-in-comparison-operator
 * http://stackoverflow.com/questions/18226800/how-to-generate-a-predicate-array-of-or-statements
 * http://stackoverflow.com/questions/29719321/combining-conditional-expressions-with-and-and-or-predicates-using-the-jpa-c
 * http://stackoverflow.com/questions/11138118/really-dynamic-jpa-criteriabuilder
 *
 * OCP
 * https://sybextestbanks.wiley.com/course/index/id/823
 *
 * Решето Аткина
 * sieve of atkin explanation-and-java-example
 * http://stackoverflow.com/questions/10580159/sieve-of-atkin-explanation-and-java-example
 * 15485863
 *
 * Authentication
 * https://habrahabr.ru/company/dataart/blog/262817/
 * https://habrahabr.ru/company/dataart/blog/311376/
 * https://habrahabr.ru/post/281406/
 * https://ru.wikipedia.org/wiki/%D0%90%D1%83%D1%82%D0%B5%D0%BD%D1%82%D0%B8%D1%84%D0%B8%D0%BA%D0%B0%D1%86%D0%B8%D1%8F_%D0%B2_%D0%98%D0%BD%D1%82%D0%B5%D1%80%D0%BD%D0%B5%D1%82%D0%B5
 * HTTP BASIC
 * http://samag.ru/archive/article/1631
 * HTTP Digest
 * http://samag.ru/archive/article/567
 *
 * AOT and JIT compilation
 * https://www.youtube.com/watch?v=oYu3HuIYDhI
 * http://www.ibm.com/developerworks/ru/library/j-jtp12214/
 *
 *
 *
 *
 */
public abstract class Summary {

    public static void main(String[] args) {

        long long_max = Long.MAX_VALUE; // result = 9223372036854775807;

        long long_1 = Long.parseUnsignedLong("9223372036854775807"); // result = 9223372036854775807;
        long long_2 = Long.parseUnsignedLong("9223372036854775808"); // result = -9223372036854775808;
        long long_3 = Long.parseUnsignedLong("-1"); // result = NumberFormatException;

        long long_4 = Long.parseLong("9223372036854775807"); // result = 9223372036854775807;
        long long_5 = Long.parseLong("9223372036854775808"); // result = NumberFormatException;
        long long_6 = Long.parseLong("-1"); // result = -1;
    }
}


