package com.transit.security;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import org.apache.catalina.authenticator.Constants;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureException;

@Provider
@SecuredWithJwtToken
public class SecuredWithJwtTokenFilter implements ContainerRequestFilter {

	@Override
	public void filter(ContainerRequestContext requestContext) {

		String authorizationHeader = requestContext.getHeaderString(HttpHeaders.AUTHORIZATION);

		if (authorizationHeader == null || authorizationHeader.isEmpty()
				|| !authorizationHeader.contains("Bearer")) {
			requestContext.abortWith(
					Response.status(Response.Status.FORBIDDEN).entity("Missing Authorization header").build());
			return;
		}
		
		String token = authorizationHeader.substring("Bearer".length()).trim();

		// Validate the token
		try {
			Jwts.parser().setSigningKey("SomeSecretCombinationKey").parse(token);
		} catch (ExpiredJwtException e) {
			requestContext.abortWith(
					Response.status(Response.Status.UNAUTHORIZED).entity("Expired token, please login").build());
			return;
		} catch (MalformedJwtException e) {
			requestContext.abortWith(
					Response.status(Response.Status.FORBIDDEN).entity("JWT was not correctly constructed").build());
			return;
		} catch (SignatureException e) {
			requestContext.abortWith(Response.status(Response.Status.FORBIDDEN).entity("Modified JWT").build());
			return;
		}

	}
}