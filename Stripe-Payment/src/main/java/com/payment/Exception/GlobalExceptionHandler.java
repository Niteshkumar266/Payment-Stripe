package com.payment.Exception;
import com.payment.payload.ErrorDetails;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ResourceNotFound.class)
   public ResponseEntity<ErrorDetails>ResourceNotFound(ResourceNotFound exception , WebRequest webRequest){
   ErrorDetails details = new ErrorDetails(new Date(),exception.getMessage(),webRequest.getDescription(false));
        return new ResponseEntity<>(details , HttpStatus.NOT_FOUND);
   }

   }
