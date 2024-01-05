package practicum.p7;

import java.util.ArrayList;

public class UitgeverijApp {
    public static void main(String[] args) {
        ArrayList<String> verbodenWoorden = new ArrayList<>();
        verbodenWoorden.add("student");
        StringProcessor processor = new StringProcessor();
        processor.voegProcesToe(new VervangProces("hij", "die"));
        processor.voegProcesToe(new HoofdletterProces());
        processor.voegProcesToe(new VerbodenWoordenProces(verbodenWoorden));
        String inputString = "Een student loopt meestal in het derde jaar stage. Dan moet hij zelf een stageplek vinden.";
        String result = processor.verwerk(inputString);
        System.out.println(result);
    }
}
