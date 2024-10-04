package org.prog.homework;

//TODO: add air company and flight number
//TODO: add hash code and equals that will compare company name and flight number
//TODO: add overload flyTo: destination, startAriport, transitAirport and print:
// Flight (flightNumber) of comapny (comapny) from to through
public class Airplane {
    public String airCompany;
    public int flightNumber;
    @Override
    public int hashCode() {
        return airCompany.hashCode() + flightNumber;
    }

    @Override
    public boolean equals(Object object) {
        if(object instanceof  Airplane) {
           if(this.airCompany.equals(((Airplane) object).airCompany) && this.flightNumber == ((Airplane) object).flightNumber){
               return true;
           } return false;
        } else return false;
    }

}
