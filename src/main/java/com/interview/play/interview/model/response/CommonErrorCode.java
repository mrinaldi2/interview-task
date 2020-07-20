package com.interview.play.interview.model.response;

public enum CommonErrorCode implements ErrorCode {
    ERROR_MISSING_PARAMETERS(-3L),
    ERROR_INTERNAL_ERROR(-1L),
    ERROR_INVALID_SESSION(-11L);

    private final long numericCode;

    private CommonErrorCode(long numericCode) {
        this.numericCode = numericCode;
    }

    public long numericCode() {
        return this.numericCode;
    }

    public String stringCode() {
        return this.name();
    }
}