package covatars.com.Covatars.models;

public class Virus1 extends Card{

    private String type;

    public Virus1(String type, String color, String imageUrl, Integer value) {
        super(type, color, imageUrl, value);
        setType("virus1");
        setValue(-1);
    }

    public void subtractHealth (Player player) {
        Integer health = player.getScore();
        player.setScore(health - 1);
    }

}
