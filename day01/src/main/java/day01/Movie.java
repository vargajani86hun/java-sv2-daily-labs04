package day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private int yearOfRelease;
    private List<Actor> actors = new ArrayList<>();

    public Movie(String title, int yearOfRelease) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public int actorsInTheirTwenties() {
        int count = 0;
        for (Actor actor : actors) {
            if ((yearOfRelease - actor.getYearOfBirth() >= 20) &&
                    (yearOfRelease - actor.getYearOfBirth() < 30)) {
                count++;
            }
        }
        return count;
    }
}
