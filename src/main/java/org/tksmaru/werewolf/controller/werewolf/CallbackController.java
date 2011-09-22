package org.tksmaru.werewolf.controller.werewolf;

import javax.servlet.ServletException;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.User;
import twitter4j.auth.RequestToken;

public class CallbackController extends Controller {

	@Override
	public Navigation run() throws Exception {

		Twitter twitter = (Twitter) sessionScope("twitter");
		RequestToken requestToken = (RequestToken) sessionScope("requestToken");

		String verifier = request.getParameter("oauth_verifier");
		try {
			twitter.getOAuthAccessToken(requestToken, verifier);
			removeSessionScope("requestToken");
		} catch (TwitterException e) {
			throw new ServletException(e);
		}

		User user = twitter.verifyCredentials();
		sessionScope("user", user);
		return redirect("menu");
	}
}
