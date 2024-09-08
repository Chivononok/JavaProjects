package streams;

public class NotFoundCity extends Exception{
    NotFoundCity(){
        super("город не найден");
    }
}
