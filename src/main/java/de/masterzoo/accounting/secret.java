package de.masterzoo.accounting;

import org.jetbrains.annotations.NonNls;

public class secret {
    @NonNls
    public static final String WELCOME_GREETING = "Welcome to the Zoo!";

    public static void welcomeCustomers() {
        System.out.println(WELCOME_GREETING);
    }
}
