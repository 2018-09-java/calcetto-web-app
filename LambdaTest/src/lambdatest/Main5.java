/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdatest;

import org.json.JSONObject;

/**
 *
 * @author claudio
 */
public class Main5 {

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

        String simple = convertToJson(
                f -> new JSONObject()
                        .put("code", f.getCode())
                        .toString(),
                flight);

        String full = convertToJson(
                f -> new JSONObject()
                        .put("code", f.getCode())
                        .put("from", f.getFrom())
                        .put("to", f.getTo())
                        .toString(),
                flight);

        System.out.println("SimpleConverter: " + simple);
        System.out.println("FullConverter: " + full);

    }

}
