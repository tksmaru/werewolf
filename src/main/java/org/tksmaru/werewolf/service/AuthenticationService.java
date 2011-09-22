package org.tksmaru.werewolf.service;

import org.scribe.builder.ServiceBuilder;
import org.scribe.builder.api.TwitterApi;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Token;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuthService;

/**
 * AmebaのOAuth認証プロバイダのラッパー
 * 
 * @author maruyama
 * @deprecated TODO 利用不可。クラス構成見直し中。
 */
public class AuthenticationService {

	private OAuthService service;

	public AuthenticationService() {
		service = new ServiceBuilder()
				.provider(TwitterApi.class)
				.apiKey("a9fa21c38519232bbc6bd4e2a9ac82b1d9107876670664f2904a72dcae631360")
				.apiSecret(
						"a0d16d3afdb1f66f2af1dda2319f245dee26f0c4ee1811c3d7c6f7cdbd0021f5")
				.callback("http://127.0.0.1:8888/werewolf/amebacallback")
				.build();
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
