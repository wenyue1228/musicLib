package Musiclibrary;

public class Artist {
    public String name;

    public Artist(String name) {
        this.name = name;

    }
/*
get and set artist name
getter是得到属性值，setter是设置属性值
 */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

/*
Override the toString method to represent the artist object as a string
*/
    @Override
    public String toString() {
        return name;
    }
}


