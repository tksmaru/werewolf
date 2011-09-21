package org.tksmaru.werewolf.service;

import org.scribe.builder.ServiceBuilder;
import org.scribe.builder.api.TwitterApi;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Token;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuthService;

/**
 * TwitterのOAuth認証プロバイダのラッパー
 * 
 * @author maruyama
 * 
 */
public class AuthenticationService {

	private OAuthService service;

	public AuthenticationService() {
		service = new ServiceBuilder().provider(TwitterApi.class)
				.apiKey("MIv9FEmDbhsY9KmrP7HKw")
				.apiSecret("TwpdMcGcCUA63StBO3gQMC3Q8RSI6FngEuhnS0uczE")
				.callback("http://127.0.0.1:8888/werewolf/callback").build();
	}

	public String getAuthUrl(Token requestToken) {
		return service.getAuthorizationUrl(requestToken);
	}

	public Token getRequestToken() {
		return service.getRequestToken();
	}

	public Token getAccessToken(Token paramToken, Verifier paramVerifier) {
		return service.getAccessToken(paramToken, paramVerifier);
	}

	public void signRequest(Token paramToken, OAuthRequest paramOAuthRequest) {
		service.signRequest(paramToken, paramOAuthRequest);
	}

	public String getVersion() {
		return service.getVersion();
	}

	public String getAuthorizationUrl(Token paramToken) {
		return service.getAuthorizationUrl(paramToken);
	}
}
