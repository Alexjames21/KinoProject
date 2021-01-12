
package rocks.process.acrm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/Top Movies")
    public class TopMoviesController {

    @GetMapping
    public String getTopMovieView() { return "Top Movies.html"; }

    @GetMapping("/createGodfather")
    public String getGodfatherReviewView() {
        return "ReviewFormGodfather.html";
    }

    @GetMapping("/createIt")
    public String getItReviewView() {
        return "ReviewFormIt.html";
    }

    @GetMapping("/createStarWars")
    public String getStarWarsReviewView() {
        return "ReviewFormStarWars.html";
    }

    @GetMapping("/createTenet")
    public String getTenetReviewView() {
        return "ReviewFormTenet.html";
    }

}