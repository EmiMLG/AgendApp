package com.emi.agendapp.model;

public class CommandParser {

    public static Command parse(String text) {

        if (text.equalsIgnoreCase("quit") || text.equalsIgnoreCase("q")) {
            return Command.QUIT;
        }
        if (text.equalsIgnoreCase("help") || text.equalsIgnoreCase("h")) {
            return Command.HELP;
        }
        if (text.equalsIgnoreCase("añadir") || text.equalsIgnoreCase("a")) {
            return Command.ADD;
        }
        if (text.equalsIgnoreCase("lista") || text.equalsIgnoreCase("l")) {
            return Command.LIST;
        }
        if (text.equalsIgnoreCase("delete") || text.equalsIgnoreCase("d")) {
            return Command.DELETE;
        }
        return Command.UNKNOWN;
    }
}
