package theater;

/**
 * Class representing a play.
 */
public class Play {

    private final String name;
    private final String type;

    /**
     * Create a play.
     *
     * @param name the play name
     * @param type the play type (tragedy, comedy, etc.)
     */
    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Get the play name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the play type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }
}
