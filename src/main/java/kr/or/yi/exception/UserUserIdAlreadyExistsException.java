package kr.or.yi.exception;

public class UserUserIdAlreadyExistsException extends RuntimeException{
    public UserUserIdAlreadyExistsException(String message) {
        super(message);
    }
}
