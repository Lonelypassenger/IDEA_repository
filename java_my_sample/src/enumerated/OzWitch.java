package enumerated;

import static net.mindview.util.Print.print;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * 枚举体内部还可以加上description的
 * @DATE:CRETED: IN 10:15 2019/9/12
 * @MODIFY:
 */
public enum  OzWitch {
    //在枚举类型当中，每个instance都必须线与方法进行申明
    WEST("Miss Gulch, aka the Wicked Witch of the West"),
    NORTH("Glinda, the Good Witch of the North"),
    EAST("Wicked Witch of the East, wearer of the Ruby " +
                 "Slippers, crushed by Dorothy's house"),
    SOUTH("Good by inference, but missing");
    private String description;
    // Constructor must be package or private access:
    private OzWitch(String description) {
        this.description = description;
    }
    public String getDescription() { return description; }
    public static void main(String[] args) {
        for(OzWitch witch : OzWitch.values())
            print(witch + ": " + witch.getDescription());
    }
}
