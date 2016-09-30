package __tutorial._quiz_card;

import javax.sound.midi.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by Vad on 30.05.2016.
 */
public class MidiFromFile {

    public static void PlayMidi() {
        try {

            //
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            //
            Sequence sequence = MidiSystem.getSequence(new File("c:/PiratesOfTheCaribbean.mid"));
            System.out.println(sequence.getMicrosecondLength() / 1000 / 1000);

            //
            sequencer.setSequence(sequence);
            System.out.println(sequencer.getMicrosecondLength() / 1000 / 1000);

            //
            sequencer.start();

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
