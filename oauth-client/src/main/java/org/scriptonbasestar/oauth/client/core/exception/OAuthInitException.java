package org.scriptonbasestar.oauth.client.core.exception;

/**
 * @author archmagece
 * @since 2016-10-24
 */
public class OAuthInitException extends OAuthException {

	private static final String DEFAULT_MSG = "초기화 실패";

	public OAuthInitException() {
		super(DEFAULT_MSG);
	}

	public OAuthInitException(String message) {
		super(message);
	}
}
