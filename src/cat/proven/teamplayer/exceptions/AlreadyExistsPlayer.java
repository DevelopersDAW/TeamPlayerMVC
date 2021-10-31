package cat.proven.teamplayer.exceptions;

/**
 *
 * @author Jordi and David
 */
public class AlreadyExistsPlayer extends Exception {

    /**
     *
     * @param message string discribing exception
     */
    public AlreadyExistsPlayer(String message) {
        super(message);
    }
}
