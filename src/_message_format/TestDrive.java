package _message_format;

import java.text.ChoiceFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Vad on 14.07.2016.
 */
public class TestDrive {
    public static void main(String[] args) {

        //
        Cat catMan = new Cat("Man", 2, 1.22);
        Cat catWoman = new Cat("Woman", 1, 0.99);

        //
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(catMan);
        cats.add(catWoman);

        //
        for (Cat cat : cats) {

            //
            double[] limits = {0, 1};
            String[] formats = {Template.MESSAGE_SLOW, Template.MESSAGE_FAST};
            ChoiceFormat choiceFormat = new ChoiceFormat(limits, formats);

            MessageFormat messageFormat = new MessageFormat(Template.PATTERN);
            Format[] formatsPattern = {new SimpleDateFormat("dd-MM-yyyy"), null, null, choiceFormat};
            messageFormat.setFormats(formatsPattern);

            Object[] arguments = {new Date(), cat.getName(), cat.getAge(), cat.getSpeed(), Template.MESSAGE_SLOW_SLOW.toUpperCase()};
            System.out.println(messageFormat.format(arguments));
        }

    }
}
