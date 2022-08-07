package kr.or.yi.exception;

public class UserNickAlreadyExistsException  extends RuntimeException{
    public UserNickAlreadyExistsException(String message) {
        super(message);
    }
}
