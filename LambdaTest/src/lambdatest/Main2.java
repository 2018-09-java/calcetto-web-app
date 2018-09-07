/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdatest;

/**
 *
 * @author claudio
 */
public class Main2 {

    static Flight flight = new Flight.Builder()
            .setCode("LAMBDA-TEST")
            .setFrom("Fisciano")
            .setTo("San Francisco")
            .build();

    static String convertToJson(FlightConverter converter, Flight flight) {
        return converter.convert(flight);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FlightConverter simpleConverter = new SimpleConverter();
        FlightConverter fullConverter = new FullConverter();

        System.out.println("SimpleConverter: " + convertToJson(simpleConverter, flight));
        System.out.println("FullConverter: " + convertToJson(fullConverter, flight));

    }

}
