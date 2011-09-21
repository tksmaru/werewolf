package org.tksmaru.werewolf.controller.werewolf;

import java.util.Map;

import org.scribe.model.Token;
import org.scribe.model.Verifier;
import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.util.RequestMap;
import org.tksmaru.werewolf.service.AuthenticationService;

public class CallbackController extends Controller {

	private AuthenticationService authService = new AuthenticationService();

	@Override
	public Navigation run() throws Exception {

		Map<String, Object> requestParams = new RequestMap(request);
		Verifier verifier = new Verifier(
				(String) requestParams.get("oauth_verifier"));
		Token requestToken = (Token) sessionScope("oauth_token");

		if (isDevelopment()) {
			// リクエストパラメータの確認
			for (String key : requestParams.keySet()) {
				System.out.println(key + " : " + requestParams.get(key));
			}

			// リクエストトークンの内容が合致しているかの確認（デバッグじゃないかも）
			String requestToken1 = (String) requestParams.get("oauth_token");
			if (requestToken1.equals(requestToken.getToken())) {
				System.out.println("トークン合ってるのでOK");
			}

			System.out.println("requestToken2 : " + requestToken.getToken());
			System.out.println("verifier : " + verifier.getValue());

		}

		Token accessToken = authService.getAccessToken(requestToken, verifier);
		sessionScope("accessToken", accessToken);
		// アクセストークンが生成できればリクエストトークンはもう不要。
		removeSessionScope("oauth_token");

		return redirect("menu");
	}
}
