package HW12;

public enum Messages {
    PLEASE_ENTER_FILE_NAME("Please enter file name"),
    FILE_NOT_FOUND("File not found, please try again"),
    EXIT("do you want to exit y/n : =)?"),
    INTERNAL_ERROR ("InternalError, app will be closed");

    private final String message;

    Messages (String message){
        this.message = message;
    }
}
