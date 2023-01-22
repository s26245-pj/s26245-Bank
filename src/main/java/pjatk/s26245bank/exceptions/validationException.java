package pjatk.s26245bank.exceptions;

import lombok.EqualsAndHashCode;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class validationException extends RuntimeException {
    private final String message;
}
