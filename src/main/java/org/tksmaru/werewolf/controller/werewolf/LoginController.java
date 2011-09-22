package org.tksmaru.werewolf.controller.werewolf;

//import org.scribe.model.Token;
import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.RequestToken;

public class LoginController extends Controller {

	@Override
	public Navigation run() throws Exception {

		Twitter twitter = new TwitterFactory().getInstance();
		sessionScope("twitter", twitter);

		StringBuffer callbackURL = request.getRequestURL();
		int index = callbackURL.lastIndexOf("/");
		callbackURL.replace(index, callbackURL.length(), "")
				.append("/callback");

		RequestToken requestToken = twitter.getOAuthRequestToken(callbackURL
				.toString());
		sessionScope("requestToken", requestToken);
		return redirect(requestToken.getAuthenticationURL());
	}
}
