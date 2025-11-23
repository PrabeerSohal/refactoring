package theater;

/**
 * Class representing a performance of a play.
 */
public class Performance {

    private final String playID;
    private final int audience;

    /**
     * Create a performance.
     *
     * @param playID the play's ID
     * @param audience audience size
     */
    public Performance(String playID, int audience) {
        this.playID = playID;
        this.audience = audience;
    }

    /**
     * Get the play ID.
     *
     * @return the play ID
     */
    public String getPlayID() {
        return playID;
    }

    /**
     * Get the audience size.
     *
     * @return audience count
     */
    public int getAudience() {
        return audience;
    }
}
