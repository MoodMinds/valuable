package org.moodminds.valuable;

/**
 * Mutable value accessor generally intended for usage in anonymous instances and lambdas.
 */
public interface Valuable<V> {

    /**
     * Return the value.
     *
     * @return the value
     */
    V get();

    /**
     * Set the given value.
     *
     * @param val the given value
     */
    void put(V val);

    /**
     * Get the previous value possible atomically for thread-safe and set the new value.
     *
     * @param val the new value to set
     * @return the previous value
     */
    V set(V val);

    /**
     * Set the given value possibly atomically for thread-safe if the current value {@code == state}.
     *
     * @param state the given expected current
     * @param val the given value
     * @return {@code true} if successfully set to the new value, or {@code false} otherwise
     */
    boolean let(V state, V val);


    /**
     * A boolean value accessor.
     */
    interface Boolean {

        /**
         * Return the value.
         *
         * @return the value
         */
        boolean get();

        /**
         * Set the given value.
         *
         * @param flg the given value
         */
        void put(boolean flg);

        /**
         * Get the previous value possible atomically for thread-safe and set the new value.
         *
         * @param flg the new value to set
         * @return the previous value
         */
        boolean set(boolean flg);

        /**
         * Set the given value possibly atomically for thread-safe if the current value {@code == state}.
         *
         * @param state the given expected current
         * @param flg the given value
         * @return {@code true} if successfully set to the new value, or {@code false} otherwise
         */
        boolean let(boolean state, boolean flg);
    }

    /**
     * A char value accessor.
     */
    interface Char {

        /**
         * Return the value.
         *
         * @return the value
         */
        char get();

        /**
         * Set the given value.
         *
         * @param chr the given value
         */
        void put(char chr);

        /**
         * Get the previous value possible atomically for thread-safe and set the new value.
         *
         * @param chr the new value to set
         * @return the previous value
         */
        char set(char chr);

        /**
         * Set the given value possibly atomically for thread-safe if the current value {@code == state}.
         *
         * @param state the given expected current
         * @param chr the given value
         * @return {@code true} if successfully set to the new value, or {@code false} otherwise
         */
        boolean let(char state, char chr);
    }

    /**
     * A byte value accessor.
     */
    interface Byte {

        /**
         * Return the value.
         *
         * @return the value
         */
        byte get();

        /**
         * Set the given value.
         *
         * @param num the given value
         */
        void put(byte num);

        /**
         * Get the previous value possible atomically for thread-safe and set the new value.
         *
         * @param num the new value to set
         * @return the previous value
         */
        byte set(byte num);

        /**
         * Set the given value possibly atomically for thread-safe if the current value {@code == state}.
         *
         * @param state the given expected current
         * @param num the given value
         * @return {@code true} if successfully set to the new value, or {@code false} otherwise
         */
        boolean let(byte state, byte num);

        /**
         * Increment value possibly atomically for thread-safe and return.
         *
         * @return incremented value
         */
        byte incr();

        /**
         * Decrement value possibly atomically for thread-safe and return.
         *
         * @return decremented value
         */
        byte decr();
    }

    /**
     * A short value accessor.
     */
    interface Short {

        /**
         * Return the value.
         *
         * @return the value
         */
        short get();

        /**
         * Set the given value.
         *
         * @param num the given value
         */
        void put(short num);

        /**
         * Get the previous value possible atomically for thread-safe and set the new value.
         *
         * @param num the new value to set
         * @return the previous value
         */
        short set(short num);

        /**
         * Set the given value possibly atomically for thread-safe if the current value {@code == state}.
         *
         * @param state the given expected current
         * @param num the given value
         * @return {@code true} if successfully set to the new value, or {@code false} otherwise
         */
        boolean let(short state, short num);

        /**
         * Increment value possibly atomically for thread-safe and return.
         *
         * @return incremented value
         */
        short incr();

        /**
         * Decrement value possibly atomically for thread-safe and return.
         *
         * @return decremented value
         */
        short decr();
    }

    /**
     * An int value accessor.
     */
    interface Int {

        /**
         * Return the value.
         *
         * @return the value
         */
        int get();

        /**
         * Set the given value.
         *
         * @param num the given value
         */
        void put(int num);

        /**
         * Get the previous value possible atomically for thread-safe and set the new value.
         *
         * @param num the new value to set
         * @return the previous value
         */
        int set(int num);

        /**
         * Set the given value possibly atomically for thread-safe if the current value {@code == state}.
         *
         * @param state the given expected current
         * @param num the given value
         * @return {@code true} if successfully set to the new value, or {@code false} otherwise
         */
        boolean let(int state, int num);

        /**
         * Increment value possibly atomically for thread-safe and return.
         *
         * @return incremented value
         */
        int incr();

        /**
         * Decrement value possibly atomically for thread-safe and return.
         *
         * @return decremented value
         */
        int decr();
    }

    /**
     * A long value accessor.
     */
    interface Long {

        /**
         * Return the value.
         *
         * @return the value
         */
        long get();

        /**
         * Set the given value.
         *
         * @param num the given value
         */
        void put(long num);

        /**
         * Get the previous value possible atomically for thread-safe and set the new value.
         *
         * @param num the new value to set
         * @return the previous value
         */
        long set(long num);

        /**
         * Set the given value possibly atomically for thread-safe if the current value {@code == state}.
         *
         * @param state the given expected current
         * @param num the given value
         * @return {@code true} if successfully set to the new value, or {@code false} otherwise
         */
        boolean let(long state, long num);

        /**
         * Increment value possibly atomically for thread-safe and return.
         *
         * @return incremented value
         */
        long incr();

        /**
         * Decrement value possibly atomically for thread-safe and return.
         *
         * @return decremented value
         */
        long decr();
    }

    /**
     * A float value accessor.
     */
    interface Float {

        /**
         * Return the value.
         *
         * @return the value
         */
        float get();

        /**
         * Set the given value.
         *
         * @param num the given value
         */
        void put(float num);

        /**
         * Get the previous value possible atomically for thread-safe and set the new value.
         *
         * @param num the new value to set
         * @return the previous value
         */
        float set(float num);

        /**
         * Set the given value possibly atomically for thread-safe if the current value {@code == state}.
         *
         * @param state the given expected current
         * @param num the given value
         * @return {@code true} if successfully set to the new value, or {@code false} otherwise
         */
        boolean let(float state, float num);
    }

    /**
     * A double value accessor.
     */
    interface Double {

        /**
         * Return the value.
         *
         * @return the value
         */
        double get();

        /**
         * Set the given value.
         *
         * @param num the given value
         */
        void put(double num);

        /**
         * Get the previous value possible atomically for thread-safe and set the new value.
         *
         * @param num the new value to set
         * @return the previous value
         */
        double set(double num);

        /**
         * Set the given value possibly atomically for thread-safe if the current value {@code == state}.
         *
         * @param state the given expected current
         * @param num the given value
         * @return {@code true} if successfully set to the new value, or {@code false} otherwise
         */
        boolean let(double state, double num);
    }
}
