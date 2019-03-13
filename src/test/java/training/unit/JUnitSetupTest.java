package training.unit;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.mock.MockName;

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
        MockName mockString = mock(MockName.class);

        mockString.isDefault();

        Mockito.verify(mockString).isDefault();
    }

    @Test
    public void verifyHamcrest() {
        MatcherAssert.assertThat("foo", is(not("bar")));
    }

    @Test
    public void verifyAssertJ() {
        assertThat("foo").isNotEqualTo("bar");
    }
}
