package _message_format;

/**
 * Created by Vad on 14.07.2016.
 */
public class Template {
    final static String PATTERN;
    final static String MESSAGE_SLOW;
    final static String MESSAGE_SLOW_SLOW = "slow";
    final static String MESSAGE_FAST = "{3} (good enough)";

    static {
        PATTERN = "{0}: Cat: name is {1}, age {2}, speed {3}";
        MESSAGE_SLOW = "{3} (it is too {4});";
    }
}
