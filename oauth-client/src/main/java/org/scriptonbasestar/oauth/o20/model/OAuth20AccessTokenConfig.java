package org.scriptonbasestar.oauth.o20.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import org.scriptonbasestar.oauth.core.nobi.TokenNobi;
import org.scriptonbasestar.oauth.core.type.GrantType;
import org.scriptonbasestar.oauth.core.type.OAuthHttpVerb;
import org.scriptonbasestar.oauth.core.type.SignatureType;

/**
 * @author archmagece
 * @date 2016-10-24
 */
@Getter
@Builder
public class OAuth20AccessTokenConfig {
	@NonNull
	private String accessTokenUrl;
	@NonNull
	//authorized token 요청할 때 썼던 주소 그대로
	private String callbackUrl;
	//	private String scope;
	@NonNull
	private TokenNobi tokenFormatNobi;

	private OAuthHttpVerb accessTokenVerb;
	private SignatureType signatureType;
	private GrantType grantType;

//	private String refreshToken;

	public static class OAuth20AccessTokenConfigBuilder{
		private OAuthHttpVerb accessTokenVerb = OAuthHttpVerb.GET;
		private SignatureType signatureType = SignatureType.Header;
		private GrantType grantType = GrantType.AUTHORIZATION_CODE;
	}

}