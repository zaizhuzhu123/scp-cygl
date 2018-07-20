package com.scp.cmd.cygl.ws;

import org.apache.commons.lang3.StringUtils;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.scp.cmd.cygl.mml.CreateUserRequestMML;

@Endpoint
public class UserEndpoint {
	private static final String NAMESPACE_URI = "http://www.cygl.cmd.scp.com/ws";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "createUserRequest")
	@ResponsePayload
	public CreateUserResponse createU(@RequestPayload CreateUserRequest request) {
		CreateUserResponse response = new CreateUserResponse();
		response.setResultcode("0");
		CreateUserRequestMML mml = new CreateUserRequestMML();
		if (request.getUserInfo() != null && request.getUserInfo().size() > 0) {
			for (UserInfo userinfo : request.getUserInfo()) {
				User user = userinfo.getUser();
				UserAddInfo userAddInfo = userinfo.getUserAddInfo();
				mml.setGRPID(userinfo.getUser().getGrpID());
				if (StringUtils.isNotBlank(mml.getNOTABLE())) {
					StringBuffer sb = new StringBuffer(mml.getNOTABLE() + "&");
					sb.append(StringUtils.isNotBlank(user.getShortNumber()) ? user.getShortNumber() : "");
					sb.append("|");
					sb.append(StringUtils.isNotBlank(userAddInfo.getAddress().getMobilePhoneNumber()) ? userAddInfo.getAddress().getMobilePhoneNumber() : "");
					sb.append("|");
					sb.append(StringUtils.isNotBlank(userAddInfo.getAddress().getName()) ? userAddInfo.getAddress().getName() : "");
					mml.setNOTABLE(sb.toString());
				} else {
					StringBuffer sb = new StringBuffer();
					sb.append(StringUtils.isNotBlank(user.getShortNumber()) ? user.getShortNumber() : "");
					sb.append("|");
					sb.append(StringUtils.isNotBlank(userAddInfo.getAddress().getMobilePhoneNumber()) ? userAddInfo.getAddress().getMobilePhoneNumber() : "");
					sb.append("|");
					sb.append(StringUtils.isNotBlank(userAddInfo.getAddress().getName()) ? userAddInfo.getAddress().getName() : "");
					mml.setNOTABLE(sb.toString());
				}
			}
			response.setResultdesc("ok");
		}
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