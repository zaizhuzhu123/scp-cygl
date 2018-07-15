package com.scp.cygl.exception;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.alibaba.fastjson.JSONException;
import com.scp.cygl.exception.command.impl.MediaTypeNotSupportedCommand;
import com.scp.cygl.exception.command.impl.MethodNotSupportedCommand;
import com.scp.cygl.exception.command.impl.MissingParameterCommand;
import com.scp.cygl.exception.command.impl.UnknowCommand;

@ControllerAdvice
public class ExceptionProcesser {

	private static Logger LOGGER = LoggerFactory.getLogger(ExceptionProcesser.class);

	/**
	 * 系统内部错误捕获
	 *
	 * @param exception
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@ResponseBody
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	public Object exceptionHandler(Exception exception, HttpServletResponse response) throws IOException {
		LOGGER.error("Capturing an exception", exception);
		return new UnknowCommand().onException(exception, response);
	}

	/**
	 * 请求的json格式错误
	 *
	 * @Title: handleMethodArgumentNotValidException @Description:
	 *         TODO(这里用一句话描述这个方法的作用) @param @param ex @param @return
	 *         设定文件 @return ExceptionResponse 返回类型 @throws
	 */
	@ExceptionHandler(JSONException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ExceptionResponse handleMethodArgumentNotValidException(JSONException ex) {
		ExceptionResponse exception = new ExceptionResponse(-1, "请求参数格式错误,JSON转换失败:" + ex.getMessage());
		return exception;
	}

	@ExceptionHandler(HttpMessageNotReadableException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ExceptionResponse handleMethodArgumentNotValidException(HttpMessageNotReadableException ex) {
		ExceptionResponse exception = new ExceptionResponse(-1, "请求参数JSON格式错误!");
		return exception;
	}

	/**
	 * *************************************************************************
	 * ********************************************************************
	 */
	/**
	 * 输入校验异常
	 *
	 * @param exception
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@ResponseBody
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MissingServletRequestParameterException.class)
	public Object exceptionHandler(MissingServletRequestParameterException exception, HttpServletResponse response) throws IOException {
		LoggerFactory.getLogger(MissingServletRequestParameterException.class).error("Capturing an exception", exception);
		return new MissingParameterCommand().onException(exception, response);
	}

	/**
	 * 业务异常
	 *
	 * @param exception
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@ResponseBody
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(ServiceException.class)
	public ExceptionResponse ExceptionHandler(ServiceException exception, HttpServletResponse response) throws IOException {
		LoggerFactory.getLogger(ServiceException.class).error("Capturing an exception", exception);
		return exception.getResponse();
	}

	/**
	 * 业务异常
	 *
	 * @param exception
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@ResponseBody
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(IllegalArgumentException.class)
	public ExceptionResponse IllegalArgumentExceptionHandler(IllegalArgumentException exception, HttpServletResponse response) throws IOException {
		LoggerFactory.getLogger(IllegalArgumentException.class).error("Capturing an exception", exception);
		ExceptionResponse exceptionRes = new ExceptionResponse(-1, exception.getMessage());
		return exceptionRes;
	}

	// IllegalArgumentException
	/**
	 * 输入校验异常
	 *
	 * @param exception
	 * @param response
	 * @return
	 * @throws IOException
	 */

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ExceptionResponse handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
		BindingResult bindingResult = ex.getBindingResult();
		String errorMesssage = "";
		for (FieldError fieldError : bindingResult.getFieldErrors()) {
			errorMesssage += fieldError.getDefaultMessage() + "\n";
		}
		ExceptionResponse exception = new ExceptionResponse(-1, errorMesssage);
		LoggerFactory.getLogger(MethodArgumentNotValidException.class).error("Capturing an exception", exception);
		return exception;
	}

	/**
	 * 未知ContentType
	 *
	 * @param exception
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@ResponseBody
	@ResponseStatus(code = HttpStatus.NOT_ACCEPTABLE)
	@ExceptionHandler(HttpMediaTypeNotSupportedException.class)
	public Object exceptionHandler(HttpMediaTypeNotSupportedException exception, HttpServletResponse response) throws IOException {
		LoggerFactory.getLogger(HttpMediaTypeNotSupportedException.class).error("Capturing an exception", exception);

		return new MediaTypeNotSupportedCommand().onException(exception, response);
	}

	/**
	 * 未知Methmod
	 *
	 * @param exception
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@ResponseBody
	@ResponseStatus(code = HttpStatus.METHOD_NOT_ALLOWED)
	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	public Object exceptionHandler(HttpRequestMethodNotSupportedException exception, HttpServletResponse response) throws IOException {
		LoggerFactory.getLogger(HttpRequestMethodNotSupportedException.class).error("Capturing an exception", exception);
		return new MethodNotSupportedCommand().onException(exception, response);
	}
}
