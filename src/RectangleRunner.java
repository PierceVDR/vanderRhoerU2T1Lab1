public class RectangleRunner {
    public static void main(String[] args) {

        // Declaring & initializing plots:
        Rectangle plot1 = new Rectangle(150,200);
        Rectangle plot2 = new Rectangle(125);
        Rectangle plot3 = new Rectangle();

        // ----------------------------------------------------------
        // Printing info:

        //System.out.println( "Plot 1 length: " + plot1.getLength() );
        //System.out.println( "Plot 1 width: " + plot1.getWidth() );
        //System.out.println( "Plot 1 area: " + plot1.calculateArea() );

        //System.out.println();

        //System.out.println( "Plot 2 length: " + plot2.getLength() );
        //System.out.println( "Plot 2 width: " + plot2.getWidth() );
        //System.out.println( "Plot 2 area: " + plot2.calculateArea() );

        //System.out.println();

        //System.out.println( "Plot 1 length: " + plot3.getLength() );
        //System.out.println( "Plot 1 width: " + plot3.getWidth() );
        //System.out.println( "Plot 1 area: " + plot3.calculateArea() );

        // ----------------------------------------------------------
        // Changing attributes:

        plot1.setWidth(75);

        plot2.setWidth(75);
        plot2.setLength(75); // Also change length for plot 2 to keep it square

        plot3.setWidth(75);

        // ----------------------------------------------------------
        // Printing total area:

        System.out.println("These three plots require " + ( plot1.calculateArea() + plot2.calculateArea() + plot3.calculateArea() ) + " of seed");
    }
}
