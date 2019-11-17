package com.transit.services;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.UUID;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.transit.converter.UserConverter;
import com.transit.entity.LoginRequest;
import com.transit.model.LoginResponse;
import com.transit.model.UserModel;
import com.transit.repository.UserRepository;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class LoginService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserConverter userConverter;

	public LoginService() {

	}

	public LoginResponse login(LoginRequest request) {
		try {
			UserModel loggedInUser = userConverter.toModel(userRepository
					.findByUsernameAndPassword(request.getUsername().trim(), request.getPassword().trim()));
			LoginResponse response = new LoginResponse();
			response.setJwt(getToken(loggedInUser));
			response.setUser(loggedInUser);

			return response;
		} catch (NoResultException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
		}

	}

	public String getToken(UserModel loggedInUser) {
		Claims customClaims = Jwts.claims();
		customClaims.put("username", loggedInUser.getUsername());
		String token = Jwts.builder().setClaims(customClaims)
				.setExpiration(
						Date.from(LocalDateTime.now().plus(1, ChronoUnit.HOURS).toInstant(ZoneOffset.ofHours(+1))))
				.setId(UUID.randomUUID().toString()).setIssuedAt(new Date()).setIssuer("ikubinfo")
				.signWith(SignatureAlgorithm.HS256,"SomeSecretCombinationKey").compact();
		return token;
	}
}
