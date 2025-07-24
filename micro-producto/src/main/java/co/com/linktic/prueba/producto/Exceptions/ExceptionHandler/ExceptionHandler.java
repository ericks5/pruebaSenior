/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.linktic.prueba.producto.Exceptions.ExceptionHandler;

import co.com.linktic.prueba.producto.Exceptions.NotExistException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.http.HttpStatus;

/**
 *
 * @author zergu
 */
@ControllerAdvice
public class ExceptionHandler {
    
    @org.springframework.web.bind.annotation.ExceptionHandler(NotExistException.class)
    public ResponseEntity<Object> notExistExceptionHandler(NotExistException ex)
    {
        Map<String,Object> body = new HashMap<>();
        body.put("Exception", "NotExistException");
        body.put("Message", ex.getMessage());
        body.put("timestamp", LocalDateTime.now());
        
        return new ResponseEntity<>(body,HttpStatus.NOT_FOUND);
        
    }
    
}
