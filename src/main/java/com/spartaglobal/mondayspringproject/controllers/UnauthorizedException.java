package com.spartaglobal.mondayspringproject.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED, reason="You are not authorized to perform this operation.")
public class UnauthorizedException extends RuntimeException {
}
