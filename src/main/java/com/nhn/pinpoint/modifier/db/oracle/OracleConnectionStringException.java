package com.nhn.pinpoint.modifier.db.oracle;

import com.nhn.pinpoint.exception.PinPointException;

/**
 *
 */
public class OracleConnectionStringException extends PinPointException {

    public OracleConnectionStringException() {
    }

    public OracleConnectionStringException(String message) {
        super(message);
    }

    public OracleConnectionStringException(String message, Throwable cause) {
        super(message, cause);
    }

    public OracleConnectionStringException(Throwable cause) {
        super(cause);
    }
}
