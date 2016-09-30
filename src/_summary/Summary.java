package _summary;

import java.util.HashMap;
import java.util.Map;

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
 */
public class Summary {

    public static void main(String[] args) {
        System.out.println(maxPowerOf2(131073));   //131072
        System.out.println();
        System.out.println(maxPowerOf2(1026));      //1024
        System.out.println();
        System.out.println(maxPowerOf2(17));        //16
    }

    public static void printTextToBinary(int i) {
        String s = Integer.toBinaryString(i);
        while (s.length() != 32) {
            s = "0" + s;
        }
        System.out.println(s);
    }


    public static int maxPowerOf2(int x) {

        printTextToBinary(x);
        System.out.println();

        int y;

        y = x >> 1;
        printTextToBinary(y);

        x |= y;
        printTextToBinary(x);
        System.out.println();

        y = x >> 2;
        printTextToBinary(y);

        x |= y;
        printTextToBinary(x);
        System.out.println();

        y = x >> 4;
        printTextToBinary(y);

        x |= y;
        printTextToBinary(x);
        System.out.println();

        y = x >> 8;
        printTextToBinary(y);

        x |= y;
        printTextToBinary(x);
        System.out.println();

        y = x >> 16;
        printTextToBinary(y);

        x |= y;
        printTextToBinary(x);
        System.out.println();

        y = x >> 1;
        printTextToBinary(y);

        x = x ^ y;
        printTextToBinary(x);
        System.out.println();

        return x;
        // comment
        // change
    }
}


