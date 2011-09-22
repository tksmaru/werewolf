package org.tksmaru.werewolf.controller.werewolf;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class AmebaLoginControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/werewolf/amebaLogin");
        AmebaLoginController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is(nullValue()));
    }
}
