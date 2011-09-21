package org.tksmaru.werewolf.controller.werewolf;

import org.scribe.model.Token;
import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.tksmaru.werewolf.service.AuthenticationService;

public class LoginController extends Controller {

	private AuthenticationService authService = new AuthenticationService();

	@Override
	public Navigation run() throws Exception {

		Token requestToken = authService.getRequestToken();

		sessionScope("oauth_token", requestToken);
		return redirect(authService.getAuthUrl(requestToken));
	}
}
