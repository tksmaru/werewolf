package org.tksmaru.werewolf.model;

import java.io.Serializable;

public class Token implements Serializable {

	private static final long serialVersionUID = 192495327452449181L;

	private String refresh_token;
	private int expires_in;
	private String access_token;

	public Token() {
	}

	public String getRefresh_token() {
		return refresh_token;
	}

	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}

	public int getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

}
