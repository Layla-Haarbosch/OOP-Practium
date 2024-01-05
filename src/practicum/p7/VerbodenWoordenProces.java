package practicum.p7;

import java.util.ArrayList;

public class VerbodenWoordenProces implements OpmaakProces{
    private final ArrayList<String> verbodenWoorden;

    public VerbodenWoordenProces(ArrayList<String> verbodenWoorden) {
        this.verbodenWoorden = verbodenWoorden;
    }

    public String maakOp(String input) {
        for (String woord : this.verbodenWoorden) {
            woord = woord.toLowerCase();

            if (input.toLowerCase().contains(woord)) {
                if (input.toUpperCase().equals(input)) {
                    woord = woord.toUpperCase();
                }
                input = input.replace(woord, "*".repeat(woord.length()));
            }
        }

        return input;
    }
}
