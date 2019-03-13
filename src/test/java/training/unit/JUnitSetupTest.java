package training.unit;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class JUnitSetupTest {

    @Test
    public void verifyJUnit() {
        assertTrue(true);
    }

    @Test
    public void verifyMockito() {
        Blah mockBlah = mock(Blah.class);

        mockBlah.doIt();

        Mockito.verify(mockBlah).doIt();
    }

    @Test
    public void verifyHamcrest() {
        MatcherAssert.assertThat(new Blah(), is(not(new Blah())));
    }

    @Test
    public void verifyAssertJ() {
        assertThat(new Blah()).isNotEqualTo(new Blah());
    }

    private class Blah {
        void doIt() {}
    }
}
