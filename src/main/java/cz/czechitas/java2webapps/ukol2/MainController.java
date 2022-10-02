package cz.czechitas.java2webapps.ukol2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Controller
public class MainController {
    public Random random = new Random();

    @GetMapping("/")
    public ModelAndView citat() {

        List<String> seznamCitatu = List.of("Debugging /de·bugh·ing/ (verb): The Classic Mystery Game where you are the detective, the victim, and the murderer.",
            "A user interface is like a joke. If you have to explain it, it's not that good.",
            "To replace programmers with robots, clients will have to accurately describe what they want. We're safe.",
            "I have a joke on programming but it only works on my computer.",
            "99 little bugs in the code, 99 bugs in the code. Take one down, patch it around. 127 little bugs in the code…",
            "When I wrote this code, only God & I understood what it did. Now… Only God knows.",
            "Programmer (noun.): A machine that turns coffee into code.",
            "Real programmers count from 0.");

    List<String> seznamPozadi = List.of("2hzL3NMOozs", "exxWKBGrNqA", "RFCFhhl3xfQ", "JPFL2E7CSYU", "QYvpHmW2eos", "oTcaW8Pqv3U", "9pY2tQBnHIg", "C-0PGZ51dYQ", "q-0uG3G4ipM", "Rt-8hbJMLxY");

    int nahodnyCitat = random.nextInt(seznamCitatu.size());
    int nahodnePozadi = random.nextInt(seznamPozadi.size());

    ModelAndView modelAndView = new ModelAndView("index");
    modelAndView.addObject("vybranyCitat", seznamCitatu.get(nahodnyCitat));
    modelAndView.addObject("vybranePozadi", seznamPozadi.get(nahodnePozadi));
    return modelAndView;
    }
}
