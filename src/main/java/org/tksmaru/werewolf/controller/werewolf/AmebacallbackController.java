package org.tksmaru.werewolf.controller.werewolf;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import net.arnx.jsonic.JSON;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.tksmaru.werewolf.model.AmebaApiResponse;
import org.tksmaru.werewolf.model.Token;

public class AmebacallbackController extends Controller {

	@Override
	public Navigation run() throws Exception {

		// TODO amebaAPI部分を別コードに切り出すこと
		String code = request.getParameter("code");
		System.out.println("code : " + code);

		URL url = new URL("https://oauth.ameba.jp/token");

		HttpURLConnection urlconn = (HttpURLConnection) url.openConnection();
		urlconn.setRequestMethod("POST");
		urlconn.setDoOutput(true);

		StringBuilder buff = new StringBuilder();
		buff.append("grant_type=authorization_code");
		buff.append("&");
		buff.append("client_id=");
		buff.append("a9fa21c38519232bbc6bd4e2a9ac82b1d9107876670664f2904a72dcae631360");
		buff.append("&");
		buff.append("client_secret=");
		buff.append("a0d16d3afdb1f66f2af1dda2319f245dee26f0c4ee1811c3d7c6f7cdbd0021f5");
		buff.append("&");
		buff.append("code=");
		buff.append(code);

		PrintWriter printWriter = new PrintWriter(urlconn.getOutputStream());
		printWriter.print(buff.toString());
		printWriter.close();

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				urlconn.getInputStream()));
		/*
		 * StringBuilder responseBody = new StringBuilder();
		 * 
		 * while (true) { String line = reader.readLine(); if (line == null) {
		 * break; } responseBody.append(line); }
		 */
		Token token = JSON.decode(reader, Token.class);
		reader.close();
		urlconn.disconnect();
		sessionScope("token", token);

		// プロフィールを取得する
		URL profileEndpoint = new URL(
				"http://platform.ameba.jp/api/profile/user/getLoginUserProfile/json");
		HttpURLConnection conn = (HttpURLConnection) profileEndpoint
				.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Authorization",
				"OAuth " + token.getAccess_token());
		// conn.connect();

		BufferedReader reader2 = new BufferedReader(new InputStreamReader(
				conn.getInputStream()));
/*
		while (true) {
			String line = reader2.readLine();
			if (line == null) {
				break;
			}
			System.out.println(line);
		}
*/
		AmebaApiResponse response = JSON
				.decode(reader2, AmebaApiResponse.class);
		System.out.println("test amebaId : "
				+ response.getProfile().getAmebaId());

		reader2.close();
		conn.disconnect();

		sessionScope("profile", response.getProfile());

		return redirect("amebaMenu");
	}
}
