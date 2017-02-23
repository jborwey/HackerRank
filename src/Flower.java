/**
 * Created by jb039k on 6/29/2016.
 */
class flower {

    String whats_your_name(){
        return "I have many names and types";
    }
}

class Jasmine extends flower {
    @Override
    public String whats_your_name(){
        super.whats_your_name();
        return "Jasmine";
    }
}
class Lily extends flower {
    @Override
    public String whats_your_name(){
        super.whats_your_name();
        return "Lily";
    }
}
class Lotus extends flower {
    @Override
    public String whats_your_name(){
        super.whats_your_name();
        return "Lotus";
    }
}

class State {

    public flower your_national_Flower() {
        return new flower();
    }

}
class WestBengal extends State {
    public Jasmine your_national_flower(){
        return new Jasmine();
    }
}
class Karnataka extends State {
    public Lotus your_national_flower(){
        return new Lotus();
    }
}
class AndhraPradesh extends State {
    public Lily your_national_flower(){
        return new Lily();
    }
}