package com.scp.cygl.soap2mml.ws.user;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {
	private static final String NAMESPACE_URI = "http://www.ws.soap2mml.cygl.scp.com/user";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "createUserRequest")
	@ResponsePayload
	public Response create(@RequestPayload CreateUserRequest request) {
		Response response = new Response();
		response.setResultCode("0");
		response.setResultDesc("ok");
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteUserRequest")
	@ResponsePayload
	public Response delete(@RequestPayload DeleteUserRequest request) {
		Response response = new Response();
		response.setResultCode("0");
		response.setResultDesc("ok");
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "modifyUserRequest")
	@ResponsePayload
	public Response modify(@RequestPayload ModifyUserRequest request) {
		Response response = new Response();
		response.setResultCode("0");
		response.setResultDesc("ok");
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getUserRequest")
	@ResponsePayload
	public Response getUser(@RequestPayload GetUserRequest request) {
		Response response = new Response();
		response.setResultCode("0");
		response.setResultDesc("ok");
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllUsersRequest")
	@ResponsePayload
	public Response getAllUsers(@RequestPayload GetAllUsersRequest request) {
		Response response = new Response();
		response.setResultCode("0");
		response.setResultDesc("ok");
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "modifyShortNumberRequest")
	@ResponsePayload
	public Response modifyShortNumber(@RequestPayload ModifyShortNumberRequest request) {
		Response response = new Response();
		response.setResultCode("0");
		response.setResultDesc("ok");
		return response;
	}
}