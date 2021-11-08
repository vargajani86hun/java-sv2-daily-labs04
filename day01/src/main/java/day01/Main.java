package day01;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Dune: Part One", 2021);
        movie.addActor(new Actor("Timothée Chalamet", 1995));
        movie.addActor(new Actor("Rebecca Ferguson", 1983));
        movie.addActor(new Actor("Zendaya", 1996));
        movie.addActor(new Actor("Jason Momoa", 1979));
        movie.addActor(new Actor("Elmi Rashid Elmi", 1992));
        movie.addActor(new Actor("Joelle Amery", 1998));
        int youngActors = movie.actorsInTheirTwenties();
        System.out.println(youngActors);
    }
}
