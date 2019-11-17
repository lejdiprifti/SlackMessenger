package com.transit.demo;


import com.transit.security.SecuredWithJwtToken;

import io.jsonwebtoken.Jwts;

@SecuredWithJwtToken
public abstract class BaseResource {

	public String getUsernameFromToken(String authHeader) {
		String token = authHeader.substring("Bearer".length()).trim();

		return (String) Jwts.parser().setSigningKey("SomeSecretCombinationKey").parseClaimsJws(token).getBody().get("username");
	}
}