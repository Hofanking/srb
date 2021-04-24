package com.scorpios.common.exception;

import com.scorpios.common.result.R;
import com.scorpios.common.result.ResponseEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class UnifiedExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public R handleException(Exception e){
      log.error(e.getMessage(),e);
      return R.error();
    }

    @ExceptionHandler(value = BadSqlGrammarException.class)
    public R handleException(BadSqlGrammarException e){
        log.error(e.getMessage(),e);
        return R.setResult(ResponseEnum.BAD_SQL_GRAMMAR_ERROR);
    }
}
