/**
 * 
 */
package com.lhan.rest.webservices.restfulwebservices.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author UHAN9LE
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4262851875833135613L;

	public UserNotFoundException(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

}
