package org.tksmaru.werewolf.controller.werewolf;

import net.arnx.jsonic.JSON;

import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.tksmaru.werewolf.service.AuthenticationService;

public class TestController extends Controller {

	private AuthenticationService service = new AuthenticationService();

	@Override
	public Navigation run() throws Exception {

		Token accessToken = (Token) sessionScope("accessToken");

		OAuthRequest request = new OAuthRequest(Verb.GET,
				"http://api.twitter.com/1/statuses/home_timeline.json");
		service.signRequest(accessToken, request);
		Response response = request.send();
		Object obj = JSON.decode(response.getBody());
		System.out.println(obj.toString());
		return forward("menu.jsp");
	}
}
