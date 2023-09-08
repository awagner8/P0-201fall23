public class Person201Farthest {
    public static void main(String[] args) throws Exception {
        String file = "data/large.txt";
        double max = 0;
        Person201 a = null;
        Person201 b = null;
        Person201[] people = Person201Utilities.readFile(file);
        for (Person201 p : people) {
            for (Person201 l : people){
               double d = p.distanceFrom(l);
                if (d > max) {
                    max = d;
                    b = l;
                    a = p;  
            }}
            
        }
        System.out.printf("farthest distance is %3.2f between %s and %s\n",max,a.getName(),b.getName());
    }

    
}


