package org.tksmaru.werewolf.service;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class AuthenticationServiceTest extends AppEngineTestCase {

    private AuthenticationService service = new AuthenticationService();

    @Test
    public void test() throws Exception {
        assertThat(service, is(notNullValue()));
    }
}
