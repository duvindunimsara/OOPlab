package VE;

class InvalidITNumberException extends Exception {
    public InvalidITNumberException() {
        super("Invalid IT number. The valid IT number starts with the characters 'IT' and is followed by 8 numbers.");
    }
}
