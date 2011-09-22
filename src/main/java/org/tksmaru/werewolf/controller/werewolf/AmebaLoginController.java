package org.tksmaru.werewolf.controller.werewolf;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class AmebaLoginController extends Controller {

	@Override
	public Navigation run() throws Exception {

		// TODO 認証エンドポイントの取得方法を切り出すこと
		return redirect("https://oauth.ameba.jp/authorize?response_type=code&client_id=a9fa21c38519232bbc6bd4e2a9ac82b1d9107876670664f2904a72dcae631360&scope=w_ameba");

	}
}
