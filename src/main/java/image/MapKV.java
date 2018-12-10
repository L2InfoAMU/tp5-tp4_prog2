package src.main.java.image;

public interface Map<Point,Color> {

    /**
     * @param point
     * @return true if this map contains a mapping for the specified key
     */
    boolean containsKey(Point point);

    /**
     * @param point
     * @return the value to which the specified key is mapped, or null if this map contains no mapping for the key
     */
    Color get(Point point);

    /**
     * @param point
     * @param defaultValue
     * @return the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key
     */
    Color getOrDefault(Point point, Color defaultValue);

    /**
     * Associates (maps) the specified value with the specified key in this map
     * @param point
     * @param value
     * @return
     */
    Color put(Point point, Color value);
}
