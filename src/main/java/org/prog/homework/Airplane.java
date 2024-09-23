package org.prog.homework;

//TODO: add air company and flight number
//TODO: add hash code and equals that will compare company name and flight number
//TODO: add overload flyTo: destination, startAriport, transitAirport and print:
// Flight (flightNumber) of comapny (comapny) from to through
public class   Airplane {
    public String airline;
    public String number;
    private String starting;
    // public static String flightNumber;

    public void weFly() {
        System.out.println(airline + "Airplane fly....");
    }

    public void weFly(String destination, String startingFrom, String passingThrough, String withPassengers) {

        System.out.println("Fly starting from" + "  " + destination + " passing Through " + passingThrough +
                "to" + withPassengers);

    }

    @Override
    public boolean equals(Object obg) {
        if (obg instanceof Airplane) {
            boolean match = this.number.equals(((Airplane) obg).number) &&
                    this.airline.equals(((Airplane) obg).airline);
            return true;
        }
        return false;

}
    @Override
    public int hashCode() {
        return (this.number + this.airline).hashCode();
    }
}










