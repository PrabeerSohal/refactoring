package theater;

/**
 * Constants used throughout the theater billing system.
 */
public final class Constants {

    // -------------------------
    // Volume credit constants
    // -------------------------

    /** Base threshold for earning volume credits. */
    public static final int BASE_VOLUME_CREDIT_THRESHOLD = 30;

    /** Extra volume credit factor for comedies. */
    public static final int COMEDY_EXTRA_VOLUME_FACTOR = 5;

    // -------------------------
    // Comedy pricing constants
    // -------------------------

    /** Additional charge per audience member for comedies. */
    public static final int COMEDY_AMOUNT_PER_AUDIENCE = 300;

    /** Threshold audience size for comedy price increases. */
    public static final int COMEDY_AUDIENCE_THRESHOLD = 20;

    /** Base price for a comedy play. */
    public static final int COMEDY_BASE_AMOUNT = 30000;

    /** Extra fee added when comedy attendance exceeds threshold. */
    public static final int COMEDY_OVER_BASE_CAPACITY_AMOUNT = 10000;

    /** Fee per audience member beyond comedy threshold. */
    public static final int COMEDY_OVER_BASE_CAPACITY_PER_PERSON = 500;

    // -------------------------
    // Tragedy pricing constants
    // -------------------------

    /** Threshold audience size for tragedy price increases. */
    public static final int TRAGEDY_AUDIENCE_THRESHOLD = 30;

    /** Base price for a tragedy play. */
    public static final int TRAGEDY_BASE_AMOUNT = 40000;

    /** Fee per audience member beyond tragedy threshold. */
    public static final int TRAGEDY_OVER_BASE_CAPACITY_PER_PERSON = 1000;

    // -------------------------
    // Formatting constants
    // -------------------------

    /** Factor for formatting amounts as currency. */
    public static final int PERCENT_FACTOR = 100;

    // -------------------------
    // History play constants
    // -------------------------

    /** Base price for a history play. */
    public static final int HISTORY_BASE_AMOUNT = 20000;

    /** Fee per audience member beyond history threshold. */
    public static final int HISTORY_OVER_BASE_CAPACITY_PER_PERSON = 1000;

    /** Threshold audience size for history price increases. */
    public static final int HISTORY_AUDIENCE_THRESHOLD = 20;

    /** Threshold for earning volume credits for history plays. */
    public static final int HISTORY_VOLUME_CREDIT_THRESHOLD = 20;

    // -------------------------
    // Pastoral play constants
    // -------------------------

    /** Base price for a pastoral play. */
    public static final int PASTORAL_BASE_AMOUNT = 40000;

    /** Fee per audience member beyond pastoral threshold. */
    public static final int PASTORAL_OVER_BASE_CAPACITY_PER_PERSON = 2500;

    /** Threshold audience size for pastoral price increases. */
    public static final int PASTORAL_AUDIENCE_THRESHOLD = 20;

    /** Threshold for earning volume credits for pastoral plays. */
    public static final int PASTORAL_VOLUME_CREDIT_THRESHOLD = 20;

    /**
     * Prevent instantiation.
     */
    private Constants() {
        // no instances allowed
    }
}
