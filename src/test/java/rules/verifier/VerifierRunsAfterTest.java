package rules.verifier;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.experimental.results.PrintableResult.testResult;
import static org.junit.experimental.results.ResultMatchers.isSuccessful;

public class VerifierRunsAfterTest {

    @Test
    public void verifierRunsAfterTest() {
        UsesVerifier.sequence = "";
        assertThat(testResult(UsesVerifier.class), isSuccessful());
        assertEquals("test verify ", UsesVerifier.sequence);
        System.out.println(UsesVerifier.sequence);
    }
}
