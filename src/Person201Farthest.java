public class Person201Farthest {
    public static void main(String[] args) throws Exception {
        String file = "/Users/swagner/Documents/Duke Fall '23/CS 201/Projects/p0-201fall23/data/large.txt";
        Person201[] people = Person201Utilities.readFile(file);
        double max = 0;
        Person201 a = null;
        Person201 b = null;
        for (Person201 p : people) {
            for (Person201 l : people){
               double d = p.distanceFrom(l);
                if (d > max) {
                    max = d;
                    a = l;
                    b = p;  
            }}
            
        }
        System.out.printf("farthest distance is %3.2f between %s and %s\n",max,a.getName(),b.getName());
    }

    
}


