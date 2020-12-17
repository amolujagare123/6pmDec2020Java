package Inheritance.PolyMorphism;

public class TvShowroom {

    void volumeControl()
    {
        System.out.println("TV volume");
    }

    void channels()
    {
        System.out.println("TV channels");
    }

    void settings()
    {
        System.out.println("TV settings");
    }
}

class LG extends  TvShowroom
{
    void volumeControl()
    {
        System.out.println("LG volume");
    }

    void channels()
    {
        System.out.println("LG channels");
    }

    void settings()
    {
        System.out.println("LG settings");
    }
}

class Samsang extends  TvShowroom
{
    void volumeControl()
    {
        System.out.println("Samsang volume");
    }

    void channels()
    {
        System.out.println("Samsang channels");
    }

    void settings()
    {
        System.out.println("Samsang settings");
    }
}


class Onida extends  TvShowroom
{
    void volumeControl()
    {
        System.out.println("Onida volume");
    }

    void channels()
    {
        System.out.println("Onida channels");
    }

    void settings()
    {
        System.out.println("Onida settings");
    }
}

class TestOverriding
{
    public static void main(String[] args) {

        TvShowroom ob = new LG(); // up casting
        ob.channels();
        ob.settings();
        ob.volumeControl();

        ob = new Samsang();
        ob.channels();
        ob.settings();
        ob.volumeControl();

        ob = new Onida();
        ob.channels();
        ob.settings();
        ob.volumeControl();

    }

}