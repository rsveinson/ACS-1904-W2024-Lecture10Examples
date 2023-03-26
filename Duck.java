/**
 * Ducks that can be sorted:
 *     - the class must implement Comparable
 *     - there must be a method compareTo
 *     - for convenience a toString method 
 */
public class Duck implements Comparable<Duck>
//public class Duck implements Comparable
{

    private String name;
    private int weight;

    public Duck(String n, int w)
    {
        name = n;
        weight = w;
    }
    
    // comparing ducks
    public int compareTo(Duck d)
    //public int compareTo(Object d)
    {
        //Duck aDuck = (Duck) d;
        Duck aDuck = d;
        return this.weight - aDuck.weight;
    }
    // printing of ducks
    public String toString(){
        return name + " " + weight;
    }
}
